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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Paciente;

/**
 *
 * @author Eduardo
 */
public class PacienteDAO {
    final private String nomeDB;
    public ConnectionInterface ic;
    private Connection con;

    public PacienteDAO() {
        this.nomeDB = null;
        ConnectionFactory cf = new ConnectionFactory();
        this.ic = cf.getDB("");
    }
    
    public PacienteDAO(String nome) {
        this.nomeDB = nome;
        ConnectionFactory cf = new ConnectionFactory();
        this.ic = cf.getDB(nome);
        this.con = ic.getConnection();
    }
    
    public boolean save(Paciente paciente) {
        String sql = "INSERT INTO pacientes (paccpf, pacnome, pacsexo, pacidade) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, paciente.getCpf());
            stmt.setString(2, paciente.getNome());
            stmt.setString(3, paciente.getSexo());
            stmt.setInt(4, paciente.getIdade());
            
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return false;
        } finally {
            ic.closeConnection(con, stmt);
        }
    }
    
    public Paciente selecionar (String campo1){
        Paciente pac = new Paciente();
        String sql = "SELECT * FROM pacientes "
                + "WHERE paccpf = " + campo1;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                pac.setCpf(rs.getString("paccpf"));
                pac.setNome(rs.getString("pacnome"));
                pac.setSexo(rs.getString("pacsexo"));
                pac.setIdade(rs.getInt("pacidade"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha na Seleção do Paciente.", "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            ic.closeConnection(con, stmt, rs);
        }
        return pac;
    }
    
    public boolean alterar (Paciente pac, String oldCPF){
        String sql = "UPDATE pacientes SET paccpf = ?, pacnome = ?, pacsexo = ?, pacidade = ?"
                        + " WHERE paccpf = " + oldCPF;
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, pac.getCpf());
            stmt.setString(2, pac.getNome());
            stmt.setString(3, pac.getSexo());
            stmt.setInt(4, pac.getIdade());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha na Alteração de dados.", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }finally {
            ic.closeConnection(con, stmt);
        }
        
    }
}
