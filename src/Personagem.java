
public abstract class Personagem {
	protected String nome;
	protected String raca;
	protected String classe;

	// Maths
	Maths calc = new Maths();

	// Atributos
	int forca;
	int constituicao;
	int destreza;
	int inteligencia;
	int sabedoria;
	int carisma;

	// Modificadores

	int modFor = calc.calcMods(forca);
	int modCon = calc.calcMods(constituicao);
	int modDes = calc.calcMods(destreza);
	int modInt = calc.calcMods(inteligencia);
	int modSab = calc.calcMods(sabedoria);
	int modCar = calc.calcMods(carisma);

	protected String getNome() {
		return nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}

	protected String getClasse() {
		return classe;
	}

	protected void setClasse(String classe) {
		this.classe = classe;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getRaca() {
		return raca;
	}

	protected int getForca() {
		return forca;
	}

	// Getters and setters for atributes
	protected void setForca(int forca) {
		this.forca += forca;
	}

	protected int getConstituicao() {
		return constituicao;
	}

	protected void setConstituicao(int constituicao) {
		this.constituicao = constituicao;
	}

	protected int getDestreza() {
		return destreza;
	}

	protected void setDestreza(int destreza) {
		this.destreza = destreza;
	}

	protected int getInteligencia() {
		return inteligencia;
	}

	protected void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	protected int getSabedoria() {
		return sabedoria;
	}

	protected void setSabedoria(int sabedoria) {
		this.sabedoria = sabedoria;
	}

	protected int getCarisma() {
		return carisma;
	}

	protected void setCarisma(int carisma) {
		this.carisma = carisma;
	}

	// Getters and setters for Mods
	public int getModFor() {
		return modFor;
	}

	public int getModCon() {
		return modCon;
	}

	public int getModDes() {
		return modDes;
	}

	public int getModInt() {
		return modInt;
	}

	public int getModSab() {
		return modSab;
	}

	public int getModCar() {
		return modCar;
	}

}
