
import java.util.ArrayList;
import java.util.UUID;
import java.util.Date;

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
    
    public void atualizarStatus(UUID cod, Status statusAtualizado, Funcionario responsavel){
        PedidoEntrega p = rastrearPedidoPorCodigo(cod);
        
        if(p != null){
            StatusEntrega novoStatus = new StatusEntrega(statusAtualizado, new Date(), responsavel);
            p.adicionaStatusEntrega(novoStatus);
            if(statusAtualizado.equals(Status.ENTREGUE) || statusAtualizado.equals(Status.CANCELADO)){
                p.getMotorista().setDisponibilidade(true);
                p.getVeiculo().setDisponibilidade(true);
            }
            System.out.println("Status do pedido atualizado para: "+novoStatus);
        }
        else{
            System.out.println("Pedido não encontrado");
        }
    }
    
    public void criarPedido(Cliente c, Motorista m, Veiculo v){
        m = motoristaDisponivel();
        v = veiculoDisponivel();
        
        if(m == null){
            System.out.println("Nenhum motorista disponível");
        }
        if(v == null){
            System.out.println("Nenhum veículo disponível");
        }
        
        if(m != null && v != null){
            PedidoEntrega p = new PedidoEntrega(c, m, v);
            m.setDisponibilidade(false);
            v.setDisponibilidade(false);
            pedidos.add(p);
        }
        
    }
    
    public Motorista motoristaDisponivel(){
        for(Motorista m : motoristas){
            if(m.getDisponibilidade()){
                return m;
            }
        }
        return null;
    }
    
    public Veiculo veiculoDisponivel(){
        for(Veiculo v : veiculos){
            if(v.getDisponibilidade()){
                return v;
            }
        }
        return null;
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
