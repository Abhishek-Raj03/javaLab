package javaLab7_10;

public abstract class Vehicle {
    int yom;
    Vehicle(int yom){
    	this.yom=yom; 
    }
    public abstract String getData();
    public abstract void putData();
}
