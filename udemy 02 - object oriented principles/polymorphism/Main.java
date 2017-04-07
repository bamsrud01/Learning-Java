/*  Movie Class  */
class Movie {

    private String title;

    //  Constructor
    public Movie(String title) {
        this.title = title;
    }

    public String plot() {
        return "No plot here";
    }

    public String getTitle() {
        return title;
    }
}

/*  Jaws Movie  */
class Jaws extends Movie {

    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A shark eats lots of people";
    }
}

/*  Independence Day Movie  */
class IndependenceDay extends Movie {

    public IndependenceDay() {
        super("Independence Day");
    }

    public String plot() {
        return "Aliens are defeated by a computer virus";
    }
}

/*  Maze Runner Movie  */
class MazeRunner extends Movie {

    public MazeRunner() {
        super("Maze Runner");
    }

    public String plot() {
        return "Kids try to escape a maze";
    }
}

/*  Star Wars Movie  */
class StarWars extends Movie {

    public StarWars() {
        super("Star Wars");
    }

    public String plot() {
        return "The Rebel Alliance resists the evil Galactic Empire";
    }
}

/*  Forgettable Movie  */
class Forgettable extends Movie {

    public Forgettable() {
        super("A forgettable movie");
    }

    //  No plot() method
}

/*  Main Class  */
public class Main {

    public static void main(String[] args) {

        //  Polymorphism: Actions act differently based on the object it is being performed on
        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + ": " + movie.getTitle());
            System.out.println("Plot: " + movie.plot() + "\n");
        }
        //  Note that movie.plot() returns different information depending on which class it is from.
        //  This is polymorphism

    }

    //  Method to return a random movie
    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated: " + randomNumber);

        switch(randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgettable();
        }
        return null;    //  In case number is outside of range
    }
}
