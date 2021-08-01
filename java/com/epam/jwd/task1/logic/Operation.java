package com.epam.jwd.task1.logic;

import com.epam.jwd.task1.entity.Ammunition;
import com.epam.jwd.task1.entity.Equipment;

import java.util.ArrayList;
import java.util.List;

public class Operation {
    private final Equipment equipment;
    private List<Ammunition> ammunition;
    private int totalCost;

    public Operation(Equipment equipment, List<Ammunition> ammunition) {
        this.equipment = equipment;
        this.ammunition = ammunition;
        this.totalCost = 0;
    }

    public int getSize() {
        return ammunition.size();
    }

    public List<Ammunition> getAmmunition() {
        return ammunition;
    }

    public void setAmmunition(List<Ammunition> ammunition) {
        this.ammunition = ammunition;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public void calculateCost() {
        totalCost = 0;
        for (Ammunition itemOfAmmunition
                : ammunition) {
            totalCost += itemOfAmmunition.getCost();
        }
    }

    public void sortByWeight() {
        Ammunition current;
        for (int i = 0; i < getSize() - 1; i++) {
            for (int j = 0; j < getSize() - i - 1; j++) {
                if (ammunition.get(j).getWeight()
                        > ammunition.get(j + 1).getWeight()) {
                    current = ammunition.get(j);
                    ammunition.set(j, ammunition.get(j + 1));
                    ammunition.set(j + 1, current);
                }
            }
        }
    }

    public void calculateItemsByPrice(int min, int max) {
        if (min < max) {
            ammunition = equipment.getAmmunition();
            List<Ammunition> newAmmunition = new ArrayList<Ammunition>();
            for (Ammunition itemOfAmmunition
                    : ammunition) {
                if (itemOfAmmunition.getCost() >= min
                        && itemOfAmmunition.getCost() <= max) {
                    newAmmunition.add(itemOfAmmunition);
                } else {
                    totalCost -= itemOfAmmunition.getCost();
                }
            }
            ammunition = newAmmunition;
        } else {
            System.out.println("Введите корректные значения");
        }
    }

    public void print() {
        System.out.println(toString());
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

        Operation that = (Operation) o;

        if (totalCost != that.totalCost) return false;
        if (equipment != null ? !equipment.equals(that.equipment) : that.equipment != null) return false;
        return ammunition != null ? ammunition.equals(that.ammunition) : that.ammunition == null;
    }

    @Override
    public int hashCode() {
        int result = equipment != null ? equipment.hashCode() : 0;
        result = 31 * result + (ammunition != null ? ammunition.hashCode() : 0);
        result = 31 * result + totalCost;
        return result;
    }
}
