import java.util.ArrayList;

public class PedidoEntrega
{
 private Cliente cliente;
 private Motorista motorista;
 private Veiculo veiculo;
 private String codRastreio;
 private ArrayList<StatusEntrega> statusEntrega;
 
 public PedidoEntrega(Cliente cliente, Motorista motorista, Veiculo veiculo, String codRastreio){
     this.cliente = cliente;
     this.motorista = motorista;
     this.veiculo = veiculo;
     this.codRastreio = codRastreio;
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
 
 public String getCodRastreio(){
     return codRastreio;
 }
 public void setCodRastreio(String codRastreio){
     this.codRastreio= codRastreio;
 }
 
 public ArrayList<StatusEntrega> getStatusEntrega(){
     return statusEntrega;
 }
 public void adicionaStatusEntrega(StatusEntrega se){
     statusEntrega.add(se);
 }
 
}


