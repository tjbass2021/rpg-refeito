package objetos;

public class TesteRPG {

	public static void main(String[] args) {

		HumanoGuerreiro lif = new HumanoGuerreiro(16, 18, 14, 12, 11, 10, 16);

		System.out.println("furia: " + lif.getFuria());
		System.out.println("dano de furia: " + lif.getDanoDeFuria());
		System.out.println("vida: " + lif.getPontosDeVida());

		System.out.println("modificador de força: " + lif.getModFor());

		
		

		System.out.println("classe: " + lif.getClasse());

		System.out.println("raça: " + lif.getRaca());

	}

}
