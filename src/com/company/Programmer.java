package com.company;

public class Programmer {

    private String name;
    private int age;

    String getName (){
        return name;}
    int getAge () {
        return age;}

    void setName (String name) {
        if (name.length() > 15) {
            System.out.println("Please, write just the name");}
        else {
               this.name = name;}}

    void setAge (int age) {
        if (age > 90 || age < 0) {
            System.out.println("Please write your age");}
        else { this.age = age; }
    }

    private void coding (){
        System.out.println("Coding in Java language");
    }

    void coding1 (){
        coding();}


}
