
package lumactud.lab.activity.pkg23;


public class AdvanceTextEditor extends TextEditor {

     public AdvanceTextEditor (String text){
        super(text);  
    }
    
    public void undo(){
        index--;
            setText(history[index]);
        

        }
    public void print(){
        System.out.println(getText());
    }
}
