import java.sql.SQLOutput;
import java.util.*;
public class View {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Declaraçao de arrays cliente
        int indexCliente = 0;//contador dos clientes
        String[] nomeCliente = {"Jao","marcos","jose"};
        String[] emailCliente = new String[3];
        String[] enderecoCliente = new String[3];
        int[] telefoneCliente = new int[3];

        //Declaração das array serviço
        int indexServico = 0 ;//contador dos serviços
        String[] nomeServico = new String[3];
        String[] descricaoServico = new String[3];
        double[] valorServico = new double[3];

        //Declaração das Array Agendamento
        int indexAgendamento = 0; //pra caso eu precisar
        String[] agendamentoData = new String[3];
        String[] agendamentoHora = new String[3];

        //LOOP principal
        while(true){
            //chamar o metodo menu
            int escolha = menu(sc);
            sc.nextLine();

            if(escolha == 4){
                System.out.println("saindooo");
                break;
            } else {
                //Os caminhos
                switch (escolha) {
                    case 1: //Cadastrar cliente
                        //LOOP
                        for (int i = 0; i <= indexCliente; i++) {
                            System.out.println("Insira os dados do Cliente: ");

                            System.out.println("Nome: ");
                            String nome = sc.nextLine();
                            nomeCliente[indexCliente] = nome;

                            System.out.println("e-mail: ");
                            String email = sc.nextLine();
                            emailCliente[indexCliente] = email;

                            System.out.println("Telefone: ");
                            int telefone = sc.nextInt();
                            telefoneCliente[indexCliente] = telefone;

                            sc.nextLine();//consumir linha

                            System.out.println("Endereço: ");
                            String endereco = sc.nextLine();
                            enderecoCliente[indexCliente] = endereco;

//                            //retomar a escolha
//                            System.out.println("digite 4");
//                            escolha = sc.nextInt();

                            //contador da array
                            indexCliente++;

                        }

                        //exibir informações
                        for (int i = 0; i < indexServico; i++) {
                            mostrarCliente(nomeCliente[i], emailCliente[i], telefoneCliente[i], enderecoCliente[i]);
                        }
                        break;
                    case 2://Cadastrar serviço
                        for (int i = 0; i <= indexServico; i++) {
                            System.out.println("metodo cadastrar servico");

                            System.out.println("Nome do serviço: ");
                            String nomeServ = sc.nextLine();
                            nomeServico[indexServico] = nomeServ;

                            System.out.println("Descrição do serviço: ");
                            String descricao = sc.nextLine();
                            descricaoServico[indexServico] = descricao;

                            System.out.println("Insira valor do serviço: ");
                            double valor = sc.nextDouble();
                            valorServico[indexServico] = valor;

                            sc.nextLine();

                            indexServico++;
                        }
                        for (int i = 0; i < indexServico; i++) {
                            mostrarServico(nomeServico[i], descricaoServico[i], valorServico[i]);
                        }
                        break;
                    case 3://Marcar agendamento
                        System.out.println("metodo agendar atendimento");

                        //Entrada do nome do cliente
                        System.out.println("Escreva o nome do Cliente: ");
                        String agendamentoCliente = sc.nextLine();

                        //Entrada do nome do serviço
                        System.out.println("Escreva o nome do Serviço: ");
                        String agendamentoServico = sc.nextLine();

                        //agendamento de dia e horario
                        System.out.println("Digite data do agendamento (DD/MM/AAAA): ");
                        String data = sc.nextLine();

                        System.out.println("Digite a hora do agendamento (HH:MM): ");
                        String hora = sc.nextLine();

                        //teste data disponivel
                        boolean dataDis = Arrays.asList(agendamentoData).contains(data);
                        if (dataDis) {
                            System.out.println("Data indisponivel");
                        } else {
                            agendamentoData[indexAgendamento] = data;
                        }

                        //teste hora disponivel
                        boolean horaDis = Arrays.asList(agendamentoHora).contains(hora);
                        if (horaDis) {
                            System.out.println("Hora indisponivel");
                        } else {
                            agendamentoHora[indexAgendamento] = hora;
                        }

                        //teste para verificar se o nome do cliente foi cadastrado:
                        boolean cadastroClient = Arrays.asList(nomeCliente).contains(agendamentoCliente);

                        //teste para verificar se o nome do serviço foi cadastrado:
                        boolean cadastroServ = Arrays.asList(nomeServico).contains(agendamentoServico);

                        //teste cliente
                        if (cadastroClient) {
                            System.out.println("Existe cliente");
                        } else {
                            System.out.println("Não existe cliente");
                        }

                        //teste serviço
                        if (cadastroServ) {
                            System.out.println("Existe servico");
                        } else {
                            System.out.println("Não existe servico");
                        }
                    default:
                        System.out.println("Valor invalido");
                }
            }
        }
        sc.close();
    }
    //metodo menu
    public static int menu(Scanner sc){
        System.out.println("Digite o valor correspondente o serviço desejado: ");
        System.out.println("1- Cadastrar Cliente");
        System.out.println("2- Cadastrar Serviço");
        System.out.println("3- Agendar Atendimento");
        System.out.println("4- Sair");

        return sc.nextInt();

    }

    //metodos para mostrar os valores das variaveis Cliente
    public static void mostrarCliente(String nome,String email,int telefone,String endereco){
        System.out.printf(nome,email,telefone,endereco);//da pra melhor isso
    }
    //metodo mostrar valores do serviço
    public static void mostrarServico(String nomeServ,String descricao, double valor){
        System.out.printf("Serviço: %s, Descrição: %s, Valor: %2f%n",nomeServ,descricao,valor);
    }
}
