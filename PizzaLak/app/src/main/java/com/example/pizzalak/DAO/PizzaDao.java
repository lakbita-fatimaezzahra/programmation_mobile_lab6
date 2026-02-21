package com.example.pizzalak.DAO;

import com.example.pizzalak.Classes.Pizza;

import java.util.List;

public interface PizzaDao {

    Pizza ajouterPizza(Pizza pizza);

    Pizza modifierPizza(Pizza pizza);

    boolean supprimerPizza(long pizzaId);

    Pizza trouverPizzaParId(long pizzaId);

    List<Pizza> listerToutesLesPizzas();
}