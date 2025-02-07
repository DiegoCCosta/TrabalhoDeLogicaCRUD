/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifb.classes;

import java.util.ArrayList;

/**
 *
 * @author dieguiiroiro
 */
public class Usuario {
    private String nomeUsuario;
    private String email;
    private String senha;
    private  ArrayList<Contato> contato;

    public Usuario(String nomeUsuario, String email, String senha, ArrayList<Contato> contato) {
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
        this.contato = contato;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public ArrayList<Contato> getContato() {
        return contato;
    }

    public void setContato(ArrayList<Contato> contato) {
        this.contato = contato;
    }
    
    
}
