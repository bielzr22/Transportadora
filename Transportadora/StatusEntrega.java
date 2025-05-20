import java.util.Date;


public class StatusEntrega
{
    private Status statusAtual;
    private Date dataHora;
    private Funcionario responsavel;
    
    public StatusEntrega(Status statusAtual, Date dataHora, Funcionario responsavel){
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
    
    public Date getDataHora(){
     return dataHora;
    }
    public void setDataHora(Date dataHora){
     this.dataHora = dataHora;
    }
    
    public Funcionario getResponsavel(){
     return responsavel;
    }
    public void setResponsavel(Funcionario responsavel){
     this.responsavel= responsavel;
    }
}
