
public class Main {

	public static void main(String[] args) {
		Cliente jenyfer = new Cliente();
		jenyfer.setNome("Jenyfer Oliveira");
		
		Conta cc = new ContaCorrente(jenyfer);
		Conta poupanca = new ContaPoupanca(jenyfer);

		cc.depositar(500);
		cc.transferir(500, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
