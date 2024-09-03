import domain.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso Java");
        curso1.setCargaHoraria(30);

        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Springboot");
        curso2.setDescricao("Curso Springboot");
        curso2.setCargaHoraria(50);

        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição Mentoria Java");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        System.out.println("\n ------- Bootcamp -------");
        Dev dev1 = new Dev();
        dev1.setNome("Bruno");
        dev1.inscrever(bootcamp);
        System.out.println("Conteudos inscritos Bruno: " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteudos inscritos Bruno: " + dev1.getConteudosInscritos());
        System.out.println("Conteudos concluidos Bruno: " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteudos inscritos Bruno: " + dev1.getConteudosInscritos());
        System.out.println("Conteudos concluidos Bruno: " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteudos inscritos Bruno: " + dev1.getConteudosInscritos());
        System.out.println("Conteudos concluidos Bruno: " + dev1.getConteudosInscritos());
        System.out.println("XP Bruno: " + dev1.calcularTotalXp());



        Dev dev2 = new Dev();
        dev2.setNome("Ana");
        dev2.inscrever(bootcamp);
        System.out.println("\nConteudos inscritos Ana: " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Conteudos concluidos Ana: " + dev2.getConteudosInscritos());
        System.out.println("Xp Ana: " + dev2.calcularTotalXp());




    }

}
