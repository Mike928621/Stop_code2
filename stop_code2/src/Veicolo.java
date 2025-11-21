import java.util.Scanner;

public class Veicolo {
    private String marca;
    private String modello;
    private String numeroTarga;
    private short tariffaGionralieraEuro;

    public Veicolo(String marca, String modello, String numeroTarga, short tariffaGionralieraEuro){
        this.marca = marca;
        this.modello = modello;
        this.numeroTarga = numeroTarga;
        this.tariffaGionralieraEuro = tariffaGionralieraEuro;
    }

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
        this.tariffaGionralieraEuro = tariffaGionralieraEuro;
    }
    public String getMarca(){
        return this.marca;
    }
    public String getModello(){
        return this.modello;
    }
    public String getNumeroTarga(){
        return this.numeroTarga;
    }
    public short getTariffaGionralieraEuro(){
        return this.tariffaGionralieraEuro;
    }


    public Veicolo registraVeicolo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Scrivi la marca del veicolo: ");
        String marca = input.nextLine();
        System.out.println("Scrivi il modello del veicolo: ");
        String modello = input.nextLine();
        System.out.println("Scrivi il numero di targa del veicolo");
        String numeroTarga = input.nextLine();
        System.out.println("Scrivi la tariffa orario per il noleggio del veicolo: ");
        short tariffaGiornalieraEuro = input.nextShort();

        Veicolo veicolo = new Veicolo(marca, modello, numeroTarga, tariffaGiornalieraEuro);

        return veicolo;
    }
}
