package com.tradisys.odyssey.apg.s2w.domain;

import java.util.Date;
import java.util.List;

public class Customer extends BasicPrincipal {

    private static final long serialVersionUID = 1397494878295063429L;

    private String firstName;
    private String secondName;
    private String bsn;
    private String address;
    private Date birth;

    public Customer() {
    }

    public Customer(String firstName, String secondName, String bsn, String address, Date birth) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.bsn = bsn;
        this.address = address;
        this.birth = birth;
    }

    @Override
    public String getType() {
        return Role.CUSTOMER.name();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getBsn() {
        return bsn;
    }

    public void setBsn(String bsn) {
        this.bsn = bsn;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;

        Customer customer = (Customer) o;

        if (!getFirstName().equals(customer.getFirstName())) return false;
        if (!getSecondName().equals(customer.getSecondName())) return false;
        if (!getBsn().equals(customer.getBsn())) return false;
        if (!getAddress().equals(customer.getAddress())) return false;
        return getBirth().equals(customer.getBirth());
    }

    @Override
    public int hashCode() {
        int result = getFirstName().hashCode();
        result = 31 * result + getSecondName().hashCode();
        result = 31 * result + getBsn().hashCode();
        result = 31 * result + getAddress().hashCode();
        result = 31 * result + getBirth().hashCode();
        return result;
    }
}
