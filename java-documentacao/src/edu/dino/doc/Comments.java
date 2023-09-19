package edu.dino.doc;

public class Comments {
  public static void main(String[] args) {
    // Testes de comentários
  }

  /**
   * Este método foi elaborado as pressas
   * por isso eu abrevei o nome das variáveis
   * mas olha, ele tem a finalidade somar ou multiplicar
   * dois números 
   */
  public int addMultiply (int n, int x, String m) {
    int r = 0;
    if ("M".equals(m)) { // M = multiplicação
      r = n * x;
    } else {
      // se não soma mesmo
      r = n + x;
    }

    return r;
  }
}
