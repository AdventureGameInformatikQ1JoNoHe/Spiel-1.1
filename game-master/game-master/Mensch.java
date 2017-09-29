
import java.util.Scanner;

public class Mensch
{
    
    public int Kraft;
    int Ausdauer;
    int Leben;
    int Intelligenz;
     Gegendstand[] Inventar=new  Gegendstand[30];
     Schlüssel Sclüssel=new Schlüssel();
    
    
    public Mensch(){
     Kraft=30;
   Ausdauer=10;
        Leben=100;
     Intelligenz=9;
    
    Inventar[0]=new Schlüssel();
    
    
    


    
    
}
public int gebLeben(){
        return Leben;
        
        
        
        
        
        
    }
      public int gebSchaden(){
        return Kraft;
        
        
        
        
        
        
    }
    public void Aua(int b){
        Leben=Leben-b;
    
    
    
    }
          public void nehme(int n,Gegendstand m){
        String l=m.getName();      
        Inventar[n]=m;
        System.out.println("du hast im "+n+" Slot einen "+l);
        
        
        
        
    }
     public Gegendstand sagItem(){
    
    return Inventar[0];
    
    
    }
}
