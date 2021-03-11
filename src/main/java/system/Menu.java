/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author marcelo
 */
public class Menu {

    public String showMenu() throws EscolaExceptions {

        List<String> opcoes = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            String j = String.valueOf(i);
            opcoes.add(j);
        }

        System.out.println("---------------------------------------------------");
        System.out.println("---Escolha uma opção:  ---------------------------\n");
        System.out.println("---------------------------------------------------");
        System.out.println("----[1] Cadastrar professor                       -");
        System.out.println("----[2] Cadastrar aluno                           -");
        System.out.println("----[3] Consultar situação de um docente/discente -");
        System.out.println("----[4] Sair.                                     -");
        System.out.println("---------------------------------------------------");
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        //tratamento de opção fora das opções do menu
        String input = "";
        try {
            Scanner myObj = new Scanner(System.in);
            input = myObj.nextLine();
            final String inputSearch = input;
            List<String> matching = opcoes.stream()
                    .filter(str -> str.contains(inputSearch))
                    .collect(Collectors.toList());
            if (matching.isEmpty()) {
                input = "Entrada Inválida";
                throw new EscolaExceptions("Entrada invalida");
            }
        } catch (EscolaExceptions e) {
            System.out.println(e.getMessage());
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
        return input;
    }

}
