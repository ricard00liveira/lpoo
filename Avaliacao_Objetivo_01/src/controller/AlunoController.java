package controller;

import model.Aluno;

public class AlunoController {
    public static void main(String[] args) {
        //Criar, no mínimo, 6 instâncias da classe de modelo, alternando entre construtores do tipo
        //padrão e parametrizado.

        Aluno a1 = new Aluno();
        System.out.println(a1);
        Aluno a2 = new Aluno();
        System.out.println(a2);
        Aluno a3 = new Aluno(3L,103,"João","Medeiros","joao_medeiros@lpoo.com");
        System.out.println(a3);
        Aluno a4 = new Aluno(4L,104,"Cátia","Bittencourt","catia_bitten@lpoo.com");
        System.out.println(a4);
        Aluno a5 = new Aluno(5L,"Robson");
        System.out.println(a5);
        Aluno a6 = new Aluno(6L,"Laísa");
        System.out.println(a6);

        //Os dois objetos criados com o construtor padrão devem ter seus estados modificados, em
        //todos os seus atributos, com os métodos setters

        a1.setId(1L);
        a1.setCpf(101);
        a1.setNome("Jéssica");
        a1.setSobrenome("Silveira");
        a1.setEmail("jessica_silveira@lpoo.com");

        System.out.println("\nAluno {" +
                "id = " + a1.getId() +
                ", cpf = " + a1.getCpf() +
                ", nome = '" + a1.getNome() + '\'' +
                ", sobrenome = '" + a1.getSobrenome() + '\'' +
                ", email = '" + a1.getEmail() + '\'' +
                '}');

        a2.setId(2L);
        a2.setCpf(102);
        a2.setNome("Flaviane");
        a2.setSobrenome("Espinhosa");
        a2.setEmail("flaviane_espinhosa@lpoo.com");

        System.out.println("\nAluno {" +
                "id = " + a2.getId() +
                ", cpf = " + a2.getCpf() +
                ", nome = '" + a2.getNome() + '\'' +
                ", sobrenome = '" + a2.getSobrenome() + '\'' +
                ", email = '" + a2.getEmail() + '\'' +
                '}');
    }
}
