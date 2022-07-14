package com.company;

public class Rectangle {
    private int length;
    private int width;

    void setLength (int length) {
        this.length = length;}
    void setWidth (int width){
        this.width = width;}

int getLength (){
        return length;}
int getWidth (){
        return width;}


    private void area (){
        System.out.print(length * width);
    }

    void area1 (){
        area();
    }



     /* Main menu:
    Rectangle rectangle = new Rectangle();
rectangle.setLength(15);
rectangle.setWidth(7);

        System.out.println("The length of the rectangle is:  " + rectangle.getLength());
        System.out.println("The width of the rectangle is: " + rectangle.getWidth());
        System.out.print("The area of the rectangle is: "); rectangle.area1();
    */



}
