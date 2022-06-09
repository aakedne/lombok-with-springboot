package com.example.lombokwithspringboot;


import lombok.*;

@Data
//@ToString
//@EqualsAndHashCode
//@Getter
//@Setter
//@RequiredArgsConstructor
//NoArsConstructor
//AllArgsConstructor
public class UserCreateRequest {
    private String userName;
    private String userPassword;

}
