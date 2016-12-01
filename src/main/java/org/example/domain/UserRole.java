package org.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigInteger;

/**
 * Created by Dom Raven on 16/11/2016.
 */
@Entity
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private BigInteger userRole_id;

    private RoleType role;

    public BigInteger getId() {
        return userRole_id;
    }

    public void setId(BigInteger id) {
        this.userRole_id = id;
    }

    public RoleType getRole() {
        return role;
    }

    public void setRole(RoleType role) {
        this.role = role;
    }
}
