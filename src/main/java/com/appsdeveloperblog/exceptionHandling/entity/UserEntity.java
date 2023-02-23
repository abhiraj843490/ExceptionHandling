package com.appsdeveloperblog.exceptionHandling.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "euser")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue
    private Long userId;

    @Column(length = 50, nullable = false,unique = true)
    private String userName;
    @Column(length = 50, nullable = false,unique = true)
    private String password;
    @Column(length = 250, nullable = false,unique = true)
    private String email;
}
