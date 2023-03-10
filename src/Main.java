import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devIvan = new Dev();
        devIvan.setNome("Ivan");
        devIvan.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ivan:" + devIvan.getConteudosInscritos());
        devIvan.progredir();
        devIvan.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Ivan:" + devIvan.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Ivan:" + devIvan.getConteudosConcluidos());
        System.out.println("XP:" + devIvan.calcularTotalXp());

        System.out.println("");
        System.out.println("-------");
        System.out.println("");

        Dev devJoana = new Dev();
        devJoana.setNome("Joana");
        devJoana.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoana.getConteudosInscritos());
        devJoana.progredir();
        devJoana.progredir();
        devJoana.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoana.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoana.getConteudosConcluidos());
        System.out.println("XP:" + devJoana.calcularTotalXp());
    }
}
