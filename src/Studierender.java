public class Studierender {
    String name;
    int matrikelnummer;
    String studiengang;

    public String frageStellen() {
        String question = Input.readString();
        return question;
        
    }
}
