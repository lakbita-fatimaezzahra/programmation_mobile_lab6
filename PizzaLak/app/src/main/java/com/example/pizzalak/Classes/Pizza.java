package com.example.pizzalak.Classes;

public class Pizza {
    private static long AUTO_ID = 1;

    private long pizzaId;
    private String nomPizza;
    private double prixPizza;
    private int imagePizza;
    private String tempsPreparation;
    private String listeIngredients;
    private String descriptionPizza;
    private String etapesPreparation;


    private int nbPersonnes;

    public Pizza() {
        this.pizzaId = AUTO_ID++;
        this.nbPersonnes = 1;
    }

    public Pizza(String nomPizza, double prixPizza, int imagePizza, String tempsPreparation,
                 String listeIngredients, String descriptionPizza, String etapesPreparation,
                 int nbPersonnes) { // ajout du paramètre
        this.pizzaId = AUTO_ID++;
        this.nomPizza = nomPizza;
        this.prixPizza = prixPizza;
        this.imagePizza = imagePizza;
        this.tempsPreparation = tempsPreparation;
        this.listeIngredients = listeIngredients;
        this.descriptionPizza = descriptionPizza;
        this.etapesPreparation = etapesPreparation;
        this.nbPersonnes = nbPersonnes;
    }

    public long getPizzaId() { return pizzaId; }

    public String getNomPizza() { return nomPizza; }
    public void setNomPizza(String nomPizza) { this.nomPizza = nomPizza; }

    public double getPrixPizza() { return prixPizza; }
    public void setPrixPizza(double prixPizza) { this.prixPizza = prixPizza; }

    public int getImagePizza() { return imagePizza; }
    public void setImagePizza(int imagePizza) { this.imagePizza = imagePizza; }

    public String getTempsPreparation() { return tempsPreparation; }
    public void setTempsPreparation(String tempsPreparation) { this.tempsPreparation = tempsPreparation; }

    public String getListeIngredients() { return listeIngredients; }
    public void setListeIngredients(String listeIngredients) { this.listeIngredients = listeIngredients; }

    public String getDescriptionPizza() { return descriptionPizza; }
    public void setDescriptionPizza(String descriptionPizza) { this.descriptionPizza = descriptionPizza; }

    public String getEtapesPreparation() { return etapesPreparation; }
    public void setEtapesPreparation(String etapesPreparation) { this.etapesPreparation = etapesPreparation; }


    public int getNbPersonnes() { return nbPersonnes; }
    public void setNbPersonnes(int nbPersonnes) { this.nbPersonnes = nbPersonnes; }

    @Override
    public String toString() {
        return nomPizza + " - " + prixPizza + " €";
    }
}