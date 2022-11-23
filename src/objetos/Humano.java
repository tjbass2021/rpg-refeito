package objetos;
public abstract class Humano extends Personagem {


    @Override
    protected void setForca(int forca) {
        forca += 1;
        super.setForca(forca);
    }

    @Override
    protected void setConstituicao(int constituicao) {
        constituicao += 1;
        super.setConstituicao(constituicao);
    }

    @Override
    protected void setDestreza(int destreza) {
        destreza += 1;
        super.setDestreza(destreza);
    }

    @Override
    protected void setInteligencia(int inteligencia) {
        inteligencia += 1;
        super.setInteligencia(inteligencia);
    }

    @Override
    protected void setSabedoria(int sabedoria) {
        sabedoria += 1;
        super.setSabedoria(sabedoria);
    }

    @Override
    protected void setCarisma(int carisma) {
        carisma += 1;
        super.setCarisma(carisma);
    }
    
}
