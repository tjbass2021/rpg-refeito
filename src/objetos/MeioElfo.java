package objetos;
public abstract class MeioElfo extends Personagem {

    @Override
    protected void setCarisma(int carisma) {
        carisma = carisma + 2;
        super.setCarisma(carisma);
    }

    // métodos espcíficos de bonificação extra para 2 atributos a escolha do jogador
    protected void setAtributoExtraForca(){
        this.forca += 1;
    }

    protected void setAtributoExtraDestreza(){
        this.destreza += 1;
    }

    protected void setAtributoExtraConstituicao() {
        this.constituicao += 1;
    }

    protected void setAtributoExtraInteligencia(){
        this.inteligencia += 1;
    }

    protected void setAtributoExtraSabedoria() {
        this.sabedoria += 1;
    }
    
}
