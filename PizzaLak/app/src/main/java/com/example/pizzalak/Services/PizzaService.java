package com.example.pizzalak.Services;

import com.example.pizzalak.Classes.Pizza;
import com.example.pizzalak.DAO.PizzaDao;
import com.example.pizzalak.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PizzaService implements PizzaDao {

    private static PizzaService INSTANCE;
    private final List<Pizza> listePizzas = new ArrayList<>();

    private PizzaService() {
        initialiserPizzas(); // préremplissage
    }

    public static PizzaService getInstance() {
        if (INSTANCE == null) INSTANCE = new PizzaService();
        return INSTANCE;
    }

    private void initialiserPizzas() {
        listePizzas.add(new Pizza(
                "BARBECUE CHICKEN PIZZA",
                3.0,
                R.drawable.pizza1,
                "35 min",
                "- Poulet\n- Sauce barbecue\n- Fromage",
                "Pizza au poulet barbecue simple et rapide.",
                "ETAPE 1: Griller le poulet.\nETAPE 2: Garnir et cuire.",
                2
        ));

        listePizzas.add(new Pizza(
                "BRUSCHETTA PIZZA",
                5.0,
                R.drawable.pizza2,
                "35 min",
                "- Saucisse de porc\n- Pepperoni\n- Fromage mozzarella\n- Tomates\n- Basilic",
                "Une pizza savoureuse aux saveurs italiennes.",
                "ETAPE 1: Cuire la viande et étaler sur la pâte.\nETAPE 2: Ajouter la garniture et cuire.",
                8
        ));

        listePizzas.add(new Pizza(
                "SPINACH PIZZA",
                2.0,
                R.drawable.pizza3,
                "25 min",
                "- Pâte à pizza\n- Sauce Alfredo\n- Épinards\n- Tomates\n- Fromage",
                "Pizza crémeuse et légère aux légumes.",
                "ETAPE 1: Étaler la pâte.\nETAPE 2: Ajouter la garniture et cuire.",
                4
        ));

        listePizzas.add(new Pizza(
                "DEEP-DISH SAUSAGE PIZZA",
                8.0,
                R.drawable.pizza4,
                "45 min",
                "- Levure\n- Farine\n- Huile\n- Épices\n- Saucisse\n- Fromage",
                "Une pizza généreuse, épaisse et pleine de saveurs.",
                "ETAPE 1: Préparer la pâte.\nETAPE 2: Garnir et cuire au four.",
                8
        ));

        listePizzas.add(new Pizza(
                "HOMEMADE PIZZA",
                4.0,
                R.drawable.pizza5,
                "50 min",
                "- Levure\n- Farine\n- Viande hachée\n- Sauce tomate\n- Fromage\n- Légumes",
                "Une pizza maison riche et savoureuse.",
                "ETAPE 1: Préparer la pâte et la garniture.\nETAPE 2: Cuire au four.",
                3
        ));

        listePizzas.add(new Pizza(
                "PESTO CHICKEN PIZZA",
                3.0,
                R.drawable.pizza6,
                "50 min",
                "- Levure\n- Farine\n- Poulet\n- Légumes\n- Pesto\n- Fromage",
                "Pizza au poulet et pesto, simple et délicieuse.",
                "ETAPE 1: Préparer la pâte.\nETAPE 2: Garnir et cuire.",
                8
        ));

        listePizzas.add(new Pizza(
                "LOADED MEXICAN PIZZA",
                3.0,
                R.drawable.pizza7,
                "30 min",
                "- Haricots noirs\n- Légumes\n- Épices\n- Fromages\n- Pâte à pizza",
                "Une pizza mexicaine pleine de saveurs et épicée.",
                "ETAPE 1: Étaler la pâte et ajouter les haricots.\nETAPE 2: Ajouter les légumes et cuire.",
                6
        ));

        listePizzas.add(new Pizza(
                "BACON CHEESEBURGER PIZZA",
                2.0,
                R.drawable.pizza8,
                "20 min",
                "- Viande hachée\n- Bacon\n- Fromage\n- Cornichons\n- Pâte à pizza",
                "Une pizza qui combine cheeseburger et pizza.",
                "ETAPE 1: Préparer la pâte et la garniture.\nETAPE 2: Cuire au four.",
                8
        ));

        listePizzas.add(new Pizza(
                "PIZZA MARGHERITA",
                1.0,
                R.drawable.pizza9,
                "30 min",
                "- Levure\n- Farine\n- Sauce tomate\n- Mozzarella\n- Basilic",
                "Classique pizza Margherita aux couleurs de l’Italie.",
                "ETAPE 1: Préparer la pâte.\nETAPE 2: Ajouter les tomates, mozzarella et basilic.\nETAPE 3: Cuire au four.",
                8
        ));

        listePizzas.add(new Pizza(
                "PEPPERONI-SAUSAGE STUFFED PIZZA",
                5.0,
                R.drawable.pizza10,
                "45 min",
                "- Levure\n- Farine\n- Viande hachée\n- Saucisse\n- Pepperoni\n- Fromage",
                "Une pizza généreuse farcie au pepperoni et à la saucisse.",
                "ETAPE 1: Préparer la pâte.\nETAPE 2: Ajouter les ingrédients et cuire.",
                12
        ));
    }
    @Override
    public Pizza ajouterPizza(Pizza pizza) {
        listePizzas.add(pizza);
        return pizza;
    }

    @Override
    public Pizza modifierPizza(Pizza pizza) {
        for (int i = 0; i < listePizzas.size(); i++) {
            if (listePizzas.get(i).getPizzaId() == pizza.getPizzaId()) {
                listePizzas.set(i, pizza);
                return pizza;
            }
        }
        return null;
    }

    @Override
    public boolean supprimerPizza(long pizzaId) {
        return listePizzas.removeIf(p -> p.getPizzaId() == pizzaId);
    }

    @Override
    public Pizza trouverPizzaParId(long pizzaId) {
        for (Pizza pizza : listePizzas) {
            if (pizza.getPizzaId() == pizzaId) return pizza;
        }
        return null;
    }

    @Override
    public List<Pizza> listerToutesLesPizzas() {
        return Collections.unmodifiableList(listePizzas);
    }
}