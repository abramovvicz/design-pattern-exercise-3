package pizza;

import java.util.List;

public class CapriciosaPizza extends Pizza {

    public CapriciosaPizza(double cost, List<String> components, PizzaType pizzaType) {
        super(cost, components, pizzaType);
    }

    @Override
    public void showPizzaInfo() {
        System.out.println(super.toString());
    }

}
