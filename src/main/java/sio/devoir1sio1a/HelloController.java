package sio.devoir1sio1a;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import sio.devoir1sio1a.Model.Exo1.Cure;
import sio.devoir1sio1a.Model.Exo1.Prestation;
import sio.devoir1sio1a.Model.Exo1.Soin;
import sio.devoir1sio1a.Model.Exo1.WeekEnd;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    ArrayList<Prestation> lesPrestations;
    @FXML
    private TableView tvPrestations;
    @FXML
    private TableColumn tcNumeroPrestation;
    @FXML
    private TableColumn tcLibellePrestation;
    @FXML
    private TableColumn tcPrixPrestation;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {

        // Jeu d'essais à décommenter une fois les classes créées

        /*lesPrestations = new ArrayList<>();
        Prestation prestation1 = new Prestation(1,"Santé");
        Prestation prestation2 = new Prestation(2,"Remise en forme");
        Cure cure1 = new Cure(3,"Bien-être",30);
        Cure cure2 = new Cure(4,"Postnatale",80);
        WeekEnd weekEnd1 = new WeekEnd(5,"Détente","Mer");
        WeekEnd weekEnd2 = new WeekEnd(6,"Beauté fraîcheur","Jardin");
        WeekEnd weekEnd3 = new WeekEnd(7,"Détente","Rue");

        Soin soin1 = new Soin("Massages normaux",15);
        Soin soin2 = new Soin("Massages relaxants",15);
        Soin soin3 = new Soin("Douches à affusion",15);
        Soin soin4 = new Soin("Bains bouillonnants algués",15);
        Soin soin5 = new Soin("Soin hydratant du visage",15);
        Soin soin6 = new Soin("Enveloppements d’algues",15);
        Soin soin7 = new Soin("Manucure et 1 soin des pieds",15);

        prestation1.ajouterSoin(soin1);prestation1.ajouterSoin(soin2);
        prestation2.ajouterSoin(soin1);prestation2.ajouterSoin(soin3);prestation2.ajouterSoin(soin4);
        cure1.ajouterSoin(soin4);
        cure2.ajouterSoin(soin5);cure2.ajouterSoin(soin6);
        weekEnd1.ajouterSoin(soin1);
        weekEnd2.ajouterSoin(soin6);weekEnd2.ajouterSoin(soin7);
        weekEnd3.ajouterSoin(soin5);weekEnd3.ajouterSoin(soin6);weekEnd3.ajouterSoin(soin7);
        lesPrestations.add(prestation1);lesPrestations.add(prestation2);
        lesPrestations.add(cure1);lesPrestations.add(cure2);
        lesPrestations.add(weekEnd1);lesPrestations.add(weekEnd2);lesPrestations.add(weekEnd3);*/

        // A vous de jouer


    }
}