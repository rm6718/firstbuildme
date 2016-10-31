package com.ironyard.inspo.data;

import javax.persistence.*;
import java.util.List;

/**
 * Created by reevamerchant on 10/30/16.
 */

public class Friend {

    private String name;

    public Friend(String name, String allergies, boolean sleepover, String birthday, long id) {
        this.name = name;
        this.allergies = allergies;
        this.sleepover = sleepover;
        this.birthday = birthday;
        this.id = id;
    }

    private String allergies;
    private boolean sleepover;
    private String birthday;
    private long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAllergies() {
        return allergies;
    }

    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }

    public boolean isSleepover() {
        return sleepover;
    }

    public void setSleepover(boolean sleepover) {
        this.sleepover = sleepover;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}



