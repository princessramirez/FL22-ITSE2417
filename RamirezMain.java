// Dummy class for FinalProject
// Outputs a simple message when implementing begin()

public class RamirezMain implements FinalProject
{
    public RamirezMain()
    {

    }


    public void begin()
    {
        String word; 
    
        try
        {
            word = Itse2417Main.myScan.nextLine();
            do 
        {
            System.out.println("We are going to print your word vertically");
            System.out.print("Enter a word: ");
            word = Itse2417Main.myScan.nextLine();
        } 
        while(!(word.length() > 0)); 
        
        System.out.println();
        
        int i = 0;
        while(i < word.length()){       
        
            char index = word.charAt(i);
            System.out.println(index);
            i++;
        }
        
            java.util.concurrent.TimeUnit.SECONDS.sleep(2);  
        }
        catch(InterruptedException e)
        {}
    }
}