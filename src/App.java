public class App {
    public static void main(String[] args) throws Exception {
        Dozierender dozierender = new Dozierender("Simon Nestler", "Informatik", 101);
        Studierender studierender = new Studierender("Max Mustermann", "Informatik", 123456);
        
        String frage = studierender.frageStellen();
        dozierender.frageBeantworten(frage);
        System.out.println("Bitte geben Sie Ihr Feedback ein: ");
        String feedback = Input.readString();
        dozierender.FeedbackErhalten(feedback);
    }
}
