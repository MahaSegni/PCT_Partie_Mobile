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
public class pays {
     private int id;
   private String nomp;
   private float cout;

    public pays() {
    }

    public pays(int id, String nomp) {
        this.id = id;
        this.nomp = nomp;
    }

    public pays(int id, float cout) {
        this.id = id;
        this.cout = cout;
    }

    public pays(int id, String nomp, float cout) {
        this.id = id;
        this.nomp = nomp;
        this.cout = cout;
    }

    public int getId() {
        return id;
    }


    public String getNomp() {
        return nomp;
    }

    public void setNomp(String nomp) {
        this.nomp = nomp;
    }

    public float getCout() {
        return cout;
    }

    public void setCout(float cout) {
        this.cout = cout;
    }
   
}
