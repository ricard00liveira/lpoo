package controller;

import model.Aluno;

public class AlunoController {
    public static void main(String[] args) {
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


    }
}
