package com.karienomen.hibertest.domain;

import javax.persistence.Entity;

/**
 * Created by karienomen on 21.10.16.
 */
@Entity
public class PC extends Computer {

    private String architecture;

    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    @Override
    public String toString() {
        return "PC{Id=" + super.getComputerId() + '\'' +
                "name=" + super.getName() + '\'' +
                "architecture='" + architecture + '\'' +
                '}';
    }
}
