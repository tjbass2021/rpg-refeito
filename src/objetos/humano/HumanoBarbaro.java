package objetos.humano;



public class HumanoBarbaro extends Humano {

    public HumanoBarbaro (int forca, int constituicao, int destreza, int inteligencia, int sabedoria, int carisma, int nivel) {

        super(forca, destreza, constituicao, inteligencia, sabedoria, carisma, nivel);

        setClasse();

        setPontosDeVida();

        exibirMensagem();
    }

    @Override
    public void setClasse() {
       this.classe = "Bárbaro"; 
    }

    @Override
    public void exibirMensagem() {
        super.exibirMensagem();

        // escrever as mensagens específicas da classe bárbaro - preciso ver qual a melhor forma de fazer
        System.out.println("Mensagem do Bárbaro");
    }

 

    
}
