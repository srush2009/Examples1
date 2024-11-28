//class name ExclusiveTime in que
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class SingleThreadedCPU {
	public int[] SingleThreadedCPU(int n,List<String> logs) {
		int [] SingleThreadedCPU=new int[n];
		Stack<Integer> stack=new Stack<>();
		int prevTime=0;
		
		for(String log:logs) {
			String [] parts=log.split(":");
			int functionId=Integer.parseInt(parts[0]);
			String type=parts[1];
			int timeStamp=Integer.parseInt(parts[2]);
			
			if(type.equals("Start")) {
				if(!stack.isEmpty()) {
					SingleThreadedCPU[stack.peek()]+=timeStamp-prevTime;
				}
				stack.push(functionId);
				prevTime=timeStamp;
			}else {
				SingleThreadedCPU[stack.pop()]+=timeStamp-prevTime+1;
				prevTime=timeStamp+1;
			}
		}
		return SingleThreadedCPU;
		
	}

	public static void main(String[] args) {
		int n=3;
		List<String> logs=new ArrayList<>();
		logs.add("0:Start:0");
		logs.add("1:Start:2");
		logs.add("2:Start:3");
		logs.add("2:end:4");
		logs.add("1:end:5");
		logs.add("0:end:6");
		
		SingleThreadedCPU singlethreadedCPU=new SingleThreadedCPU();
		int[] result= singlethreadedCPU.SingleThreadedCPU(n,logs);
		System.out.println(Arrays.toString(result));//o/p 3,2,2

	}
	

}
