package dao;

import domain.Jogador;
import domain.Time;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DaoTime extends BaseDao<Time> {

    public Time buscarPorNomeTime(Class<Time> cls, String nome){
        em.getTransaction().begin();
        Time obj = em.find(cls, nome);
        em.getTransaction().commit();
        em.close();
        return obj;
    }

    public Time buscarTimePorNomeJogador(Class<Time> cls, String nomeJogador){
        return new Time();
    }

    public Time buscarCampeonatosPorTime(Class<Time> cls, String nomeJogador){
        return new Time();
    }

}
