
public class JamesBond {
	Vault vault;
public int findCode(Vault vault) {
	this.vault = vault;
	for(int i=0;i<1000001;i++) {
if(vault.TryCode(i)) {
	return i;
}
	}
	return -1;
}


}
