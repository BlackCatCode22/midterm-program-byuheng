import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n\nZoo Program\n\n");
        Animal myAnimal = new Animal();
        Animal mySecondAnimal = new Animal("some name", "hyena");

        String aName = mySecondAnimal.name;
        System.out.println("\n The animal name is: " + aName);

        // Create a hyena
        Hyena myHyena = new Hyena();

        // Look at the new Hyena object
        System.out.println("\n The hyena name is: " + myHyena.name);

        // Create hyena with a name and species
        Hyena aNewHyena = new Hyena("Zig" , "Hyena");

        System.out.println(" \n The name of my hyena is: " + aNewHyena.name);
    }
}