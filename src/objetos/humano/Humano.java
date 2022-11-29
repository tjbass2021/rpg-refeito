package objetos.humano;
// import calculos.*;

import objetos.Personagem;

public abstract class Humano extends Personagem {

    public Humano (int forca, int destreza, int constituicao, int inteligencia, int sabedoria, int carisma, int nivel) {

        super(forca, destreza, constituicao, inteligencia, sabedoria, carisma, nivel);



        setRaca();


    }

    @Override
    public void setForca(int forca) {
        forca += 1;
        super.setForca(forca);
    }

    @Override
    public void setConstituicao(int constituicao) {
        constituicao += 1;
        super.setConstituicao(constituicao);
    }

    @Override
    public void setDestreza(int destreza) {
        destreza += 1;
        super.setDestreza(destreza);
    }

    @Override
    public void setInteligencia(int inteligencia) {
        inteligencia += 1;
        super.setInteligencia(inteligencia);
    }

    @Override
    public void setSabedoria(int sabedoria) {
        sabedoria += 1;
        super.setSabedoria(sabedoria);
    }

    @Override
    public void setCarisma(int carisma) {
        carisma += 1;
        super.setCarisma(carisma);
    }

    @Override
    public void setRaca() {
       this.raca = "Humano"; 
    }

    public abstract void setClasse();
    
}
