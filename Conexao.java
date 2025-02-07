/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifb.edu.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dieguiiroiro
 */
public class Conexao {
     private static final String URL = "jdbc:sqlite:C:\\Users\\dieguiiroiro\\Documents\\NetBeansProjects\\javainterface\\src\\main\\java\\ifb\\telas\\bancoAgenda.db";
    public static Connection getConnection(){
         try {
             return DriverManager.getConnection(URL);
         } catch (SQLException ex) {
             Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
         }
         return null;
    }
    
    public static void closeConnection(Connection con){
         try {
             con.close();
         } catch (SQLException ex) {
             Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt){
        closeConnection(con);
         try {
             stmt.close();
         } catch (SQLException ex) {
             Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
    //public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
    //    closeConnection(con,stmt);
    //     try {
    //         rs.close();
    //     } catch (SQLException ex) {
    //         Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
    //    }
    //    
    //}
    
    public static void closeConnection(Connection conn, PreparedStatement stmt, ResultSet rs) {
    try {
        if (rs != null) {
            rs.close();
        }
        if (stmt != null) {
            stmt.close();
        }
        if (conn != null) {
            conn.close();
        }
    } catch (SQLException e) {
        System.err.println("Erro ao fechar recursos: " + e.getMessage());
    }
}
    
}
