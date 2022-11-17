
public class Humano extends Personagem {
	@Override
	protected void setForca(int forca) {
		this.forca += 2;
		super.setForca(forca);
	}
	
	@Override
	public void setRaca(String raca) {
		this.raca = "Humano";
		super.setRaca(raca);
	}
	
}
