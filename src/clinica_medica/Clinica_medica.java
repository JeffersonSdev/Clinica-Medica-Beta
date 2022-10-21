package clinica_medica;

import java.time.LocalDateTime;
import Classes.Consulta;
import Classes.Exame;
import Classes.Medico;
import Classes.Paciente;
import Classes.Secretaria;
import java.util.Scanner;

public class Clinica_medica {

    public static void main(String[] args) {
        Scanner teclado       = new Scanner(System.in);
        Scanner tecladoString = new Scanner(System.in);
        LocalDateTime data = LocalDateTime.now();
        
        int decisao, menu;
        String descricao;
        
        Secretaria s1 = new Secretaria("Mary", 20, "123.456.789-31", "(85)99999-9999");
        Medico m1 = new Medico("Jefferson", 36, "001.003.002-90");
        Paciente p1 = new Paciente();
        Consulta c1 = new Consulta(s1);

        System.out.println("Bem vindo a clínica J.M !");
        
        do {
            System.out.println("Deseja se consultar ? \n• Digite 1 para SIM \n• Digite 2 para NÃO");
            decisao = teclado.nextInt();
            if (decisao == 1) {
                System.out.println("Olá eu me chamo " + s1.getNome() + ", secretária da Clinica J.M, irei fazer seu exame, vamos lá ?");

                System.out.println("Qual exame você deseja fazer ?\n");
                System.out.println("💉 - - - - - - - - - - - - - - - - - - - - - - - - - 💉");
                System.out.println("   1 Exame de Urina              6 Teste de gravidez\n"
                        + "   2 Hemograma                   7 Covid-19\n"
                        + "   3 Colesterol                  8 Colesterol\n"
                        + "   4 Glicemia                    9 Eletrocardiograma\n"
                        + "   5 Teste Ergométrico          10 Ecocardiograma");
                System.out.println("💉 - - - - - - - - - - - - - - - - - - - - - - - - - 💉");
                menu = teclado.nextInt();
                
                switch (menu) {
                case 1:
                p1.setExame("urina");
                break;
                
                case 2:
                p1.setExame("Hemograma");
                break;
                
                case 3:
                p1.setExame("Colesterol");
                break;
                
                case 4:
                p1.setExame ("Glicemia");
                break;
                
                case 5:
                p1.setExame ("teste ergométrico");
                break;
                
                case 6:
                p1.setExame("sangue");
                break;
                
                case 7:
                p1.setExame ("covid-19");
                break;
                
                case 8:
                p1.setExame ("colesterol");
                break;
                
                case 9:
                p1.setExame ("eletrocardiograma");
                break;
                
                case 10:
                p1.setExame ("fezes");
                break;
                     default:
                System.out.println("Escolha uma opção válida ");
                }
                System.out.println("Como se chama ?");
                p1.setNome(tecladoString.nextLine());

                System.out.println("Prazer em conhece-lo, " + p1.getNome() + ".");

                System.out.println("Quantos anos você tem ?");
                p1.setIdade(teclado.nextInt());

                System.out.println("Poderia me falar qual o seu cpf ?");
                p1.setCpf(tecladoString.nextLine());

                System.out.println("Certo, " + p1.getNome() + " estamos quase finalizando, digite seu peso.");
                p1.setPeso(teclado.nextDouble());

                System.out.println("Digite sua altura.");
                p1.setAltura(teclado.nextDouble());

                System.out.println("\nTudo pronto !");
                System.out.println(m1.getNome() + " vai ficar responsável por te atender !");
                System.out.println("A consulta será amanhã às " + data.getHour() + " horas.");

                descricao = "Paciente " + p1.getNome() + " exame de " + p1.getExame() + " agendado por " + s1.getNome() + " para às " + data.getHour() + " horas de amanhã.";
                System.out.println(descricao);
                System.out.println("💉----------Clinica J.M----------💉");
                
                
                
                
                }else if (decisao != 1 && decisao != 2) {
                System.out.println("Digite uma opção válida !");

            } else {
                System.out.println("Obrigada !");
               
            } 

            }while (decisao != 1 || decisao != 2);

        } //while (decisao != 1 || decisao != 2);
}

//}
