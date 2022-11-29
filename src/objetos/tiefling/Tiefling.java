package objetos.tiefling;

import objetos.Personagem;

public abstract class Tiefling extends Personagem {

    public Tiefling (int forca, int destreza, int constituicao, int inteligencia, int sabedoria, int carisma, int nivel) {

        super(forca, destreza, constituicao, inteligencia, sabedoria, carisma, nivel);



        setRaca();


    }

    @Override
    public void setInteligencia(int inteligencia) {
        inteligencia += 1;
        super.setInteligencia(inteligencia);
    }

    @Override
    public void setCarisma(int carisma) {
        carisma += 1;
        super.setCarisma(carisma);
    }
    
}
