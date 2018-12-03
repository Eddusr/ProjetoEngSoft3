/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Luiz Oliveira
 */
public class ConsultaExame {
    private int codigo;
    private String data;
    private String hora;
    private Consulta consulta;

    public ConsultaExame() {
    }

    public ConsultaExame(String data, String hora, Consulta consulta) {
        this.data = data;
        this.hora = hora;
        this.consulta = consulta;
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

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
    
    
    
    
}
