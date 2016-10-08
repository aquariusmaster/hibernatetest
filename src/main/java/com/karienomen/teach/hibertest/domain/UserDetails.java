package com.karienomen.teach.hibertest.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by karienomen on 08.10.16.
 */
@Entity(name = "USERS")
public class UserDetails {

    @Id
    @Column(name = "USER_ID")
    private int userId;
    @Column(name = "USERNAME")
    private String userName;

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
}
