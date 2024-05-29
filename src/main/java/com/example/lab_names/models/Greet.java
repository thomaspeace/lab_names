package com.example.lab_names.models;

// POJO
// private properties, public getters and setters, and an empty overloaded constructor

public class Greet{

    private String name;
    private String timeOfDay;

    public Greet(String name, String timeOfDay){
        this.name = name;
        this.timeOfDay = timeOfDay;
    }

    public Greet(){}

    public void setName(String name){
        this.name = name;
    }

    public void setTimeOfDay(String timeOfDay){
        this.timeOfDay = timeOfDay;
    }

    public String getName(){
        return this.name;
    }

    public String getTimeOfDay(){
        return this.timeOfDay;
    }

}
