package objetos.halfling;

import objetos.Personagem;

public abstract class Halfling extends Personagem {

    public Halfling (int forca, int destreza, int constituicao, int inteligencia, int sabedoria, int carisma, int nivel) {

        super(forca, destreza, constituicao, inteligencia, sabedoria, carisma, nivel);



        setRaca();


    }

    @Override
    public void setDestreza(int destreza) {
        destreza = destreza + 2;
        super.setDestreza(destreza);
    }
    
}
