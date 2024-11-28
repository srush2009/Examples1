import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

class Point{
	private double x;
	private double y;
	public Point(double x,double y) {
		this.x=x;
		this.y=y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public static double distance(Point p1,Point p2) {
		return Math.sqrt(Math.pow(p2.getY()-p1.getY(),2)+Math.pow(p2.getX()-p1.getX(),2));
	}
	@Override
	public String toString() {
		return "("+this.x+","+this.y+")";
	}
	
}
class Line{
	private Point start=new Point(0,0);
	private Point end=new Point(0,0);
	
	public Line(Point start,Point end) {
		this.start=start;
		this.end=end;
	}

	public Point getStart() {
		return start;
	}

	public void setStart(Point start) {
		this.start = start;
	}

	public Point getEnd() {
		return end;
	}

	public void setEnd(Point end) {
		this.end = end;
	}
	public double getLineLength() {
		return Point.distance(start, end);
	}

	@Override
	public String toString() {
		return "Start=" + this.start + "End=" + this.end ;
	}	
}
interface ListOfLines{
	ArrayList<Line> getLinesFromStartingPoint(Point p);
	Line getLineWithMaxLength();
}
class LineList implements ListOfLines{
	private ArrayList<Line> list_of_lines;
	public LineList(ArrayList<Line> lines) {
		list_of_lines=lines;
	}
	@Override
	public ArrayList<Line> getLinesFromStartingPoint(Point p){
		ArrayList<Line> startingLines=new ArrayList<>();
		for(Line line:list_of_lines) {
			if(line.getStart().getX()==p.getX() && line.getStart().getY()==p.getY()) {
				startingLines.add(line);
			}
		}
		return startingLines;
	}
	@Override
	public Line getLineWithMaxLength() {
		Line maxLine=null;
		double maxLength=-1;
		for(Line line:list_of_lines) {
			double length=line.getLineLength();
			if(length>maxLength) {
				maxLength=length;
				maxLine=line;
			}
		}
		return maxLine;
		
	}
}
public class Lines {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		int nLines=sc.nextInt();
		ArrayList<Line> lines=new ArrayList<>();
		for(int i=0;i<nLines;i++) {
			System.out.println("Enter coordinates(x1 y1 x2 y2)for line"+(i+1)+":");
			
			double x1=sc.nextDouble();
			double y1=sc.nextDouble();
			double x2=sc.nextDouble();
			double y2=sc.nextDouble();
			
			Point p1=new Point(x1,y1);
			Point p2=new Point(x2,y2);
			Line line=new Line(p1,p2);
			lines.add(line);
		}
		LineList myList=new LineList(lines);
		Line maxLine=myList.getLineWithMaxLength();
		System.out.println("Longest Line: "+maxLine);
		DecimalFormat df=new DecimalFormat("#.00");
		System.out.println("Length: "+df.format(maxLine.getLineLength()));
		System.out.println("Enter the starting point coordinates (x,y):");
		double startX= sc.nextDouble();
		double startY=sc.nextDouble();
		Point startingPoint=new Point(startX,startY);
		
		ArrayList<Line> startingLines=myList.getLinesFromStartingPoint(startingPoint);
		System.out.println("All the lines starting from point: "+startingPoint);
		for(Line line:startingLines) {
			System.out.println(line);
		}

	}

}
