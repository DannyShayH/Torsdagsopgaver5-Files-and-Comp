import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
//Class
public class Cafe {

    private ArrayList<String> coffeeMenu;
//Constructor
    public Cafe(){
        coffeeMenu = new ArrayList<>();

    }
    public void loadMenuData(){
        try {
            File file = new File("coffees.txt");
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()) {
                coffeeMenu.add(scanner.nextLine());
            }
            scanner.close();
        } catch(FileNotFoundException e) {
            System.out.println("File not found. Check path and filename");
        }
    }
    public ArrayList<String> getCoffeeMenu(){
        return coffeeMenu;
    }
}
