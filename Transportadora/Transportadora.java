
import java.util.ArrayList;

public class Transportadora
{
    private String nome;
    private ArrayList<Cliente> clientes;
    private ArrayList<Motorista> motoristas;
    private ArrayList<Veiculo> veiculos;
    private ArrayList<PedidoEntrega> pedidos;
    
    
    public Transportadora(String nome)
    {
        this.nome = nome;
        clientes = new ArrayList<>();
        motoristas = new ArrayList<>();
        veiculos = new ArrayList<>();
        pedidos = new ArrayList<>();
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public ArrayList<Cliente> getCliente(){
        return clientes;
    }
    public void adicionaCliente(Cliente c){
        clientes.add(c);
    }
    
    public ArrayList<Motorista> getMotorista(){
        return motoristas;
    }
    public void adicionaMotorista(Motorista m){
        motoristas.add(m);
    }
    
    public ArrayList<Veiculo> getVeiculo(){
        return veiculos;
    }
    public void adicionaVeiculo(Veiculo v){
        veiculos.add(v);
    }
    
    public ArrayList<PedidoEntrega> getPedido(){
        return pedidos;
    }
    public void adicionaPedido(PedidoEntrega pe){
        pedidos.add(pe);
    }

}
