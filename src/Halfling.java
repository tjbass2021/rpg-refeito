public abstract class Halfling extends Personagem {

    @Override
    protected void setDestreza(int destreza) {
        destreza = destreza + 2;
        super.setDestreza(destreza);
    }
    
}
