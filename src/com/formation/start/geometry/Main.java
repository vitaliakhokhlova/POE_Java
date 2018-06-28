package com.formation.start.geometry;

public class Main {
    public static void main(String[] args) {

        Point p1 = new Point(1,2);
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
        System.out.println(p1.equals(p2));
    }
}
