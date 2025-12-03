package sio.devoir1sio1a.Model.Exo1;

public class Cure extends Prestation
{
    private int tauxRemboursement;

    public Cure(int idPrestation, String nomPrestation, int tauxRemboursement) {
        super(idPrestation, nomPrestation);
    }

    @Override
    public double getPrix() {
        double total = 0;
        for (Soin soin : getLesSoins()) {
            total += soin.getPrixSoin();
        }
        return total - tauxRemboursement;
    }
    @Override
    public String getInfos(){
        return super.getInfos();
    }
    public int getTauxRemboursement() {
        return tauxRemboursement;
    }

    // A vous de jouer

}
