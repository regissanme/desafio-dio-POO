package br.com.regissanme.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Projeto: desafio-dio-poo
 * Desenvolvedor: Reginaldo Santos de Medeiros (regissanme)
 * Data: 04/08/2022
 * Hora: 10:42
 *
 * Esta classe representa um bootcamp, da forma como é apresentado na DIO,
 * mas com regras de negócio próprias para esse projeto.
 */
public class Bootcamp {

    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private final Set<Dev> devsIncritos = new HashSet<>();
    private final Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsIncritos() {
        return devsIncritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void adicionarDev(Dev dev){
        this.devsIncritos.add(dev);
    }

    public void removerDev(Dev dev){
        this.devsIncritos.remove(dev);
    }

    public void adicionarConteudo(Conteudo conteudo){
        this.conteudos.add(conteudo);
    }

    public void removerConteudo(Conteudo conteudo){
        this.conteudos.remove(conteudo);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao);
    }
}
