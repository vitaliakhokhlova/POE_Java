package com.formation.start.geometry;

import java.util.Objects;

public class Point {

    //TP recopier Point



    private double x = 0;
    private double y = 0;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return Double.compare(point.getX(), getX()) == 0 &&
                Double.compare(point.getY(), getY()) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(getX(), getY());
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }



    void moveTo(double x, double y){
        this.x = x;
        this.y = y;
    }

    void display(){
        System.out.println("("+x+", "+y+")");
    }

    void moveRelative(double x, double y){
        this.x += x;
        this.y += y;
    }

    Point recopier(){
        Point p = new Point(this.x, this.y);
        return p;
    }

    void recopier(Point p){
        this.x = p.x;
        this.y = p.y;
    }
}
