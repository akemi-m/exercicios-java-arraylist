package exercicio_2;

import java.util.Scanner;
import java.util.ArrayList;

public class Util {
  public Scanner in = new Scanner(System.in);
  public ArrayList<Integer> lista = new ArrayList<>();
  public Integer resposta;

  public void somaDeDoisValoresAnteriores() {
    System.out.println("Programa soma de dois valores anteriores!\n");

    System.out.println("Adicione os números do array, digite 0 para finalizar a criação do array: ");

    while (true) {
      resposta = in.nextInt();

      if (resposta == 0) {
        break;
      }

      lista.add(resposta);
    }

    if (lista.size() < 3) {
      System.out.println("Erro, o array deve ser no mínimo de tamanho 3.");
      return;
    }

    System.out.println("Array definido: " + lista);

    for (int indexAtual = 2; indexAtual < lista.size(); indexAtual++) {
      for (int indexPrimeiroValor = 0; indexPrimeiroValor < indexAtual; indexPrimeiroValor++) {
        for (int indexSegundoValor = indexPrimeiroValor + 1; indexSegundoValor < indexAtual; indexSegundoValor++) {

          if (lista.get(indexAtual) == lista.get(indexPrimeiroValor) + lista.get(indexSegundoValor)) {
            System.out.println("Existe um elemento que é a soma de dois anteriores.");
            return;
          }
        }
      }
    }
    // Ordem de complexidade em notação 0: O(n³)
    System.out.println("Nenhum elemento é a soma de dois anteriores.");
  }

}
