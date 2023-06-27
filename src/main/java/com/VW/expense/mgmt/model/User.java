package com.VW.expense.mgmt.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.UUID;
/**
 * User class Representing 'users'
 *
 * @author Ayush
 */
public class User {

    private final UUID id;
    private final String name;

    public User(UUID id, String name){
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
