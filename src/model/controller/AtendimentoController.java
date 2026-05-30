package model.controller;

import model.entity.Atendimento;
import model.entity.StatusAtendimento;
import model.service.AtendimentoService;

public class AtendimentoController {

    private AtendimentoService atendimentoService;

    public AtendimentoController(
            AtendimentoService atendimentoService
    ) {

        this.atendimentoService = atendimentoService;
    }

    public void cadastrarAtendimento(
            Atendimento atendimento
    ) {

        try {

            atendimentoService.salvar(atendimento);

            System.out.println(
                    "Atendimento cadastrado com sucesso!"
            );

        } catch (Exception e) {

            System.out.println(
                    e.getMessage()
            );
        }
    }

    public void listarAtendimentos() {

        try {

            for (Atendimento atendimento :
                    atendimentoService.listarTodos().values()) {

                System.out.println(atendimento);
            }

        } catch (Exception e) {

            System.out.println(
                    e.getMessage()
            );
        }
    }

    public void buscarAtendimento(
            int id
    ) {

        try {

            Atendimento atendimento =
                    atendimentoService.buscarPorId(id);

            System.out.println(
                    atendimento
            );

        } catch (Exception e) {

            System.out.println(
                    e.getMessage()
            );
        }
    }

    public void removerAtendimento(
            int id
    ) {

        try {

            atendimentoService.remover(id);

            System.out.println(
                    "Atendimento removido com sucesso!"
            );

        } catch (Exception e) {

            System.out.println(
                    e.getMessage()
            );
        }
    }

    public void atualizarStatus(
            int id,
            StatusAtendimento novoStatus
    ) {

        try {

            atendimentoService.atualizarStatus(
                    id,
                    novoStatus
            );

            System.out.println(
                    "Status atualizado com sucesso!"
            );

        } catch (Exception e) {

            System.out.println(
                    e.getMessage()
            );
        }
    }
}