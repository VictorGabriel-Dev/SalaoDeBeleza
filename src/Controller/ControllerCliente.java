package Controller;
import Model.*;
import View.ClienteView;
import java.util.Scanner;

public class ControllerCliente {
    //metodo recebe entrada do usuario e
    //envia para o Model
    public void recebe(){
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        Cliente cliente = new Cliente();
        cliente.setNome(nome);//interessante isso

        //metodo que mostrar os dados armazenados
        for(int i=0; i<3;i++){
            //ele precisa imprir todos os valores dentro da array
            String recebeValor = cliente.getNome();
            System.out.println(recebeValor);
        }

    }
}
