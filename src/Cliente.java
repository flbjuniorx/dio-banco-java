public class Cliente {

    protected String nomeCliente;
    private String cpfCliente;

    protected Cliente(String nomeCliente, String cpfCliente) {
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }
}