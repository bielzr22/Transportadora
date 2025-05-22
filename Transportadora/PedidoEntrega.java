import java.util.ArrayList;
import java.util.UUID;

public class PedidoEntrega
{
 private Cliente cliente;
 private Motorista motorista;
 private Veiculo veiculo;
 private UUID codRastreio;
 private ArrayList<StatusEntrega> statusEntrega;
 
 public PedidoEntrega(Cliente cliente, Motorista motorista, Veiculo veiculo){
     this.cliente = cliente;
     this.motorista = motorista;
     this.veiculo = veiculo;
     this.codRastreio = UUID.randomUUID();
     this.statusEntrega = new ArrayList<>();
 }
 
 public Cliente getCliente(){
     return cliente;
 }
 public void setCliente(Cliente cliente){
     this.cliente = cliente;
 }
 
 public Motorista getMotorista(){
     return motorista;
 }
 public void setMotorista(Motorista motorista){
     this.motorista= motorista;
 }
 
 public Veiculo getVeiculo(){
     return veiculo;
 }
 public void setVeiculo(Veiculo veiculo){
     this.veiculo = veiculo;
 }
 
 public UUID getCodRastreio(){
     return codRastreio;
 }
 public void setCodRastreio(UUID codRastreio){
     this.codRastreio= codRastreio;
 }
 
 public ArrayList<StatusEntrega> getStatusEntrega(){
     return statusEntrega;
 }
 public void adicionaStatusEntrega(StatusEntrega se){
     statusEntrega.add(se);
 }
 
}


