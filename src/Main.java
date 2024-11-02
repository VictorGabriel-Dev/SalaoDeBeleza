import Controller.ControllerCliente;
import View.ClienteView;

public class Main {
    public static void main(String[]args){
        String nome = "";
        ClienteView.imprimir();
        ControllerCliente controllerCliente = new ControllerCliente();
        controllerCliente.cadastrarCliente(nome);
    }

}
