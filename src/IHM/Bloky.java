package IHM;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ItemListener;


public class Bloky {
    public static void main(String[] args) {
        // Création de la fenêtre principale
        JFrame fenetre = new JFrame("Bloc Note");
        fenetre.setSize(600, 500); // Taille plus grande pour le confort
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setLocationRelativeTo(null); // Centrer la fenêtre
        fenetre.setLayout(new BorderLayout()); // Utiliser BorderLayout

        // Zone de texte avec défilement
        JTextArea textArea = new JTextArea();
        textArea.setBackground(Color.WHITE); // Change la couleur de fond de la zone de texte
        textArea.setForeground(Color.BLACK); // Change la couleur du texte

        JScrollPane scrollPane = new JScrollPane(textArea);
        fenetre.add(scrollPane, BorderLayout.CENTER); // Zone de texte en plein écran

        // Barre de menu
        JMenuBar menuBar = new JMenuBar();

        // Menu Fichier
        JMenu menuFichier = new JMenu("Fichier");
        JMenuItem ouvrir = new JMenuItem("Ouvrir"); 
        JMenuItem enregistrer = new JMenuItem("Enregistrer");
        JMenuItem quitter = new JMenuItem("Quitter");

        // Ajouter les options au menu
        menuFichier.add(ouvrir);
        menuFichier.add(enregistrer);
        menuFichier.addSeparator();
        menuFichier.add(quitter);
        
        menuBar.add(menuFichier);
        
        // Ajout de la barre de menu correctement
        fenetre.setJMenuBar(menuBar);
        
     // ==== MENU MODIFIER ====
        JMenu menuModifier = new JMenu("Modifier");
        JMenuItem copier = new JMenuItem("Copier");
        JMenuItem couper = new JMenuItem("Couper");
        JMenuItem coller = new JMenuItem("Coller");
        JMenuItem remplacer = new JMenuItem("Remplacer");


        menuModifier.add(copier);
        menuModifier.add(couper);
        menuModifier.add(coller);
        menuModifier.addSeparator();
        menuModifier.add(remplacer);

        menuBar.add(menuModifier);
        
        // ==== MENU Affichage ====
        JMenu menuAffichage = new JMenu("Affichage");
        JMenuItem ZoomIn = new JMenuItem("Zoom in");
        JMenuItem ZoomOut  = new JMenuItem("Zoom out");
       


        menuAffichage.add(ZoomIn);
        menuAffichage.add(ZoomOut);
   ;

        menuBar.add(menuAffichage);
        
        
        // Rendre la fenêtre visible
        fenetre.setVisible(true);
    }
}
