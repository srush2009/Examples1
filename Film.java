import java.util.*;

interface IFilm{
	
}
class Film implements IFilm{
	private String title;
	private String director;
	private int year;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}

class FilmLibrary implements IFilmLibrary{
	private List<IFilm> films = new ArrayList<>();
	
	public void addFilm(IFilm film) {
		films.add(film);
	}
	public void removeFilm(String title) {
		IFilm filmToRemove = null;
		for(Ifilm film : films) {
			if(film.getTitle().equals(title)) {
				filmToRemove = film;
				break;
			}
		}
		if(filmToRemove != null) {
			films.remove(filmToRemove);
		}
	}
	public List<IFilm>.getFilms();
	return films;
}
 public List<Ifilm> searchFilms(String query){
	 List<IFilm> searchResults = new ArrayList<>();
	 for(IFilm film : films) {
		 if(film.getTitle().contains(query) || film.getDirector().contains(query)) {
			 searchResults.add(film);
		 }
	 }
	 return searchResults;
 }
 public int getTotalFilmCount() {
	 return films.size(); 
	 }
 }

 
public class MainFilmMaster {

}

/*package quesBank2;
import java.util.*;

interface IFilm {
    String getTitle();
    String getDirector();
    int getYear();
}

interface IFilmLibrary {
    void addFilm(IFilm film);
    void removeFilm(String title);
    List<IFilm> getFilms();
    List<IFilm> searchFilms(String query);
    int getTotalFilmCount();
}

class Film implements IFilm {
    private String title;
    private String director;
    private int year;
    
    public Film(String title, String director, int year) {
        this.title = title;
        this.director = director;
        this.year = year;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDirector() {
        return director;
    }

    @Override
    public int getYear() {
        return year;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

class FilmLibrary implements IFilmLibrary {
    private List<IFilm> films = new ArrayList<>();
    
    @Override
    public void addFilm(IFilm film) {
        films.add(film);
    }
    
    @Override
    public void removeFilm(String title) {
        IFilm filmToRemove = null;
        for (IFilm film : films) {
            if (film.getTitle().equals(title)) {
                filmToRemove = film;
                break;
            }
        }
        if (filmToRemove != null) {
            films.remove(filmToRemove);
        }
    }

    @Override
    public List<IFilm> getFilms() {
        return films;
    }

    @Override
    public List<IFilm> searchFilms(String query) {
        List<IFilm> searchResults = new ArrayList<>();
        for (IFilm film : films) {
            if (film.getTitle().contains(query) || film.getDirector().contains(query)) {
                searchResults.add(film);
            }
        }
        return searchResults;
    }

    @Override
    public int getTotalFilmCount() {
        return films.size();
    }
}

public class MainFilmMaster {
    public static void main(String[] args) {
        FilmLibrary library = new FilmLibrary();
        
        // Create some Film objects
        Film film1 = new Film("Inception", "Christopher Nolan", 2010);
        Film film2 = new Film("The Matrix", "Lana Wachowski, Lilly Wachowski", 1999);
        Film film3 = new Film("Interstellar", "Christopher Nolan", 2014);
        
        // Add films to the library
        library.addFilm(film1);
        library.addFilm(film2);
        library.addFilm(film3);
        
        // Print all films
        System.out.println("All Films in Library:");
        for (IFilm film : library.getFilms()) {
            System.out.println(film.getTitle() + " by " + film.getDirector() + " (" + film.getYear() + ")");
        }
        
        // Search films by title
        String searchQuery = "Inception";
        System.out.println("\nSearch Results for '" + searchQuery + "':");
        List<IFilm> searchResults = library.searchFilms(searchQuery);
        for (IFilm film : searchResults) {
            System.out.println(film.getTitle() + " by " + film.getDirector());
        }

        // Remove a film by title
        library.removeFilm("The Matrix");
        
        // Print remaining films
        System.out.println("\nRemaining Films after Removal:");
        for (IFilm film : library.getFilms()) {
            System.out.println(film.getTitle() + " by " + film.getDirector());
        }
        
        // Total film count
        System.out.println("\nTotal Film Count: " + library.getTotalFilmCount());
    }
}*/

