package domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class Time implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "time", cascade = CascadeType.ALL)
    private List<Jogador> jogadores;

    @OneToOne(cascade = CascadeType.ALL)
    private Tecnico tecnico;

    @ManyToMany
    @JoinTable(name = "time_campeonato",
    joinColumns = {
            @JoinColumn(name = "equipe_id")
    },
    inverseJoinColumns = {
            @JoinColumn(name = "campeonato_id")
    })
    private List<Campeonato> campeonatos;
}
