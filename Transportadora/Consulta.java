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
        
        if(t.getMotorista().isEmpty()){
            System.out.println("Sem funcionários");
            System.out.println();
        }else{
            for(Funcionario f : t.getMotorista()){
                System.out.println("Funcionário #"+i);
                System.out.println(f);
                i++;
            }
        }
    }
    
    public static void consultaVeiculo(Transportadora t){
        int i =1;
        
        if(t.getVeiculo().isEmpty()){
            System.out.println("Sem veículos");
           System.out.println();
        }else{
            for(Veiculo v : t.getVeiculo()){
                System.out.println("Veículo #"+i);
                System.out.println(v);
                i++;
            }
        }
    }
    
    public static void consultaCliente(Transportadora t){
        int i =1;
        
        if(t.getCliente().isEmpty()){
            System.out.println("Sem clientes");
            System.out.println();   
        }else{
            for(Cliente c : t.getCliente()){
                System.out.println("Cliente #"+i);
                System.out.println(c);
                i++;
            }
        }
    }
}
