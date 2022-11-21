public abstract class MeioElfo extends Personagem {

    @Override
    protected void setCarisma(int carisma) {
        carisma = carisma + 2;
        super.setCarisma(carisma);
    }


    // Observar este método da regra de escolher entre dois atributos para poder dar um aumento de 1 ponto para cada no construtor dos personagens do tipo Meio-Elfo

    protected int[] setDoisAtributos(int atributo1, int atributo2) {
        int[] atributos;

        atributos = new int[2];

        atributo1 += 1;
        atributo2 += 1;

        atributos[0] = atributo1;
        atributos[1] = atributo2;

        return atributos;

    }
    
}
