import java.util.Scanner;

public class Cadastro
{
    public static void cadastrar(Transportadora t){
        System.out.println("O que você deseja cadastrar?");
        System.out.println("1) Veiculo");
        System.out.println("2) Motorista");
        System.out.println("3) Pedido");
        System.out.println("4) Cliente");
        Scanner sc = new Scanner(System.in);
        
        int resp = sc.nextInt();
        sc.nextLine();
        
        if(resp == 1){
            cadastrarVeiculo(t);
        }else if(resp == 2){
            cadastrarMotorista(t);
        }else if(resp == 3){
            cadastrarPedido(t);
        }else if(resp == 4){
            cadastrarCliente(t);
        }
    }
    
    public static void cadastrarVeiculo(Transportadora t){
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
            t.adicionaVeiculo(carro);
        }if(tipo.equalsIgnoreCase("moto")){
            Moto moto= new Moto(placa, modelo, capCarga);
             t.adicionaVeiculo(moto);
        }if(tipo.equalsIgnoreCase("caminhao")){
            Caminhao caminhao = new Caminhao(placa, modelo, capCarga);
            t.adicionaVeiculo(caminhao);
        }
        
    }
    
    public static void cadastrarMotorista(Transportadora t){
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
        t.adicionaMotorista(motorista);
    }
    
    public static void cadastrarCliente(Transportadora t){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nome do cliente: ");
        String nome = sc.nextLine();
        System.out.println("CPF do cliente: ");
        String cpf = sc.nextLine();
        System.out.println("Telefone do cliente: ");
        String telefone = sc.nextLine();
        
        Cliente cliente = new Cliente(nome, cpf, telefone);
        t.adicionaCliente(cliente);
    }
    
    public static void cadastrarPedido(Transportadora t){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("CPF do cliente para cadastrar o pedido: ");
        String cpf = sc.nextLine();
        
        Cliente c = t.getClientePorCPF(cpf);
        
        if(c == null){
            System.out.println("CPF não encontrado");
        }else{
            t.criarPedido(c);
        }
    }
    
}
