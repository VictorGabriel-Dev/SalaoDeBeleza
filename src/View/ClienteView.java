package View;
//import Controller.*;
import java.util.Scanner;

public class ClienteView {
    Scanner sc = new Scanner(System.in);
    ControllerCliente controllerCliente;

    public void imprimir(){
        System.out.println("----Cadastro Cliente----");
        System.out.println("Nome:");
    }

    //ele vai imprimir array nomeCliente
    public void imprima(String[] nomeCliente){
        //loop para percorrer a array
        for(int i=0; i< nomeCliente.length;i++){
            System.out.println(nomeCliente[i]);
        }
    }
    public void CadastroCliente(){
        System.out.println("----Cadastro Cliente----");
        String nome = sc.nextLine();
        controllerCliente.cadastrarCliente();
    }


}
