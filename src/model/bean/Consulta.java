/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Eduardo
 */
public class Consulta {
    private int codigo;
    private String data;
    private String hora;
    private Paciente paciente;
    private Medico medico;
    //private Exame exame;
    //private Material material;

    public Consulta() {
        this.codigo = 0;
        this.data = "";
        this.hora = "";
    }
    public Consulta(int codigo, String data, String hora) {
        this.codigo = codigo;
        this.data = data;
        this.hora = hora;
    }
    public Consulta(Consulta a) {
        this.codigo = a.codigo;
        this.data = a.data;
        this.hora = a.hora;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    
}
