package objetos.humano;

// import calculos.Maths;

public class HumanoGuerreiro extends Humano {

    public HumanoGuerreiro(int forca, int destreza, int constituicao, int inteligencia, int sabedoria, int carisma, int nivel){


        super(forca, destreza, constituicao, inteligencia, sabedoria, carisma, nivel);

        setClasse();
        setPontosDeVida(pontosDeVida);
    }

    @Override
    public void setClasse() {
       this.classe = "Guerreiro"; 
        
    }

    // public HumanoGuerreiro(int forca, int constituicao, int destreza, int inteligencia, int sabedoria, int carisma, int nivel) {

    //     // Atributos
    //     // setForca(forca);
    //     // setConstituicao(constituicao);
    //     // setDestreza(destreza);
    //     // setInteligencia(inteligencia);
    //     // setSabedoria(sabedoria);
    //     // setCarisma(carisma);

    //     // Modificadores
    //     // modFor = Maths.calcMods(forca);
    //     // modCon = Maths.calcMods(constituicao);
    //     // modDes = Maths.calcMods(destreza);
    //     // modInt = Maths.calcMods(inteligencia);
    //     // modSab = Maths.calcMods(sabedoria);
    //     // modCar = Maths.calcMods(carisma);
        

    //     setRaca("Humano");
    //     setClasse("Guerreiro");
    //     setNivel(20);

    //     // bonus
    //     // setBonusDeProficiencia(bonusDeProficiencia);

    //     // pontos de vida
    //     // setPontosDeVida(pontosDeVida, modCon);

    //     super(forca, constituicao, destreza, inteligencia, sabedoria, carisma, nivel);
    // }



    //pontos de vida de Guerreiro

    @Override
    public void setPontosDeVida(int pontosDeVida) {
        pontosDeVida = 10 + getModCon();
        super.setPontosDeVida(pontosDeVida);
    }


}
