
public class TesteRPG {

	public static void main(String[] args) {

		Personagem lux = new HumanoGuerreiro(15, 16, 18, 12, 14, 15);

		lux.setNome("Lux");

		MeioElfo nox = new MeioElfoGuerreiro();
		nox.setNome("Nox");
		System.out.println(nox.getNome());
		nox.setForca(15);
		System.out.println("Nox FORCA: " + nox.getForca());
		nox.setAtributoExtraForca();	
		System.out.println("Nox FORCA: " + nox.getForca());



		System.out.println(lux.getNome());



		System.out.println(lux.getForca());
		System.out.println(lux.getDestreza());
		System.out.println(lux.getModDes());
		System.out.println(lux.getModFor());
		System.out.println(lux.getRaca());
		System.out.println(lux.getClasse());
		System.out.println(lux.getNivel());

		System.out.println(lux.getBonusDeProficiencia());
		System.out.println(lux.getPontosDeVida());
	}

}
