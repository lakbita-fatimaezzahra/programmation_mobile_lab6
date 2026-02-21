package com.example.pizzalak.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pizzalak.Classes.Pizza;
import com.example.pizzalak.R;

import java.util.List;

public class PizzaAdapter extends BaseAdapter {

        private final Context ctx;
        private final List<Pizza> pizzas;

        public PizzaAdapter(Context ctx, List<Pizza> pizzas) {
            this.ctx = ctx;
            this.pizzas = pizzas;
        }

        @Override public int getCount() { return pizzas.size(); }
        @Override public Object getItem(int i) { return pizzas.get(i); }
        @Override public long getItemId(int i) { return pizzas.get(i).getPizzaId(); }

        @Override
        public View getView(int pos, View convertView, ViewGroup parent) {
            if (convertView == null)
                convertView = LayoutInflater.from(ctx).inflate(R.layout.row_pizza, parent, false);

            ImageView img = convertView.findViewById(R.id.imgPizza);
            TextView tvNom = convertView.findViewById(R.id.tvNom);
            TextView tvPeople = convertView.findViewById(R.id.tvPeople);
            ImageView iconTime = convertView.findViewById(R.id.iconTime);
            TextView tvTime = convertView.findViewById(R.id.tvTime);
            ImageView iconFav = convertView.findViewById(R.id.iconFav);

            Pizza p = pizzas.get(pos);
            img.setImageResource(p.getImagePizza());
            tvNom.setText(p.getNomPizza());
            tvPeople.setText(String.valueOf(p.getNbPersonnes()));
            tvTime.setText(p.getTempsPreparation());
            return convertView;
        }
    }

