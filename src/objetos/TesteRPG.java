package objetos;

public class TesteRPG {

	public static void main(String[] args) {

		HumanoBarbaro lif = new HumanoBarbaro(16, 18, 14, 12, 11, 10, 16);

		System.out.println("furia: " + lif.getFuria());
		System.out.println("dano de furia: " + lif.getDanoDeFuria());
		System.out.println("vida: " + lif.getPontosDeVida());

	}

}
