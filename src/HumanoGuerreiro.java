public class HumanoGuerreiro extends Personagem implements Guerreiro {

    // Cálculos
    Maths calculadoraMod = new Maths();

    

    public HumanoGuerreiro(int forca, int constituicao, int destreza, int inteligencia, int sabedoria, int carisma) {

        // Atributos
        setForca(forca);
        setConstituicao(constituicao);
        setDestreza(destreza);
        setInteligencia(inteligencia);
        setSabedoria(sabedoria);
        setCarisma(carisma);



        // Modificadores
        modFor = calculadoraMod.calcMods(forca);
        modCon = calculadoraMod.calcMods(constituicao);
        modDes = calculadoraMod.calcMods(destreza);
        modInt = calculadoraMod.calcMods(inteligencia);
        modSab = calculadoraMod.calcMods(sabedoria);
        modCar = calculadoraMod.calcMods(carisma);
        

        setRaca("Humano");
        setClasse("Guerreiro");
        setNivel(20);

        // bonus
        setBonusDeProficiencia(bonusDeProficiencia(nivel, 0));
    }



    @Override
    protected void setForca(int forca) {
        forca += 1;
        super.setForca(forca);
    }

    @Override
    protected void setConstituicao(int constituicao) {
        constituicao += 1;
        super.setConstituicao(constituicao);
    }

    @Override
    protected void setDestreza(int destreza) {
        destreza += 1;
        super.setDestreza(destreza);
    }

    @Override
    protected void setInteligencia(int inteligencia) {
        inteligencia += 1;
        super.setInteligencia(inteligencia);
    }

    @Override
    protected void setSabedoria(int sabedoria) {
        sabedoria += 1;
        super.setSabedoria(sabedoria);
    }

    @Override
    protected void setCarisma(int carisma) {
        carisma += 1;
        super.setCarisma(carisma);
    }



    

    // implements

    @Override
    public int bonusDeProficiencia(int nivel, int bonus) {
        if(nivel >= 1 && nivel <= 4) {
            bonus = 2;
        } else if (nivel >= 5 && nivel <= 8){
            bonus = 3;
        } else if (nivel >= 9 && nivel <= 12) {
            bonus = 4;
        } else if (nivel >=  13 && nivel <= 16) {
            bonus = 5;
        } else if (nivel >= 17 && nivel <= 20) {
            bonus = 6;
        }
        return bonus;
    }
}
