package org.ulpgc.is1.model;

public class Phone {
    public String number;

    public Phone(String number) {
        this.number = number;
    }

    public boolean isValid() {
        return true;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
