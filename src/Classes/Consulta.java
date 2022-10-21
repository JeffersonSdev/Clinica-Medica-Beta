package Classes;

import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Consulta {

    Scanner tecladoString = new Scanner(System.in);
    Scanner tecladoDouble = new Scanner(System.in);
    Scanner tecladoInt = new Scanner(System.in);
    LocalDateTime data = LocalDateTime.now();

    private Secretaria secretaria;
    private Medico medico;
    private Paciente paciente;
    private Exame exame;
    private String descricao;
    private int menu;
    private String decisao;

    public Consulta(Secretaria secretaria) {
        this.secretaria = secretaria;
    }

    public void consulta() {

        System.out.println("Olá eu me chamo " + secretaria.nome + ", secretária da Clinica J.M, irei fazer seu exame, vamos lá ?");

        System.out.println("Qual exame você deseja fazer ?\n");
        System.out.println("💉 - - - - - - - - - - - - - - - - - - - - - - - - - 💉");
        System.out.println("   1 Exame de Urina              6 Teste de gravidez\n"
                + "   2 Hemograma                   7 Covid-19\n"
                + "   3 Colesterol                  8 Colesterol\n"
                + "   4 Glicemia                    9 Eletrocardiograma\n"
                + "   5 Teste Ergométrico          10 Ecocardiograma");
        System.out.println("💉 - - - - - - - - - - - - - - - - - - - - - - - - - 💉");
        menu = tecladoInt.nextInt();

        switch (menu) {
            case 1:
                decisao = "Urina";
                break;

            case 2:
                decisao = ("Hemograma");
                break;

            case 3:
                decisao = ("Colesterol");
                break;

            case 4:
                decisao = ("Glicemia");
                break;

            case 5:
                decisao = ("teste ergométrico");
                break;

            case 6:
                decisao = ("sangue");
                break;

            case 7:
                decisao = ("covid-19");
                break;

            case 8:
                decisao = ("colesterol");
                break;

            case 9:
                decisao = ("eletrocardiograma");
                break;

            case 10:
                decisao = ("fezes");
                break;

            default:
                System.out.println("Escolha uma opção válida ");
        }

        System.out.println("Como se chama ?");
        paciente.setNome(tecladoString.nextLine());

        System.out.println("Prazer em conhece-lo, " + paciente.getNome() + ".");

        System.out.println("Quantos anos você tem ?");
        paciente.setIdade(tecladoInt.nextInt());

        System.out.println("Poderia me falar qual o seu cpf ?");
        paciente.setCpf(tecladoString.nextLine());

        System.out.println("Certo, " + paciente.getNome() + " estamos quase finalizando, digite seu peso.");
        paciente.setPeso(tecladoDouble.nextDouble());

        System.out.println("Digite sua altura.");
        paciente.setAltura(tecladoDouble.nextDouble());

        System.out.println("Tudo pronto !");
        System.out.println(medico.nome + " vai ficar responsável por te atender !");
        System.out.println("A consulta será amanhã às " + data.getHour() + " horas.");

        descricao = "Paciente " + paciente.getNome() + " exame de " + this.decisao + " agendado por " + secretaria.nome + " para às " + data.getHour() + " horas de amanhã.";
        System.out.println(descricao);

    }

}
