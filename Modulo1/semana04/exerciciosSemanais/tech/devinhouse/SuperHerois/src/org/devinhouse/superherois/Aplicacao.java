package org.devinhouse.superherois;

import org.devinhouse.superherois.cli.Display;
import org.devinhouse.superherois.exception.OpcaoInvalidaException;
import org.devinhouse.superherois.models.Operacao;
import org.devinhouse.superherois.models.Personagem;
import org.devinhouse.superherois.models.TipoPersonagem;
import org.devinhouse.superherois.repository.PersonagemRepository;

import java.util.List;

public class Aplicacao {
    private Display display = new Display();
    private PersonagemRepository repo = new PersonagemRepository();

    public void executar() {
        Operacao operacao = null;

        while (operacao != Operacao.SAIR) {
            display.exibirMenu();
            try{
                operacao = display.obterOperacao();
                processar(operacao);
            } catch (OpcaoInvalidaException e) {
                display.exibirMsg("A opção informada é inválida");
            }
        }
    }

    private void processar(Operacao operacao) {
        switch (operacao) {
            case ADICIONAR_HEROI:
                Personagem heroi = display.cadastrar(TipoPersonagem.HEROI);
                repo.inserir(heroi);
                display.aguardar();
                break;
            case ADICIONAR_VILAO:
                Personagem vilao = display.cadastrar(TipoPersonagem.VILAO);
                repo.inserir(vilao);
                display.aguardar();
                break;
            case LISTAR:
                List<Personagem> pergonagens = repo.consultar();
                if (pergonagens.isEmpty()) {
                    display.exibirMsg("Sem personagens cadastrados");
                } else {
                    System.out.println(pergonagens);
                }
                display.aguardar();
        }
    }
}
