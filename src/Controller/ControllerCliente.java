package Controller;
import Model.ClienteModel;
import View.ClienteView;
import java.util.Scanner;

public class ControllerCliente {
    Scanner sc = new Scanner(System.in);
    String Entrada = sc.nextLine();

    ClienteView clienteView = new ClienteView();
    public void imprimir;


    //public void imprima(String[] nomeCliente){}


    public void cadastrarCliente(String nome) {
        System.out.println(nome);
    }

}
