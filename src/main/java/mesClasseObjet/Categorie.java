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
public class Categorie {
    private String nomCategorie;
    private int ageMin;
    private int ageMax;

    public Categorie() {
    }

    public Categorie(String nomCategorie, int ageMin, int ageMax) {
        this.nomCategorie = nomCategorie;
        this.ageMin = ageMin;
        this.ageMax = ageMax;
    }

    public String getNomCategorie() {
        return nomCategorie;
    }

    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }

    public int getAgeMin() {
        return ageMin;
    }

    public void setAgeMin(int ageMin) {
        this.ageMin = ageMin;
    }

    public int getAgeMax() {
        return ageMax;
    }

    public void setAgeMax(int ageMax) {
        this.ageMax = ageMax;
    }

    @Override
    public String toString() {
        return "Categorie{" + "nomCategorie=" + nomCategorie + ", ageMin=" + ageMin + ", ageMax=" + ageMax + '}';
    }
    
    
    
}
