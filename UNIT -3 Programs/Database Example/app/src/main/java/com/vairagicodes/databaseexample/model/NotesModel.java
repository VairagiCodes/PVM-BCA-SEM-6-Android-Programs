package com.vairagicodes.databaseexample.model;

public class NotesModel {

    private String title;
    private String description;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }



    public NotesModel(String title, String description) {
        this.title = title;
        this.description = description;
    }




}
