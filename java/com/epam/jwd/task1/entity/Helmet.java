package com.epam.jwd.task1.entity;

public class Helmet extends Ammunition {
    private String typeOfConstruction;
    private String ventilation;
    private String glass;

    public Helmet(int cost, int weight, String size, String typeOfConstruction, String ventilation, String glass) {
        super(cost, weight, size);
        this.typeOfConstruction = typeOfConstruction;
        this.ventilation = ventilation;
        this.glass = glass;
    }

    public String getTypeOfConstruction() {
        return typeOfConstruction;
    }

    public void setTypeOfConstruction(String typeOfConstruction) {
        this.typeOfConstruction = typeOfConstruction;
    }

    public String getVentilation() {
        return ventilation;
    }

    public void setVentilation(String ventilation) {
        this.ventilation = ventilation;
    }

    public String getGlass() {
        return glass;
    }

    public void setGlass(String glass) {
        this.glass = glass;
    }

    @Override
    public String toString() {
        return "Helmet  Cost: " + getCost() + ". Weight: " + getWeight()
                + "кг. Size: " + getSize() + ". TypeOfConstruction: " + this.typeOfConstruction
                + ". Ventilation: " + this.ventilation + ". Glass: " + this.glass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Helmet helmet = (Helmet) o;

        if (typeOfConstruction != null ? !typeOfConstruction.equals(helmet.typeOfConstruction) : helmet.typeOfConstruction != null)
            return false;
        if (ventilation != null ? !ventilation.equals(helmet.ventilation) : helmet.ventilation != null) return false;
        return glass != null ? glass.equals(helmet.glass) : helmet.glass == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (typeOfConstruction != null ? typeOfConstruction.hashCode() : 0);
        result = 31 * result + (ventilation != null ? ventilation.hashCode() : 0);
        result = 31 * result + (glass != null ? glass.hashCode() : 0);
        return result;
    }
}
