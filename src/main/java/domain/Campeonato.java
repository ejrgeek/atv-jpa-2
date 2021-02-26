package domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Campeonato implements Serializable {

    @Id
    private Long id;

    private String nome, dataInicio, dataFim;

    @ManyToMany
    private List<Time> times;

    public Campeonato() {}

    public Campeonato(String nome, String dataInicio, String dataFim, List<Time> times) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.times = times;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public List<Time> getTimes() {
        return times;
    }

    public void setTimes(List<Time> times) {
        this.times = times;
    }
}
