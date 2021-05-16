package com.example.entrevueSpringBoot.entrevueentities;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name="Film")
@Data
@NoArgsConstructor
@RequiredArgsConstructor(staticName = "newInstance")
public class Film implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String titre;
    @NonNull
    private String description;
    @ManyToMany
    @JoinTable(name="FilmActor")
    private Collection<Actor> acteurs;
}
