public class HumanoGuerreiro extends Humano {

    // Cálculos
    Maths calculadoraMod = new Maths();

    

    public HumanoGuerreiro(int forca, int constituicao, int destreza, int inteligencia, int sabedoria, int carisma) {

        // Atributos
        setForca(forca);
        setConstituicao(constituicao);
        setDestreza(destreza);
        setInteligencia(inteligencia);
        setSabedoria(sabedoria);
        setCarisma(carisma);



        // Modificadores
        modFor = calculadoraMod.calcMods(forca);
        modCon = calculadoraMod.calcMods(constituicao);
        modDes = calculadoraMod.calcMods(destreza);
        modInt = calculadoraMod.calcMods(inteligencia);
        modSab = calculadoraMod.calcMods(sabedoria);
        modCar = calculadoraMod.calcMods(carisma);
        

        setRaca("Humano");
        setClasse("Guerreiro");
        setNivel(20);

        // bonus
        setBonusDeProficiencia(bonusDeProficiencia);

        // pontos de vida
        setPontosDeVida(pontosDeVida, modCon);
    }



    // pontos de vida de Guerreiro

    @Override
    public void setPontosDeVida(int pontosDeVida, int modCon) {
        pontosDeVida = 10 + modCon;
        super.setPontosDeVida(pontosDeVida, modCon);
    }


}
