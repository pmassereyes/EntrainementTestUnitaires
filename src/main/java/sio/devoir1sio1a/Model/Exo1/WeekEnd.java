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
        return super.getPrix();
    }
    // A vous de jouer
}
