package sio.devoir1sio1a.Model.Exo2;

import java.util.ArrayList;

public class Eleve
{
    private int idEleve;
    private String nomEleve;
    private ArrayList<Lecon> lesLecons;

    public Eleve(int idEleve, String nomEleve) {
        this.idEleve = idEleve;
        this.nomEleve = nomEleve;
        this.lesLecons = new ArrayList<>();
    }

    public int getIdEleve() {
        return idEleve;
    }

    public String getNomEleve() {
        return nomEleve;
    }

    public ArrayList<Lecon> getLesLecons() {
        return lesLecons;
    }

    // Cette méthode permet d'ajouter une leçon à la collection
    public void ajouterLecon(Lecon lecon)
    {
        lesLecons.add(lecon);
    }

    // Cette méthode retourne le nombre de leçons réglées
    public int nbLeconsReglees()
    {
        // A vous de jouer

        return 0;
    }

    // Cette méthode retourne la leçon
    // qui a réalisé le plus grand nombre de Kms
    // S'il y a des ex aequo, on retourne toujours la première
    public Lecon leconLaPlusLongue()
    {
        // A vous de jouer

        return null;
    }
}
