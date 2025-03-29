public class App {
    public static void main(String[] args) throws Exception {
        // Dozierender und Studierender erstellen
        Dozierender dozierender = new Dozierender("Simon Nestler", "Informatik", 101);
        Studierender studierender = new Studierender("Max Mustermann", "UXD", 123456);

        // Lehrveranstaltung erstellen
        Lehrveranstaltung lehrveranstaltung = new Lehrveranstaltung();
        lehrveranstaltung.Titel = "Einführung in die Softwareentwicklung 2";
        lehrveranstaltung.Dozierende = new String[] { "Simon Nestler" };
        lehrveranstaltung.Studierende = new String[] { "Max Mustermann" };
        lehrveranstaltung.hinzufuegenStunden();

        // Lehrveranstaltungsdetails anzeigen
        lehrveranstaltung.anzeigenVeranstaltungDetails();
        System.out.println("");
        // Feedback vom Studierenden einholen
        System.out.println("Bitte geben Sie Ihr Feedback zur Veranstaltung ein: ");
        String feedback = Input.readString();
        dozierender.FeedbackErhalten(feedback);
        System.out.println("");

        // Aufgaben für eine Praktikumsstunde einlesen
        Praktikumsstunde praktikum = new Praktikumsstunde();
        praktikum.setDetails("Praktikum Softwareentwicklung 2", 9, "Raum C303", "11.04.2025");
        praktikum.aufgabenEinlesen();
        System.out.println("");
        System.out.println("Aufgaben für die Praktikumsstunde:");
        praktikum.getDetails();
        System.out.println("");

        // Studierender stellt eine Frage
        String frage = studierender.frageStellen();
        dozierender.frageBeantworten(frage);

        



        

        // Sprechstundenanfrage vom Studierenden
        String sprechstunde = studierender.SprechstundenAnfrage();
        System.out.println("Sprechstundenanfrage erhalten: " + sprechstunde);

        
    }
}
