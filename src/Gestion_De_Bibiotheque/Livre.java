/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestion_De_Bibiotheque;

/**
 *
 * @author pc
 */
public class Livre {
    private int livreID;
    private String titre;
    private int auteurID;
    private String genre;
    private String isbn;
    private String datePublication;
    private boolean disponibilite;

    // Getters et setters
    public int getLivreID() {
        return livreID;
    }

    public void setLivreID(int livreID) {
        this.livreID = livreID;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getAuteurID() {
        return auteurID;
    }

    public void setAuteurID(int auteurID) {
        this.auteurID = auteurID;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(String datePublication) {
        this.datePublication = datePublication;
    }

    public boolean isDisponibilite() {
        return disponibilite;
    }

    public void setDisponibilite(boolean disponibilite) {
        this.disponibilite = disponibilite;
    }
    
}
