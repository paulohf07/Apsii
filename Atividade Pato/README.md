# Atividade Pato - Padrão de Projeto Strategy

Este projeto é uma implementação prática do padrão de projeto comportamental **Strategy**, inspirado no clássico exemplo do livro *"Use a Cabeça! Padrões de Projetos" (Head First Design Patterns)*.

O objetivo principal é demonstrar como separar os comportamentos que mudam (como voar e emitir sons) dos aspectos da classe principal que permanecem os mesmos, utilizando composição em vez de herança.

## 🚀 Tecnologias Utilizadas

*   **Java 26** (OpenJDK)
*   **IntelliJ IDEA** 2025.3

## 🏗️ Estrutura do Projeto

O código está organizado dentro de pacotes sob a pasta `src`:

*   `apresentação`: Contém o ponto de entrada da aplicação (`MiniPatoNaLagoa.java`).
*   `patos`: Contém a classe abstrata base `Duck` e as implementações concretas como `MallardDuck`.
*   `quacks`: Contém a interface `QuackBehavior` e as estratégias de som (`Quack`, `MuteQuack`, `Squeak`).
*   `voos`: Contém a interface `FlyBehavior` e as estratégias de voo (`FlyWithWings`, `FlyNoWay`).

## 🛠️ Como Executar o Projeto

1. Certifique-se de que o **SDK (JDK 26)** está configurado corretamente no seu IntelliJ IDEA.
2. Defina a pasta `src` como **Sources Root** (Botão direito em `src` > *Mark Directory as* > *Sources Root*).
3. Abra o arquivo `src/apresentação/MiniPatoNaLagoa.java`.
4. Execute o método `main` clicando no botão verde de **Play** ou utilizando o atalho `Ctrl + Shift + F10`.

## 📝 Licença

Este projeto possui fins estritamente didáticos e educacionais.
