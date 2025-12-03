package sio.devoir1sio1a.Model.Exo2;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class AutoEcole
{
    private String nomAutoEcole;
    private ArrayList<Eleve> lesEleves;

    public AutoEcole(String nomAutoEcole) {
        this.nomAutoEcole = nomAutoEcole;
        this.lesEleves = new ArrayList<>();
    }

    // Cette méthode permet d'ajouter un élève à la collection
    public void ajouterEleve(Eleve eleve)
    {
        lesEleves.add(eleve);
    }

    // Cette méthode calcule le chiffre d'affaires
    // uniquement pour les leçons réglées.
    // Ce dernier se détermine de la façon suivante
    // ca = nombre de leçons réglées * 17.56
    // Le prix d'une leçon est de 17.56
    public double calculerChiffreAffaires() {
        double total = 0;
        for (Eleve eleve : lesEleves) {
            for (Lecon lecon : eleve.getLesLecons()) { // utilise le getter
                if (lecon.isReglee()) {
                    total += 17.56;
                }
            }
        }
        return Math.round(total * 100.0) / 100.0;
    }

    // Cette méthode calcule le nombre total de Kms
    // uniquement pour l'immatriculation du véhicule passée en paramètre.
    public int nbKmsVehicule(String uneImmat)
    {
        int nbKms = 0;
        for (Eleve eleve : lesEleves) {
            for (Lecon lecon : eleve.getLesLecons()) {
                if (lecon.getImmatriculation().equals(uneImmat)) {
                    nbKms += lecon.getNbKm();
                }
            }
        }
        return nbKms;
    }
}
