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
public class Exame {
    
    private int codigo;
    private String nome;
    private String descricao;
    private String tipo;
    //private Material material;

    public Exame() {
        this.codigo = 0;
        this.nome = "";
        this.descricao = "";
        this.tipo = "";
    }
    public Exame(int codigo, String nome, String descricao, String tipo) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
    }
    public Exame(Exame a) {
        this.codigo = a.codigo;
        this.nome = a.nome;
        this.descricao = a.descricao;
        this.tipo = a.tipo;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
