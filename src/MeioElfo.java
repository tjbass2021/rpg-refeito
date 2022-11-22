public abstract class MeioElfo extends Personagem {

    @Override
    protected void setCarisma(int carisma) {
        carisma = carisma + 2;
        super.setCarisma(carisma);
    }


    protected void setAtributoExtraForca(){
        this.forca = this.forca + 1;
    }
    
}
