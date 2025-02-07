/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ifb.classes;

/**
 *
 * @author dieguiiroiro
 */
public class Contato {
    private int id;
    private int idUsuario;
    private String nome;
    private String telefone;
    private String email;
    private String dataAniversario;
    
    public Contato(){
        
    }
    public Contato(int id, int idUsuario, String nome, String telefone, String email, String dataAniversario) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dataAniversario = dataAniversario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    @Override
    public String toString() {
        return "Contato{" + "id=" + id + ", idUsuario=" + idUsuario + ", nome=" + nome + ", telefone=" + telefone + ", email=" + email + ", dataAniversario=" + dataAniversario + '}';
    }

}
