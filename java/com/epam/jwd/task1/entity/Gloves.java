package com.epam.jwd.task1.entity;

public class Gloves extends Ammunition {
    private String type;
    private String season;
    private String waterResistance;

    public Gloves(int cost, int weight, String size, String type, String season, String waterResistance) {
        super(cost, weight, size);
        this.type = type;
        this.season = season;
        this.waterResistance = waterResistance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getWaterResistance() {
        return waterResistance;
    }

    public void setWaterResistance(String waterResistance) {
        this.waterResistance = waterResistance;
    }

    @Override
    public String toString() {
        return "Gloves  Cost: " + getCost() + ". Weight: " + getWeight()
                + "кг. Size: " + getSize() + ". Type: " + this.type
                + ". Season: " + this.season + ". WaterResistance: " + this.waterResistance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Gloves gloves = (Gloves) o;

        if (type != null ? !type.equals(gloves.type) : gloves.type != null) return false;
        if (season != null ? !season.equals(gloves.season) : gloves.season != null) return false;
        return waterResistance != null ? waterResistance.equals(gloves.waterResistance) : gloves.waterResistance == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (season != null ? season.hashCode() : 0);
        result = 31 * result + (waterResistance != null ? waterResistance.hashCode() : 0);
        return result;
    }
}
