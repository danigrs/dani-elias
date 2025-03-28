public class Dozierender {
    private String name;
    private String fakultaet;
    private int bueroNummer;

    public void frageBeantworten(String frage) {
        String antwort;
        System.out.println("Frage: " + frage);
        System.out.println("Bitte geben Sie Ihre Antwort ein:");
        antwort = Input.readString();
        System.out.println("Antwort: " + antwort);
    }
}
