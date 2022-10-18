package com.springbootpractice.springboot.practice.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ShiftOutgoingId implements Serializable {
    private static final long serialVersionUID = -6594646777367622118L;
    private Long unitId;
    private String facilityId;
    private String regionId;
    private String date;
    private String shift;

    public Long getUnitId() {
        return unitId;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        this.facilityId = facilityId;
    }

    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }
}
