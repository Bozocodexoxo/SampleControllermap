package com.vamshi.education.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "students")
public class Student {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotBlank(message = "name must be not blank")
    @Size(min = 3,message = "please enter more than 3 characters")
    private String FirstName;
    @NotBlank(message = "name must be not blank")
    @Size(min = 3,message = "please enter more than 3 characters")
    private String LastName;
    @NotBlank(message = "Email must be not blank")
 @jakarta.validation.constraints.Email(message = "please enter email")
    private String Email;
    @NotBlank(message = "please enter the phone number")
    @Pattern(regexp = "(^$|[0-9]{10})",message = "mobile number must be 10")
    private String PhoneNumber;
    @NotBlank(message = "please enter the subject")
@Size(min = 5,message = "subject must be atleast 5 words")
    private String Message;



}
