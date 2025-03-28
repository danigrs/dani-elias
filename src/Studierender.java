public class Studierender {
    String name;
    int matrikelnummer;
    String studiengang;

    public String frageStellen() {
        System.out.println("Bitte geben Sie Ihre Frage ein: ");
        String question = Input.readString();
        return question;
    }

    public String SprechstundenAnfrage() {
        System.out.println("Bitte geben Sie Ihre Anfrage ein: ");
        String anfrage = Input.readString();
        return anfrage;
    }
}
