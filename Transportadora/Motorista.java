

public class Motorista extends Funcionario
{
    private String cnh;
    private boolean disponibilidade;
    
    public Motorista(String nome, String cpf, String telefone, String endereco, String cnh, boolean disponibilidade){
        super(nome, cpf, telefone, endereco);
        this.cnh = cnh;
        this.disponibilidade = disponibilidade;
        
    }
    
    public String getCnh(){
        return cnh;
    }
    public void setCnh(String cnh){
        this.cnh = cnh;
    }
    
    public boolean getDisponibilidade(){
        return disponibilidade;
    }
    public void setDisponibilidade(boolean disponibilidade){
        this.disponibilidade= disponibilidade;
    }

    
}
