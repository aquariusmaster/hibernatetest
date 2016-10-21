package com.karienomen.hibertest.domain;

import javax.persistence.Entity;

/**
 * Created by karienomen on 21.10.16.
 */
@Entity
public class Notebook extends Computer {

    private float screenSize;

    public float getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Notebook{Id=" + super.getComputerId() + '\'' +
                "name" + super.getName() + '\'' +
                "screenSize=" + screenSize +
                '}';
    }
}
