import java.util.Scanner;
import java.util.UUID;

public class Main
{
    public static void main(String[] args){
        System.out.println("Qual o nome da transportadora? ");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        
        Transportadora transportadora = new Transportadora(nome);
        
        menuInicial();
        int resp = sc.nextInt();
        sc.nextLine();
        
        if(resp == 1){
            Cadastro.cadastrar(transportadora);
        }else if(resp == 2){
            Consulta.menuConsulta(transportadora);
        }else if (resp == 3) {
            Rastreio.menuRastreio(transportadora);
        }else if (resp == 4) {
            //atualizarPedido(transportadora);
        }
    }
    
    public static void menuInicial(){
        System.out.println("O que você deseja fazer?");
        System.out.println("1) Cadastro");
        System.out.println("2) Consulta");
        System.out.println("3) Rastrear");
        System.out.println("4) Atualizar pedido");
        System.out.println("5) Remover motorista ou veículo");
    }
    
    /*
    public static void atualizarPedido(Transportadora t){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Código do pedido para atualizar: ");
        UUID cod = UUID.fromString(sc.nextLine());
        System.out.println("Status do pedido para atualizar: ");
        Status statusAtualizado = sc.nextLine();
        System.out.println("CNH do Motorista responsável pela atualização do pedido: ");
        String cnh = sc.nextLine();    
        Motorista responsavel = t.getMotoristaPorCNH(cnh);
    

        
        t.atualizarStatus(cod, statusAtualizado,responsavel);
    }*/
    
    public static void remover(Transportadora t){
        System.out.println("O que você deseja remover?");
        System.out.println("1) Motorista");
        System.out.println("2) Veículo");
        
        Scanner sc = new Scanner(System.in);
        int resp = sc.nextInt();
        sc.nextLine();
        
        if(resp == 1){
            System.out.println("Qual a CNH do motorista que você deseja remover?");
            String cnh = sc.nextLine();
            t.removerMotorista(cnh);
        }else if(resp == 2){
            System.out.println("Qual a placa do veículo que você deseja remover?");
            String placa = sc.nextLine();
            t.removerVeiculo(placa);
        }
    }
}
