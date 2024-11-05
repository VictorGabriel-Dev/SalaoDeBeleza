package Model;
import Model.Cliente;

public class ClienteModel {
    private Cliente[] listaCliente;
    private int contador = 0;

    //Construtor ele cria array listaCliente, com o tamanho especificado pelo parametro [tamanho].
    public ClienteModel(int tamanho){
        listaCliente = new Cliente[tamanho];
    }
    //metodo adicionarCliente, vai receber um objeto como parametro, no caso objeto Cliente
    //o if verifica se tem espaço para adicinar mais objetos, se não imprime frase na tela
    public void adicionarCliente(Cliente cliente){
        if (contador < listaCliente.length){
            listaCliente[contador] = cliente;
            contador++;
        } else {
            System.out.println("Alista de clientes está cheia!");
        }
    }
    //metodo get para array listaCliente, isso é para você verificar depois as entradas
    // vc pode fazer um metodo para imprimir isso.
    public Cliente[] getListaCliente() {
        return listaCliente;
    }
}
