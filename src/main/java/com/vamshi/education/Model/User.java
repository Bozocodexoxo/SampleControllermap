package com.vamshi.education.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    int id;
    @NotBlank(message = "please enter username")
    @Size(min=4,message ="please enter more than 4 chars" )

    private String username;
    @NotBlank(message = "please enter the message")
    @Size(min=4,message = "enter the password")
    private String password;

}
