/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mesClasseObjet;

/**
 *
 * @author usager
 */
public class Ville {
    private String nomVille;
    private String province;

    public Ville() {
    }

    public Ville(String nomVille, String province) {
        this.nomVille = nomVille;
        this.province = province;
    }

    public String getNomVille() {
        return nomVille;
    }

    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "Ville{" + "nomVille=" + nomVille + ", province=" + province + '}';
    }
    
    
}
