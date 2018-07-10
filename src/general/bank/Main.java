package general.bank;


public class Main {

    public static void main(String[] args) {

        Client client1 = new Client("Vitalia", "Khokhlova");
        Client client2 = new Client("Jean-Yves", "Clemont");

        Account accountVita = new Account("1234", "ING", client1, 10000, 2);
        Account accountJY = new Account("5697", "ING", client2, 3000, 2);
        //accountVita.displayRIB();
        //System.out.println(accountVita);
        //accountVita.debit(213);
        accountVita.transfer(213, accountJY);
        //accountVita.withdraw(300);
        //accountVita.withdraw(10000);
        //accountVita.addInterest();
        //accountVita.close();
        //accountVita.withdraw(300);

        //System.out.println(client1);
        //System.out.println(client2);
        accountVita.printTransactionList();
        accountJY.printTransactionList();

        Transaction transaction = new Transaction(375, accountVita, accountJY);

        accountVita.printTransactionList();
        accountJY.printTransactionList();

        System.out.println(Client.getCompteur());
    }
}
