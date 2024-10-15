/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion_De_Bibiotheque;

/**
 *
 * @author pc
 */
public class Membre {
    private int membreID;
    private String nom;
    private String prenom;
    private String email;
    private String dateInscription;

    // Getters et setters
    public int getMembreID() {
        return membreID;
    }

    public void setMembreID(int membreID) {
        this.membreID = membreID;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(String dateInscription) {
        this.dateInscription = dateInscription;
    }
    
}
