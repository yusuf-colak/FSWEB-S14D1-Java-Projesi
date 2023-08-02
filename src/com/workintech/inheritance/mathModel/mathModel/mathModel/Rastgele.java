package com.workintech.inheritance.mathModel.mathModel.mathModel;

public class Rastgele {
    private double width;
    private double length;

    public Rastgele(double width, double length) {
        this.width = width<=0 ? 0 : width;
        this.length = length<=0 ? 0: length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public  double getArea(){
         return  width*length;
    }
}
