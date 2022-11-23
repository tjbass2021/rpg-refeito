package objetos;
public abstract class Anao extends Personagem {
   
    @Override
    protected void setConstituicao(int constituicao) {
        constituicao = constituicao + 2;
        super.setConstituicao(constituicao);
    }
}
