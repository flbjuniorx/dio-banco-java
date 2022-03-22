public class Main {

    public static void main(String[] args) {

        String nomeCliente = "Fernando";
        String cpfCliente = "12345678911";

        Cliente fernando = new Cliente(nomeCliente, cpfCliente);
        Cliente maria = new Cliente("Maria", "11122233344");

        ContaCorrente cc = new ContaCorrente(fernando);

        double valor = 100;
        System.out.printf("Tentativa de saque de R$ %.2f na conta número %d%n", valor, cc.numeroConta);
        cc.sacar(valor);
        System.out.printf("Depósito de R$ %.2f na conta %d%n",valor,cc.numeroConta);
        cc.depositar(valor);
        cc.imprimirExtrato();

        Conta cp = new ContaPoupanca(maria);
        double valor2 = 30;
        System.out.printf("Transferência de R$ %.2f da conta %d para a conta %d%n",valor2,cc.numeroConta, cp.numeroConta);
        cc.transferir(valor2,cp);
        cp.imprimirExtrato();
        cc.imprimirExtrato();

    }

}