public class Vorlesungsstunde {
    private String thema;
    private int uhrzeit;
    private String raum;
    private String datum;

    public void getDetails(){
        System.out.println("Thema: " + thema);
        System.out.println("Uhrzeit: " + uhrzeit);
        System.out.println("Raum: " + raum);
        System.out.println("Datum: " + datum);
    }
    public void setDetails(String thema, int uhrzeit, String raum, String datum){
        this.thema = thema;
        this.uhrzeit = uhrzeit;
        this.raum = raum;
        this.datum = datum;
    }

}
