package com.springbasics.triangle;

public class MakeTriangle {
    private String type;
    private int sideLength;
    private  MakePoint pointA;
    private  MakePoint pointB;
    private MakePoint pointC;

    public MakeTriangle(MakePoint pointA, MakePoint pointB, MakePoint pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public MakeTriangle(String type, int sideLength) {
        this.type = type;
        this.sideLength = sideLength;
    }

    public MakeTriangle(String type) {
        this.type = type;
    }

    public MakeTriangle(int sideLength) {
        this.sideLength = sideLength;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void drawTriangle(){
        System.out.print("Triangle made with points ("+pointA.getX()+","+pointA.getY()+")");
        System.out.print(",("+pointB.getX()+","+pointB.getY()+")");
        System.out.println(",("+pointC.getX()+","+pointC.getY()+")");
    }
}
