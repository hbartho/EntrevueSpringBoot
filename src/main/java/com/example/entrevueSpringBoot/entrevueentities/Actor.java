package com.example.entrevueSpringBoot.entrevueentities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name="Actor")
@Data
@NoArgsConstructor
@RequiredArgsConstructor(staticName = "newInstance")
public class Actor implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private String nom;
    @NonNull
    private String prenom;
    @ManyToMany(mappedBy = "acteurs", fetch = FetchType.LAZY)
    private Collection<Film> films;

    public Long getId() {
        return id;
    }

    @JsonIgnore
    public Collection<Film> getFilms() {
        return films;
    }
}
