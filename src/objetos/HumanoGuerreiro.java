package objetos;
import calculos.Maths;

public class HumanoGuerreiro extends Humano {

    public HumanoGuerreiro(int forca, int constituicao, int destreza, int inteligencia, int sabedoria, int carisma) {

        // Atributos
        setForca(forca);
        setConstituicao(constituicao);
        setDestreza(destreza);
        setInteligencia(inteligencia);
        setSabedoria(sabedoria);
        setCarisma(carisma);

        // Modificadores
        modFor = Maths.calcMods(forca);
        modCon = Maths.calcMods(constituicao);
        modDes = Maths.calcMods(destreza);
        modInt = Maths.calcMods(inteligencia);
        modSab = Maths.calcMods(sabedoria);
        modCar = Maths.calcMods(carisma);
        

        setRaca("Humano");
        setClasse("Guerreiro");
        setNivel(20);

        // bonus
        setBonusDeProficiencia(bonusDeProficiencia);

        // pontos de vida
        // setPontosDeVida(pontosDeVida, modCon);
    }



    // pontos de vida de Guerreiro

    // @Override
    // public void setPontosDeVida(int pontosDeVida, int modCon) {
    //     pontosDeVida = 10 + modCon;
    //     super.setPontosDeVida(pontosDeVida, modCon);
    // }


}
