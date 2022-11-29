package objetos.draconato;

import objetos.Personagem;

public abstract class Draconato extends Personagem {

    public Draconato (int forca, int destreza, int constituicao, int inteligencia, int sabedoria, int carisma, int nivel) {

        super(forca, destreza, constituicao, inteligencia, sabedoria, carisma, nivel);



        setRaca();


    }

    @Override
    public void setRaca() {
       this.raca = "Draconato"; 
    }

    @Override
    public void setForca(int forca) {
        forca = forca + 2;
        super.setForca(forca);
    }

    @Override
    public void setCarisma(int carisma) {
        carisma = carisma + 1;
        super.setCarisma(carisma);
    }
    
}
