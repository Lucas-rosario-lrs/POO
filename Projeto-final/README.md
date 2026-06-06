# Diagrama UML

[![Diagramas-de-Classe-UML-Projeto-Final.png](https://i.postimg.cc/mgwd2dhq/Diagramas-de-Classe-UML-Projeto-Final.png)](https://postimg.cc/4YYvWQ6b)

# Declaração de Uso de Inteligência Artificial

Para os devidos efeitos de avaliação e em cumprimento do **Critério 12** estipulado para o Projeto Final da disciplina de Programação Orientada a Objetos, o grupo declara que **utilizou** Inteligência Artificial (IA) como ferramenta de apoio durante o desenvolvimento do projeto *SecureTraffic Analyzer*.

### Ferramenta Utilizada
* **Nome da IA:** Gemini Pro (Google) e Claude.ai

### Como a IA foi utilizada
A IA atuou como um assistente de planeamento ("pair programmer" e tutor) ao longo das seguintes fases do projeto:

1. **Ideação e Arquitetura Inicial:** * A IA ajudou a maturar a ideia do analisador de tráfego com criptografia, sugerindo uma arquitetura de pacotes (`modelo`, `io`, `seguranca`, `concorrencia` e `excecoes`) alinhada com as boas práticas exigidas na disciplina (Aula 06).
2. **Divisão de Tarefas:** * Auxiliou na divisão equitativa das tarefas em 3 partes, garantindo que todos os elementos do grupo aplicassem conceitos cruciais de POO (Herança, Polimorfismo, Interfaces e Threads).
3. **Revisão de Código e Resolução de Erros (Debugging):** * A IA ajudou a identificar erros de compilação na junção das partes (por exemplo, a falta dos métodos *getters* `isAck()` e `getPortaOrigem()` nas classes filhas).
   * Sugeriu a implementação de tratamento de exceções com blocos `try-catch` para erros de *InputMismatchException* no menu de leitura (Aula 13).
   * Explicou e sugeriu o uso do modificador `synchronized` no método de escrita de ficheiros para garantir a segurança no uso simultâneo de *Threads* (*Thread-Safe*).
   * Criação do Readme.
### Uso de IA:
O integrante Pedro utilizou a ferramenta Claude Sonnet 4.6 (Anthropic) para auxiliar na criação da classe GerenciadorArquivo e na revisão das classes PacoteRede, PacoteTCP e PacoteUDP, incluindo identificação de erros de tipagem e boas práticas de orientação a objetos.
