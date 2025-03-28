public class Studierender {
    String name;
    int matrikelnummer;
    String studiengang;
    
    public Studierender(String name, String studiengang, int matrikelnummer) {
        this.name = name;
        this.studiengang = studiengang;
        this.matrikelnummer = matrikelnummer;

    }
    public String frageStellen() {
        System.out.println("Bitte geben Sie Ihre Frage ein: ");
        String question = Input.readString();
        return question;
        
    }
}
