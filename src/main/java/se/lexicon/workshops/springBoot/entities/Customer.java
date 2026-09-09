package se.lexicon.workshops.springBoot.entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.Instant;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

/*
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
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Long id;

    @Column(length=100)
    private String firstName;

    @Column(length=50)
    private String lastName;

    @Column(length=100)
    private String email;

    Instant createdAt;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="",referencedColumnName = "id")
    Address address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="user_profile_id",referencedColumnName = "id")
    UserProfile profile;

}
