import java.util.UUID;
import java.util.Scanner;

public class Rastreio {


    public static void menuRastreio(Transportadora t){
        System.out.println("Qual tipo de rastreio você quer?");
        System.out.println("1) Rastreio completo ");
        System.out.println("2) Ultima atualização ");
        Scanner sc = new Scanner(System.in);
        int resp = sc.nextInt();
        sc.nextLine();

        System.out.println("Qual o código de rastreio");
        UUID cod = UUID.fromString(sc.nextLine());

        if(resp == 1){
            rastreioPedido(cod, t);
        } else if (resp == 2) {
            rastreioUltimaAtualizacao(cod, t);
        }
    }

    public static void rastreioPedido(UUID cod, Transportadora t){
        PedidoEntrega p = t.getPedidoPorCodigo(cod);
        if(p != null){
            System.out.println("Pedido: "+p.getCodRastreio());
            for(StatusEntrega s : p.getStatusEntrega()){
                System.out.println(s.toString());
                System.out.println();
            }
        }
        else{
            System.out.println("Pedido não encontrado");
        }
    }
    public static void rastreioUltimaAtualizacao(UUID cod, Transportadora t){
        PedidoEntrega p = t.getPedidoPorCodigo(cod);
        if (p != null){
            System.out.println("Pedido: "+p.getCodRastreio());
            for(StatusEntrega s : p.getStatusEntrega()){
                System.out.println(p.getStatusEntrega().get(p.getStatusEntrega().size() -1).toString());
            }
        }
        else{
            System.out.println("Pedido não encontrado");
        }
    }
}
