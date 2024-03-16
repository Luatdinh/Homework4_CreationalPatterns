import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Driver {
    public static void main(String[] args) {

        Customer[] customers = new Customer[]{
            new Customer("Luat", "Paleo"),
            new Customer("Matthew", "Vegan"),
            new Customer("Daniel", "Nut Allergy"),
            new Customer("Ian", "Vegan"), 
            new Customer("Ethan", "Paleo"), 
            new Customer("Wesley", "No Restriction")
        };

        for (Customer customer : customers) {
 
            Macronutrient Macronutrient = new Macronutrient(customer.getDietPlan());
            Carb carb = Macronutrient.createCarb();
            Protein protein = Macronutrient.createProtein();
            Fat fat = Macronutrient.createFat();
            System.out.println(customer.getName() + " with " + customer.getDietPlan() + " diet plan:");
            carb.eat();
            protein.eat();
            fat.eat();
            System.out.println();
        }
    }
}

