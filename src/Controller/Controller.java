package Controller;
import Model.Cliente;
import View.View;
import java.util.*;

import View.*;
public class Controller {
   public static void main(String[]args) {

       View view = new View();

       // Chamando o método print
       view.CadastroCliente();

       public void cadastrarCliente(String nome){
           Cliente cliente = new Cliente(nome);
           clientes.add(cliente);
       }
   }
}
