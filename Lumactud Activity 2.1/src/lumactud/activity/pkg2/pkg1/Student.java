
package lumactud.activity.pkg2.pkg1;


public class Student {
    
    private String firstName;
    private String lastName;
    private int age;
    private boolean isMinor;
    
    public Student (String firstName, String lastName, int age){
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        
            if (this.age < 18){
                
                isMinor = true;
                IncreaseAge();
            } else {
                isMinor= false;
            }
            
   
    }
           public String getName(){
               return lastName + ", " + firstName;
    }
         public void IncreaseAge(){
             age++;
             
             if (age >= 18){
                 isMinor = false;
                 
             }
                     
         }
         
   
         public String toString(){
             String adultCheck;
             
             if(isMinor == true) {
                 adultCheck = "Minor";
             } else {
                 adultCheck = "Adult";
             }
            String result = getName() + " - " + Integer.toString(age) + " - " + adultCheck;
            return result;
         } 
         
}
