import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        System.out.println("\n Welcome to the Cat Program! \n");

        ArrayList<String> myCatList = new ArrayList<>();

        //
        // Create a cat object
        Cat myCat = new Cat();

        //
        myCat.catSound = "meow";
        myCat.name = "Stella";
        myCat.age = 8;

        System.out.println("\nMy cat name is: " + myCat.name);
        System.out.println("\nMy cat make a sound: " + myCat.catSound);
        System.out.println("\nLives left: " + Cat.MAX_LIVES);

    }

}
