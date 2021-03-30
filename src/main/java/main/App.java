package main;

import dao.CampeonatoDao;
import dao.TimeDao;
import domain.Campeonato;
import domain.Jogador;
import domain.Tecnico;
import domain.Time;

import java.util.Arrays;
import java.util.Calendar;

public class App {
    public static void main(String[] args) {

        CampeonatoDao campeonatoDao = new CampeonatoDao();
        TimeDao timeDao = new TimeDao();

        Campeonato campeonatoFafic = Campeonato.builder()
                .nome("Campeonato Fafic")
                .dataInicio(new Calendar.Builder().setDate(2021, 03, 15).build())
                .dataFim(new Calendar.Builder().setDate(2021, 05, 15).build()).build();

        campeonatoDao.saveOrUpdate(campeonatoFafic);

        Jogador erlon = new Jogador();
        erlon.setPosicao("Goleiro");
        erlon.setTitular(true);
        erlon.setNome("Erlon");

        Tecnico luc = new Tecnico();
        luc.setNome("Luciano");

        campeonatoFafic = campeonatoDao.findBtId(Campeonato.class, 1L);

        Time timeFafic = Time.builder()
                .nome("Time Fafic")
                .campeonatos(Arrays.asList(campeonatoFafic))
                .jogadores(Arrays.asList(erlon))
                .tecnico(luc).build();

        timeDao.saveOrUpdate(timeFafic);

    }
}
