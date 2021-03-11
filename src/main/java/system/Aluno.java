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
public class Aluno extends Pessoa {

    private String turma;
    private double AV1;
    private double AV2;

    public Aluno() {

    }

    public Aluno(String turma, double AV1, double AV2) {
        super();
        this.turma = turma;
        this.AV1 = AV1;
        this.AV2 = AV2;
    }

    @Override
    public void consultarSituacao() {
        System.out.println("Nome do aluno: " + super.getNomeCompleto());
        System.out.println("Situação do aluno: " + super.getSituacao());
        System.out.println("Turma do aluno: " + getTurma());
        System.out.println("Nota AV1: " + getAV1());
        System.out.println("Nota AV2: " + getAV2());
    }

    /**
     * @return the turma
     */
    public String getTurma() {
        return turma;
    }

    /**
     * @param turma the turma to set
     */
    public void setTurma(String turma) {
        this.turma = turma;
    }

    /**
     * @return the AV1
     */
    public double getAV1() {
        return AV1;
    }

    /**
     * @param AV1 the AV1 to set
     */
    public void setAV1(double AV1) {
        this.AV1 = AV1;
    }

    /**
     * @return the AV2
     */
    public double getAV2() {
        return AV2;
    }

    /**
     * @param AV2 the AV2 to set
     */
    public void setAV2(double AV2) {
        this.AV2 = AV2;
    }

}
