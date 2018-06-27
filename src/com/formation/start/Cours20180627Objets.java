package com.formation.start;

public class Cours20180627Objets {

    public static void main(String[] args){

        /*Point p1 = new Point(1,2);
        Point p2 = p1.recopier();
        Point p3 = new Point();
        p3.recopier(p1);

        System.out.println(p1);
        p1.moveRelative(3.,7.);
        System.out.println(p1);
        System.out.println(p2);
        //p2.display();
        System.out.println(p3);
        //p3.display();

        p3.setX(10);
        //p3.display();
        System.out.println(p3);
        System.out.println(p1.equals(p2));*/

        Client client1 = new Client ("Vitalia","Khokhlova");
        Client client2 = new Client ("Jean-Yves","Clemont");

        Account accountVita = new Account("1234", "ING", client1, 10000, 2);
        Account accountJY = new Account("5697", "ING", client2, 3000, 2);
        //accountVita.displayRIB();
        //System.out.println(accountVita);
        //accountVita.debit(213);
        accountVita.transfer(213,accountJY);
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
}}
