/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lumactud.lab.activity.pkg23;

/**
 *
 * @author User
 */
public class PrintTextEditor extends TextEditor {
   
    public PrintTextEditor(String Text) {
        super(Text);
    }
    
    public void print(){
        System.out.println(getText());
    }
    
}
