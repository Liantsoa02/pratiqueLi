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
    private String qualification;

    public Entraineur() {
    }

    public Entraineur(String qualification) {
        this.qualification = qualification;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Entraineur{" + "qualification=" + qualification + '}';
    }

    
}
