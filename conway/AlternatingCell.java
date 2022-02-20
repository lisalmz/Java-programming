
public class AlternatingCell extends AbstractCell {
	int generation=0;
	public AlternatingCell(int r, int c, ConwayWorld w) {
		super(r, c, w);
	}
	
	public  AbstractCell cellForNextGeneration() {
		return this;
	}
	
	public boolean willBeAliveInNextGeneration() {
		return!getIsAlive();
	}

	public char displayCharacter() {
			return getIsAlive() ? 'A' : '.';
	}
	
	public boolean getIsAlive() {
		generation=generation+1;
		if(generation%2==1) {
			return false;
		}
		else {
			return true;
		}
	}
}
