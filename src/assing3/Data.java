package assing3;



public class Data {
    private /*@ spec_public @*/ int giorno;
    private /*@ spec_public @*/ int mese;
    private /*@ spec_public @*/ int anno;
    



    
    public Data(int giorno, int mese, int anno){
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno;
    }
    
    public /*@ pure @*/ int getYear(){
    	return this.anno; 
    }
    
    public /*@ pure @*/ int getMonth(){ 
    	return this.mese; 
    }
    
    public /*@ pure @*/ int getDay(){
    	return this.giorno; 
    }
    
    


    

    
    
}
