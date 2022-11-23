package objetos;
public abstract class Tiefling extends Personagem {

    @Override
    protected void setInteligencia(int inteligencia) {
        inteligencia += 1;
        super.setInteligencia(inteligencia);
    }

    @Override
    protected void setCarisma(int carisma) {
        carisma += 1;
        super.setCarisma(carisma);
    }
    
}
