package sio.devoir1sio1a.Model.Exo1;

import java.io.Serializable;
import java.util.ArrayList;

public class Prestation implements IInfos, Comparable {

    private int idPrestation;
    private String nomPrestation;
    private ArrayList<Soin>lesSoins;
    // A vous de jouer


    public Prestation(int idPrestation, String nomPrestation) {
        this.idPrestation = idPrestation;
        this.nomPrestation = nomPrestation;
    }
    public void ajouterSoin(Soin soin) {
        lesSoins.add(soin);
    }

    public ArrayList<Soin> getLesSoins() {
        return lesSoins;
    }

    public double getPrix(){
        return 0;
    }

    public int getIdPrestation() {
        return idPrestation;
    }

    @Override
    public String getInfos() {
        return "";
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }


}
