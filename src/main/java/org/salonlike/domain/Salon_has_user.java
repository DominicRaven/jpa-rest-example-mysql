package org.salonlike.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Dom Raven on 28/11/2016.
 */
public class Salon_has_user {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int salon_user_id;

    private User user_id;

    private Salon salon_id;

    public int getSalon_user_id() {
        return salon_user_id;
    }

    public User getUser_id() {
        return user_id;
    }

    public Salon getSalon_id() {
        return salon_id;
    }
}
