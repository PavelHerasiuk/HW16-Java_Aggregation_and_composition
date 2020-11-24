package by.epam.tourist.main;

// 5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
// различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
// Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        TourAggregator skyTour = new TourAggregator("Sky Tour");
        Client client = new Client("Pavel", "Pavlov", 500.20);

        skyTour.addTourPackage(new TourPackage("Spain", "Barcelona", TourPackageType.CRUISE,
                Transport.SHIP, TypeOfFood.BREAKFAST, 12, 1059.50));
        skyTour.addTourPackage(new TourPackage("Spain", "Palma", TourPackageType.RECREATION,
                Transport.PLANE, TypeOfFood.ALL_INCLUSIVE, 14, 1700.50));
        skyTour.addTourPackage(new TourPackage("Spain", "Madrid", TourPackageType.EXCURSION,
                Transport.BUS, TypeOfFood.NOT_INCLUDED, 5, 450.10));
        skyTour.addTourPackage(new TourPackage("Spain", "Malaga", TourPackageType.RECREATION,
                Transport.PLANE, TypeOfFood.BREAKFAST, 15, 1450.20));
        skyTour.addTourPackage(new TourPackage("Spain", "Barcelona", TourPackageType.TREATMENT,
                Transport.BUS, TypeOfFood.ALL_INCLUSIVE, 8, 560.80));
        skyTour.addTourPackage(new TourPackage("Italy", "Rome", TourPackageType.EXCURSION,
                Transport.PLANE, TypeOfFood.ALL_INCLUSIVE, 10, 970.36));
        skyTour.addTourPackage(new TourPackage("Italy", "Venice", TourPackageType.CRUISE,
                Transport.SHIP, TypeOfFood.BREAKFAST, 20, 1089.91));
        skyTour.addTourPackage(new TourPackage("Italy", "Milan", TourPackageType.SHOPPING,
                Transport.PLANE, TypeOfFood.BREAKFAST, 3,355.99));
        skyTour.addTourPackage(new TourPackage("Italy", "Florence", TourPackageType.TREATMENT,
                Transport.TRAIN, TypeOfFood.ALL_INCLUSIVE, 13, 1099.50));
        skyTour.addTourPackage(new TourPackage("Italy", "Rome", TourPackageType.SHOPPING,
                Transport.CAR, TypeOfFood.NOT_INCLUDED, 5, 599.50));

        System.out.println("Select by excursion:");
        ArrayList<TourPackage> selectByType = skyTour.selectByTourPackageType(TourPackageType.EXCURSION);
        TourAggregator.printTours(selectByType);

        System.out.println("\nSelect by ship:");
        ArrayList<TourPackage> selectByOption = skyTour.selectByMoreOption(Transport.SHIP);
        TourAggregator.sortByNumberOfDays(selectByOption);
        TourAggregator.printTours(selectByOption);

        System.out.println("\nSelect by plane and breakfast:");
        selectByOption = skyTour.selectByMoreOption(Transport.PLANE, TypeOfFood.BREAKFAST);
        TourAggregator.sortByPrice(selectByOption);
        TourAggregator.printTours(selectByOption);

        System.out.println("\nSelect by bus, all inclusive and for 7 days:");
        selectByOption = skyTour.selectByMoreOption(Transport.BUS, TypeOfFood.ALL_INCLUSIVE, 7);
        TourAggregator.sortByPrice(selectByOption);
        TourAggregator.printTours(selectByOption);

        System.out.println("\nSelect by bus, all inclusive and for 8 days:");
        selectByOption = skyTour.selectByMoreOption(Transport.BUS, TypeOfFood.ALL_INCLUSIVE, 8);
        TourAggregator.sortByPrice(selectByOption);
        TourAggregator.printTours(selectByOption);

        System.out.println("\nSelect for 5 days:");
        selectByOption = skyTour.selectByMoreOption(5);
        TourAggregator.sortByPrice(selectByOption);
        TourAggregator.printTours(selectByOption);

        skyTour.addClient(client, selectByOption.get(0));
    }
}