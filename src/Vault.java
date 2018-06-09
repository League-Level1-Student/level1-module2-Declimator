import java.util.Random;

import javax.swing.JOptionPane;

public class Vault {
	boolean isRight;
	int code;

public static void main(String[] args) {
	
}
	Vault() {
		this.code = new Random().nextInt(1000001);


	}

	public boolean TryCode(int input) {
		if (input == code) {
			return true;
		} else {
			return false;
		}
	}

}
