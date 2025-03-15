package exercicio_1;

import java.util.Scanner;
import java.util.ArrayList;

public class Util {
  private Scanner in = new Scanner(System.in);
  private ArrayList<Integer> lista = new ArrayList<>();
  private Integer resposta;

  public void encontrarNumeroRepetido() {
    System.out.println("Programa encontre um número repetido no array!\n");

    System.out.println("Adicione os números do array, digite 0 para finalizar a criação do array: ");

    while (true) {
      resposta = in.nextInt();

      if (resposta == 0) {
        break;
      }

      lista.add(resposta);
    }

    if (lista.size() < 2) {
      System.out.println("Erro, o array deve ser de tamanho maior ou igual a 2.");
      return;
    }

    for (Integer inteiro : lista) {
      if (inteiro > lista.size() - 1 | inteiro < 1) {
        System.out.println("O array deve conter número inteiros no intervalo de 1 até o tamanho do array - 1.");
        return;
      }
    }

    System.out.println("Array definido: " + lista);

    for (int j = 0; j < lista.size(); j++) {
      for (int i = 0; i < lista.size() - 1; i++) {
        if (lista.get(i) > lista.get(i + 1)) {
          Integer aux = lista.get(i);
          lista.set(i, lista.get(i + 1));
          lista.set(i + 1, aux);
        }
        if (lista.get(i) == lista.get(i + 1)) {
          System.out.println("Número repetido: " + lista.get(i));
          return;
        }
      }
    }
    in.close();

    // Ordem de complexidade em notação 0: O(n²)
  }
}
