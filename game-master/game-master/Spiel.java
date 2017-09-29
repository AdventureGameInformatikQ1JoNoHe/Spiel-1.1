
import java.util.Scanner;
public class Spiel
{   
    private Scanner console = new Scanner(System.in);

    private String Klasse;
    private String Input;
    private String Name;
    private Magier Magier=new Magier();
    private Schütze Schütze=new Schütze();
    private Assassine Assasine=new Assassine();
    private Kämpfer Kämpfer=new Kämpfer();
    private Welt map=new Welt();
    private Gegendstand[][] Welt=new Gegendstand[56][37];
    private Parser parser;
    int Koordia;
    int Koordib;
    int z;
    Mensch Mensch=new Mensch();
    String f;
    public Spiel()
    {
        parser = new Parser();

        Spielen();
    }

    public void Spielen(){
        map.Erstellemap();
        Wählen();
        getName();

        
    
    }

    public void Wählen(){
        System.out.println("Hey willkommen bei unserem AdventureGame");
        System.out.println("Welcher Charakterklasse möchtest du beitreten? Magier,Assassine, Kämpfer oder Schütze?");
        Klasse= console.next();
        System.out.println("Du bist nun ein "+Klasse+ " Los gehts!");
        switch(Klasse){
        case"Magier":  
            Gegendstand Ü=Magier.sagItem();
            System.out.println("Du besitzt einen Zauberstab"+ Ü);
            break;
        case"Kämpfer":  
       Gegendstand Q=Kämpfer.sagItem();
        System.out.println("Du besitzt ein "+ Q);    
         break;
          case"Assasine": Gegendstand L=Kämpfer.sagItem();
        System.out.println("Du besitzt ein "+ L);
          break; 
            case"Schütze":Gegendstand B=Schütze.sagItem();
        System.out.println("Du besitzt ein "+ B);
          break;  
            
            
            
            
            
        }

        
        
    
    }

    public void getName(){

        String Frage;
        System.out.println("Wie ist dein Name?");
        Name= console.next();
        System.out.println("Du bist also "+ Klasse +" "+ Name+"?");Frage= console.next();
        if(Frage.equalsIgnoreCase("Ja")){

            
            game1();

        }

    }

    public void  game1(){

        while (Koordia!=37 || Koordib!=38) {
            System.out.println("Was willst du machen?");
            Command command = parser.getCommand();
            action(command);
        }

        
        
        
        
        
        
        
        
        
    }     

    private boolean action(Command command) 
    {
        boolean wantToQuit = false;
        if(command.isUnknown()) {
            System.out.println("Wiederhole die Aktion bitte!");

        }
        
            String commandWord = command.getCommandWord();
        System.out.println(Welt[Koordia][Koordib]);
        
        switch  (commandWord) {
            case "hilfe": 
            
            System.out.println("Nutze die Befehle:");
            System.out.println("'gehe osten'");
            System.out.println("'gehe norden'");              
            System.out.println("'gehe westen'");
            System.out.println("Oder 'gehe süden', um dich fortzubewegen");
            break;
            case "gehe":
                  String direction = command.getSecondWord();
                  if ("norden".equalsIgnoreCase(direction)) {
                      geheN(command);
                  }
                   if ("osten".equalsIgnoreCase(direction)) {
                      geheO(command);
                  }
                   if ("westen".equalsIgnoreCase(direction)) {
                      geheW(command);
                  }
                   if ("süden".equalsIgnoreCase(direction)) {
                      geheS(command);
                  }
                  break;
                   
            
            
        }
        Check();
        return wantToQuit;
    }     
    private void nehme(int b,Gegendstand n){
        
        Mensch.nehme(b,n);
        
    }
    private void Check(){
       if(map.aufhebbar(Koordia,Koordib)==true){
        
           System.out.println("Du kannst hier etwas aufheben.");
           System.out.println("Möchtest du "+map.getName(Koordia,Koordib)+ "aufheben ?");
            String Wahl=console.next();
            switch(Wahl){
                case "Ja":System.out.println("In welches Fach möchtest du +map.getName(Koordia,Koordib)+ packen?");   
                int Fach;
                Fach=console.nextInt();
                
                
                
                
                nehme(Fach,Welt[Koordia][Koordib]);
                break;
                case "Nein":System.out.println("Okay");
                break;
           
                
           
           
        }}
      else{System.out.println("Es befindet sich kein Gegenstand auf dem Feld");}  
        
        
        
        
        
        
        
    }
    
       private void geheN(Command command){

            Koordia=Koordia-1;
            System.out.println("Du bist bei "+Koordia+" " + Koordib);

        
        
    
            }
        
        private void geheO(Command command){

            Koordib=Koordib+1;
            System.out.println("Du bist bei "+Koordia+" " + Koordib);

        
        
    
            }  
        
            private void geheS(Command command){

                Koordia=Koordia+1;
                System.out.println("Du bist bei "+Koordia+" " + Koordib);

        
        
    
            }  
            private void geheW(Command command){

            Koordib=Koordib-1;
            System.out.println("Du bist bei "+Koordia+" " + Koordib);

        
        
    
            }  
        
        
        
        
        }
  
    

