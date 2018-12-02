/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

import java.util.List;

/**
 *
 * @author Eduardo
 */
public class Consulta {
    private int codigo;
    private String data;
    private String hora;
    private String status;
    private Paciente paciente;
    private Medico medico;
    private List<Exame> exames;
    private List<Material> materiais;

    public Consulta() {
    }

    public Consulta(int codigo, String data, String hora, Paciente paciente, String status, Medico medico, List<Exame> exames, List<Material> materiais) {
        this.codigo = codigo;
        this.data = data;
        this.hora = hora;
        this.status = status;
        this.paciente = paciente;
        this.medico = medico;
        this.exames = exames;
        this.materiais = materiais;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Exame> getExames() {
        return exames;
    }

    public void setExames(List<Exame> exames) {
        this.exames = exames;
    }

    public List<Material> getMateriais() {
        return materiais;
    }

    public void setMateriais(List<Material> materiais) {
        this.materiais = materiais;
    }
    
}
