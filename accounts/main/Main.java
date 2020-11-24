package by.epam.accounts.main;

// 4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
//Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам,
//имеющим положительный и отрицательный балансы отдельно.

public class Main {

    public static void main(String[] args) {
        Bank randomBank = new Bank("Belarusbank ");

        Client pavlov = new Client("Alex ","Pavlov", "ASD09800076543");
        Client markov = new Client("Alexandr", "Markov", "ZXC67800095434");

        randomBank.addNewClient(pavlov);
        randomBank.addNewClient(markov);

        pavlov.openAccount(new Account(1001.16));
        pavlov.openAccount(new Account(2000.88));
        pavlov.openAccount(new Account(-5000.67));
        pavlov.openAccount(new Account(3000.56));

        markov.openAccount(new Account(1500.80));
        markov.openAccount(new Account(-1000.34));
        markov.openAccount(new Account(10000.56));
        markov.openAccount(new Account(5000.78));

        //lock check
        System.out.println(randomBank.getClient("ASD09876543").getAccount(1).getStatus());
        randomBank.getClient("ASD09876543").blockAccount(1);
        System.out.println(randomBank.getClient("ASD09876543").getAccount(1).getStatus() + "\n");

        //sorting check
        System.out.println(randomBank.getClient("ASD09876543").getInformation());
        randomBank.getClient("ASD09876543").sortByBalance();
        System.out.println(randomBank.getClient("ASD09876543").getInformation());
        randomBank.getClient("ASD09876543").sortByBalance();
        System.out.println(randomBank.getClient("ASD09876543").getInformation());

        //print the total balance
        System.out.println(pavlov.toString() + ", total balance: " + pavlov.getBalance());
        System.out.println(markov.toString() + ", total balance: " + markov.getBalance());

        //print balance of positive accounts
        System.out.println();
        System.out.println(pavlov.toString() + ", positive balance: " + pavlov.getBalancePositiveAccounts());
        System.out.println(markov.toString() + ", positive balance: " + markov.getBalancePositiveAccounts());

        //print balance of negative accounts
        System.out.println();
        System.out.println(pavlov.toString() + ", negative balance: " + pavlov.getBalanceNegativeAccounts());
        System.out.println(markov.toString() + ", negative balance: " + markov.getBalanceNegativeAccounts());
    }
}