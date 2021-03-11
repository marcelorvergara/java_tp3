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
public class Pessoa {

    private String nomeCompleto;
    private String situacao;
    private String primNome;
    private String[] outrosNomes;

    public Pessoa() {

    }

    public Pessoa(String nomeCompleto, String situacao) {
        super();
        this.nomeCompleto = nomeCompleto;
        this.situacao = situacao;
    }

    public void consultarSituacao() {
        System.out.println("Nome Completo: " + getNomeCompleto());
        System.out.println("Situação: " + getSituacao());

    }

    /**
     * @return the nomeCompleto
     */
    public String getNomeCompleto() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.primNome).append(" *");
        for (String s : this.outrosNomes) {
            sb.append(s).append(" ");
        }
        return sb.toString().trim();
    }

    /**
     * @param nomeCompleto the nomeCompleto to set
     */
    public void setNomeCompleto(String nomeCompleto) {
        String nome = nomeCompleto;

        //extraindo o primeiro nome com o espaço e retirando o espaço
        this.primNome = nome.substring(0, nome.indexOf(" ") + 1).trim();

        //retirando o primeiro nome (com o espaço final?) do restante dos outros outrosNomes
        String outros = nome.replace(this.primNome + " ", "");

        this.outrosNomes = outros.split(" ");

    }

    /**
     * @return the situacao
     */
    public String getSituacao() {
        return situacao;
    }

    /**
     * @param situacao the situacao to set
     */
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
