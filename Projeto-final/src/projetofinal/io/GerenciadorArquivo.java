package projetofinal.io;
import projetofinal.excecoes.ExcecaoPacoteInvalido;
import projetofinal.modelo.PacoteRede;
import projetofinal.modelo.PacoteTCP;
import projetofinal.modelo.PacoteUDP;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
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

    public void salvarLog(String caminho, String dados) throws IOException {
        Files.writeString(Path.of(caminho), dados + System.lineSeparator(), java.nio.file.StandardOpenOption.CREATE, java.nio.file.StandardOpenOption.APPEND);
    }
}
