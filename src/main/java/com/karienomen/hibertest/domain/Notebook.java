package com.karienomen.hibertest.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by karienomen on 09.10.16.
 */
@Entity
public class Notebook {
    @Id @GeneratedValue
    private int notebookId;
    private String model;

    public int getNotebookId() {
        return notebookId;
    }

    public void setNotebookId(int notebookId) {
        this.notebookId = notebookId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "notebookId=" + notebookId +
                ", model='" + model + '\'' +
                '}';
    }
}
