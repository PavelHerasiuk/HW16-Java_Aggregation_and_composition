package by.epam.accounts.main;

import java.util.ArrayList;

class Bank {
    private String name;
    private final ArrayList<Client> clients;

    Bank(String name) {
        this.name = name;
        this.clients = new ArrayList<>();
    }

    public Client getClient(String passportID) {
        for (Client person : clients) {
            if (person.getPassportID().equals(passportID)) {
                return person;
            }
        }
        return null;
    }

    public void addNewClient(Client client) {
        clients.add(client);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("Bank %s has %d customers", name, clients.size());
    }
}