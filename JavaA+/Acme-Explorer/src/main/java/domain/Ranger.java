
package domain;

public class Ranger extends Actor {

	// Attributes -------------------------------------------------------------

	private boolean	suspicious;


	public boolean isSuspicious() {
		return this.suspicious;
	}

	public void setSuspicious(final boolean suspicious) {
		this.suspicious = suspicious;
	}

}
