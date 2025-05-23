
import java.util.ArrayList;
import java.util.UUID;
import java.time.LocalDateTime;

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
    
    public PedidoEntrega getPedidoPorCodigo(UUID cod){
            for(PedidoEntrega pe : pedidos){
                if(pe.getCodRastreio().equals(cod)){
                    return pe;
                }
            }
            return null;
    }
    
    public Cliente getClientePorCPF(String cpf){
        for(Cliente c : clientes){
            if(c.getCpf().equals(cpf)){
                return c;
            }
        }
        return null;
    }
    
    public Veiculo getVeiculoPorPlaca(String placa){
        for(Veiculo v : veiculos){
            if(v.getPlaca().equals(placa)){
                return v;
            }
        }
        return null;
    }
    
    public Motorista getMotoristaPorCNH(String cnh){
        for(Motorista m : motoristas){
            if(m.getCnh().equals(cnh)){
                return m;
            }
        }
        return null;
    }
    
    
    public void atualizarStatus(UUID cod, Status statusAtualizado, Funcionario responsavel){
        PedidoEntrega p = getPedidoPorCodigo(cod);
        
        if(p != null){
            StatusEntrega novoStatus = new StatusEntrega(statusAtualizado, LocalDateTime.now(), responsavel);
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
    
    public void criarPedido(Cliente c){
        Motorista m = motoristaDisponivel();
        Veiculo v = veiculoDisponivel();
        
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
