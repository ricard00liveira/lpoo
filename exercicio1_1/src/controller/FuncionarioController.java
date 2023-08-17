package controller;

import model.Funcionario;

public class FuncionarioController {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        System.out.println(f1);
        Funcionario f2 = new Funcionario("Ricardo",10000);
        System.out.println(f2);

        f1.setNome("Marcelo");
        f1.setSalario(9990);

        System.out.println("Funcionário: " + f1.getNome() + "\nSalário: " + f1.getSalario());
    }
}
