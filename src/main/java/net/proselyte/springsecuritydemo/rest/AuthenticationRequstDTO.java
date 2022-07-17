package net.proselyte.springsecuritydemo.rest;

import lombok.Data;

@Data
public class AuthenticationRequstDTO {
    private String email;
    private String password;
}
