package sio.devoir1sio1a.Model.Exo2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class AutoEcoleTest {

    private AutoEcole autoEcole;
    private Eleve eleve1;
    private Eleve eleve2;
    private Lecon lecon1;
    private Lecon lecon2;
    private Lecon lecon3;
    private Lecon lecon4;
    private Lecon lecon5;
    @BeforeEach
    void setUp()
    {
        autoEcole = new AutoEcole("ORT Auto école");
        eleve1 = new Eleve(1,"Benoit");
        eleve2 = new Eleve(2,"Virginie");
        lecon1 = new Lecon(1,new Date(),"UH-463-17",true,56);
        lecon2 = new Lecon(2,new Date(),"AR-891-45",false,73);
        lecon3 = new Lecon(3,new Date(),"UH-463-17",false,47);
        lecon4 = new Lecon(4,new Date(),"KY-502-28",true,82);
        lecon5 = new Lecon(5,new Date(),"UH-463-17",true,49);
        eleve1.ajouterLecon(lecon1);eleve2.ajouterLecon(lecon2);
        eleve2.ajouterLecon(lecon3);eleve2.ajouterLecon(lecon4);
        eleve1.ajouterLecon(lecon5);
        autoEcole.ajouterEleve(eleve1);
        autoEcole.ajouterEleve(eleve2);
    }

    @Test
    void calculerChiffreAffaires()
    {
        // Cas n°1 : 3 leçons réglées : 17.56 * 3


        // Cas n°2 : 0 leçon réglée

    }

    @Test
    void nbKmsVehicule()
    {
        // Cas n°1 : 3 leçons pour l'immatriculation : UH-463-17 : 56 + 47 + 49


        // Cas n°2 : 0 leçon pour l'immatriculation : AA-AAA-AA

    }
}