package br.com.regissanme.desafio.dominio;

/**
 * Projeto: desafio-dio-poo
 * Desenvolvedor: Reginaldo Santos de Medeiros (regissanme)
 * Data: 03/08/2022
 * Hora: 23:12
 *
 * Classe que representa um Conteúdo do tipo Curso, com suas especificidades.
 */
public class Curso extends Conteudo {


    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", XP='" + calcularXp() + '\'' +
                '}';
    }
}
