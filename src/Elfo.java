public abstract class Elfo extends Personagem {

    @Override
    protected void setDestreza(int destreza) {
        destreza = destreza + 2;
        super.setDestreza(destreza);
    }
    
}
