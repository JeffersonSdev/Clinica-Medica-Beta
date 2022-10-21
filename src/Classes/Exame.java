package Classes;

import java.time.LocalDateTime;

public class Exame {

    LocalDateTime data = LocalDateTime.now();
    
    private String nomeExame;
    private Medico medico;
    private Paciente paciente;
    private int cod;
    private boolean status;
    

    public Exame(Paciente paciente, Integer cod) {
        this.paciente = paciente;
        this.cod = cod;
    }

    

    public void exame() {
        System.out.println("💉----------Clinica J.M----------💉\nConsulta ↴");
        // System.out.println("Agendado por: " + s1.nome);
        System.out.println("Medico: " + medico.nome);
        System.out.println("Paciente: " + paciente.nome);
        System.out.println("Horario do atendimento " + data.getHour());
        //System.out.println(s1.getPacienteDescricao());

    }


    public String getNomeExame() {
        return nomeExame;
    }

    public void setNomeExame(String nomeExame) {
        this.nomeExame = nomeExame;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;  
    }

    
    
}
