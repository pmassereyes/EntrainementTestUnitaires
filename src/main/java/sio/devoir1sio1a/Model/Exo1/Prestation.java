package sio.devoir1sio1a.Model.Exo1;

import java.util.ArrayList;

public class Prestation {
    private int idPrestation;
    private String nomPrestation;
    private ArrayList<Soin>lesSoins;
    // A vous de jouer


    public Prestation(int idPrestation, String nomPrestation) {
        this.idPrestation = idPrestation;
        this.nomPrestation = nomPrestation;
    }
    public void ajouterSoin(Soin) {
    }

    public ArrayList<Soin> getLesSoins() {
        return lesSoins;
    }

    public int getIdPrestation() {
        return idPrestation;
    }
}
