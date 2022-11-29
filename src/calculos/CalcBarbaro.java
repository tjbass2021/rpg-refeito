package calculos;

public abstract class CalcBarbaro {
    public static String calcFuria(int nivel) {
    String furia = "";

    if (nivel >= 1 && nivel <= 2) {
      furia = "2";
    } else if (nivel >= 3 && nivel <= 5) {
      furia = "3";
    } else if (nivel >= 6 && nivel <= 11) {
      furia = "4";
    } else if (nivel >= 12 && nivel <= 16) {
      furia = "5";
    } else if (nivel >= 17 && nivel <= 19) {
      furia = "6";
    } else if (nivel >= 20) {
      furia = "Ilimitado";
    }

    return furia;
  }

  public static int calcDanoDeFuria (int nivel) {
    int danoDeFuria = 0;
    if (nivel >= 1 && nivel <= 8) {
            danoDeFuria = 2;
        } else if (nivel >= 9 && nivel <= 15) {
            danoDeFuria = 3;
        } else if (nivel >= 16) {
            danoDeFuria = 4;
        }

    return danoDeFuria;
  }

  public static int calcVidaBarbaro (int nivel, int modCon) {
    int pontosDeVida = 0;
    if (nivel == 1) {
            pontosDeVida = 12 + modCon;
        } else if (nivel > 1) {
            pontosDeVida = (7 + modCon) * nivel;
        }
    return pontosDeVida;
  }
}
