package objetos.humano;

import calculos.CalcClassesMagicas;

public class HumanoBruxo extends Humano {

    public HumanoBruxo(int forca, int destreza, int constituicao, int inteligencia, int sabedoria, int carisma,
            int nivel) {
        super(forca, destreza, constituicao, inteligencia, sabedoria, carisma, nivel);

        setClasse();
        setPontosDeVida();
        setAtqDeMagia(atqDeMagia);
        setCDdeMagia(CDdeMagia);



        exibirMensagem();
    }

    @Override
    public void setClasse() {
       this.classe = "Bruxo";
    }

    /* (non-Javadoc)
     * @see objetos.Personagem#setAtqDeMagia(int)
     */
    @Override
    public void setAtqDeMagia(int atqDeMagia) {
        atqDeMagia = CalcClassesMagicas.calcModAtaqueMagiaBardo(getBonusDeProficiencia(), getModCar());
        super.setAtqDeMagia(atqDeMagia);
    }

    /* (non-Javadoc)
     * @see objetos.Personagem#setCDdeMagia(int)
     */
    @Override
    public void setCDdeMagia(int cDdeMagia) {
        cDdeMagia = CalcClassesMagicas.calcCDMAgia(getBonusDeProficiencia(), getModCar());
        super.setCDdeMagia(cDdeMagia);
    }

    @Override
    public void exibirMensagem() {
        super.exibirMensagem();
        CalcClassesMagicas.msg(getCDdeMagia(), getAtqDeMagia());
    }



}
