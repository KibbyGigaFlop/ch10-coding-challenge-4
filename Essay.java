import javax.swing.JOptionPane;

public class Essay extends GradedActivity{
  
  //global variables
   public static Essay finalScore = new Essay();
   public static int grammarScore;
   public static int contentScore;
   public static int spellingScore;
   public static int correctLengthScore;

   public static void main(String args[] ){

       //asks for student's name
       String studentName = JOptionPane.showInputDialog("Enter the student's name.");
   
      //GRAMMAR INPUT 
      do{
      
      String grammarInput = JOptionPane.showInputDialog("Enter score for grammar (out of 30 points.)");
      grammarScore = Integer.parseInt(grammarInput);

      if (grammarScore > 30 || grammarScore < 0)
        JOptionPane.showMessageDialog(null, "Invalid entry. Please enter in a number between 0 and 30.");
      
      }while(grammarScore > 30 || grammarScore < 0);
      
      //SPELLING INPUT
      do{
      
      String spellingInput = JOptionPane.showInputDialog("Enter score for spelling (out of 20 points.)");
      spellingScore = Integer.parseInt(spellingInput);

      if (spellingScore > 20 || spellingScore < 0)
         JOptionPane.showMessageDialog(null, "Invalid entry. Please enter in a number between 0 and 20.");
      
      }while(spellingScore > 20 || spellingScore < 0);
      
      //CORRECTLENGTH INPUT
      do{
      
      String correctLengthInput = JOptionPane.showInputDialog("Enter score for correct length (out of 20 points.)");
      correctLengthScore = Integer.parseInt(correctLengthInput);

      if (correctLengthScore > 20 || correctLengthScore < 0)
            JOptionPane.showMessageDialog(null, "Invalid entry. Please enter in a number between 0 and 20.");
      
      }while(correctLengthScore > 20 || correctLengthScore < 0);
      
      //CONTENT INPUT
      do{
      
      String contentInput = JOptionPane.showInputDialog("Enter score for content (out of 30 points.)");
      contentScore = Integer.parseInt(contentInput);

      if (contentScore > 30 || contentScore < 0)
               JOptionPane.showMessageDialog(null, "Invalid entry. Please enter in a number between 0 and 30.");
      
      }while(contentScore > 30 || contentScore < 0);
      
      
      int scoreTotal = spellingScore + contentScore + correctLengthScore + grammarScore; 
      
      finalScore.setScore(scoreTotal);
      
      JOptionPane.showMessageDialog(null, studentName + "'s final score for the essay" + 
      " was " + finalScore.getScore() + "." + " They earned a(n) " + finalScore.getGrade());
      
      JOptionPane.showMessageDialog(null, "They scored these in the following categories: \n" + 
      "Grammar: " + grammarScore + "\n Spelling: " + spellingScore + "\n Correct Length: " + 
      correctLengthScore + "\n Content: " + contentScore);
   
   }

}