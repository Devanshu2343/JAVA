import java.util.*;

  class Program1 {
    public static void main(String[] args) {

        try  {
            System.out.println("Before Sleep..");
            Thread.sleep(2000);
            
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        finally{
            System.out.println("After Sleep");
        }
        
    }
    

     
}
