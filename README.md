# Atividade I - Estrutura de Dados

Soluções da Atividade I da disciplina de Estrutura de Dados, ministrada pelo Prof. Dr. Antonio Marcos Selmini.

## Enunciados dos Exercícios

### Exercício 1:

Implemente um programa em Java que encontre um número repetido em um array (deverá existir um método para fazer a verificação). O programa deve considerar um array A de tamanho n (n ≥ 2) contendo números inteiros no intervalo de 1 a n-1, com exatamente um número repetido. Após a implementação do seu algoritmo, descreva qual a ordem de complexidade em notação O do método responsável por fazer a verificação (coloque essa informação como comentário no início do código). Observação: nenhuma classe além da classe ArrayList poderá ser utilizada.

**Requisitos:**

- O programa deve receber como entrada um array contendo n inteiros. Os valores deverão ser informados via terminal e devem estar no intervalo especificado no enunciado.
- Deve identificar e exibir o número que aparece mais de uma vez.
- O programa não pode usar recursividade.

**Exemplo de Entrada:** `{3, 1, 3, 4, 2}`
**Saída Esperada:** `Número repetido = 3`

### Exercício 2:

Implemente um programa em Java contendo um método que verifique se um vetor de inteiros contém pelo menos um elemento A[i] que seja a soma de dois valores anteriores no próprio vetor. Ou seja, seu programa deve identificar se existem índices j e k (j < i e k < i) tais que: A[i] = A[j] + A[k]. Após a implementação do seu algoritmo, descreva qual a ordem de complexidade em notação O do método responsável por fazer a verificação (coloque essa informação como comentário no início do código). Observação: nenhuma classe além da classe ArrayList poderá ser utilizada.

**Requisitos:**

- O programa deve receber como entrada um array contendo n inteiros. Os valores deverão ser informados via terminal e devem estar no intervalo especificado no enunciado.
- O algoritmo deve verificar, para cada elemento A[i] (a partir do terceiro), se ele pode ser obtido como soma de dois elementos anteriores.
- O programa deve imprimir "Existe um elemento que é a soma de dois anteriores." caso encontre tal valor, ou "Nenhum elemento é a soma de dois anteriores." caso contrário.
- O programa não pode usar recursividade.

**Exemplo de Entrada:** `{3, 8, 4, 12, 7, 15}`
**Exemplo de Saída:** `Existe um elemento que é a soma de dois anteriores.`

### Exercício 3:

Implemente um programa em Java que reorganize um array de inteiros A contendo n elementos de forma que todos os números menores ou iguais a um valor k fiquem antes dos números maiores que k.

**Requisitos:**

- O algoritmo deve reorganizar os elementos in-place, ou seja, sem criar um novo array auxiliar.
- O programa não pode usar recursividade.
- O programa deve receber como entrada um array não ordenado e um valor inteiro k. Todos os valores devem ser informados pelo terminal.

**Exemplo de Entrada:** `{8, 2, 7, 3, 10, 5, 1, 6}, k = 5`
**Exemplo de Saída:** `Array reorganizado: 2 3 5 1 6 10 7 8`

### Exercício 4:

Desenvolva uma classe para representar um triângulo. Defina métodos para calcular a área S, o perímetro P e o centróide de coordenadas x e y.

**Requisitos:**

- A classe deverá ter o método construtor para inicializar todos os atributos do objeto.
- Para calcular raiz quadrada, utilize o método estático `Math.sqrt()`, e para calcular potenciação, utilize `Math.pow(a, b)`.
- A classe principal deve gerar alguns objetos e armazená-los em um `ArrayList`. Após o armazenamento, imprima para cada triângulo a área, o perímetro e o centróide de coordenadas x e y.
