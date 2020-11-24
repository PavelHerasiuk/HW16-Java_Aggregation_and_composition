package by.epam.tourist.main;

public enum Transport {
    PLANE,
    BUS,
    SHIP,
    TRAIN,
    CAR;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}