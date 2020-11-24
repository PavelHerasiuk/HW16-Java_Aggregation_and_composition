package by.epam.tourist.main;

public enum TourPackageType {
    RECREATION,
    EXCURSION,
    TREATMENT,
    SHOPPING,
    CRUISE;

    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}