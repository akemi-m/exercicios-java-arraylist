package exercicio_1;

// 1. Implemente um programa em Java que encontre um número repetido em um array (deverá
// existir um método para fazer a verificação). O programa deve considerar um array A de tamanho
// n (n ≥ 2) contendo números inteiros no intervalo de 1 a n-1, com exatamente um número
// repetido. 
// Após a implementação do seu algoritmo, descreva qual a ordem de complexidade em
// notação O do método responsável por fazer a verificação (coloque essa informação como
// comentário no início do código). 

// Observação: nenhuma classe além da classe ArrayList poderá ser utilizada.

// Requisitos:
// a) O programa deve receber como entrada um array contendo n inteiros. Os valores deverão
// ser informados via terminal e devem estar no intervalo especificado no enunciado
// b) Deve identificar e exibir o número que aparece mais de uma vez.
// c) O programa não pode usar recursividade.

// Exemplo de Entrada: {3, 1, 3, 4, 2}.
// Saída Esperada: número repetido = 3

public class Main {
  public static void main(String[] args) {
    new Util().encontrarNumeroRepetido();
  }
}
