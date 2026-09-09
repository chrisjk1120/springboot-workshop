package se.lexicon.workshops.springBoot.entities;

import jakarta.persistence.*;
import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

/*
classDiagram
    class Address {
        -Long id
        -String street
        -String city
        -String zipCode
    }
    class UserProfile {
        -Long id
        -String nickname
        -String phoneNumber
        -String bio
    }
    class Customer {
        -Long id
        -String firstName
        -String lastName
        -String email
        -Instant createdAt
        -Address address
        -UserProfile profile
    }
 */
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable=false)
    private Long id;

    @Column(length=255)
    private String street;

    @Column(length=90)
    private String city;

    @Column(length=15)
    private String zipCode;

}
