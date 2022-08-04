import br.com.regissanme.desafio.dominio.Bootcamp;
import br.com.regissanme.desafio.dominio.Curso;
import br.com.regissanme.desafio.dominio.Dev;
import br.com.regissanme.desafio.dominio.Mentoria;

import java.time.LocalDate;

/**
 * Projeto: desafio-dio-poo
 * Desenvolvedor: Reginaldo Santos de Medeiros (regissanme)
 * Data: 03/08/2022
 * Hora: 23:12
 */
public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do Curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição do Curso de js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição da Mentoria Java");
        mentoria1.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Spring Framework Experience");
        bootcamp.setDescricao("Descrição do Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev dev1 = new Dev();
        dev1.setNome("Reginaldo");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos dev1: " + dev1.getConteudosInscritos());

        dev1.progredir();
        System.out.println("Conteudos inscritos dev1: " + dev1.getConteudosInscritos());
        System.out.println("Conteudos concluídos dev1: " + dev1.getConteudosConcluidos());
        dev1.progredir();
        System.out.println("XP: " + dev1.calcularTotalXp());

        System.out.println("====================================================");
        Dev dev2 = new Dev();
        dev2.setNome("Regis Sanme");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos dev2: " + dev2.getConteudosInscritos());

        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteudos inscritos dev2: " + dev2.getConteudosInscritos());
        System.out.println("Conteudos concluídos dev2: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());


    }
}
