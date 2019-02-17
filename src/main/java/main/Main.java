package main;

import pizza.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    PizzaFactory pizzaFactory = new PizzaFactory();

    Pizza pizzaCapriciosa = pizzaFactory.create(PizzaType.CAPRICIOSA, 20, Arrays.asList("asdasdasd"));
    Pizza pizzaHawai = pizzaFactory.create(PizzaType.HAWAI, 30, Arrays.asList("składniki hawajskie"));

    }

}
