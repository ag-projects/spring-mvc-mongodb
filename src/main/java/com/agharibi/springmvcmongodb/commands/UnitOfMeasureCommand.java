package com.agharibi.springmvcmongodb.commands;

public class UnitOfMeasureCommand {

    private String id;
    private String description;

    public UnitOfMeasureCommand() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
