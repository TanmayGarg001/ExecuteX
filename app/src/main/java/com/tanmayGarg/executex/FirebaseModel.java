package com.tanmayGarg.executex;

public class FirebaseModel {
    private String title;
    private String description;

    public FirebaseModel() {
    }

    public FirebaseModel(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

}