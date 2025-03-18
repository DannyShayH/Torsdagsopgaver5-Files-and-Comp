public class Main{
    public static void main(String[] args){

        Cafe myCafe = new Cafe();
        myCafe.loadMenuData();

        System.out.println("Cafe Menu:");
        for (String coffee : myCafe.getCoffeeMenu()){
            System.out.println(coffee);
        }
    }
}