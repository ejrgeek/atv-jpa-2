package domain;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("T")
public class Tecnico extends Profissional {

    @OneToOne
    private Time treina;

    public Tecnico() {}

    public Tecnico(String nome, Time time, Time treina) {
        super(nome, time);
        this.treina = treina;
    }

    public Time getTreina() {
        return treina;
    }

    public void setTreina(Time treina) {
        this.treina = treina;
    }
}
