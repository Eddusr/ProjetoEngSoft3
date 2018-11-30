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
public class Material {
    
    private int codigo;
    private String nome;

    public Material() {
        this.codigo = 0;
        this.nome = "";
    }
    public Material(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    public Material(Material a) {
        this.codigo = a.codigo;
        this.nome = a.nome;
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
    
}
