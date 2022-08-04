package br.com.regissanme.desafio.dominio;

/**
 * Projeto: desafio-dio-poo
 * Desenvolvedor: Reginaldo Santos de Medeiros (regissanme)
 * Data: 03/08/2022
 * Hora: 23:31
 *
 * Classe (Mãe, Pai, Base) para representar os conteúdos oferecidos em um bootcamp.
 * Os conteúdos podem ser, como exemplo, as Mentorias, os Cursos, etc.
 */
public abstract class Conteudo {

    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

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

    public abstract double calcularXp();
}
