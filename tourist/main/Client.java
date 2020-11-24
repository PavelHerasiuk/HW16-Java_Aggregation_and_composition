package by.epam.tourist.main;

public class Client {

    private String firstName;
    private String lastName;
    private double prepay;
    private TourPackage tourPackage;

    Client(String firstName, String lastName, double prepay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.prepay = prepay;
    }

    public TourPackage getTourPackage() {
        return tourPackage;
    }

    public void setTourPackage(TourPackage tourPackage) {
        this.tourPackage = tourPackage;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getPrepay() {
        return prepay;
    }

    public void setPrepay(double prepay) {
        this.prepay = prepay;
    }
}