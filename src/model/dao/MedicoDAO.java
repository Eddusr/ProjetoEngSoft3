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
import javax.swing.JOptionPane;
import model.bean.Especialidade;
import model.bean.Medico;

/**
 *
 * @author Luiz Oliveira
 */
public class MedicoDAO {
    final private String nomeDB;
    public ConnectionInterface ic;
    private Connection con;

    public MedicoDAO() {
        this.nomeDB = null;
        ConnectionFactory cf = new ConnectionFactory();
        this.ic = cf.getDB("");
    }
    
    public MedicoDAO(String nome) {
        this.nomeDB = nome;
        ConnectionFactory cf = new ConnectionFactory();
        this.ic = cf.getDB(nome);
        this.con = ic.getConnection();
    }
    
    public boolean save(Medico medico) {
        String sql = "INSERT INTO medicos (medcrm, mednome, med_espcod) VALUES (?, ?, ?)";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, medico.getCrm());
            stmt.setString(2, medico.getNome());
            stmt.setInt(3, medico.getEspecialidade().getCodigo());
            
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro: " + ex);
            return false;
        } finally {
            ic.closeConnection(con, stmt);
        }
    }
    
    public List<Medico> selecionar (){
 
        String sql = "SELECT * FROM SelectMed";
        
        List<Medico> medicos = new ArrayList<>();        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                Medico med = new Medico();
                med.setCrm(rs.getString("medcrm"));
                med.setNome(rs.getString("mednome"));
                Especialidade esp = new Especialidade();
                esp.setCodigo(rs.getInt("espcod"));
                esp.setNome(rs.getString("espnome"));
                med.setEspecialidade(esp);
                medicos.add(med);               
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha na Seleção de Medicos.", "Erro", JOptionPane.ERROR_MESSAGE);
        } finally {
            ic.closeConnection(con, stmt, rs);
        }
        return medicos;
        
    }
}
