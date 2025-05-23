import java.util.Scanner;

public class Consulta
{
    public static void menuConsulta(Transportadora t){
        System.out.println("Qual tipo de consulta você deseja realizar?");
        System.out.println("1) Funcionários ");
        System.out.println("2) Veículos");
        System.out.println("3) Clientes ");
        
        Scanner sc = new Scanner(System.in);
        
        int resp = sc.nextInt();
        sc.nextLine();
        
        if(resp == 1){
            consultaFuncionario(t);
        }else if(resp == 2){
            consultaVeiculo(t);
        }else if(resp == 3){
            consultaCliente(t);
        }
    }
    
    public static void consultaFuncionario(Transportadora t){
        int i = 1;
        for(Funcionario f : t.getMotorista()){
            System.out.println("Funcionário #"+i);
            System.out.println(f);
        }
    }
    
    public static void consultaVeiculo(Transportadora t){
        int i =1;
        for(Veiculo v : t.getVeiculo()){
            System.out.println("Veículo #"+1);
            System.out.println(v);
        }
    }
    
    public static void consultaCliente(Transportadora t){
        int i =1;
        for(Cliente c : t.getCliente()){
            System.out.println("Cliente #"+1);
            System.out.println(c);
        }
    }
}
