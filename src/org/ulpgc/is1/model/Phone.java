package org.ulpgc.is1.model;

public class Phone {
    public String number;

    public Phone(String number) {
        this.number = number;
        this.number = this.isValid() ? this.number : "XXXX";
    }

    public boolean isValid() {
        if (this.number.length() != 9) return false;

        try {
            Integer.parseInt(this.number);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
