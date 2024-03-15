
package lumactud.lab.activity.pkg23;
import java.util.Scanner;

public class LumactudLabActivity23 {

    
    public static void main(String[] args) {
         
     
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial text: ");
        String initialText = scanner.nextLine();
        System.out.print("Choose editor type (1 for Print, 2 for Advanced): ");
        int editorType = scanner.nextInt();
        TextEditor editor;

        if (editorType == 2) {
            editor = new AdvanceTextEditor(initialText);
        } else {
            editor = new PrintTextEditor(initialText);
        }

        Tester.test(editor);
    }
    }
    

