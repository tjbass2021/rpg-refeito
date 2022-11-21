public abstract class Draconato extends Personagem {

    @Override
    protected void setForca(int forca) {
        forca = forca + 2;
        super.setForca(forca);
    }

    @Override
    protected void setCarisma(int carisma) {
        carisma = carisma + 1;
        super.setCarisma(carisma);
    }
    
}
