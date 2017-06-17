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
public class Produkt 
{
    private String bezeichnung;
    private String valuta;
    private String mengenBezeichnung;
    private double preis;
    private double fillMenge;
    private Datum ablaufdatum;
    
    /**
     * Bitte geben Sie folgende Produktinformationen an:
     * @param bez 
     * @param pre 
     * @param wae 
     * @param fill 
     * @param meng 
     * @param ab 
     */
    public Produkt(String bez, double pre, String wae, double fill, String meng, Datum ab)
    {
        this.bezeichnung = bez;
        this.valuta = wae;
        this.mengenBezeichnung = meng;
        this.preis = pre;
        this.fillMenge = fill;
        this.ablaufdatum = ab;
    }
    
    public Produkt()
    {
        this.bezeichnung = "Cola";
        this.preis = 2.5;
        this.valuta = "Fr.";
        this.mengenBezeichnung = "Stk.";
        this.fillMenge = 10;
        this.ablaufdatum = new Datum();
    }
    
    public String gibBezeichnung()
    {
        return this.bezeichnung;
    }
    
    public double gibPreis()
    {
        return this.preis;
    }
    
    public String gibWaehrung()
    {
        return this.valuta;
    }
    
    public String gibMengenBezeichnung()
    {
        return this.mengenBezeichnung;
    }
    
    public Datum gibAblaufdatum()
    {
        return this.ablaufdatum;
    }
    
    public void setzePreis(double pr)
    {
        this.preis = pr;
    }
    
    public double gibFuellmenge()
    {
        return this.fillMenge;
    }
}
