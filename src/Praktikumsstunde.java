public class Praktikumsstunde {
    private String thema;
    private int uhrzeit;
    private String raum;
    private String datum;
    private String[] aufgaben;

    public void getDetails(){
        System.out.println("Thema: " + thema);
        System.out.println("Uhrzeit: " + uhrzeit);
        System.out.println("Raum: " + raum);
        System.out.println("Datum: " + datum);
        for(int i=0; i<aufgaben.length; i++){
            System.out.println("Aufgabe " + i + ":" + aufgaben[i]);
        }
    }
    public void setDetails(String thema, int uhrzeit, String raum, String datum){
        this.thema = thema;
        this.uhrzeit = uhrzeit;
        this.raum = raum;
        this.datum = datum;
    }
    public void aufgabenEinlesen(){
        System.out.println("Bitte geben Sie die Anzahl der Aufgaben ein: ");
        int anzahl = Input.readInt();
        aufgaben = new String[anzahl];
        for(int i=0; i<anzahl; i++){
            System.out.println("Bitte geben Sie die Aufgabe " + (i+1) + " ein: ");
            aufgaben[i] = Input.readString();
        }
    }
}
