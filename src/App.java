public class App {
    public static void main(String[] args) throws Exception {
<<<<<<< HEAD
        Dozierender dozierender = new Dozierender("Simon Nestler", "Informatik", 101);
        Studierender studierender = new Studierender("Max Mustermann", "Informatik", 123456);
        
        String frage = studierender.frageStellen();
        dozierender.frageBeantworten(frage);
        System.out.println("Bitte geben Sie Ihr Feedback ein: ");
        String feedback = Input.readString();
        dozierender.FeedbackErhalten(feedback);
=======
        // Dozierender und Studierender erstellen
        Dozierender dozierender = new Dozierender("Simon Nestler", "Informatik", 101);
        Studierender studierender = new Studierender("Max Mustermann", "Informatik", 123456);

        // Lehrveranstaltung erstellen
        Lehrveranstaltung lehrveranstaltung = new Lehrveranstaltung();
        lehrveranstaltung.Titel = "Software Engineering Praktikum";
        lehrveranstaltung.Dozierende = new String[] { "Simon Nestler" };
        lehrveranstaltung.Studierende = new String[] { "Max Mustermann" };
        lehrveranstaltung.hinzufuegenStunden();

        // Lehrveranstaltungsdetails anzeigen
        lehrveranstaltung.anzeigenVeranstaltungDetails();

        // Studierender stellt eine Frage
        String frage = studierender.frageStellen();
        dozierender.frageBeantworten(frage);

        // Feedback vom Studierenden einholen
        System.out.println("Bitte geben Sie Ihr Feedback zur Veranstaltung ein: ");
        String feedback = Input.readString();
        dozierender.FeedbackErhalten(feedback);

        // Sprechstundenanfrage vom Studierenden
        String sprechstunde = studierender.SprechstundenAnfrage();
        System.out.println("Sprechstundenanfrage erhalten: " + sprechstunde);

        // Aufgaben für eine Praktikumsstunde einlesen
        Praktikumsstunde praktikum = new Praktikumsstunde();
        praktikum.setDetails("Objektorientierte Programmierung", 10, "Raum 101", "01.04.2025");
        praktikum.aufgabenEinlesen();
        praktikum.getDetails();
>>>>>>> a49f6328100c26d15a0ae9c3de1a4bc79eea84a2
    }
}
