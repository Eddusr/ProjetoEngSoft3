/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import model.bean.Material;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Luiz Oliveira
 */
public class MaterialDAOTest {
    
    public MaterialDAOTest() {
    }

    @Test
    @Ignore
    public void insert() {
        
        MaterialDAO dao = new MaterialDAO("mysql");
        Material mat = new Material("Luvas");
        if (dao.save(mat)){
            System.out.println("Deu certo");
        }
        else {
            fail("Deu errado");
        }
    }
    
    @Test
    @Ignore
    public void select (){
    
        MaterialDAO dao = new MaterialDAO("mysql");
        for (Material m: dao.selecionar()){
            System.out.println("Cod: " + m.getCodigo() + " Nome: " + m.getNome());
        }
    }
    
    @Test
    @Ignore
    public void update (){
        MaterialDAO dao = new MaterialDAO("mysql");
        Material mat = new Material("Agulha");
       if(dao.alterar(mat, 3)){
            System.out.println("Deu certo");
           
       }
       else {
           fail("Deu errado");
       }
    }
    
    @Test
    public void delete (){
    
        MaterialDAO dao = new MaterialDAO("mysql");
        if (dao.deletar(3)){
            System.out.println("deletado");
        }
        else
            fail("Falha ao deletar");
        
    }
}
