/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion_De_Bibiotheque;

/**
 *
 * @author pc
 */
public class Auteur {
     private int auteurID;
    private String nom;
    private String prenom;
    private String dateNaissance;
    private String nationalite;

    // Getters et setters
    public int getAuteurID() {
        return auteurID;
    }

    public void setAuteurID(int auteurID) {
        this.auteurID = auteurID;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }
    
}
