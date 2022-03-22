
public abstract class Conta implements iConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected double saldoConta;
    protected int numeroConta;
    protected int agenciaConta;
    protected Cliente cliente;

    protected Conta(Cliente cliente) {

        this.agenciaConta = Conta.AGENCIA_PADRAO;
        saldoConta = 0;
        this.numeroConta = Conta.SEQUENCIAL++;
        this.cliente = cliente;

        System.out.println("Conta criada: Agencia " + agenciaConta + ", Conta " + numeroConta);
        System.out.println("Bem-vindo(a) " + cliente.nomeCliente);
        getSaldoConta();
    }

    @Override
    public void sacar(double valor) {
        if (saldoConta < valor) {
            System.out.println("Saldo insuficiente");
            getSaldoConta();
        } else {
            saldoConta -= valor;
        }
    }

    @Override
    public void depositar(double valor) {
        saldoConta += valor;
    }

    @Override
    public void transferir(double valor, iConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        System.out.printf("Transferência efetuada no valor de R$ %.2f%n", valor);
        getSaldoConta();
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void getSaldoConta() {
        System.out.printf("Saldo: R$ %.2f%n%n", saldoConta);
    }

    protected void imprimirInfosComuns() {
        System.out.printf("Titular: %s%n", this.cliente.getNomeCliente());
        System.out.printf("Agência: %d%n", agenciaConta);
        System.out.printf("Conta: %d%n", numeroConta);
        getSaldoConta();
    }

}