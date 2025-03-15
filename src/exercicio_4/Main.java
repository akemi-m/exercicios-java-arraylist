package exercicio_4;

// 4. Desenvolva uma classe para representar um triângulo. Defina métodos para calcular a área S, o
// perímetro P e o centróide de coordenadas x e y. 

// S = √(p (p - a)(p - b)(p - c))
// p = (a + b + c) / 2
// P = a + b + c
// y = (a / 3) √(1 - λ²)
// x = (b + aλ) / 3
// λ = (a² + b² - c²) / (2ab)

// Requisitos:
// a) A classe deverá ter o método construtor para inicializar todos os atributos do objeto.
// b) Para calcular raiz quadrada é utilizado o método estático Math.sqrt() e, para calcular potenciação
// o método estático Math.pow(a, b). A classe Math está no pacote java.lang que não precisa ser
// importado.
// c) Gere a classe principal para gerar alguns objetos e armazenar em um ArrayList. Após o
// armazenamento, imprima para cada triângulo a área, o perímetro e o centróide de coordenadas
// x e y.

public class Main {
  public static void main(String[] args) {
    Util util = new Util();

    util.adicionarTriangulosLista();
    util.imprimirListaTriangulo();
  }
}
