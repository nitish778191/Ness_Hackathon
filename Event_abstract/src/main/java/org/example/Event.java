package org.example;

import java.util.Scanner;

abstract class Event {
    protected String name;
    protected String detail;
    protected String type;
    protected String organiser;

    public Event(String name, String detail, String type, String organiser) {
        this.name = name;
        this.detail = detail;
        this.type = type;
        this.organiser = organiser;
    }

    public String getName() {
        return name;
    }

    public String getDetail() {
        return detail;
    }

    public String getType() {
        return type;
    }

    public String getOrganiser() {
        return organiser;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setOrganiser(String organiser) {
        this.organiser = organiser;
    }

    abstract Double calculateAmount();
}