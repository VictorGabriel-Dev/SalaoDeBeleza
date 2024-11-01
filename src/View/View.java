package View;
import Model.*;
import Controller.*;
import java.util.Scanner;

public class View {
    Controller controller;
    Scanner sc = new Scanner(System.in);

    public void CadastroCliente(){
        System.out.println("----Cadastro Cliente----");
        //quantos clientes vc quer cadastrar
        int quantidade = sc.nextInt();
        sc.nextLine();//para consumir nova linha

        for(int i=0; i<quantidade;i++) {
            System.out.println("Nome:");
            String nome = sc.nextLine();
            controller.cadastrarCliente(nome);
        }
    }


    //ele vai imprimir array nomeCliente
    public  void clienteCadastrados(String[] nomeCliente){
        //loop para percorrer a array
        for(int i=0; i< nomeCliente.length;i++){
            System.out.println(nomeCliente[i]);
        }
    }


}
