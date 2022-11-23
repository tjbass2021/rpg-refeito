package calculos;
public abstract class Maths {

  public static int calcMods(int atributo) {
    int mod = 0;
    if (atributo == 1) {
      mod = -5;

    } else if (atributo == 2 || atributo == 3) {
      mod = -4;

    } else if (atributo == 4 || atributo == 5) {
      mod = -3;

    } else if (atributo == 6 || atributo == 7) {
      mod = -2;

    } else if (atributo == 8 || atributo == 9) {
      mod = -1;

    } else if (atributo == 10 || atributo == 11) {
      mod = 0;

    } else if (atributo == 12 || atributo == 13) {
      mod = 1;

    } else if (atributo == 14 || atributo == 15) {
      mod = 2;

    } else if (atributo == 16 || atributo == 17) {
      mod = 3;

    } else if (atributo == 18 || atributo == 19) {
      mod = 4;

    } else if (atributo == 20 || atributo == 21) {
      mod = 5;

    } else if (atributo == 22 || atributo == 23) {
      mod = 6;

    } else if (atributo == 24 || atributo == 25) {
      mod = 7;

    } else if (atributo == 26 || atributo == 27) {
      mod = 8;

    } else if (atributo == 28 || atributo == 29) {
      mod = 9;

    } else if (atributo == 30) {
      mod = 10;

    }

    return mod;
  }

  public static int calculoDePericias(int modificador, int bonusDeProficiencia) {
    return modificador + bonusDeProficiencia;
  }


  // métodos de cálculos de Bárbaro

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

  // cálculos de bardo, bruxo e clerigo

  public static int calcVidaBardoBruxoClerigoDruida (int nivel, int modCon) {
    int pontosDeVida = 0;
    if (nivel == 1) {
            pontosDeVida = 8 + modCon;
        } else if (nivel > 1) {
            pontosDeVida = (5 + modCon) * nivel;
        }
    return pontosDeVida;
  }

  // truques conhecidos para bardo, bruxo e druidas

  public static int calcTruques (int nivel) {
    int truques = 0;
    if (nivel >= 1 && nivel <= 3) {
      truques = 2;
    } else if (nivel >= 4 && nivel <= 9) {
      truques = 3;
    } else if (nivel >= 10) {
      truques = 4;
    }
    return truques;
  }

  public static int calcMagiaBardo (int nivel) {
    int magias = 0;
    switch(magias) {
      case 1:
        magias = 4;
        break;
      case 2:
        magias = 5;
        break;
      case 3:
        magias = 6;
        break;
      case 4:
        magias = 7;
        break;
      case 5:
        magias = 8;
        break;
      case 6:
        magias = 9;
        break;
      case 7:
        magias = 10;
        break;
      case 8:
        magias = 11;
        break;
      case 9:
        magias = 12;
        break;
      case 10:
        magias = 14;
        break;
      case 11:
        magias = 15;
        break;
      case 12:
        magias = 15;
        break;
      case 13:
        magias = 16;
        break;
      case 14:
        magias = 18;
        break;
      case 15:
        magias = 19;
        break;
      case 16:
        magias = 19;
        break;
      case 17:
        magias = 20;
        break;
      case 18:
        magias = 22;
        break;
      case 19:
        magias = 22;
        break;
      case 20:
        magias = 22;
        break;
    }

    if (nivel > 20) {
      magias = 22;
    }

    return magias;
  }

  // calculo de classe de dificuldade de magia CD

  public static int calcCDMAgiaBardo (int bonusDeProficiencia, int modCar) {
    int cd = 8 + bonusDeProficiencia + modCar;
    return cd;
  }

  // calculo de modificador de ataque de magia

  public static int calcModAtaqueMagiaBardo (int bonusDeProficiencia, int modCar) {
    int mdm = bonusDeProficiencia + modCar;
    return mdm;
  }
}
