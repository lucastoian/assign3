package assign3;

public class Elettore{

    private String nome;
    private String cognome;
    private Data data;
    private String luogoDiNascita;
    private String sesso;
    private String codiceFiscale;
    private Boolean voto;

    public Elettore(String nome, String cognome, Data data, String luogoDiNascita, String sesso, String codiceFiscale){
        this.nome = nome;
        this.cognome = cognome;
        this.data = data;
        this.luogoDiNascita = luogoDiNascita;
        this.sesso = sesso;
        this.codiceFiscale = codiceFiscale;
        voto = false;
    }

}