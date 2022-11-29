package objetos;

// import calculos.CalcBarbaro;
// import calculos.Maths;

public class HumanoBarbaro extends Humano {

    public HumanoBarbaro (int forca, int constituicao, int destreza, int inteligencia, int sabedoria, int carisma, int nivel) {

        super(forca, destreza, constituicao, inteligencia, sabedoria, carisma, nivel);

        setClasse();
        

    }

    @Override
    public void setClasse() {
       this.classe = "Bárbaro"; 
    }

 

    
}
