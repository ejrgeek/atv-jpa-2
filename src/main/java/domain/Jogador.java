package domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("J")
public class Jogador extends Profissional{
    private String posicao;

    private boolean isTitular;

    @OneToOne
    private Time time;

    public Jogador() {}

    public Jogador(String nome, Time time, String posicao, boolean isTitular, Time time1) {
        super(nome, time);
        this.posicao = posicao;
        this.isTitular = isTitular;
        this.time = time1;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public boolean isTitular() {
        return isTitular;
    }

    public void setTitular(boolean titular) {
        isTitular = titular;
    }

    @Override
    public Time getTime() {
        return time;
    }

    @Override
    public void setTime(Time time) {
        this.time = time;
    }
}
