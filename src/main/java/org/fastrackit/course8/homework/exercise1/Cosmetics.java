package org.fastrackit.course8.homework.exercise1;

public class Cosmetics extends Product{
    private String color;
    private double weight;

    public Cosmetics(double price, String name, String description, int quantity, String color, double weight) {
        super(price, name, description, quantity);
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cosmetics{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", price=" + getPrice() +
                ", name='" + getName() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", quantity=" + getQuantity() +
                '}';
    }
}
