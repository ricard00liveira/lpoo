package controller;

import model.Aluno;

import java.util.*;
import java.util.stream.Collectors;

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

        //No controlador criado na questão 1 adicione dois tipos de coleções de objetos, List
        //e Map. Em cada coleção adicione todos os objetos que você criou nesse controlador, tendo o
        //cuidado de inserir os objetos ordenados pelo campo id (se não tiver um, crie-o), na ordem
        //crescente, e imprima esses objetos

        //List
        List<Aluno> alunosList = new ArrayList<>();
        alunosList.add(a1);
        alunosList.add(a2);
        alunosList.add(a3);
        alunosList.add(a4);
        alunosList.add(a5);
        alunosList.add(a6);

        System.out.println("\nLista de Alunos:\n" + alunosList);

        //Map
        Map<Long, Aluno> alunosMap = new HashMap<>();
        alunosMap.put(a1.getId(),a1);
        alunosMap.put(a2.getId(),a2);
        alunosMap.put(a3.getId(),a3);
        alunosMap.put(a4.getId(),a4);
        alunosMap.put(a5.getId(),a5);
        alunosMap.put(a6.getId(),a6);

        System.out.println("\nImprimindo Coleção Map:\n" + alunosMap);

        //Também imprima o objeto de id=5 de cada coleção, se
        //essa operação for possível na coleção.

        //List id 5
        Aluno alunoFind = alunosList.stream().filter(c -> c.getId() == 5).findAny().orElse(null);
        System.out.println("\nList Find: #5\n" + alunoFind);
        //Map id 5
        System.out.println("Imprimindo id=5 do Map:\n"+ alunosMap.get(a5.getId()));

        //Por fim, ordene os objetos pelo campo id, na ordem
        //decrescente, com uma das técnicas apresentadas em sala de aula e imprima as coleções que
        //você reordenou.

        //List
        System.out.println(alunosList.stream().sorted(Comparator.comparing(Aluno::getId).reversed()).collect(Collectors.toList()));
        System.out.println(alunosList);
    }
}
