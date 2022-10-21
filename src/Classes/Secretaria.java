package Classes;

import java.util.Scanner;

public class Secretaria extends Pessoa {

    Scanner teclado = new Scanner(System.in);

    private String telefone;

    public Secretaria(String nome, Integer idade, String cpf, String telefone) {
        super(nome, idade, cpf);
        this.telefone = telefone;
    }

    /* Medico m1 = new Medico("Jefferson", 36, "001.003.002-90");
    Paciente p1 = new Paciente(null, 0, null);*/
    public void imprimir() {

        System.out.println("💉----------Clinica J.M----------💉\n" + "Consulta ↴");
        System.out.println("Agendado por: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("- - - - - - - - - - - - - - -");
    }


}
