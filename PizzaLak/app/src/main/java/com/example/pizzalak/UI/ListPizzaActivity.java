package com.example.pizzalak.UI;


import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pizzalak.Adapters.PizzaAdapter;
import com.example.pizzalak.Classes.Pizza;
import com.example.pizzalak.R;
import com.example.pizzalak.Services.PizzaService;
import com.google.android.material.appbar.MaterialToolbar;

import java.util.List;

public class ListPizzaActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle b) {
            super.onCreate(b);
            setContentView(R.layout.activity_list_pizza);

            ListView listV = findViewById(R.id.listPizzas);
            List<Pizza> pizzas = PizzaService.getInstance().listerToutesLesPizzas();
            MaterialToolbar toolbar = findViewById(R.id.topAppBar);

            listV.setAdapter(new PizzaAdapter(this, pizzas));

            listV.setOnItemClickListener((parent, view, pos, id) -> {
                Intent it = new Intent(this, PizzaDetailActivity.class);
                it.putExtra("pizza_id", id);
                startActivity(it);
            });
        }
    }
