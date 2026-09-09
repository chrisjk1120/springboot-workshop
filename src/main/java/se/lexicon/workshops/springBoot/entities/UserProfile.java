package se.lexicon.workshops.springBoot.entities;

import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor



/*     class UserProfile {
        -Long id
        -String nickname
        -String phoneNumber
        -String bio
    } */

@Entity
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable=false)
    private Long id;

    @Column(length=50)
    private String nickname;

    @Column(length=20)
    private String phoneNumber;

    @Column(length=255)
    private String bio;
}
