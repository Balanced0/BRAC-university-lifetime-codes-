public class Vaccine{
    private String vac_name;
    private int sec_dose;
    public Vaccine(String vac_name, String country, int sec_dose){
        this.vac_name = vac_name;
        this.sec_dose = sec_dose;
    }
    public String get_vac_name(){
        return vac_name;
    }
    public int get_sec_dose(){
        return sec_dose;
    }
}