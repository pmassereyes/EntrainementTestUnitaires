package sio.devoir1sio1a.Model.Exo2;

import java.util.Date;

public class Lecon
{
    private int idLecon;
    private Date dateLecon;
    private String immatriculation;
    private boolean reglee;
    private int nbKm;

    public Lecon(int idLecon, Date dateLecon, String immatriculation, boolean reglee, int nbKm) {
        this.idLecon = idLecon;
        this.dateLecon = dateLecon;
        this.immatriculation = immatriculation;
        this.reglee = reglee;
        this.nbKm = nbKm;
    }

    public int getIdLecon() {
        return idLecon;
    }

    public Date getDateLecon() {
        return dateLecon;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public boolean isReglee() {
        return reglee;
    }

    public int getNbKm() {
        return nbKm;
    }

    public void setReglee(boolean reglee) {
        this.reglee = reglee;
    }

    public void setNbKm(int nbKm) {
        this.nbKm = nbKm;
    }
}
