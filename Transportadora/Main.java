import java.util.Scanner;

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
            
        }
    }
    
    public static void menuInicial(){
        System.out.println("O que você deseja fazer?");
        System.out.println("1) Cadastro");
        System.out.println("2) Consulta");
        System.out.println("3) Rastrear");
        System.out.println("4) Atualizar pedido");
    }
}
