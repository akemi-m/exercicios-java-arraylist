package exercicio_2;

// 2. Implemente um programa em Java contendo um método que verifique se um vetor de
// inteiros contém pelo menos um elemento A[i] que seja a soma de dois valores anteriores no
// próprio vetor. Ou seja, seu programa deve identificar se existem índices j e k (j < i e k < i) tais que:
// A[i] = A[j] + A[k]. 
// Após a implementação do seu algoritmo, descreva qual a ordem de
// complexidade em notação O do método responsável por fazer a verificação (coloque essa
// informação como comentário no início do código). 

// Observação: nenhuma classe além da classe ArrayList poderá ser utilizada.

// Requisitos
// a) O programa deve receber como entrada um array contendo n inteiros. Os valores deverão
// ser informados via terminal e devem estar no intervalo especificado no enunciado
// b) O algoritmo deve verificar, para cada elemento A[i] (a partir do terceiro), se ele pode ser
// obtido como soma de dois elementos anteriores.
// c) O programa deve imprimir "Existe um elemento que é a soma de dois anteriores." caso
// encontre tal valor, ou "Nenhum elemento é a soma de dois anteriores." caso contrário.
// d) O programa não pode usar recursividade.

// Exemplo de Entrada: A = {3, 8, 4, 12, 7, 15}; // 15 = 8 + 7
// Exemplo de Saída: Existe um elemento que é a soma de dois anteriores.

public class Main {
  public static void main(String[] args) {
    new Util().somaDeDoisValoresAnteriores();
  }
}
