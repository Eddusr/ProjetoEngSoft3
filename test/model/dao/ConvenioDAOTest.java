/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import model.bean.Convenio;
import model.bean.Especialidade;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Luiz Oliveira
 */
public class ConvenioDAOTest {
    
    public ConvenioDAOTest() {
    }

    @Test
    @Ignore
    public void insert() {
        
        ConvenioDAO dao = new ConvenioDAO("mysql");
        Convenio conv = new Convenio(0, "Amil", "Platina");
        if(dao.save(conv)){
            System.out.println("Sucesso na inserção.");
        }
        else{
            fail("Erro!");
        }
        
    }
    @Test
    public void select(){
    
        ConvenioDAO dao = new ConvenioDAO("mysql");
        for (Convenio c: dao.selecionar()){
        
            System.out.println("Cod: " + c.getCodigo()+ " Nome: " + c.getNome() + " Cobertura: " + c.getCobertura());
            
        }
    }
    
}
