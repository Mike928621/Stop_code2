import java.util.Scanner;
import java.util.InputMismatchException;
public class Autovettura extends Veicolo {
    private byte numeroPosti;
    private byte numeroPorte;

    public Autovettura(){}

    public Autovettura(String marca, String modello, String numeroTarga, float tariffaGiornalieraEuro, byte numeroPosti, byte numeroPorte){
        super(marca, modello, numeroTarga, tariffaGiornalieraEuro);
        this.numeroPosti = numeroPosti;
        this.numeroPorte = numeroPorte;
    }
    //end costruttori


    public short getNumeroPosti() {
        return numeroPosti;
    }

    public short getNumeroPorte() {
        return numeroPorte;
    }


    public void setNumeroPosti(byte numeroPosti) {
        this.numeroPosti = numeroPosti;
    }

    public void setNumeroPorte(byte numeroPorte) {
        this.numeroPorte = numeroPorte;
    }

    public Autovettura registraAutovettura(){
        Scanner input = new Scanner(System.in);
        while (true){
            try{
                leggiDati(input);
                System.out.println("Scrivi il numero di posti dell'auto: ");
                this.numeroPosti = input.nextByte();
                System.out.println("Scrivi il numero di porte dell'auto:");
                this.numeroPorte = input.nextByte();
                break;
            }catch(InputMismatchException ie){
                ie.printStackTrace();
                System.out.println("Inserire un valore appropriato");
            }
        }
        input.close();

        Autovettura a = new Autovettura(getMarca(), getModello(), getNumeroTarga(), getTariffaGionralieraEuro(), this.numeroPosti, this.numeroPorte);

        return a;
    }//end registraAutovettura

    @Override
    public String toString(){
        return "Marca: " + getMarca() + "\n" + "Modello: " + getModello() + "\n" + "Targa: " + getNumeroTarga() + "\n" + "Tariffa giornaliera: " + getTariffaGionralieraEuro() + "\n" + "Numero di porte: " + this.numeroPorte + "\n" + "Numero di posti: " + this.numeroPosti;
    }

}
