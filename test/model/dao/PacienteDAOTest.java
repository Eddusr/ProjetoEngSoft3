/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import model.bean.Paciente;
import static org.junit.Assert.fail;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author Luiz Oliveira
 */
public class PacienteDAOTest {
    
    public PacienteDAOTest() {
    }

    @Test
    @Ignore
    public void inserir() {
        
        Paciente pac = new Paciente("43333177897", "Luiz", "M", 24);
        PacienteDAO dao = new PacienteDAO("mysql");
        
        if(dao.save(pac)){
            System.out.println("salvo com sucesso");
        }
        else{
            fail("Erro ao salvar");
        }
        
    }
    
    @Test
    @Ignore
    public void select(){
        
        PacienteDAO dao = new PacienteDAO("mysql");
        Paciente pac = dao.selecionar("43333177897");
        if (pac != null){
            System.out.println("Nome: " + pac.getNome() + " Idade: " + pac.getIdade() + " anos.");
        }
        else
            fail("Erro ao selecionar");
        
    }
    
    @Test
    public void update(){
        Paciente pac = new Paciente("43333177897", "Luiz Roberto", "M", 23);
        PacienteDAO dao = new PacienteDAO("mysql");
        if (dao.alterar(pac, "43333177897")){
            System.out.println("Alteracao realizada com sucesso");
        }else
            fail("Erro na alteracao de dados");
    }
}