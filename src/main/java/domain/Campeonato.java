package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Campeonato implements Serializable {

    @Id
    private Long id;

    private String nome;

    @ManyToMany
    private List<Time> times;

    @Temporal(TemporalType.DATE)
    private LocalDate dataInicio, dataFim;

}
