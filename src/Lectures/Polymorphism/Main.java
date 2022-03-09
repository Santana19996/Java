package Lectures.Polymorphism;

class Movie {
    private String name;

    public String getName() {
        return name;
    }

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }
}


class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A shark eats lots of people!";
    }
}

class independenceDay extends Movie {
    public independenceDay() {
        super("Independent Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over world";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}


class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take universe";
    }
}

class Forgettable extends Movie {
    public Forgettable() {
        super("Forgettable");
    }
}


public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie # " + i + ":" + movie.getName() + "\n" + "Plot:" + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random generated was : " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new independenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgettable();
        }
        return null;
    }

}
