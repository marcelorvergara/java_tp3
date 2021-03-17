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
public class Main {

    static private int cod = 0;
    private static final Pessoa[] psList = new Pessoa[100];
    private static boolean condition = true;

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws system.EscolaExceptions
     */
    public static void main(String[] args) throws IOException, EscolaExceptions {
        // TODO code application logic here
        while (isCondition()) {
            Menu menu = new Menu();
            String escolha = menu.showMenu();
            //Sair
            if ("4".equals(escolha)) {
                setCondition(false);
                System.out.println("Programa terminado. Inté!");
                break;

            } //Cadastro de aluno ou professor
            else if ("1".equals(escolha) || "2".equals(escolha)) {

                try {
                    Cadastro cad;
                    cad = new Cadastro();
                    Pessoa ps = cad.cadastro(escolha);
                    setPsList(ps, cod);
                    System.out.println("**** Status ****");
                    if ("1".equals(escolha)) {
                        System.out.println("Professor cadastrado com o código: " + cod);
                    } else if ("2".equals(escolha)) {
                        System.out.println("Aluno Cadastrado com o código: " + cod);
                    }
                    System.out.println("**** Status ****");
                    cod++;
                } catch (Exception e) {
                    System.out.println("teste de erro");
                    System.out.println(e.getMessage());
                }

            } //Situação cadastral do docente
            else if ("3".equals(escolha)) {
                System.out.println("**** Consulta Situação do Docente/Discente ****");
                System.out.println("Entre com o código do docente/discente:");
                Scanner codIn = new Scanner(System.in);
                String codQ = codIn.nextLine();
                try {
                    int mat = Integer.parseInt(codQ);
                    System.out.println("Matrícula: " + mat);
                    Pessoa pss = psList[mat];
                    if (pss instanceof Aluno) {
                        System.out.println("Essa matrícula é de uma aluno. Tente novamente!");
                    } else if (pss instanceof Professor) {
                        System.out.println("Situação Cadastrada: ");
                        pss.consultarSituacao();
                    } else {
                        throw new EscolaExceptions("Mat inv");
                    }
                } catch (EscolaExceptions e) {
                    System.out.println(e.getMessage());;
                } catch (Throwable e) {
                    System.out.println("Erro genérico");
                } finally {
                    System.out.println("**************************");
                }

            }//Opção do Menu fora do range de opções
            else {
                //a exception já foi tratada na classe menu
                System.out.println("\nTente novamente!");
            }

        }
    }

    /**
     * @return the condition
     */
    public static boolean isCondition() {
        return condition;
    }

    /**
     * @param aCondition the condition to set
     */
    public static void setCondition(boolean aCondition) {
        condition = aCondition;
    }

    /**
     * @return the psList
     */
    public static Pessoa[] getPsList() {
        return psList;
    }

    /**
     * @param aPsList the psList to set
     * @param cod
     */
    private static void setPsList(Pessoa aPsList, int cod) {
        psList[cod] = aPsList;
    }

}
