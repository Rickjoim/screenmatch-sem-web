package br.com.alura.screenmath.model;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Episodios {
    private Integer temporada;
    private String tituloEpisodios;
    private Integer numeroEpisodios;
    private Double avaliacao;
    private LocalDate dataLancamento;

    public Episodios(Integer numeroTemporada, DadosEpesodio dadosEpisodios) {
        this.temporada = numeroTemporada;
        this.tituloEpisodios = dadosEpisodios.titulo();
        this.numeroEpisodios = dadosEpisodios.numero();

        try{
            this.avaliacao = Double.valueOf(dadosEpisodios.avaliacao());
        } catch (NumberFormatException ex) {
            this.avaliacao = 0.0;
        }

        try{
            this.dataLancamento = LocalDate.parse(dadosEpisodios.dataLancamento());
        } catch (DateTimeParseException ex) {
            this.dataLancamento = null;
        }

    }

    public Integer getTemporada() {
        return temporada;
    }

    public void setTemporada(Integer temporada) {
        this.temporada = temporada;
    }

    public String getTituloEpisodios() {
        return tituloEpisodios;
    }

    public void setTituloEpisodios(String tituloEpisodios) {
        this.tituloEpisodios = tituloEpisodios;
    }

    public Integer getNumeroEpisodios() {
        return numeroEpisodios;
    }

    public void setNumeroEpisodios(Integer numeroEpisodios) {
        this.numeroEpisodios = numeroEpisodios;
    }

    public Double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    @Override
    public String toString() {
        return "temporada=" + temporada +
                ", tituloEpisodios='" + tituloEpisodios + '\'' +
                ", numeroEpisodios=" + numeroEpisodios +
                ", avaliacao=" + avaliacao +
                ", dataLancamento=" + dataLancamento;
    }
}
