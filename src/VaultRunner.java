
public class VaultRunner {
	public static void main(String[] args) {
		JamesBond jb = new JamesBond();
		Vault vault = new Vault();
		jb.findCode(vault);
		System.out.println(jb.findCode(vault));
	}

}
