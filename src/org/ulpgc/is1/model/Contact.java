package org.ulpgc.is1.model;

import java.util.Date;

public class Contact {
    public Date start;
    public Date end;
    public int budget;

    public Contact(Date start, Date end, int budget) {
        this.start = start;
        this.end = end;
        this.budget = budget;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}
