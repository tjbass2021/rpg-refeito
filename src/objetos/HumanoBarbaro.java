package objetos;

import calculos.Maths;

public class HumanoBarbaro extends Humano {

    private String furia;
    private int danoDeFuria;

    public HumanoBarbaro (int forca, int constituicao, int destreza, int inteligencia, int sabedoria, int carisma, int nivel) {


        setRaca("Humano");
        setClasse("Barbaro");
        setNivel(nivel);

        setForca(forca);
        setConstituicao(constituicao);
        setDestreza(destreza);
        setInteligencia(inteligencia);
        setSabedoria(sabedoria);
        setCarisma(carisma);

        modFor = Maths.calcMods(forca);
        modCon = Maths.calcMods(constituicao);
        modDes = Maths.calcMods(destreza);
        modInt = Maths.calcMods(inteligencia);
        modSab = Maths.calcMods(sabedoria);
        modCar = Maths.calcMods(carisma);

        setFuria(Maths.calcFuria(nivel)); 
        setDanoDeFuria(Maths.calcDanoDeFuria(nivel));

        setBonusDeProficiencia(nivel);
        setPontosDeVida(Maths.calcVidaBarbaro(nivel, modCon));
        

    }

    

    public void setFuria(String furia) {
        this.furia = furia;
    }

    public void setDanoDeFuria(int danoDeFuria) {
        this.danoDeFuria = danoDeFuria;
    }

    public String getFuria() {
        return furia;
    }

    public int getDanoDeFuria() {
        return danoDeFuria;
    }



    
}
