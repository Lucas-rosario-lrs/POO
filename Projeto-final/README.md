# Projeto *SecureTraffc Analyzer*

> Alinhado ao critério de Relevância ao Curso, o projeto SecureTraffic Analyzer foi concebido para atender às demandas reais da área de Computação e Telecomunicações. A aplicação atua como um sistema de análise e segurança de tráfego de rede, projetado para realizar a leitura, classificação e processamento seguro de pacotes de dados.
>
>O sistema processa logs de tráfego de forma automatizada, identificando e distinguindo protocolos críticos como TCP e UDP. Ao aplicar princípios de Programação Orientada a Objetos, a solução garante não apenas a organização eficiente dos dados, mas também a integridade e confidencialidade das informações através de uma camada de criptografia extensível, resolvendo problemas clássicos de exposição de dados em trânsito e gargalos de processamento.

## Diagrama UML

[![Diagramas-de-Classe-UML-Projeto-Final.png](https://i.postimg.cc/mgwd2dhq/Diagramas-de-Classe-UML-Projeto-Final.png)](https://postimg.cc/4YYvWQ6b)

## Declaração de Uso de Inteligência Artificial

Para os devidos efeitos de avaliação e em cumprimento do critério estipulado para o Projeto Final da disciplina de Programação Orientada a Objetos, o grupo declara que **utilizou** Inteligência Artificial (IA) como ferramenta de apoio durante o desenvolvimento do projeto *SecureTraffic Analyzer*.

### Ferramenta Utilizada
* **Nome da IA:** Gemini Pro (Google) e Claude.ai

### Como a IA foi utilizada
A IA atuou como um assistente de planeamento ("pair programmer" e tutor) ao longo das seguintes fases do projeto:

1. **Ideação e Arquitetura Inicial:** * A IA ajudou a maturar a ideia do analisador de tráfego com criptografia, sugerindo uma arquitetura de pacotes (`modelo`, `io`, `seguranca`, `concorrencia` e `excecoes`) alinhada com as boas práticas exigidas na disciplina.
2. **Divisão de Tarefas:** * Auxiliou na divisão equitativa das tarefas em 3 partes, garantindo que todos os elementos do grupo aplicassem conceitos cruciais de POO (Herança, Polimorfismo, Interfaces e Threads).
3. **Revisão de Código e Resolução de Erros (Debugging):** * A IA ajudou a identificar erros de compilação na junção das partes (por exemplo, a falta dos métodos *getters* `isAck()` e `getPortaOrigem()` nas classes filhas).
   * Sugeriu a implementação de tratamento de exceções com blocos `try-catch` para erros de *InputMismatchException* no menu de leitura.
   * Explicou e sugeriu o uso do modificador `synchronized` no método de escrita de ficheiros para garantir a segurança no uso simultâneo de *Threads* (*Thread-Safe*).
   * Auxilio na criação do Readme.
### Uso de IA:
O integrante Pedro utilizou a ferramenta Claude Sonnet 4.6 (Anthropic) para auxiliar na criação da classe GerenciadorArquivo e na revisão das classes PacoteRede, PacoteTCP e PacoteUDP, incluindo identificação de erros de tipagem e boas práticas de orientação a objetos.
