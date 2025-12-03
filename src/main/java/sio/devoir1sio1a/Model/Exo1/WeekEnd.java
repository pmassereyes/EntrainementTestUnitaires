package sio.devoir1sio1a.Model.Exo1;

public class WeekEnd extends Prestation
{
    private String typeChambre;

    public WeekEnd(int idPrestation, String nomPrestation, String typeChambre) {
        super(idPrestation, nomPrestation);
    }
    @Override
    public String getInfos(){
        return super.getInfos();
    }
    @Override
    public double getPrix(){
        double total = 0;
        for (Soin soin : getLesSoins()){
            total += soin.getPrixSoin();
        }
        if (this.typeChambre =="Mer"){
            return  total += 200;
        }
        else if (this.typeChambre =="Jardin"){
            return  total += 140;
        }
        else {
            return  total += 125;
        }
    }
    // A vous de jouer
}
