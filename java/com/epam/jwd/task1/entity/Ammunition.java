package com.epam.jwd.task1.entity;

public abstract class Ammunition {
    private int cost;
    private int weight;
    private String size;

    public Ammunition(int cost, int weight, String size) {
        this.cost = cost;
        this.weight = weight;
        this.size = size;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Cost: " + this.cost + ". Weight: " + this.weight + ". Size: " + this.size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ammunition that = (Ammunition) o;

        if (cost != that.cost) return false;
        if (weight != that.weight) return false;
        return size != null ? size.equals(that.size) : that.size == null;
    }

    @Override
    public int hashCode() {
        int result = cost;
        result = 31 * result + weight;
        result = 31 * result + (size != null ? size.hashCode() : 0);
        return result;
    }
}
