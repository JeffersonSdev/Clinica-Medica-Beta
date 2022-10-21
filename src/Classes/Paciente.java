package Classes;

import java.math.BigDecimal;
import java.util.Scanner;

public class Paciente extends Pessoa {

    private double peso;
    private double altura;
    private Exame [] exame ;
    private String descricao;
    //private Double imc = (peso/(altura * altura));

    //public Double imc = (peso/(altura*altura));*/
    //Construtor
    public Paciente(){
        
    }
    public Paciente(String nome, Integer idade, String cpf) {
        super(nome, idade, cpf);

    }

    
    
    public void imprimir() {
        System.out.println("- - - - - - - - - - - - - - -");
        System.out.println("Paciente: " + this.nome);
        System.out.println("Idade: "    + this.idade);
        System.out.println("altura: "   + this.altura);
        System.out.println("Peso: "     + this.idade);
        System.out.println("Cpf: "      + this.cpf);
        System.out.println("💉----------Clinica J.M----------💉");
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Exame getExame() {
        return exame;
    }

    public void setExame(Exame exame) {
        this.exame = exame;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
}
