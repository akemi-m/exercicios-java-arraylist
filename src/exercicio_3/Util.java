package exercicio_3;

import java.util.Scanner;
import java.util.ArrayList;

public class Util {
  private Scanner in = new Scanner(System.in);
  private ArrayList<Integer> lista = new ArrayList<>();
  private Integer resposta;
  private Integer numero;

  public void reorganizarArray() {
    System.out.println("Programa de reorganização de arrays!\n");

    System.out.println("Adicione os números do array, digite 0 para finalizar a criação do array: ");

    while (true) {
      resposta = in.nextInt();

      if (resposta == 0) {
        break;
      }

      lista.add(resposta);
    }

    System.out.println("Array definido: " + lista);
    System.out.println("Escolha um valor que faça parte do array: ");
    numero = in.nextInt();
    System.out.println("Valor definido: " + numero);

    for (int i = lista.size() - 1; i >= 0; i--) {
      if (lista.get(i) > numero) {
        lista.add(lista.get(i));
        lista.remove(i);
      }
    }

    System.out.println("Array reorganizado: " + lista);
    in.close();
  }
}
