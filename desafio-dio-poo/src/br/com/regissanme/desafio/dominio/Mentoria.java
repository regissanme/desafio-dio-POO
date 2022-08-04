package br.com.regissanme.desafio.dominio;

import java.time.LocalDate;

/**
 * Projeto: desafio-dio-poo
 * Desenvolvedor: Reginaldo Santos de Medeiros (regissanme)
 * Data: 03/08/2022
 * Hora: 23:12
 */
public class Mentoria {

    private String titulo;
    private String descricao;
    private LocalDate data;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                '}';
    }
}
