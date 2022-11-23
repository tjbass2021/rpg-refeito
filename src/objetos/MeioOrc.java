package objetos;
public abstract class MeioOrc extends Personagem {

    @Override
    protected void setForca(int forca) {
        forca += 2;
        super.setForca(forca);
    }

    @Override
    protected void setConstituicao(int constituicao) {
        constituicao += 1;
        super.setConstituicao(constituicao);
    }
    
}
