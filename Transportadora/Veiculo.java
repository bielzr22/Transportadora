
public class Veiculo
{
    private String placa;
    private String modelo;
    private double capacidadeCarga;
    private boolean disponibilidade;
    
    public Veiculo(String placa, String modelo, double capacidadeCarga){
        this.placa = placa;
        this.modelo = modelo;
        this.capacidadeCarga = capacidadeCarga;
        disponibilidade = true;
    }
    
    public String getPlaca(){
        return placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public double getCapacidadeCarga(){
        return capacidadeCarga;
    }
    public void setCapacidadeCarga(double capacidadeCarga){
        this.capacidadeCarga = capacidadeCarga;
    }
    
    public boolean getDisponibilidade(){
        return disponibilidade;
    }
    public void setDisponibilidade(boolean disponibilidade){
        this.disponibilidade = disponibilidade;
    }
    
    @Override
    public String toString(){
        return "Placa: " +getPlaca()+ "\nModelo: " +getModelo()+ "\nCapacidade de carga: " +getCapacidadeCarga()+ "/nDisponibilidade: " +getDisponibilidade();
    }
    
}
