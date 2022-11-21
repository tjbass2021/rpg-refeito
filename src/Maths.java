public class Maths {
  int mod;

  public int calcMods(int atributo) {
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
}
