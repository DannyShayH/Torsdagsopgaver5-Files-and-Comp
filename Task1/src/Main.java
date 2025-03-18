import java.util.ArrayList;

public class Main{
    public static void main(String[] args){

    ArrayList<Customer> customers = new ArrayList<>();
    customers.add(new Customer("Wilson", "Wilkins", "WillyWilkins"));
    customers.add(new Customer("Ronald", "Widitcha", "R.Widitcha"));
    customers.add(new Customer("Mooba", "Dooba", "Modoba"));


    printCustomers(customers);
    }
    public static void printCustomers(ArrayList<Customer> customers){
        for (Customer customer : customers){
            System.out.println(customer);
        }
    }
}