public class KREIS  
{
    int x;
    int y;
    int r;// r=radius des kreises 
    int fuellfarbe;
    

 
    public KREIS(int xNew, int yNew, int rNew,int fuellfarbeNew)
 {
     int x = yNew;
     int y = yNew;
     int r = rNew;
     int fuellfarbe=fuellfarbeNew;
    
    }
    
    public void zeichnen()
    {
        ZEICHENFENSTER.gibFenster().fuelleKreis(x, y, r, fuellfarbe);
    }
    
    public void farbeaendern(int farbe)
    {
        
        
    }
}