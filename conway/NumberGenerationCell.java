
public class NumberGenerationCell extends AbstractCell {
	int generation=0;
	public NumberGenerationCell(int r, int c, ConwayWorld w) {
		super(r, c, w);
	}
	
	public  AbstractCell cellForNextGeneration() {
		return this;
	}
	
	public boolean willBeAliveInNextGeneration() {
		return true;
	}

	public char displayCharacter() {
		generation=(generation+1)%10;
		return (char)(generation + '0');	
	}
	
	public boolean getIsAlive() {
			return true;
	}
}
