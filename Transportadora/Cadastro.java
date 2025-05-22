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
        }else if(resp == 2){
            cadastrarMotorista();
        }else if(resp == 3){
            cadastrarPedido();
        }else if(resp == 4){
            cadastrarCliente();
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
    
    public void cadastrarMotorista(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nome do motorista: ");
        String nome = sc.nextLine();
        System.out.println("CPF do motorista: ");
        String cpf = sc.nextLine();
        System.out.println("Telefone do motorista: ");
        String telefone = sc.nextLine();
        System.out.println("CNH do motorista: ");
        String cnh = sc.nextLine();
        
        Motorista motorista = new Motorista(nome, cpf, telefone, cnh);
    }
    
    public void cadastrarCliente(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nome do cliente: ");
        String nome = sc.nextLine();
        System.out.println("CPF do cliente: ");
        String cpf = sc.nextLine();
        System.out.println("Telefone do cliente: ");
        String telefone = sc.nextLine();
        
        Cliente cliente = new Cliente(nome, cpf, telefone);
        
    }
    
    
    
}
