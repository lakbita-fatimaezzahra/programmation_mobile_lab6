package com.example.pizzalak.UI;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pizzalak.Classes.Pizza;
import com.example.pizzalak.R;
import com.example.pizzalak.Services.PizzaService;

public class PizzaDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_pizza_detail);

        long pizzaId = getIntent().getLongExtra("pizza_id", -1);
        Pizza pizza = PizzaService.getInstance().trouverPizzaParId(pizzaId);

        ImageView imagePizzaDetail = findViewById(R.id.imagePizzaDetail);
        TextView textNomPizzaDetail = findViewById(R.id.textNomPizzaDetail);
        TextView textMetaPizzaDetail = findViewById(R.id.textMetaPizzaDetail);
        TextView textIngredientsPizzaDetail = findViewById(R.id.textIngredientsPizzaDetail);
        TextView textDescriptionPizzaDetail = findViewById(R.id.textDescriptionPizzaDetail);
        TextView textEtapesPizzaDetail = findViewById(R.id.textEtapesPizzaDetail);

        if (pizza != null) {
            imagePizzaDetail.setImageResource(pizza.getImagePizza());
            textNomPizzaDetail.setText(pizza.getNomPizza());
            textMetaPizzaDetail.setText(
                    pizza.getTempsPreparation() + " • " + pizza.getPrixPizza() + " €"
            );
            textIngredientsPizzaDetail.setText(pizza.getListeIngredients());
            textDescriptionPizzaDetail.setText(pizza.getDescriptionPizza());
            textEtapesPizzaDetail.setText(pizza.getEtapesPreparation());
        } else {
            textNomPizzaDetail.setText("Pizza introuvable !");
        }
    }
}