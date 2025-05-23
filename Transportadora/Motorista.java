

public class Motorista extends Funcionario
{
    private String cnh;
    private boolean disponibilidade;
    
    public Motorista(String nome, String cpf, String telefone, String cnh){
        super(nome, cpf, telefone);
        this.cnh = cnh;
        disponibilidade = true;
        
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
    
    @Override
    public String toString(){
        return "Nome: "+getNome() + "\nCPF: " +getCpf() +"\nTelefone: "+getTelefone()+ "\nCNH: "+getCnh()+ "\nDisponibilidade: "+getDisponibilidade();
    }
}
