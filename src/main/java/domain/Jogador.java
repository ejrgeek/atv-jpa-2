package domain;

import lombok.*;

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
