package movieapp.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    @Autowired
    MovieRepositoryImpl moviesRepo;

    public List<Movie> getAllMovies() {
        return moviesRepo.findAll();
    }

    public Movie getMovie(String title, String year, String duration, String genre){
     return null; //movies

    }

    public void addMovie(Movie movie){
       moviesRepo.create();

    }

  
            }
        }

    }
}
