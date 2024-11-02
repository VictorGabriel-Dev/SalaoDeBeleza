package Controller;

import Model.ClienteModel;
import View.ClienteView;

public class ControllerCliente {


    ClienteView clienteView = new ClienteView();

    // Chamando o método print
       clienteView.CadastroCliente();

    public void cadastrarCliente(String nome) {
        ClienteModel clienteModel = new ClienteModel(nome);
        clientes.add(clienteModel);
    }

}
