/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automat;

/**
 *
 * @author n1k
 */
public class Automat 
{
    private Produkt p1;
    private Produkt p2;
    private Produkt p3;
    private Produkt p4;
    private double bisherBezahlt;
    private double gesamtSumme;
    private int auswahl;
    
    private String txt1;
    private String txt2;
    private String txt3;
    private String txt4;
    
    public Automat(Produkt p1, Produkt p2, Produkt p3, Produkt p4)
    {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.bisherBezahlt = 0.00;
        this.gesamtSumme = 0.00;
        //ControlPanel tmp = new ControlPanel();
        //this.auswahl = tmp.gibAuswahl();
                
    }
    
    public Automat()
    {
        this.p1 = null;
        this.p2 = null;
        this.p3 = null;
        this.p4 = null;
        //ControlPanel tmp = new ControlPanel();
        //this.auswahl = tmp.gibAuswahl();
    }
    
    public double gibBisherBezahltenBetrag()
    {
        return this.bisherBezahlt;
    }
    
    public void geldEinwerfen(double g)
    {
        this.bisherBezahlt = g;
    }
    
    public void restGeldAusgeben()
    {
        this.bisherBezahlt = 0;
    }
    
    public void produktHinzufugen(Produkt p)
    {
        if(this.p1 == null) { this.p1 = p; }
        else if (this.p2 == null) { this.p2 = p; }
        else if (this.p3 == null) { this.p3 = p; }
        else if (this.p4 == null) { this.p4 = p; }
        else { System.console(); }        
    }
    
    public Produkt gibProdukt(int o)
    {
        switch (o)
        {
            case 1: return p1;
            case 2: return p2;
            case 3: return p3;
            case 4: return p4;
            default : System.out.println("Like magic, Sie haben eine Nummer gewählt die nicht auf dem Tastenfeld ist. Wählen Sie zwischen 1-4."); return null;
        }
    }
    
    public int gibBereitsAuswahlt()
    {
        return this.auswahl;
    }
    
    public void zeigeProduktinformationen()
    {
        if (this.p1 == null) { this.txt1 = "Fach 1 ist leider leer."; }
        else { this.txt1 = "Fach 1: " + this.p1.gibBezeichnung() + " | Preis: " + this.p1.gibPreis() + " " + this.p1.gibWaehrung() + " | Menge: " + this.p1.gibFuellmenge() + " " + this.p1.gibMengenBezeichnung(); }
        
        if (this.p2 == null) { this.txt2 = "Fach 2 ist leider leer."; }
        else { this.txt2 = "Fach 2: " + this.p2.gibBezeichnung() + " | Preis: " + this.p2.gibPreis() + " " + this.p2.gibWaehrung() + " | Menge: " + this.p2.gibFuellmenge() + " " + this.p2.gibMengenBezeichnung(); }
        
        if (this.p3 == null) { this.txt3 = "Fach 3 ist leider leer."; }
        else { this.txt3 = "Fach 3: " + this.p3.gibBezeichnung() + " | Preis: " + this.p3.gibPreis() + " " + this.p3.gibWaehrung() + " | Menge: " + this.p3.gibFuellmenge() + " " + this.p3.gibMengenBezeichnung(); }
        
        if (this.p4 == null) { this.txt4 = "Fach 4 ist leider leer."; }
        else { this.txt4 = "Fach 4: " + this.p4.gibBezeichnung() + " | Preis: " + this.p4.gibPreis() + " " + this.p4.gibWaehrung() + " | Menge: " + this.p4.gibFuellmenge() + " " + this.p4.gibMengenBezeichnung(); }
        
        System.out.println("##################################################");
        System.out.println(this.txt1);
        System.out.println("##################################################");
        System.out.println(this.txt2);
        System.out.println("##################################################");
        System.out.println(this.txt3);
        System.out.println("##################################################");
        System.out.println(this.txt4);
        System.out.println("##################################################");
    }
}
