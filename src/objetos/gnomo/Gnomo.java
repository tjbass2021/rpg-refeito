package objetos.gnomo;

import objetos.Personagem;

public abstract class Gnomo extends Personagem{

    public Gnomo (int forca, int destreza, int constituicao, int inteligencia, int sabedoria, int carisma, int nivel) {

        super(forca, destreza, constituicao, inteligencia, sabedoria, carisma, nivel);



        setRaca();


    }

    @Override
    public void setInteligencia(int inteligencia) {
        inteligencia = inteligencia + 2;
        super.setInteligencia(inteligencia);
    }
    
}
