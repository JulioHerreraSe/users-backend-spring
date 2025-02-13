package com.springboot.backend.julio.usersapp.users_backend.auth;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class SimpleGrantedAuthorityJsonCreator {

    public SimpleGrantedAuthorityJsonCreator(@JsonProperty("authority") String role) {

    }
}
