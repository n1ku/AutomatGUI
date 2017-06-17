/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author n1k
 */
public class Datum 
{
    private int tag;
    private int monat;
    private int jahr;
    private DateFormat dfd = new SimpleDateFormat("dd");
    private DateFormat dfm = new SimpleDateFormat("MM");
    private DateFormat dfy = new SimpleDateFormat("yyyy");
    
    public Datum()
    {
        Date d = new Date();
        this.tag = Integer.parseInt(dfd.format(d));
        this.monat = Integer.parseInt(dfm.format(d));
        this.jahr = Integer.parseInt(dfy.format(d));
    }
    
    public Datum(int tag, int monat, int jahr)
    {
        this.tag = tag;
        this.monat = monat;
        this.jahr = jahr;
    }
    
    public int gibTag()
    {
        return this.tag;
    }
    
    public int gibMonat()
    {
        return this.monat;
    }
    
    public int gibJahr()
    {
        return this.jahr;
    }
    
    public String gibDatumAlsString()
    {
        String d = this.tag + "." + this.monat + "." + this.jahr;
        return d;
    }    
}
