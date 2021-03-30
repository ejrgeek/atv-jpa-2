package domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class Campeonato implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany(mappedBy = "campeonatos", cascade = CascadeType.ALL)
    private List<Time> times;

    @Temporal(TemporalType.DATE)
    private Calendar dataInicio, dataFim;

}
