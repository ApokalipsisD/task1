package com.epam.jwd.task1.entity;

public class Jacket extends Ammunition {
    private String style;
    private String typeOfFastener;
    private int numberOfPockets;

    public Jacket(int cost, int weight, String size, String style, String typeOfFastener, int numberOfPockets) {
        super(cost, weight, size);
        this.style = style;
        this.typeOfFastener = typeOfFastener;
        this.numberOfPockets = numberOfPockets;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getTypeOfFastener() {
        return typeOfFastener;
    }

    public void setTypeOfFastener(String typeOfFastener) {
        this.typeOfFastener = typeOfFastener;
    }

    public int getNumberOfPockets() {
        return numberOfPockets;
    }

    public void setNumberOfPockets(int numberOfPockets) {
        this.numberOfPockets = numberOfPockets;
    }

    @Override
    public String toString() {
        return "Jacket  Cost: " + getCost() + ". Weight: " + getWeight()
                + "кг. Size: " + getSize() + ". Style: " + this.style
                + ". TypeOfFastener: " + this.typeOfFastener + ". NumberOfPockets: " + this.numberOfPockets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Jacket jacket = (Jacket) o;

        if (numberOfPockets != jacket.numberOfPockets) return false;
        if (style != null ? !style.equals(jacket.style) : jacket.style != null) return false;
        return typeOfFastener != null ? typeOfFastener.equals(jacket.typeOfFastener) : jacket.typeOfFastener == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (style != null ? style.hashCode() : 0);
        result = 31 * result + (typeOfFastener != null ? typeOfFastener.hashCode() : 0);
        result = 31 * result + numberOfPockets;
        return result;
    }
}
