import java.util.ArrayList;
import java.util.List;

public class Pizza {
    
    private Size size;
    private Chains chains;
    private List<String> toppings;

    private Pizza(Size size, Chains chains, List<String> toppings) 
    {
        this.size = size;
        this.chains = chains;
        this.toppings = toppings;
    }

    public static class Builder 
    {
        private Size size;
        private Chains chains;
        private List<String> toppings = new ArrayList<>();

        public Builder setSize(Size size) 
        {
            this.size = size;
            return this;
        }

        public Builder setChains(Chains chains) 
        {
            this.chains = chains;
            return this;
        }

        public Builder addPepperoni() 
        {
            this.toppings.add("Pepperoni");
            return this;
        }

        public Builder addSausage() 
        {
            this.toppings.add("Sausage");
            return this;
        }

        public Builder addMushrooms() 
        {
            this.toppings.add("Mushrooms");
            return this;
        }

        public Builder addBacon() 
        {
            this.toppings.add("Bacon");
            return this;
        }

        public Builder addOnions() 
        {
            this.toppings.add("Onions");
            return this;
        }

        public Builder addExtraCheese() 
        {
            this.toppings.add("Extra Cheese");
            return this;
        }

        public Builder addPeppers() 
        {
            this.toppings.add("Peppers");
            return this;
        }

        public Builder addChicken() 
        {
            this.toppings.add("Chicken");
            return this;
        }

        public Builder addOlives() 
        {
            this.toppings.add("Olives");
            return this;
        }

        public Builder addSpinach() 
        {
            this.toppings.add("Spinach");
            return this;
        }

        public Builder addTomatoAndBasil() 
        {
            this.toppings.add("Tomato and Basil");
            return this;
        }

        public Builder addBeef() 
        {
            this.toppings.add("Beef");
            return this;
        }

        public Builder addHam() 
        {
            this.toppings.add("Ham");
            return this;
        }

        public Builder addPesto() 
        {
            this.toppings.add("Pesto");
            return this;
        }

        public Builder addSpicyPork() 
        {
            this.toppings.add("Spicy Pork");
            return this;
        }

        public Builder addHamAndPineapple() 
        {
            this.toppings.add("Ham and Pineapple");
            return this;
        }

        public Pizza build() 
        {
            return new Pizza(this.size, this.chains, this.toppings);
        }
    }

    public enum Size 
    { 
        Small, Medium, Large 
    }

    public enum Chains 
    { 
        PizzaHut, LittleCaesars, Dominos 
    }

    public void eat() 
    {
        System.out.println("- Enjoying a " + size + " pizza from " + chains + " with toppings: " + String.join(", ", toppings) + ".");
    }
}

