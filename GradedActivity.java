public class GradedActivity{

   private int score; //numeric score
   
   /**
      the setScore method sets the score field.
      @param s The value to score in score.
   */
   
   public void setScore(int s){
   
      score = s;
   
   
   }
   /**
      The getScore method returns the score.
      @return The value stored in the score field.
   */
   
   public int getScore(){
   
      return score;
   
   }
   
   public char getGrade(){
   
      char letterGrade;
      
      if (score >= 90)
         letterGrade = 'A';
      else if (score >= 80)
         letterGrade = 'B';
      else if (score >= 70)
         letterGrade = 'C';
      else if (score >= 60)
         letterGrade = 'D';
      else       
         letterGrade = 'F';
         
      return letterGrade;
        
   }

}