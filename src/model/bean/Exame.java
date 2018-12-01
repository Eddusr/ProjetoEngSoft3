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
public class Exame {
    
    private int codigo;
    private String nome;
    private String descricao;
    private String tipo;
    private List<Material> materiais;

    public Exame() {
    }

    public Exame(int codigo, String nome, String descricao, String tipo, List<Material> materiais) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
        this.materiais = materiais;
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

    public List<Material> getMateriais() {
        return materiais;
    }

    public void setMateriais(List<Material> materiais) {
        this.materiais = materiais;
    }
    
    

}
