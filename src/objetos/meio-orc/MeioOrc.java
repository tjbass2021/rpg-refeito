package objetos;
public abstract class MeioOrc extends Personagem {

    public MeioOrc (int forca, int destreza, int constituicao, int inteligencia, int sabedoria, int carisma, int nivel) {

        super(forca, destreza, constituicao, inteligencia, sabedoria, carisma, nivel);



        setRaca();


    }

    @Override
    public void setForca(int forca) {
        forca += 2;
        super.setForca(forca);
    }

    @Override
    public void setConstituicao(int constituicao) {
        constituicao += 1;
        super.setConstituicao(constituicao);
    }
    
}
