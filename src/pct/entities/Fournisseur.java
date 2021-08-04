/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct.entities;

/**
 *
 * @author mahas
 */
public class Fournisseur {
    private int matricule;
    private String nomf,email;
    private int telephone;

    public Fournisseur(int matricule, String nomf, String email, int telephone) {
        this.matricule = matricule;
        this.nomf = nomf;
        this.email = email;
        this.telephone = telephone;
    }

    public Fournisseur() {
    }

    public int getMatricule() {
        return matricule;
    }

    public String getNomf() {
        return nomf;
    }

    public void setNomf(String nomf) {
        this.nomf = nomf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
    
    
    
}
