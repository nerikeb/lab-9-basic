import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoteManager {
    Scanner scanner = new Scanner(System.in);
    List<Note> notes = new ArrayList<>();
    void addNote() {
        System.out.println("Enter note id:");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline left-over
        System.out.println("Enter note title:");
        String title = scanner.nextLine();
        System.out.println("Enter note content:");
        String content = scanner.nextLine();
        notes.add(new Note(id, title, content));
    }

    void viewNotes() {
        for (Note note : notes) {
            System.out.println(note);
        }
    }

    void deleteNote() {
        System.out.println("Enter note id to delete:");
        int id = scanner.nextInt();
        notes.removeIf(note -> note.getId() == id);
    }
}
