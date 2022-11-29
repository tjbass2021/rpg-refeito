package objetos.anao;

import objetos.Personagem;

public abstract class Anao extends Personagem {

    public Anao (int forca, int destreza, int constituicao, int inteligencia, int sabedoria, int carisma, int nivel) {

        super(forca, destreza, constituicao, inteligencia, sabedoria, carisma, nivel);



        setRaca();


    }
   
    @Override
    public void setConstituicao(int constituicao) {
        constituicao = constituicao + 2;
        super.setConstituicao(constituicao);
    }
}
