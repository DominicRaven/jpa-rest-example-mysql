package org.salonlike.domain;
import javax.persistence.*;

/**
 * Created by Dom Raven on 27/11/2016.
 */
@Entity
public class Salon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long salon_id;

    private String name;

    private String desc;

    private String addressLine1;

    private String addressLine2;

    public long getId() {
        return salon_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

}
