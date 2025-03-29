public class Lehrveranstaltung {
    String Titel;
    String[] Dozierende;
    String[] Studierende;
    int Vorlesungsstunden;
    int Praktikumsstunden;

    public void hinzufuegenEntfernenStudierende(){
        Studierende = new String[Studierende.length + 1];
        System.out.println("Bitte geben Sie den Namen des Studierenden ein: ");
        String name = Input.readString();
        Studierende[Studierende.length - 1] = name;
        System.out.println("Studierender " + name + " wurde hinzugefügt.");
        System.out.println("Bitte geben Sie den Namen des Studierenden ein, den Sie entfernen möchten: ");
        String name2 = Input.readString();
        for (int i = 0; i < Studierende.length; i++) {
            if (Studierende[i].equals(name2)) {
                Studierende[i] = null;
                System.out.println("Studierender " + name2 + " wurde entfernt.");
                break;
            }
        }
        System.out.println("Studierender " + name2 + " wurde nicht gefunden.");
    }

    public void hinzufuegenStunden(){
        System.out.println("Bitte geben Sie die Anzahl der Vorlesungsstunden ein: ");
        Vorlesungsstunden = Input.readInt();
        System.out.println("Bitte geben Sie die Anzahl der Praktikumsstunden ein: ");
        Praktikumsstunden = Input.readInt();
        System.out.println("Vorlesungsstunden: " + Vorlesungsstunden);
        System.out.println("Praktikumsstunden: " + Praktikumsstunden);
    }

    public void anzeigenVeranstaltungDetails(){
        System.out.println("Titel der Veranstaltung: " + Titel);
        System.out.print("Dozierende: ");
        for (String dozierender : Dozierende) {
            System.out.println(dozierender);
        }
        System.out.print("Studierende: ");
        for (String studierender : Studierende) {
            System.out.println(studierender);
        }
        System.out.println("Vorlesungsstunden: " + Vorlesungsstunden);
        System.out.println("Praktikumsstunden: " + Praktikumsstunden);
    }

}
