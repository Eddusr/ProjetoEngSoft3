/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionInterface;
import control.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Consulta;
import model.bean.Medico;
import model.bean.Paciente;

/**
 *
 * @author Luiz Oliveira
 */
public class ConsultaDAO {
    
    final private String nomeDB;
    public ConnectionInterface ic;
    private Connection con;

    public ConsultaDAO () {
        this.nomeDB = null;
        ConnectionFactory cf = new ConnectionFactory();
        this.ic = cf.getDB("");
    }
    
    public ConsultaDAO (String nome) {
        this.nomeDB = nome;
        ConnectionFactory cf = new ConnectionFactory();
        this.ic = cf.getDB(nome);
        this.con = ic.getConnection();
    }
    
    public boolean save (Consulta cons){
        
        String sql = "INSERT INTO consultas " +
                     "(consdata, conshora, consstatus, cons_paccpf, cons_medcrm) "+
                     "VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, cons.getData());
            stmt.setString(2, cons.getHora());
            stmt.setString(3, cons.getStatus());
            stmt.setString(4, cons.getPaciente().getCpf());
            stmt.setString(5, cons.getMedico().getCrm());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha na Inserção de dados.", "Erro", JOptionPane.ERROR_MESSAGE);
            System.err.println("Erro: " + ex);
            return false;
        } finally {
            ic.closeConnection(con, stmt);
        }
    }
    
    public List<Consulta> selecionar (String campoSel){
        
        List<Consulta> consultas = new ArrayList<>();
        String sql;
        if (campoSel.contains("/")){
            sql = "SELECT * FROM consultas "+
                  "WHERE cons_medcrm = " + campoSel;
        }
        else{
            sql = "SELECT * FROM consultas "+
                  "WHERE cons_paccpf = " + campoSel;
        }
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                Consulta cons = new Consulta();
                cons.setCodigo(rs.getInt("conscod"));
                cons.setData(rs.getString("consdata"));
                cons.setHora(rs.getString("conshora"));
                cons.setStatus(rs.getString("consstatus"));
                Paciente pac = new Paciente();
                pac.setCpf(rs.getString("cons_paccpf"));
                cons.setPaciente(pac);
                Medico med = new Medico();
                med.setCrm(rs.getString("cons_medcrm"));
                cons.setMedico(med);
                consultas.add(cons);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha na seleção de dados.", "Erro", JOptionPane.ERROR_MESSAGE);
            System.err.println("Erro: " + ex);
        } finally {
            ic.closeConnection(con, stmt, rs);
        }
        return consultas;        
    }
    
    public boolean alterar (Consulta cons){
        
        String sql = "UPDATE consultas "+
                     "SET consdata = ?, conshora = ?, consstatus = ? "+
                     "WHERE conscod = ?";
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, cons.getData());
            stmt.setString(2, cons.getHora());
            stmt.setString(3, cons.getStatus());
            stmt.setInt(4, cons.getCodigo());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha na Alteração de dados.", "Erro", JOptionPane.ERROR_MESSAGE);
            System.err.println("Erro: " + ex);
            return false;
        } finally {
            ic.closeConnection(con, stmt);
        }
    }
    
    public boolean deletar (int delCod){
        
        String sql = "DELETE FROM consultas " +
                     "WHERE conscod = " + delCod;
        
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao deletar dados.", "Erro", JOptionPane.ERROR_MESSAGE);
            System.err.println("Erro: " + ex);
            return false;
        } finally {
            ic.closeConnection(con, stmt);
        }
    }
}
