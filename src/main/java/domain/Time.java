package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Time implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "equipe")
    private List<Profissional> profissionals;

    @ManyToMany
    @JoinTable(name = 'equipe_campeonato',
    joinColumns = {
            @JoinColumn(name = "equipe_id")
    },
    inverseJoinColumns = {
            @JoinColumn(name = 'campeonato_id')
    })

    private List<Campeonato> campeonatos;
}
