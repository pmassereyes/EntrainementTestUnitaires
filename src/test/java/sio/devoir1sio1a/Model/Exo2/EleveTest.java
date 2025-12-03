package sio.devoir1sio1a.Model.Exo2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class EleveTest {

    private Eleve eleve;
    private Lecon lecon1;
    private Lecon lecon2;
    private Lecon lecon3;
    private Lecon lecon4;
    private Lecon lecon5;
    @BeforeEach
    void setUp()
    {
        eleve = new Eleve(1,"Benoit");
        lecon1 = new Lecon(1,new Date(),"",true,56);
        lecon2 = new Lecon(2,new Date(),"",false,73);
        lecon3 = new Lecon(3,new Date(),"",false,47);
        lecon4 = new Lecon(4,new Date(),"",true,82);
        lecon5 = new Lecon(5,new Date(),"",true,49);
        eleve.ajouterLecon(lecon1);eleve.ajouterLecon(lecon2);
        eleve.ajouterLecon(lecon3);eleve.ajouterLecon(lecon4);
        eleve.ajouterLecon(lecon5);
    }

    @Test
    void nbLeconsReglees()
    {
        // Cas n°1 : 3 leçons réglées
        int actual = eleve.nbLeconsReglees();
        int expected = 3;
        assertEquals(expected,actual);



        // Cas n°2 : 0 leçon réglée
        // Modifier les leçons 1, 4 et 5 afin qu'elles ne soient pas réglées
        lecon1.setReglee(false);
        lecon4.setReglee(false);
        lecon5.setReglee(false);
        actual = eleve.nbLeconsReglees();
        expected = 0;
        assertEquals(expected,actual);



    }

    @Test
    void leconLaPlusLongue()
    {
        // Cas n°1 : lecon4


        // Cas n°2 : lecon1


        // Cas n°3 : Ex aequo : lecon3,lecon5


    }
}