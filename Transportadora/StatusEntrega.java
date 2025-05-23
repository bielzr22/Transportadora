import java.time.LocalDateTime;


public class StatusEntrega
{
    private Status statusAtual;
    private LocalDateTime dataHora;
    private Funcionario responsavel;
    
    public StatusEntrega(Status statusAtual, LocalDateTime dataHora, Funcionario responsavel){
        this.statusAtual = statusAtual;
        this.dataHora = dataHora;
        this.responsavel = responsavel;
    }
    
    public Status getStatusAtual(){
        return statusAtual;
    }
    public void setStatusAtual(Status statusAtual){
        this.statusAtual = statusAtual;
    }
    
    public LocalDateTime getDataHora(){
     return dataHora;
    }
    public void setDataHora(LocalDateTime dataHora){
     this.dataHora = dataHora;
    }
    
    public Funcionario getResponsavel(){
     return responsavel;
    }
    public void setResponsavel(Funcionario responsavel){
     this.responsavel= responsavel;
    }
    
    @Override
    public String toString(){
        return "Status atual: " +getStatusAtual().toString()+ "\nData e hora: " +getDataHora().toString()+ "\nResponsável: " +getResponsavel().getNome();
    }
}
