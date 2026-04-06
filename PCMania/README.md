# 💻 Projeto PCMania - POO

**Autor:** Lucas do Rosario da Silva  
**Curso:** Engenharia de Telecomunicações - 3º Período  
**Matrícula:** GET - 9842  
**Instituição:** Instituto Nacional de Telecomunicações (Inatel)  

---

## 📌 Sobre o Projeto

Este repositório contém a solução do exercício prático **"PCMania"**, desenvolvido para a disciplina de **Programação Orientada a Objetos (POO)**.

O projeto consiste em um sistema de compras em Java para uma loja de computadores, onde o cliente pode:

- Navegar por diferentes promoções  
- Adicionar itens ao carrinho  
- Visualizar o extrato final da compra  

### 🎯 Objetivo

Aplicar na prática conceitos fundamentais de POO em Java, como:

- Encapsulamento de atributos  
- Relacionamentos entre classes:
  - Associação  
  - Agregação  
  - Composição  
- Manipulação de arrays nativos de objetos  

---

## 🤖 Relatório de Uso de Inteligência Artificial

Conforme orientado nas instruções da atividade, declaro o uso de Inteligência Artificial como ferramenta de apoio durante a elaboração deste projeto.

**Modelo utilizado:** Gemini 3.1 Pro  

A implementação da lógica principal, criação dos menus interativos, laços de repetição e manipulação de arrays foram desenvolvidas ativamente por mim.  

A IA foi utilizada como suporte para:

- Esclarecimento de dúvidas conceituais  
- Correção de erros  
- Sugestões de melhorias estruturais  

---

## 🧠 Prompts Utilizados

### 🔹 Prompt 1 — Planejamento e Arquitetura

> "Com base no PDF anexado, crie o escopo completo do projeto, ou seja, as atividades que precisarei realizar."

**Resumo da resposta:**  
A IA forneceu um roteiro estruturado com as seguintes etapas:

1. Configuração inicial  
2. Modelagem das classes de componentes  
3. Modelagem das classes agregadoras (Computador e Cliente)  
4. Implementação do menu interativo no `main`  

✔️ Isso ajudou a organizar a ordem de desenvolvimento do projeto.

---

### 🔹 Prompt 2 — Tradução do UML para Código

> "Cite códigos de forma que mostre as atribuições feitas na UML, por exemplo: // composição // agregação, afins."

**Resumo da resposta:**  
A IA explicou como a simbologia UML se traduz em Java:

- **Composição (losango preenchido):**  
  O objeto deve ser instanciado junto com a classe principal (relação forte via construtor)

- **Agregação (losango vazio):**  
  Relação opcional (0..1), implementada via métodos como `addMemoriaUSB()`

✔️ Isso facilitou a implementação correta das relações entre classes.

---

### 🔹 Prompt 3 — Correção de Bugs (Debugging)

> "Me ajude a consertar um erro no meu código..."

**Resumo da resposta:**  
A IA identificou que arrays de objetos em Java são inicializados com `null`.

🔍 Problema:
- O laço `for` acessava posições não preenchidas do array

💡 Solução aplicada:
```java
if (computadores[i] != null) {
    total += computadores[i].getPreco();
}
````

✔️ Também sugeriu melhorias no código, que foram implementadas.

---

### 🔹 Prompt 4 — Estruturação do Fluxo de Compra

> "Como posso estruturar um fluxo de compra em Java que permita ao usuário selecionar produtos, adicionar múltiplos itens ao carrinho e finalizar a compra com um resumo organizado?"

**Resumo da resposta:**
A IA sugeriu:

* Uso de menus interativos com `switch-case`
* Estrutura de repetição (`while`) para manter o sistema ativo
* Separação de responsabilidades entre classes (`Cliente`, `Computador`, etc.)
* Organização do carrinho via arrays

✔️ Isso ajudou a tornar o sistema mais modular, organizado e intuitivo.

---

### 🔹 Prompt 5 — Criação do README

> "Me ajude a criar o README para o meu projeto..."

**Resultado:**
A IA gerou um README inicial sem formatação.

✔️ Este documento foi posteriormente estruturado e melhorado com o auxílio do **ChatGPT (OpenAI)**.

---

## 📊 Avaliação do Uso da IA

O uso da Inteligência Artificial foi **bastante satisfatório**.

A ferramenta contribuiu para:

* Melhor compreensão da teoria de POO
* Correção de erros práticos
* Organização da arquitetura do projeto

✔️ Isso permitiu uma implementação mais fluida, estruturada e alinhada com boas práticas de programação.
