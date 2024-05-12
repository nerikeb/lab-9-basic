import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //option to add own data
        NoteManager note = new NoteManager();

        System.out.println("Choose an option:");
        System.out.println("1. Add a new note");
        System.out.println("2. View all notes");
        System.out.println("3. Delete a note");
        System.out.println("4. Exit");


        while (true) {
            String option = sc.nextLine();
            switch (option) {
                case "1" -> note.addNote();
                case "2" -> note.viewNotes();
                case "3" -> note.deleteNote();
                case "4" -> {
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }

    }
}