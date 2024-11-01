package View;
import Model.Cliente;
import java.util.Scanner;

public class View {
    Scanner sc = new Scanner(System.in);
    int index = 0;

    //metodo menu inicial
   /* System.out.pritnln("---------MENU INICIAL----------");
    System.out.pritnln("Cadastrar Cliente");
    System.out.pritnln("Cadastrar Serviço");
    System.out.pritnln("Agendar atendimento"); */

    //medoto para cadastro cliente
//    System.out.pritnln("-----Cadastro do Cliente-----");
//    System.out.pritnln("Nome:");
//    String nome = sc.nextLine();

    public void print(String mensagem){
        System.out.println(mensagem);
    }


}
