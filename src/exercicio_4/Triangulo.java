package exercicio_4;

public class Triangulo {
  private double a;
  private double b;
  private double c;

  public Triangulo(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public double calcularArea() {
    double p = (a + b + c) / 2;
    double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
    return area;
  }

  public double calcularPerimetro() {
    double perimetro = a + b + c;
    return perimetro;
  }

  public double[] calcularCentroide() {
    double lambda = (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b);
    double x = (b + a * lambda) / 3;
    double y = (a / 3) * Math.sqrt(1 - Math.pow(lambda, 2));

    double[] coordenadasCentroide = { x, y };
    return coordenadasCentroide;
  }
}
