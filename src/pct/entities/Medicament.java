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
public class Medicament {
    private int ref,qte,nbrG;
    private String nomM,libelle;
    private  float prix,ig;

    public Medicament() {
    }

    public Medicament(int ref, int qte, int nbrG, String nomM, String libelle, float prix, float ig) {
        this.ref = ref;
        this.qte = qte;
        this.nbrG = nbrG;
        this.nomM = nomM;
        this.libelle = libelle;
        this.prix = prix;
        this.ig = ig;
    }

    public Medicament(int ref, int qte, String libelle, float prix, float ig) {
        this.ref = ref;
        this.qte = qte;
        this.libelle = libelle;
        this.prix = prix;
        this.ig = ig;
    }

    public int getRef() {
        return ref;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public int getNbrG() {
        return nbrG;
    }

    public void setNbrG(int nbrG) {
        this.nbrG = nbrG;
    }

    public String getNomM() {
        return nomM;
    }

    public void setNomM(String nomM) {
        this.nomM = nomM;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public float getIg() {
        return ig;
    }

    public void setIg(float ig) {
        this.ig = ig;
    }
    
}
