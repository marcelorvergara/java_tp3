/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

/**
 *
 * @author marcelo
 */
public class EscolaExceptions extends Exception {

    private String messageError = "";

    EscolaExceptions(String msg) {
        if ("Entrada invalida".equals(msg)) {
            messageError = "Entrada inválida ou inexistente!";
        } else if ("Mat inv".equals(msg)) {
            messageError = "Matrícula inválida! Tente novamente.";
        } else if ("err_cad".equals(msg)) {
            messageError = "Falha na entrada de dados. Favor verificar os dados digitados.\nO salário só pode conter números e um ponto para casas decimais.";
        } else {
            messageError = "Erro genérico, não identificado.";
        }

    }

    EscolaExceptions() {
        messageError = "Erro genérico.";
    }

    @Override
    public String getMessage() {
        return messageError;
    }
}
