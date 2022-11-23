package objetos;
public abstract class Gnomo extends Personagem{

    @Override
    protected void setInteligencia(int inteligencia) {
        inteligencia = inteligencia + 2;
        super.setInteligencia(inteligencia);
    }
    
}
