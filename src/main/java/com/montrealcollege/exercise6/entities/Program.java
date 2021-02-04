package com.montrealcollege.exercise6.entities;

import java.util.Date;

public class Program {

    private String name;
    private Integer duration;
    private Date startDate;

    public Program() {
    }

    public Program(String name, Integer duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void firstHere() {
        startDate = new Date();
    }

    @Override
    public String toString() {
        return "Program{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", startDate=" + startDate +
                '}';
    }
}
