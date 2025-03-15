package exercicio_4;

import java.util.ArrayList;

public class Util {
  private ArrayList<Triangulo> listaTriangulo = new ArrayList<>();

  public void adicionarTriangulosLista() {
    listaTriangulo.add(new Triangulo(5, 12, 13));
    listaTriangulo.add(new Triangulo(7, 24, 25));
    listaTriangulo.add(new Triangulo(6, 8, 10));
  }

  public void imprimirListaTriangulo() {
    int contador = 1;

    for (Triangulo triangulo : listaTriangulo) {
      System.out.println(contador + "º triângulo da lista:");
      System.out.println("Área: " + triangulo.calcularArea());
      System.out.println("Perímetro: " + triangulo.calcularPerimetro());
      double[] centroide = triangulo.calcularCentroide();
      System.out.println("Centróide: x = " + centroide[0] + ", y = " + centroide[1] + "\n");
      contador++;
    }
  }
}
