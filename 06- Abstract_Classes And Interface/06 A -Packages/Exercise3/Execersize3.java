// package com.codewithharry.shape;

class Rectangle{
    private int l,b;
    public void setDimension(int l , int b){
        this.l=l;
        this.b=b;
    }
    public int getArea(){
        return l*b;
    }
}
class Sqare{
    private int r;
    public void setDimension1(int r){
        this.r=r;
    }
    public int getArea1(){
        return r*r;
    }
}
class Circle{
    protected double r;
    public void setDimesion2(double r){
        this.r=r;
    }
    public double getArea2(){
        return 3.14*r*r;
    }
}
class Cylinder extends Circle{
    private double h;
    public void setDimension3(double r, double h){
        this.r=r;
        this.h=h;
    }
    public double getVolume(){
        return 3.14*r*r*h;
    }
}
class Sphere extends Circle{
    public double getVolume1(){
        return (4/3)*3.14*r*r;
    }
}
public class Execersize3 {
    public static void main(String[] args) {
        Rectangle c = new Rectangle();
        c.setDimension(5,4);
        System.out.println(c.getArea());
        Sqare b = new Sqare();
        b.setDimension1(10);
        System.out.println(b.getArea1());
        Cylinder a = new Cylinder();
        a.setDimension3(5, 10);
        System.out.println(a.getArea2());
        System.out.println(a.getVolume());
        Sphere d = new Sphere();
        d.setDimesion2(50);
        System.out.println(d.getVolume1());
    }
}
