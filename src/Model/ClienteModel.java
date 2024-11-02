package Model;

public class ClienteModel {
    //Declaraçao de arrays cliente
    private String[] nomeCliente;
    private String[] emailCliente;
    private String[] enderecoCliente;
    private int[] telefoneCliente;

    //getters e setters

    public String[] getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String [] nomes) {
        this.nomeCliente = nomes;
    }
    public String[] getEmailCliente() {
        return emailCliente;
    }
    public void setEmailCliente(String[] emailCliente) {
        this.emailCliente = emailCliente;
    }
    public String[] getEnderecoCliente() {
        return enderecoCliente;
    }
    public void setEnderecoCliente(String[] enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }
    public int[] getTelefoneCliente() {
        return telefoneCliente;
    }
    public void setTelefoneCliente(int[] telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }
}
