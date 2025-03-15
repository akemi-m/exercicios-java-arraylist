package exercicio_3;

// 3. Implemente um programa em Java que reorganize um array de inteiros A contendo n
// elementos de forma que todos os números menores ou iguais a um valor k fiquem antes dos
// números maiores que k.

// Regras e Restrições
// a) O algoritmo deve reorganizar os elementos in-place, ou seja, sem criar um novo array auxiliar.
// b) O programa não pode usar recursividade.
// c) O programa deve receber como entrada um array não ordenado e um valor inteiro k. Todos
// os valores devem ser informados pelo terminal.

// Exemplo de Entrada: A = {8, 2, 7, 3, 10, 5, 1, 6} e k = 5.
// Exemplo de Saída: Array reorganizado: 2 3 5 1 6 10 7 8 (Os números menores ou iguais a 5
// aparecem antes dos maiores, sem exigir ordenação interna)

public class Main {
  public static void main(String[] args) {
    new Util().reorganizarArray();
  }
}
