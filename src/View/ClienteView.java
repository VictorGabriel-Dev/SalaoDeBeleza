package View;
import Controller.ControllerCliente;

public class ClienteView {

    //metodo CadastroCliente
    public static void cc(){
        ControllerCliente controllerCliente = new ControllerCliente();
        System.out.println("----Cadastro Cliente----");
        System.out.print("Nome:");
        controllerCliente.recebe();
        System.out.print("CPF:");
        controllerCliente.recebe();
        System.out.println("email");
        controllerCliente.recebe();
    }
}
