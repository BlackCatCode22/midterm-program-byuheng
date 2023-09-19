import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    // Create tge genUniqueIDFunction

    //Values for theSpecies:
    // lion

    String genUniqueID(String theSpecies) {
        if (theSpecies.equals("lion")) {
            // do something
        }
    }


    public static void main(String[] args) {

        System.out.println("Welcome to my Zoo Warmup!");

        // Create an animal object.
        Animal myNewAnimal = new Animal();

        myNewAnimal.desc = "This is my description";

        System.out.println("\n The desc of the new animal is: " + myNewAnimal.desc);

        // Open the arriving animal text file


        // File path
        String filePath = "C:\\Users\\Heng\\OneDrive\\Documents\\Fresno City College\\Fall '23\\CIT-63-16266 - Mohle, Dennis\\IdeaProjects\\Arriving Animal Arraylist\\src\\arrivingAnimals.txt";



        // Create an ArrayList to hold the animal objects
        ArrayList<Animal> animalList = new ArrayList<>();

        // Create an Animal object from the Animal Class.
        Animal anyOldAnimal = new Animal();

        // Attempt to read the file
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));

            String line;



            // Read and print each line from the file
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                // Split the line into 6 substring
                String[] myArray = line.split(",");
                System.out.println("\n myArray[0] is " + myArray[0]);
                System.out.println("\n myArray[1] is " + myArray[1]);


                // Fill the object's data field
                anyOldAnimal.desc = myArray[0];
                anyOldAnimal.birthSeason = myArray[1];
                anyOldAnimal.color = myArray[2];
                anyOldAnimal.weight = myArray[3];
                anyOldAnimal.origin01 = myArray[4];
                anyOldAnimal.origin02 = myArray[5];

                // Add the newly created animal object to the array list
            }
            // Close the reader
            reader.close();
        } catch (IOException e) {
            // Handle any exceptions that may occur during file access
            e.printStackTrace();
        }
        // We are done wht the text file
        // Output the Arraylist
        // Output the animalList with an item in loop
        // Create an Animal object from the Animal Class
        for (Animal animal : animalList) {
            System.out.println(animal.desc);
            System.out.println(animal.birthSeason);
            System.out.println(animal.color);
            System.out.println(animal.weight);
            System.out.println(animal.origin01);
            System.out.println(animal.origin02);
            System.out.println("\n\n");
        }
            System.out.println(" The number of animals is: " + Animal.numOfAnimals);
    }

}

