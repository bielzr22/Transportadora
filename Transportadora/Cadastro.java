import java.util.Scanner;

public class Cadastro
{
    public void cadastrar(){
        System.out.println("O que você deseja cadastrar?");
        System.out.println("1) Veiculo");
        System.out.println("2) Motorista");
        System.out.println("3) Pedido");
        System.out.println("4) Cliente");
        Scanner sc = new Scanner(System.in);
        
        int resp = sc.nextInt();
        sc.nextLine();
        
        if(resp == 1){
            cadastrarVeiculo();
        }
    }
    
    public void cadastrarVeiculo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o tipo de veículo (Carro / Moto / Caminhão) ? ");
        String tipo = sc.nextLine();
        
        System.out.println("Qual a placa? ");
        String placa = sc.nextLine();
        System.out.println("Qual o modelo? ");
        String modelo = sc.nextLine();
        System.out.println("Qual a capacidade de carga? ");
        double capCarga = sc.nextDouble();
        sc.nextLine();
        
        if(tipo.equalsIgnoreCase("carro")){
            Carro carro = new Carro(placa, modelo, capCarga);
        }if(tipo.equalsIgnoreCase("moto")){
            Moto moto= new Moto(placa, modelo, capCarga);
        }if(tipo.equalsIgnoreCase("caminhao")){
            Caminhao caminhao = new Caminhao(placa, modelo, capCarga);
        }
    }
}
