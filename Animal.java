public class Animal {

    public static int numOfAnimals = 0;

    // Create a constructor

    public Animal() {
        numOfAnimals++;
    }

    String name;
    String desc;
    String birthSeason;
    String color;
    String weight;
    String origin01;
    String origin02;

    // Create a method

    public void makeNoise() {
        System.out.println("\n This is where an animal make a noise");
    }

    public String makNoise02() {
            return "This is a str returned from a method in my Animal class";
    }

}

