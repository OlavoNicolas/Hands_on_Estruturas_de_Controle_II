# Hands_on_Estruturas_de_Controle_II

## Handson Java

Este projeto consiste em um programa em Java que reúne diferentes exercícios básicos de programação. O objetivo é praticar estruturas de controle, entrada de dados, manipulação de strings e uso de funções matemáticas.

---

## Funcionalidades

O programa apresenta um menu com quatro opções:

### 1 - Saída (ASCII Art)

Exibe um desenho simples utilizando caracteres no console.

---

### 2 - Cálculo de Distância

Calcula a distância entre dois pontos na superfície da Terra a partir de suas coordenadas geográficas (latitude e longitude).

* Utiliza as funções:

  * `Math.sin`
  * `Math.cos`
  * `Math.acos`
* Conversão de graus para radianos com `Math.toRadians`
* Raio da Terra considerado: 6371.01 km

---

### 3 - Contador de Caracteres

Conta a quantidade de caracteres de uma string informada pelo usuário.

* Entrada com `nextLine()`
* Uso de `length()` para contagem

---

### 4 - Múltipla Escolha

Apresenta uma questão sobre Java com cinco alternativas.

* Tema: classe `Scanner`
* O usuário possui três tentativas
* Estrutura de repetição com `do-while`

---

## Tecnologias utilizadas

* Java
* Classe `Scanner` para entrada de dados
* Classe `Math` para cálculos matemáticos

---

## Como executar

1. Compilar o arquivo:

```bash
javac Handson.java
```

2. Executar o programa:

```bash
java Handson
```

---

## Estrutura do programa

* Uso de `switch-case` para seleção de opções
* Uso de laços de repetição (`for` e `do-while`)
* Manipulação de strings
* Cálculos matemáticos

---

## Observações

* Ao misturar `nextInt()` e `nextLine()`, é necessário limpar o buffer do Scanner.
* No cálculo de distância, os valores devem ser convertidos para radianos antes de aplicar as funções trigonométricas.

---
