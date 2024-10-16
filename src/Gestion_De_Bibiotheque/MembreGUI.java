/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Gestion_De_Bibiotheque;

import Gestion_De_Bibiotheque.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author pc
 */
public class MembreGUI extends javax.swing.JFrame {
private BibliothequeGUI bibliothequeDAO;
    /**private BibliothequeDAO bibliothequeDAO;
     * Creates new form MembreGUI
     */
    public MembreGUI() {
        initComponents();
          bibliothequeDAO = new BibliothequeGUI();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        MembreIDTextField2 = new javax.swing.JTextField();
        NOMTextField3 = new javax.swing.JTextField();
        EmailTextField4 = new javax.swing.JTextField();
        PrenomTextField6 = new javax.swing.JTextField();
        DateISCFormattedTextField2 = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        ajoutButton1 = new javax.swing.JButton();
        suppButton2 = new javax.swing.JButton();
        modfButton3 = new javax.swing.JButton();
        AfficheButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MembreTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        RECHERCHETextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Date Inscription");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Prenom");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("MembreID ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Email");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Nom\t");

        MembreIDTextField2.setBackground(new java.awt.Color(204, 0, 0));
        MembreIDTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MembreIDTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MembreIDTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(NOMTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                        .addComponent(EmailTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                        .addComponent(PrenomTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                        .addComponent(DateISCFormattedTextField2)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MembreIDTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NOMTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PrenomTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(DateISCFormattedTextField2)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        ajoutButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ajoutButton1.setText("Ajouter Membre");
        ajoutButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutButton1ActionPerformed(evt);
            }
        });

        suppButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        suppButton2.setText("Supprimer Membre");
        suppButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppButton2ActionPerformed(evt);
            }
        });

        modfButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        modfButton3.setText("Modiffier Membre");
        modfButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modfButton3ActionPerformed(evt);
            }
        });

        AfficheButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AfficheButton4.setText("Afficher Membre ");
        AfficheButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AfficheButton4ActionPerformed(evt);
            }
        });

        MembreTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "MembreID", "Nom", "Prenom", "Email", "Date Inscription"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        MembreTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MembreTable1MouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(MembreTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setText("           GESTION MEMBRE              ");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("RECHERCHE");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("COORDONNE");

        RECHERCHETextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RECHERCHETextField1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ajoutButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(suppButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(modfButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AfficheButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(RECHERCHETextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RECHERCHETextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ajoutButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suppButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modfButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AfficheButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MembreIDTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MembreIDTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MembreIDTextField2ActionPerformed

    private void modfButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modfButton3ActionPerformed
        // TODO add your handling code here:
    // Récupération des valeurs des champs de texte
    String MembreID = MembreIDTextField2.getText(); // ID du Membre à modifier (important pour la requête WHERE)
     // Récupération des valeurs des champs de texte
    String Nom = NOMTextField3.getText();
    String Prenom = PrenomTextField6.getText();
    String Email = EmailTextField4.getText();
   
    String DateInscription = DateISCFormattedTextField2.getText();
    

    // Validation des champs
    if (Nom.isEmpty() || Prenom.isEmpty() || Email.isEmpty() || DateInscription.isEmpty() ) {
        JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs.");
        return;
    }

    // Requête SQL de mise à jour
    String sql = "UPDATE Membres SET Nom = ?, Prenom = ?, Email = ?, DateIscription = ?   WHERE MembreID = ?";

    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        // Vérification de la connexion à la base de données
        if (conn == null) {
            throw new SQLException("Connexion à la base de données échouée.");
        }

        // Configuration des paramètres de la requête
        pstmt.setString(2, Nom);
        pstmt.setString(3, Prenom);
        pstmt.setString(4, Email);
        pstmt.setString(5, DateInscription);

        // Conversion de la date (si nécessaire)
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date parsedDate = dateFormat.parse(DateInscription);
            pstmt.setDate(5, new java.sql.Date(parsedDate.getTime()));
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Format de date incorrect. Utilisez 'YYYY-MM-DD'.");
            return;
        }

       
        pstmt.setInt(1, Integer.parseInt(MembreID));

        // Exécution de la mise à jour
        int rowsAffected = pstmt.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Membre modifié avec succès!");

            // Effacement des champs après modification
            NOMTextField3.setText("");
            PrenomTextField6.setText("");
            EmailTextField4.setText("");
            DateISCFormattedTextField2.setText("");
           

            // Actualisation de l'affichage des Membres
            AfficheButton4ActionPerformed(evt); 
        } else {
            JOptionPane.showMessageDialog(null, "Erreur : Aucun Membre avec cet ID n'a été trouvé.");
        }

    } catch (SQLException e) {
        e.printStackTrace(); // Journalisation de l'erreur
        JOptionPane.showMessageDialog(null, "Erreur lors de la modification du Membre : " + e.getMessage());
    }


                                            

    }//GEN-LAST:event_modfButton3ActionPerformed

    private void suppButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppButton2ActionPerformed
                                                
                                               
    int selectedRow = MembreTable1.getSelectedRow();
    if (selectedRow != -1) {
        // Get the MembreID from the selected row
        int MembreID = (int) MembreTable1.getValueAt(selectedRow, 0); // Assuming MembreID is in the first column
        
        String sql = "DELETE FROM Membres WHERE MembreID = ?";
        
        int confirm = JOptionPane.showConfirmDialog(null, "Êtes-vous sûr de vouloir supprimer ce Membre?", "Confirmation", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try (Connection conn = DatabaseConnection.getConnection();
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {
                 
                pstmt.setInt(1, MembreID);
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Membre supprimé avec succès!");
                
                // Refresh the table after deletion
                AfficheButton4ActionPerformed(evt); // Refresh the table
            } catch (SQLException e) {
                e.printStackTrace(); // Print stack trace for debugging
                JOptionPane.showMessageDialog(null, "Erreur lors de la suppression des données : " + e.getMessage());
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Veuillez sélectionner un Membre à supprimer.");
    }                                     

    }//GEN-LAST:event_suppButton2ActionPerformed

    private void AfficheButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AfficheButton4ActionPerformed
                                                         
        // TODO add your handling code here:
                                                 
    String sql = "SELECT * FROM Membres";
    
    try (Connection conn = DatabaseConnection.getConnection();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(sql)) {
        
        DefaultTableModel tablemodel = (DefaultTableModel) MembreTable1.getModel();
        
        // Vider le modèle avant de le remplir
        tablemodel.setRowCount(0);

        while (rs.next()) {
            int MembreID = rs.getInt("MembreID");
            String Nom = rs.getString("Nom");
            String Prenom = rs.getString("Prenom");
            String Email = rs.getString("Email");
            String DateInscription = rs.getString("DateInscription");
           

            // Créer un tableau d'objets pour ajouter à la table
            Object[] MembreTable = {MembreID, Nom, Prenom, Email, DateInscription};
            
            // Ajouter la ligne au modèle de table
            tablemodel.addRow(MembreTable);
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Erreur lors de la récupération des données.");
    }
    }//GEN-LAST:event_AfficheButton4ActionPerformed

    private void ajoutButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutButton1ActionPerformed
        // TODO add your handling code here:                                              

    // Récupération des valeurs des champs de texte
    String Nom = NOMTextField3.getText();
    String Prenom = PrenomTextField6.getText();
    String Email = EmailTextField4.getText();
   
    String DateInscription = DateISCFormattedTextField2.getText();
    

    // Validation des champs
    if (Nom.isEmpty() || Prenom.isEmpty() || Email.isEmpty() || DateInscription.isEmpty() ) {
        JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs.");
        return;
    }

    // Requête SQL sans MembreID (s'il est auto-incrémenté)
    String sql = "INSERT INTO Membres (Nom, Prenom, Email, DateInscription) VALUES (?, ?, ?, ?)";

    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        // Vérification de la connexion à la base de données
        if (conn == null) {
            throw new SQLException("Connexion à la base de données échouée.");
        }

        // Configuration des paramètres de la requête
        pstmt.setString(1, Nom);
        pstmt.setString(2, Prenom);
        pstmt.setString(3, Email);
        pstmt.setString(4, DateInscription);
        
        // Conversion de la date (si nécessaire)
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date parsedDate = dateFormat.parse(DateInscription);
            pstmt.setDate(4, new java.sql.Date(parsedDate.getTime()));
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Format de date incorrect. Utilisez 'YYYY-MM-DD'.");
            return;
        }

        
        // Exécution de la mise à jour
        int rowsAffected = pstmt.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Membres ajouté avec succès!");

            // Effacement des champs après ajout
            NOMTextField3.setText("");
            PrenomTextField6.setText("");
            EmailTextField4.setText("");
            DateISCFormattedTextField2.setText("");
           

            // Actualisation de l'affichage des Membre
            AfficheButton4ActionPerformed(evt); 
        }

    } catch (SQLException e) {
        e.printStackTrace(); // Journalisation de l'erreur
        JOptionPane.showMessageDialog(null, "Erreur lors de l'ajout du livre : " + e.getMessage());
    }

   
    }//GEN-LAST:event_ajoutButton1ActionPerformed

    private void MembreTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MembreTable1MouseReleased
        int i = MembreTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)MembreTable1.getModel();
        MembreIDTextField2.setText(model.getValueAt(i, 0).toString());
        NOMTextField3.setText(model.getValueAt(i, 1).toString());
        PrenomTextField6.setText(model.getValueAt(i, 2).toString());
        EmailTextField4.setText(model.getValueAt(i, 3).toString());
        DateISCFormattedTextField2.setText(model.getValueAt(i, 4).toString());
        
    }//GEN-LAST:event_MembreTable1MouseReleased

    private void RECHERCHETextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RECHERCHETextField1KeyReleased
           String searchText = RECHERCHETextField1.getText().trim(); 
    if (!searchText.isEmpty()) {
        TableMembreRecherche(searchText);
    } else {
        // إذا كان مربع البحث فارغًا، قم بعرض كل البيانات
        TableMembreRecherche(""); 
    }
    }//GEN-LAST:event_RECHERCHETextField1KeyReleased

     public void TableMembreRecherche(String valeur) {
    String[] auteur = {"MembreID ", "Nom", "Prenom", "Email", "DateInscription"};
    DefaultTableModel model = new DefaultTableModel(null, auteur);

    // استخدام PreparedStatement لتجنب أخطاء SQL Injection
    String sql = "SELECT * FROM Membres WHERE Nom LIKE ?";

    try (Connection conn = DatabaseConnection.getConnection();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        // إعداد قيمة البحث مع إضافة علامات %
        pstmt.setString(1, "%" + valeur + "%");

        try (ResultSet rs = pstmt.executeQuery()) {
            // تخزين النتائج في الجدول
            while (rs.next()) {
                String[] afficher = new String[5];
                afficher[0] = rs.getString("MembreID");
                afficher[1] = rs.getString("Nom");
                afficher[2] = rs.getString("Prenom");
                afficher[3] = rs.getString("Email");
                afficher[4] = rs.getString("DateInscription");
                model.addRow(afficher);
            }

            // تحديث الجدول بالموديل
            MembreTable1.setModel(model);
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Erreur lors de la récupération des données.");
    }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MembreGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MembreGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MembreGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MembreGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MembreGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AfficheButton4;
    private javax.swing.JFormattedTextField DateISCFormattedTextField2;
    private javax.swing.JTextField EmailTextField4;
    private javax.swing.JTextField MembreIDTextField2;
    private javax.swing.JTable MembreTable1;
    private javax.swing.JTextField NOMTextField3;
    private javax.swing.JTextField PrenomTextField6;
    private javax.swing.JTextField RECHERCHETextField1;
    private javax.swing.JButton ajoutButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modfButton3;
    private javax.swing.JButton suppButton2;
    // End of variables declaration//GEN-END:variables
}
