package objetos;

public abstract class Personagem {
	protected String nome;
	protected String raca;
	protected String classe;
	protected int nivel;
	protected int bonusDeProficiencia;
	protected int iniciativa;
	protected int classeDeArmadura;
	protected int percepcaoPassiva;
	protected int pontosDeVida;

	// Atributos
	int forca;
	int constituicao;
	int destreza;
	int inteligencia;
	int sabedoria;
	int carisma;

	// Modificadores

	int modFor;
	int modCon;
	int modDes;
	int modInt;
	int modSab;
	int modCar;

	public void setPontosDeVida(int pontosDeVida) {
		this.pontosDeVida = pontosDeVida;
	}

	public int getPontosDeVida() {
		return pontosDeVida;
	}

	public void setPercepcaoPassiva(int percepcaoPassiva) {
		this.percepcaoPassiva = percepcaoPassiva;
	}

	public int getPercepcaoPassiva() {
		return percepcaoPassiva;
	}

	public void setClasseDeArmadura(int classeDeArmadura) {
		this.classeDeArmadura = classeDeArmadura;
	}

	public int getClasseDeArmadura() {
		return classeDeArmadura;
	}

	public void setIniciativa(int iniciativa) {
		this.iniciativa = iniciativa;
	}

	public int getIniciativa() {
		return iniciativa;
	}

	public void setBonusDeProficiencia(int bonusDeProficiencia) {
		if(nivel >= 1 && nivel <= 4) {
            bonusDeProficiencia = 2;
        } else if (nivel >= 5 && nivel <= 8){
            bonusDeProficiencia = 3;
        } else if (nivel >= 9 && nivel <= 12) {
            bonusDeProficiencia = 4;
        } else if (nivel >=  13 && nivel <= 16) {
            bonusDeProficiencia = 5;
        } else if (nivel >= 17 && nivel <= 20) {
            bonusDeProficiencia = 6;
        }
		this.bonusDeProficiencia = bonusDeProficiencia;
	}

	public int getBonusDeProficiencia() {
		return bonusDeProficiencia;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getNivel() {
		return nivel;
	}

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
		this.constituicao += constituicao;
	}

	protected int getDestreza() {
		return destreza;
	}

	protected void setDestreza(int destreza) {
		this.destreza += destreza;
	}

	protected int getInteligencia() {
		return inteligencia;
	}

	protected void setInteligencia(int inteligencia) {
		this.inteligencia += inteligencia;
	}

	protected int getSabedoria() {
		return sabedoria;
	}

	protected void setSabedoria(int sabedoria) {
		this.sabedoria += sabedoria;
	}

	protected int getCarisma() {
		return carisma;
	}

	protected void setCarisma(int carisma) {
		this.carisma += carisma;
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
