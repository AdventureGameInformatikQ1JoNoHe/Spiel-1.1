
/**
 * Beschreiben Sie hier die Klasse Magier.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Magier extends Mensch
{
        int Kraft=25;
    int Ausdauer=30;
      Gegendstand[] Inventar=new Gegendstand[30];
    int Intelligenz=90;
     Schlüssel Schlüssel=new Schlüssel();
    public Magier()
    { 
   
        Inventar[0]=Schlüssel;
       
    }
    
    }

