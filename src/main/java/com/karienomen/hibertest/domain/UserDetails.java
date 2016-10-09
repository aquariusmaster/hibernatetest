package com.karienomen.hibertest.domain;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.*;

/**
 * Created by karienomen on 08.10.16.
 */
@Entity
@Table(name = "user_details")
public class UserDetails {

    @Id @GeneratedValue
    @Column(name = "user_id")
    private int userId;
    private String userName;
    private Date joinedDate;
    @ElementCollection
    @JoinTable(name = "user_address", joinColumns = @JoinColumn(name = "user_id"))
    @GenericGenerator(name = "sequence-gen", strategy = "sequence")
    @CollectionId(columns = {@Column(name = "address_id")}, type = @Type(type = "long"), generator = "sequence-gen")
    private Collection<Address> listOfAddresses = new ArrayList<Address>();
    private String descriptions;
    @OneToOne
    private Notebook notebook;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(Date joinedDate) {
        this.joinedDate = joinedDate;
    }

    public Collection<Address> getListOfAddresses() {
        return listOfAddresses;
    }

    public void setListOfAddresses(Collection<Address> listOfAddresses) {
        this.listOfAddresses = listOfAddresses;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Notebook getNotebook() {
        return notebook;
    }

    public void setNotebook(Notebook notebook) {
        this.notebook = notebook;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", joinedDate=" + joinedDate +
                ", listOfAddresses=" + listOfAddresses +
                ", descriptions='" + descriptions + '\'' +
                ", notebook=" + notebook +
                '}';
    }
}
