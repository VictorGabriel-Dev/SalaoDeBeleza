package View;
//import Controller.*;
import Controller.ControllerCliente;

import java.util.Scanner;

public class ClienteView {
    public static void imprimir(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("----Cadastro Cliente----");
        System.out.println("Nome:");

        String nome = scanner.nextLine();
        //o construtor é necessario quando o metodo não é statico
        ControllerCliente controllerCliente = new ControllerCliente();
        controllerCliente.cadastrarCliente(nome);
    }
}
