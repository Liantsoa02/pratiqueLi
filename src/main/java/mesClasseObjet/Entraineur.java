/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mesClasseObjet;

import java.util.Date;

/**
 *
 * @author usager
 */
public class Entraineur {
    private Date dateNaissance;

    public Entraineur() {
    }

    public Entraineur(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    @Override
    public String toString() {
        return "Entraineur{" + "dateNaissance=" + dateNaissance + '}';
    }
    
    
}
