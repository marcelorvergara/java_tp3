/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author marcelo
 */
public class Cadastro {

    Cadastro() throws IOException {

    }

    public Pessoa cadastro(String escolha) {
        switch (escolha.charAt(0)) {
            case '1':
                System.out.println("**** Cadastro Professor ****");
                System.out.println("Entre com o Nome do Professor:");
                Scanner nomeProfIn = new Scanner(System.in);
                String professor = nomeProfIn.nextLine();
                System.out.println("Entre com a situação do professor:");
                Scanner situacaoProfIn = new Scanner(System.in);
                String situacaoProf = situacaoProfIn.nextLine();
                System.out.println("Entre com o departamento:");
                Scanner departamentoIn = new Scanner(System.in);
                String departamento = departamentoIn.nextLine();
                System.out.println("Entre com o salário:");
                Scanner salarioIn = new Scanner(System.in);
                String salario = salarioIn.nextLine();

                Pessoa psProf = new Professor(departamento, Double.parseDouble(salario));
                psProf.setNomeCompleto(professor);
                psProf.setSituacao(situacaoProf);
                return psProf;
            case '2':
                System.out.println("**** Cadastro Aluno ****");
                System.out.println("Entre com o Nome do Aluno:");
                Scanner nomeAluIn = new Scanner(System.in);
                String aluno = nomeAluIn.nextLine();
                System.out.println("Entre com a turma do aluno:");
                Scanner turmaAluIn = new Scanner(System.in);
                String turmaAlu = turmaAluIn.nextLine();
                System.out.println("Entre com a situação do aluno:");
                Scanner situacaoAluIn = new Scanner(System.in);
                String situacaoAlu = situacaoAluIn.nextLine();
                System.out.println("Entre com a nota AV1:");
                Scanner av1In = new Scanner(System.in);
                String av1 = av1In.nextLine();
                System.out.println("Entre com a nota AV2:");
                Scanner av2In = new Scanner(System.in);
                String av2 = av2In.nextLine();

                Pessoa psAlu = new Aluno(turmaAlu, Double.parseDouble(av1), Double.parseDouble(av2));
                psAlu.setNomeCompleto(aluno);
                psAlu.setSituacao(situacaoAlu);
                return psAlu;

        }
        return null;

    }
}
