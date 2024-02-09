package decorator;

// By going this route I'll have to create a new subclass
// for an infinite number of pizza.
// I'd also have to change prices in many classes
// when just 1 Pizza topping cost changes

// Inheritance is static while composition is dynamic
// Through composition I'll be able to add new functionality
// by writing new code rather than by changing current code

public class ThreeCheesePizza implements Pizza {

    private static final String description = "Mozzarella, Fontina, Parmesan Cheese Pizza";
    private static final double cost = 10.50;

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getCost() {
        return cost;
    }
}