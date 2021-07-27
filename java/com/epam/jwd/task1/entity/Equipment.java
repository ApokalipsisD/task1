package com.epam.jwd.task1.entity;

import java.util.ArrayList;
import java.util.List;

public class Equipment {
    private List<Ammunition> ammunition;

    public Equipment() {
        this.ammunition = new ArrayList<Ammunition>();
    }

    public List<Ammunition> getAmmunition() {
        return ammunition;
    }

    public void setAmmunition(List<Ammunition> ammunition) {
        this.ammunition = ammunition;
    }

    public void addElement(Ammunition itemOfAmmunition) {
        ammunition.add(itemOfAmmunition);
    }

    public void deleteElement(int index) {
        ammunition.remove(index);
    }

    public void deleteElement(Ammunition itemOfAmmunition) {
        ammunition.remove(itemOfAmmunition);
    }

    @Override
    public String toString() {
        if (ammunition != null) {
            StringBuilder sb = new StringBuilder();
            for (Ammunition itemOfAmmunition
                    : ammunition) {
                sb.append(itemOfAmmunition.toString()).append("\n");
            }
            return sb.toString();
        } else {
            return "Предметы отсутствуют";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Equipment equipment = (Equipment) o;

        return ammunition != null ? ammunition.equals(equipment.ammunition) : equipment.ammunition == null;
    }

    @Override
    public int hashCode() {
        return ammunition != null ? ammunition.hashCode() : 0;
    }
}


