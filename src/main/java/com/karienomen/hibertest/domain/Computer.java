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
    private String model;

    public int getComputerId() {
        return computerId;
    }

    public void setComputerId(int computerId) {
        this.computerId = computerId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "notebookId=" + computerId +
                ", model='" + model + '\'' +
                '}';
    }
}
