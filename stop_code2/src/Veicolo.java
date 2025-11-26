import java.util.InputMismatchException;
import java.util.Scanner;

public  abstract class Veicolo {
    private String marca;
    private String modello;
    private String numeroTarga;
    private float tariffaGiornalieraEuro;

    public Veicolo(String marca, String modello, String numeroTarga, float tariffaGiornalieraEuro){
        this.marca = marca;
        this.modello = modello;
        this.numeroTarga = numeroTarga;
        this.tariffaGiornalieraEuro = tariffaGiornalieraEuro;
    }
    public Veicolo(){}//end costruttore


    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModello(String modello){
        this.modello = modello;
    }
    public void setNumeroTarga(String numeroTarga){
        this.numeroTarga = numeroTarga;
    }
    public void setTariffaGionralieraEuro(short tariffaGionralieraEuro){
        this.tariffaGiornalieraEuro = tariffaGionralieraEuro;
    }
    //end metodi set


    public String getMarca(){
        return this.marca;
    }
    public String getModello(){
        return this.modello;
    }
    public String getNumeroTarga(){
        return this.numeroTarga;
    }
    public float getTariffaGionralieraEuro(){
        return this.tariffaGiornalieraEuro;
    }
    //end metodi get



    public void leggiDati(Scanner input) throws InputMismatchException {
        System.out.println("Scrivi la marca del veicolo: ");
        this.marca = input.nextLine();
        System.out.println("Scrivi il modello del veicolo: ");
        this.modello = input.nextLine();
        System.out.println("Scrivi il numero di targa del veicolo");
        this.numeroTarga = input.nextLine();
        System.out.println("Scrivi la tariffa orario per il noleggio del veicolo: ");
        this.tariffaGiornalieraEuro = input.nextShort();
    }
}
