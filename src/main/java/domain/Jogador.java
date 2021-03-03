package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@DiscriminatorValue("J")
public class Jogador extends Profissional{
    private String posicao;

    private boolean isTitular;

    @ManyToOne
    private Time time;
}
