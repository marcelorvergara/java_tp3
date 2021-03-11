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
public class Professor extends Pessoa {

    private String departamento;
    private double salario;

    public Professor() {

    }

    public Professor(String departamento, double salario) {
        super();
        this.departamento = departamento;
        this.salario = salario;
    }

    @Override
    public void consultarSituacao() {
        System.out.println("Nome do Professor: " + super.getNomeCompleto());
        System.out.println("Situação professor: " + super.getSituacao());
        System.out.println("Departamento: " + getDepartamento());
        System.out.println("Salário: " + getSalario());
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

}
