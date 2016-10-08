package com.karienomen.teach.hibertest.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by karienomen on 08.10.16.
 */
@Entity
@Table(name = "user_details")
public class UserDetails {

    @Id
    private int userId;
    private String userName;
    private Date joinedDate;
    private String address;
    private String descriptions;


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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", joinedDate=" + joinedDate +
                ", address='" + address + '\'' +
                ", descriptions='" + descriptions + '\'' +
                '}';
    }
}
