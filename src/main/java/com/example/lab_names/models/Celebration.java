package com.example.lab_names.models;

// DTO

public class Celebration {

    private String message;

    public Celebration(String message){
        this.message = message;
    }

    public Celebration(){}

    public String getMessage(){
        return this.message;
    }

    public void setMessage(String message){
        this.message = message;
    }


}
