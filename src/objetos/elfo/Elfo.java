package objetos.elfo;

import objetos.Personagem;

public abstract class Elfo extends Personagem {

    public Elfo (int forca, int destreza, int constituicao, int inteligencia, int sabedoria, int carisma, int nivel) {

        super(forca, destreza, constituicao, inteligencia, sabedoria, carisma, nivel);



        setRaca();


    }

    @Override
    public void setDestreza(int destreza) {
        destreza = destreza + 2;
        super.setDestreza(destreza);
    }
    
}
