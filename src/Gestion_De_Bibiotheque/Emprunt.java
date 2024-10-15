/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion_De_Bibiotheque;

/**
 *
 * @author pc
 */
public class Emprunt {
    private int empruntID;
    private int livreID;
    private int membreID;
    private String dateEmprunt;
    private String dateRetour;

    // Getters et setters
    public int getEmpruntID() {
        return empruntID;
    }

    public void setEmpruntID(int empruntID) {
        this.empruntID = empruntID;
    }

    public int getLivreID() {
        return livreID;
    }

    public void setLivreID(int livreID) {
        this.livreID = livreID;
    }

    public int getMembreID() {
        return membreID;
    }

    public void setMembreID(int membreID) {
        this.membreID = membreID;
    }

    public String getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDateEmprunt(String dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public String getDateRetour() {
        return dateRetour;
    }

    public void setDateRetour(String dateRetour) {
        this.dateRetour = dateRetour;
    }
}
