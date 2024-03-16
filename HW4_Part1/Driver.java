public class Driver {
    public static void main(String[] args) {

        Pizza pizzaHutLarge = new Pizza.Builder()
                .setSize(Pizza.Size.Large)
                .setChains(Pizza.Chains.PizzaHut)
                .addBeef()
                .addExtraCheese()
                .addTomatoAndBasil()
                .build();

        Pizza pizzaHutSmall = new Pizza.Builder()
                .setSize(Pizza.Size.Small)
                .setChains(Pizza.Chains.PizzaHut) 
                .addBacon()
                .addOnions()
                .build();

        Pizza littleCaesarsMedium = new Pizza.Builder()
                .setSize(Pizza.Size.Medium)
                .setChains(Pizza.Chains.LittleCaesars) 
                .addPepperoni()
                .addSausage()
                .addMushrooms()
                .addChicken()
                .addOlives()
                .addSpinach()
                .addPeppers()
                .addPesto()
                .build();

        Pizza littleCaesarsSmall = new Pizza.Builder()
                .setSize(Pizza.Size.Small)
                .setChains(Pizza.Chains.LittleCaesars) 
                .addSpicyPork()
                .addMushrooms()
                .addBacon()
                .addOnions()
                .addPeppers()
                .addHamAndPineapple()
                .build();

        Pizza dominosSmall = new Pizza.Builder()
                .setSize(Pizza.Size.Small)
                .setChains(Pizza.Chains.Dominos)
                .addSpicyPork()
                .build();

        Pizza dominosLarge = new Pizza.Builder()
                .setSize(Pizza.Size.Large)
                .setChains(Pizza.Chains.Dominos) 
                .addBeef()
                .addPesto()
                .addSpinach()
                .build();

        pizzaHutLarge.eat();
        pizzaHutSmall.eat();
        littleCaesarsMedium.eat();
        littleCaesarsSmall.eat();
        dominosSmall.eat();
        dominosLarge.eat();
    }
}
