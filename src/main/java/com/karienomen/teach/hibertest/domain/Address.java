package com.karienomen.teach.hibertest.domain;

import javax.persistence.Embeddable;

/**
 * Created by karienomen on 08.10.16.
 */
@Embeddable
public class Address {

    private String street;
    private String city;
    private String region;
    private String country;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
