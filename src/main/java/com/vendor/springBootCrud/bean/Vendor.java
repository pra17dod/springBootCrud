package com.vendor.springBootCrud.bean;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name="Vendor")
public class Vendor {

    @Id
    private String vendorId;
    @NotBlank
    private String vendorName;

    public Vendor() {
    }



    public Vendor(String vendorId, @NotBlank String vendorName) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
    }



    public String getVendorId() {
        return vendorId;
    }
    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }
    public String getVendorName() {
        return vendorName;
    }
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((vendorId == null) ? 0 : vendorId.hashCode());
        result = prime * result + ((vendorName == null) ? 0 : vendorName.hashCode());
        return result;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vendor other = (Vendor) obj;
        if (vendorId == null) {
            if (other.vendorId != null)
                return false;
        } else if (!vendorId.equals(other.vendorId))
            return false;
        if (vendorName == null) {
            if (other.vendorName != null)
                return false;
        } else if (!vendorName.equals(other.vendorName))
            return false;
        return true;
    }



}

