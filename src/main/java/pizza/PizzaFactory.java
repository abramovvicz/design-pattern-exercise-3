package pizza;

import java.util.List;

public class PizzaFactory {
    public Pizza create(PizzaType pizzaType, double cost, List<String> components) {
        if (pizzaType.equals(PizzaType.CAPRICIOSA)) {
            return new CapriciosaPizza(cost, components, PizzaType.CAPRICIOSA);
        } else if (pizzaType.equals(PizzaType.COUNTRY)) {
            return new CountryPizza(cost, components, PizzaType.COUNTRY);
        } else if (pizzaType.equals(PizzaType.HAWAI)) {
            return new HawaiPizza(cost, components, PizzaType.HAWAI);
        } else if (pizzaType.equals(PizzaType.MARGHERITA)) {

            return new MargheritaPizza(cost, components, PizzaType.MARGHERITA);

        }
        return null;
    }


}
