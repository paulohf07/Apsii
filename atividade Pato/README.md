# Atividade Pato

Este projeto demonstra uma implementação prática do padrão de projeto **Strategy** em Java. O objetivo é isolar e encapsular os comportamentos de voo e de som de forma independente da classe abstrata principal `Duck`, permitindo flexibilidade e troca de comportamentos em tempo de execução.

## 📦 Estrutura do Projeto
O sistema é composto por 10 arquivos estruturados nos seguintes pacotes:
* `apresentacao`: Contém a classe que executa a simulação na lagoa.
* `patos`: Contém a classe abstrata base `Duck` e as especializações de patos.
* `quacks`: Encapsula as diferentes implementações de som (como emitir som ou permanecer em silêncio).
* `voos`: Encapsula as diferentes mecânicas de voo (como voar com asas ou não voar).

## 💡 Funcionamento
O programa principal cria uma instância de `MallardDuck` e demonstra suas ações iniciais (apresentação, som, voo e nado). Utilizando os métodos `setFlyBehavior` e `setQuackBehavior`, o código demonstra a troca dinâmica de comportamento durante a execução do fluxo.

## 🛠️ Especificações Técnicas
* **Linguagem:** Java
* **Codificação:** UTF-8

---
*Estudos de Arquitetura e Padrões de Software.*
