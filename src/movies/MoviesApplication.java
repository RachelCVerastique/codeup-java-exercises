package movies;

import java.util.Scanner;


public class MoviesApplication {


    public static void printAllMovies(Movie[] movies) {
        for (int i = 0; i < movies.length; i++) {
            System.out.println(movies[i].getName() + " -- " + movies[i].getGenre());
        }
    }

    public static void printMoviesByGenre(Movie[] movies, String genre) {
        for (int i = 0; i < movies.length; i++) {
            if(movies[i].getGenre().equals(genre)){
            System.out.println(movies[i].getName() + " -- " + movies[i].getGenre());
            }
        }
    }


    public static void main(String[] args) {

        System.out.println("What would you like to do? ");
        System.out.println("0 - exit");
        System.out.println("1 - View all movies");
        System.out.println("2 - View movies in the animated category");
        System.out.println("3 - View movies in the drama category");
        System.out.println("4 - View movies in the horror category");
        System.out.println("5 - View movies in the scifi category");
        System.out.println("Enter your choice: ");
        Scanner userInput = new Scanner(System.in);
        int userChoice = userInput.nextInt();

        Movie[] movies = MoviesArray.findAll();


        switch (userChoice) { // takes in user input
            case 0:
                System.out.println("Exit");
                break;
            case 1:
                printAllMovies(movies);
                break;
            case 2:
                printMoviesByGenre(movies, "animated");
                break;
            case 3:
                printMoviesByGenre(movies, "drama");
                break;
            case 4:
                printMoviesByGenre(movies, "horror");
                break;
            case 5:
                printMoviesByGenre(movies, "scifi");
                break;

        }


    }
}
