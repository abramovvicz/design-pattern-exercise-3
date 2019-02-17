package pizza;

import java.util.List;

public class MargheritaPizza extends Pizza {


    public MargheritaPizza(double cost, List<String> components, PizzaType pizzaType) {
        super(cost, components, pizzaType);
    }

    @Override
    public void showPizzaInfo() {
        System.out.println(super.toString());
    }

}
