package _06_vault;

public class VaultRunner {
	public static void main(String[] args) {
		Vault vault = new Vault();
		SecretAgent bob = new SecretAgent();
		bob.tryCode(vault);
		
		
	}

}
