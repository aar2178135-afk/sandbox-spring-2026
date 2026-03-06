package org.example.sandbox.comparable;

public class Fruit implements Comparable<Fruit> {

    private String fruitName;
    private int fruitQty;

    // Constructor
    public Fruit(String fruitName, int fruitQty) {
        this.fruitName = fruitName;
        this.fruitQty = fruitQty;
    }

    // Getter for fruitName
    public String getFruitName() {
        return fruitName;
    }

    // Setter for fruitName
    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    // Getter for fruitQty
    public int getFruitQty() {
        return fruitQty;
    }

    // Setter for fruitQty
    public void setFruitQty(int fruitQty) {
        this.fruitQty = fruitQty;
    }

    // toString method
    @Override
    public String toString() {
        return "Fruit{name='" + fruitName + "', qty=" + fruitQty + "}";
    }

    // compareTo method
    @Override
    public int compareTo(Fruit other) {

        // Compare fruit names first
        int nameCompare = this.fruitName.compareTo(other.fruitName);

        // If names are different, return that result
        if (nameCompare != 0) {
            return nameCompare;
        }

        // If names are the same, compare quantities
        return Integer.compare(this.fruitQty, other.fruitQty);
    }
}
