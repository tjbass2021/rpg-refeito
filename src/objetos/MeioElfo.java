package objetos;
public abstract class MeioElfo extends Personagem {


    public MeioElfo (int forca, int destreza, int constituicao, int inteligencia, int sabedoria, int carisma, int nivel) {

        super(forca, destreza, constituicao, inteligencia, sabedoria, carisma, nivel);



        setRaca();


    }

    @Override
    public void setRaca() {
       this.raca = "Meio-Elfo"; 
    }

    @Override
    public void setCarisma(int carisma) {
        carisma = carisma + 2;
        super.setCarisma(carisma);
    }

    // métodos específicos de bonificação extra para 2 atributos a escolha do jogador
    public void setAtributoExtraForca(){
        this.forca += 1;
    }

    public void setAtributoExtraDestreza(){
        this.destreza += 1;
    }

    public void setAtributoExtraConstituicao() {
        this.constituicao += 1;
    }

    public void setAtributoExtraInteligencia(){
        this.inteligencia += 1;
    }

    public void setAtributoExtraSabedoria() {
        this.sabedoria += 1;
    }
    
}
