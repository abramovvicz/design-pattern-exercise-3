package pizza;

import java.util.List;

public class PizzaFactory {
    public Pizza create(PizzaType pizzaType, double cost, List<String> components) {
        if (pizzaType.equals(PizzaType.CAPRICIOSA)) {
            return new CapriciosaPizza(cost, components);
        } else if (pizzaType.equals(PizzaType.COUNTRY)) {
            return new CountryPizza(cost, components);
        } else if (pizzaType.equals(PizzaType.HAWAI)) {
            return new CountryPizza(cost, components);
        } else if (pizzaType.equals(PizzaType.MARGHERITA)) {
            return new CountryPizza(cost, components);
        }
        return null;
    }


}
