import java.util.ArrayList;
import java.util.List;

public class MovieDemo {
	private int ticketId;
	private String movieName;
	private List<String> movieList;
	
	public MovieDemo(int ticketId, String movieName) {
		super();
		this.ticketId = ticketId;
		this.movieName = movieName;
		this.movieList = new ArrayList<>();
	}
	public int getTicketId() {
		return movieName; //return ticketId if error
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	public void addmovietoList(String movieName) {
		movieList.add(movieName);
		System.out.println("Movie: "+movieName+" added to the list");
		}
	
	public void removeMovieFromList(String movieName) {
		if(movieList.contains(movieName)) {
			movieList.remove(movieName);
			System.out.println("Movie: "+movieName+" removed from the list");
		} else {
			System.out.println("Movie: "+movieName+" not found in the list");
		}
	}
	public List<String> getAllElements(){
		List<String> result=new ArrayList<>(movieList);
		result.add("Count: "+movieList.size());
		return result;
		
	}
	
	public void searchMovies(String movieName) {
		if(movieList.contains(movieName)) {
			System.out.println("Movie: "+movieName+" found in the list");
		}else {
			System.out.println("Movie: "+movieName+" not found in the list");
		}
	}
	public static void main(String[] args) {
		MovieDemo movie=new MovieDemo(1,"Inception");
		movie.addmovietoList("Inception");
		movie.addmovietoList("Interstellar");
		
		List<String> allMovies=movie.getAllElements();
		for(String movie1:allMovies) {
			System.out.println(movie1);
			
		}
		movie.searchMovies("Inception");
		movie.searchMovies("Interstellar");
		movie.searchMovies("Avatar");
		
//		movie.removeMovieFromList("Avatar");
//	    List<String> updatedMovies = movie.getAllElements();
//	    System.out.println("\nUpdated Movie List:");
//	    for (String updatedMovie : updatedMovies) {
//	         System.out.println(updatedMovie);
//
//	}

}
}
