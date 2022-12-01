package objetos.humano;

public class HumanoBardo extends Humano {

    public HumanoBardo(int forca, int destreza, int constituicao, int inteligencia, int sabedoria, int carisma,
            int nivel) {
        super(forca, destreza, constituicao, inteligencia, sabedoria, carisma, nivel);

        setRaca();
        setPontosDeVida();

        exibirMensagem();
    }

    @Override
    public void setClasse() {
       this.classe = "Bardo"; 
    }


}
