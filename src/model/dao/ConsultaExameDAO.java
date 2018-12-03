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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.ConsultaExame;
import model.bean.Exame;

/**
 *
 * @author Luiz Oliveira
 */
public class ConsultaExameDAO {
    final private String nomeDB;
    public ConnectionInterface ic;
    private Connection con;

    public ConsultaExameDAO() {
        this.nomeDB = null;
        ConnectionFactory cf = new ConnectionFactory();
        this.ic = cf.getDB("");
    }

    public ConsultaExameDAO(String nome) {
        this.nomeDB = nome;
        ConnectionFactory cf = new ConnectionFactory();
        this.ic = cf.getDB(nome);
        this.con = ic.getConnection();
    }
    
    public boolean save (ConsultaExame exam) {
        
        String sql = "INSERT INTO consultasexames "+
                     "(conscod, examecod, consexamedata, consexamehora) "+
                     "VALUES (?, ?, ?, ?)";
        
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, exam.getConsulta().getCodigo());
            stmt.setInt(2, exam.getCodigo());
            stmt.setString(3, exam.getData());
            stmt.setString(4, exam.getHora());
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha na Inserção de dados.", "Erro", JOptionPane.ERROR_MESSAGE);
            System.err.println("Erro: " + ex);
            return false;
        } finally {
            ic.closeConnection(con, stmt);
        }
    }
}
