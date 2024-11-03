package Controller;
import Model.ClienteModel;
import View.ClienteView;
import java.util.Scanner;

public class ControllerCliente {
    //metodo receber String
    public void recebe(){
        Scanner sc = new Scanner(System.in);
        String valor = sc.nextLine();
        //receba valor e envie para o model
        //metodo model, envia valor para o model
        ClienteModel clienteModel = new ClienteModel();
        clienteModel.setValor(valor);

        String recebeValor = clienteModel.getValor();
        System.out.println(recebeValor);
    }
//    public void recebe1() {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Digite o valor:");
//        String valor = sc.nextLine();
//
//        // Envia o valor para o Model
//        ClienteModel clienteModel = new ClienteModel();
//        clienteModel.setValor(valor);
//
//        System.out.println("Valor enviado para o Model: " + valor);
//    }

}
