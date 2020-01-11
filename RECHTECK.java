public class RECHTECK  
{
    int posx;
    int posy;
    int hoehe;
    int laenge;
    String fuellfarbe;
 
    public RECHTECK(int lNeu, int hNeu, int xNeu, int yNeu,String fNeu)
 {
     laenge = lNeu;
     hoehe = hNeu;
     posx = xNeu;
     posy = yNeu;
     fuellfarbe = fNeu;
     //DIES IST EIN ROMAN , GESCHRIEBT VON MIR.
     //WAS ICH UNBEDINGT NUR SAGEN WOLLTE, IST DAS ES NICHTS BRINGEN TUT
     //ES HABE DAMIT NICHTS ZU TUN DOCH SAGE ICH DASS ICH TOLL BIN.
     // ICH BIN NICO UND ICH SAGE OFT DINGE DIE ICH DENKE
     //ICH WILL NUR DINGE TUN DIE ICH MIR VORNEHME
     // DIES WURDE TOLL GESCHRIBT
     //FEHLER 404 FILE NOT KOT
    }
    
    public void zeichnen()
    {
        ZEICHENFENSTER.gibFenster().fuelleRechteck(posx,posy,laenge,hoehe,fuellfarbe); 
    }
}
