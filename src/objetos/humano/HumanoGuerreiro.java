package objetos.humano;

// import calculos.Maths;

public class HumanoGuerreiro extends Humano {

    public HumanoGuerreiro(int forca, int destreza, int constituicao, int inteligencia, int sabedoria, int carisma,
            int nivel) {

        super(forca, destreza, constituicao, inteligencia, sabedoria, carisma, nivel);

        setClasse();
        setPontosDeVida();

        exibirMensagem();
    }

    @Override
    public void setClasse() {
        this.classe = "Guerreiro";

    }

}
