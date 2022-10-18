package com.springbootpractice.springboot.practice.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class ShiftOutgoing {
    @EmbeddedId
    private ShiftOutgoingId shiftOutgoingId;
    private long cencusAtStffCll;
    private long census;

    public ShiftOutgoingId getShiftOutgoingId() {
        return shiftOutgoingId;
    }

    public void setShiftOutgoingId(ShiftOutgoingId shiftOutgoingId) {
        this.shiftOutgoingId = shiftOutgoingId;
    }

    public long getCencusAtStffCll() {
        return cencusAtStffCll;
    }

    public void setCencusAtStffCll(long cencusAtStffCll) {
        this.cencusAtStffCll = cencusAtStffCll;
    }

    public long getCensus() {
        return census;
    }

    public void setCensus(long census) {
        this.census = census;
    }
}
