package com.karienomen.hibertest.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by karienomen on 09.10.16.
 */
@Entity
public class Computer {
    @Id @GeneratedValue
    private int computerId;
    private String name;

    public int getComputerId() {
        return computerId;
    }

    public void setComputerId(int computerId) {
        this.computerId = computerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "notebookId=" + computerId +
                ", name='" + name + '\'' +
                '}';
    }
}
