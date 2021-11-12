package assing3;

import java.util.Calendar;


public class Elettore{

    private /*@ spec_public @*/ String nome;
    private /*@ spec_public @*/ String cognome;
    private /*@ spec_public @*/ Data dataNascita;
    private /*@ spec_public @*/ String luogoDiNascita;
    private /*@ spec_public @*/ String nazioneDiNascita;
    private /*@ spec_public @*/ String sesso;
    private /*@ spec_public @*/ String codiceFiscale;
    private /*@ spec_public @*/ Boolean voto;
    
    
    

    private /*@ spec_public @*/ int thisYear = Calendar.getInstance().get(Calendar.YEAR);
    private /*@ spec_public @*/ int thisMonth = Calendar.getInstance().get(Calendar.MONTH);
    private /*@ spec_public @*/ int thisDay = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
    

    /*@ requires (sesso == "femmina" || sesso == "maschio") && 
      @ 		 ((nazioneDiNascita == "Italia") ==> (luogoDiNascita != null)) &&
      @			 validDate(dataNascita);
      @ 	      
      @ 
      @*/
    public Elettore(/*@ non_null @*/String nome, /*@ non_null @*/String cognome, Data dataNascita, String luogoDiNascita,String nazioneDiNascita, String sesso, String codiceFiscale){
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.luogoDiNascita = luogoDiNascita;
        this.nazioneDiNascita = nazioneDiNascita; 
        this.sesso = sesso;
        this.codiceFiscale = codiceFiscale;
        voto = false;
    }
    
    
    /*@ requires (thisYear - dataNascita.getYear() >= 18) &&
      @ 		 (this.voto == false);
      */
     public void esprimi_voto(){
    	voto = true; 
    }
    
    
    
    /**
     * 
     * stabilisce se la data sia valida
     * una data per essere valida non deve essere successiva alla data corrente
     * 
     * @param d la data da confrontare
     * @return true se d è successiva alla data corrente, false altrimenti
     */
    public /*@ pure @*/ boolean validDate(Data d){
    	if(d.getYear() > thisYear) return false;
    
    	if(d.getYear() == thisYear){
    		if(d.getMonth() > thisMonth) return false; 
    		
    		if(d.getMonth() == thisMonth ){
    			if(d.getDay() > this.thisDay) return false;
    		}
    	}
    	
    	return true;
    }
    
    
    
    public boolean getVoto(){
    	return this.voto;
    }
    
    
    
    
    
    

    
    
    
    

}