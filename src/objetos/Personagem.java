package objetos;

import calculos.*;

public abstract class Personagem {
	public String nome;
	public String raca;
	public String classe;
	public int nivel;
	public int bonusDeProficiencia;
	public int iniciativa;
	public int classeDeArmadura;
	public int percepcaoPassiva;
	public int pontosDeVida;

	// específicos do barbaro
	private String furia;
    private int danoDeFuria;

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


	public Personagem(int forca, int destreza, int constituicao, int inteligencia, int sabedoria, int carisma, int nivel) {

		setForca(forca);
        setDestreza(destreza);
        setConstituicao(constituicao);
        setInteligencia(inteligencia);
        setSabedoria(sabedoria);
        setCarisma(carisma);

		setNivel(nivel);

        setModFor(Maths.calcMods(forca));
        setModDes(Maths.calcMods(destreza));
        setModCon(Maths.calcMods(constituicao));
        setModInt(Maths.calcMods(inteligencia));
        setModSab(Maths.calcMods(sabedoria));
        setModCar(Maths.calcMods(carisma));
	}



	public void setPontosDeVida(int pontosDeVida) {
		pontosDeVida = CalcVida.vida(getNivel(), getModCon(), getClasse());
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public abstract void setRaca(); 
	

	public String getRaca() {
		return raca;
	}

	public int getForca() {
		return forca;
	}

	// Getters and setters for atributes
	public void setForca(int forca) {
		this.forca += forca;
	}

	public int getConstituicao() {
		return constituicao;
	}

	public void setConstituicao(int constituicao) {
		this.constituicao += constituicao;
	}

	public int getDestreza() {
		return destreza;
	}

	public void setDestreza(int destreza) {
		this.destreza += destreza;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia += inteligencia;
	}

	public int getSabedoria() {
		return sabedoria;
	}

	public void setSabedoria(int sabedoria) {
		this.sabedoria += sabedoria;
	}

	public int getCarisma() {
		return carisma;
	}

	public void setCarisma(int carisma) {
		this.carisma += carisma;
	}

	// Getters and setters for Mods

	public void setModFor(int modFor) {
		this.modFor = modFor;
	}

	public void setModDes(int modDes) {
		this.modDes = modDes;
	}

	public void setModCon(int modCon) {
		this.modCon = modCon;
	}

	public void setModInt(int modInt) {
		this.modInt = modInt;
	}

	public void setModSab(int modSab) {
		this.modSab = modSab;
	}

	public void setModCar(int modCar) {
		this.modCar = modCar;
	}

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

	// getters e setters do barbaro

	public void setFuria(String furia) {
        this.furia = furia;
    }

    public void setDanoDeFuria(int danoDeFuria) {
        this.danoDeFuria = danoDeFuria;
    }

    public String getFuria() {
        return furia;
    }

    public int getDanoDeFuria() {
        return danoDeFuria;
    }


	// exibição

	public void exibirMensagem() {

		System.out.println("=================");
		System.out.println("Raça: " + getRaca());
		System.out.println("Classe: " + getClasse());
		System.out.println("Vida: " + getPontosDeVida());
		System.out.println("=================");
		System.out.println("====Atributos====");
		System.out.println("Força: " + getForca() + " +(" + getModFor() + ")");
		System.out.println("Constituição: " + getConstituicao() + " +(" + getModCon() + ")");
		System.out.println("Destreza: " + getDestreza() + " +(" + getModDes() + ")");
		System.out.println("Inteligência: " + getInteligencia() + " +(" + getModInt() + ")");
		System.out.println("Sabedoria: " + getSabedoria() + " +(" + getModSab() + ")");
		System.out.println("Carisma: " + getCarisma() + " +(" + getModCar() + ")");
		System.out.println("================");
	}



}
