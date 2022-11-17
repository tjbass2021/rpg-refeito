
public class TesteRPG {

	public static void main(String[] args) {

		Personagem lux = new Humano();
		
		lux.setNome("Lux");
		//lux.setRaca("Humano");
		lux.setForca(15);
		
		System.out.println(lux.getNome());
		
//		if(lux.getRaca() == "Humano") {
//			lux.setForca(2);
//		}
		
		System.out.println(lux.getForca());
	}

}
