package projetofinal.io;

import projetofinal.modelo.PacoteRede;
import projetofinal.modelo.PacoteTCP;
import projetofinal.modelo.PacoteUDP;
import projetofinal.excecoes.ExcecaoPacoteInvalido;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorArquivo {

    public List<PacoteRede> lerPacotes(String caminho) throws IOException, ExcecaoPacoteInvalido {
        List<PacoteRede> pacotes = new ArrayList<>();
        List<String> linhas = Files.readAllLines(Path.of(caminho));

        for (String linha : linhas) {
            String[] dados = linha.split(";");

            if (dados.length < 6) {
                throw new ExcecaoPacoteInvalido("Linha inválida: " + linha);
            }

            String tipo = dados[0];
            int id = Integer.parseInt(dados[1]);
            String origem = dados[2];
            String destino = dados[3];
            String payload = dados[4];

            if (tipo.equalsIgnoreCase("TCP")) {
                pacotes.add(new PacoteTCP(id, origem, destino, payload, Boolean.parseBoolean(dados[5])));
            } else if (tipo.equalsIgnoreCase("UDP")) {
                pacotes.add(new PacoteUDP(id, origem, destino, payload, Integer.parseInt(dados[5])));
            } else {
                throw new ExcecaoPacoteInvalido("Tipo inválido: " + tipo);
            }
        }
        return pacotes;
    }

    public synchronized void salvarLog(String caminho, PacoteRede pacote) {
        try {
            StringBuilder sb = new StringBuilder();

            if (pacote instanceof PacoteTCP) {
                PacoteTCP tcp = (PacoteTCP) pacote;
                sb.append("TCP;").append(tcp.getId()).append(";")
                        .append(tcp.getIpOrigem()).append(";")
                        .append(tcp.getIpDestino()).append(";")
                        .append(tcp.getPayload()).append(";")
                        .append(tcp.isAck());
            } else if (pacote instanceof PacoteUDP) {
                PacoteUDP udp = (PacoteUDP) pacote;
                sb.append("UDP;").append(udp.getId()).append(";")
                        .append(udp.getIpOrigem()).append(";")
                        .append(udp.getIpDestino()).append(";")
                        .append(udp.getPayload()).append(";")
                        .append(udp.getPortaOrigem());
            }

            sb.append(System.lineSeparator());

            Files.writeString(
                    Path.of(caminho),
                    sb.toString(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );
        } catch (IOException e) {
            System.out.println("[ERRO] Falha ao gravar dados no arquivo de saída: " + e.getMessage());
        }
    }
}