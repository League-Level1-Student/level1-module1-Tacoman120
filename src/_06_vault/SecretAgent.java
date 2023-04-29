package _06_vault;

public class SecretAgent {

	public int tryCode(Vault vault) {
		for(int i = 0; i<1000001; i++) {
			
			System.out.println(vault.tryCode(i)+": "+i);
			
			if(vault.tryCode(i)) {
				
				return i;
				
			}
			
		}
		return -1;
	}
	

}
