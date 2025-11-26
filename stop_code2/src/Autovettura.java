import java.util.Scanner;
import java.util.InputMismatchException;
public class Autovettura extends Veicolo {
    private short numeroPosti;
    private short numeroPorte;

    public Autovettura(){}

    public Autovettura(String marca, String modello, String numeroTarga, short tariffaGiornalieraEuro, short numeroPosti, short numeroPorte){
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


    public void setNumeroPosti(short numeroPosti) {
        this.numeroPosti = numeroPosti;
    }

    public void setNumeroPorte(short numeroPorte) {
        this.numeroPorte = numeroPorte;
    }

    public Autovettura registraAutovettura(){
        while (true){
            try{
                Scanner input = new Scanner(System.in);
                leggiDati(input);
                System.out.println("Scrivi il numero di posti dell'auto: ");
                this.numeroPosti = input.nextShort();
                System.out.println("Scrivi il numero di porte dell'auto:");
                this.numeroPorte = input.nextShort();
                break;
            }catch(InputMismatchException ie){
                ie.printStackTrace();
                System.out.println("Inserire un valore appropriato");
            }
        }



        Autovettura a = new Autovettura(getMarca(), getModello(), getNumeroTarga(), getTariffaGionralieraEuro(), this.numeroPosti, this.numeroPorte);

        return a;
    }

    @Override
    public String toString(){
        return "Marca: " + getMarca() + "\n" + "Modello: " + getModello() + "\n" + "Targa: " + getNumeroTarga() + "\n" + "Tariffa giornaliera: " + getTariffaGionralieraEuro() + "\n" + "Numero di porte: " + this.numeroPorte + "\n" + "Numero di posti: " + this.numeroPosti;
    }

}
