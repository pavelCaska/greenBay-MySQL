package com.pc.greenbay.model.response;

import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserListDTO {
    private UUID id;
    private String username;
    private String password;
    private double balance;
    private String roles;

}
