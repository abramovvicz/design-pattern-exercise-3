package pizza;

import java.util.List;

public class CountryPizza extends Pizza {

    public CountryPizza(double cost, List<String> components, PizzaType pizzaType) {
        super(cost, components, pizzaType);
    }

    @Override
    public void showPizzaInfo() {
        System.out.println(super.toString());
    }
}
