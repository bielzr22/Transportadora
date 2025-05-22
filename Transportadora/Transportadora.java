
import java.util.ArrayList;
import java.util.UUID;

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
    
    public PedidoEntrega rastrearPedidoPorCodigo(UUID cod){
            for(PedidoEntrega pe : pedidos){
                if(pe.getCodRastreio().equals(cod)){
                    return pe;
                }
            }
            return null;
    }
    
    public void historicoPedido(UUID cod){
        PedidoEntrega p = rastrearPedidoPorCodigo(cod);
        if(p != null){
            System.out.println("Pedido: "+p.getCodRastreio());
            for(StatusEntrega s : p.getStatusEntrega()){
                System.out.println("Status: "+s.getStatusAtual());
                System.out.println("Data: "+s.getDataHora());
                System.out.println("Responsável: "+s.getResponsavel());
                System.out.println();
            }
        }
        else{
            System.out.println("Pedido não encontrado");
        }
        
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
