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
        } else {
            messageError = "Erro genérico, não identificado.";
        }

    }

    @Override
    public String getMessage() {
        return messageError;
    }
}
