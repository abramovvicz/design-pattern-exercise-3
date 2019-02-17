package pizza;

import java.util.List;

public class CountryPizza extends Pizza {

    public CountryPizza(double cost, List<String> commpontents) {
        super(cost, commpontents, PizzaType.COUNTRY);
    }
}
