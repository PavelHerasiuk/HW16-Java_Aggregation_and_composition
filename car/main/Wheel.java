package by.epam.car.main;

public class Wheel {
    private final int diameter;
    private boolean isGood;

    Wheel(int diameter) {
        this.diameter = diameter;
        this.isGood = true;
    }

    int getDiameter() {
        return diameter;
    }

    boolean isGood() {
        return isGood;
    }

    public void setGoodWheel() {
        isGood = true;
    }

    void breakWheel() {
        this.isGood = false;
    }
}