import java.util.Scanner;
import java.util.InputMismatchException;
public class Furgone extends Veicolo{
    private short portataKg;
    private float lunghezzaCm;
    private float larghezzaCm;
    private float altezzaCm;

    public Furgone(){}

    public Furgone(String marca, String modello, String numeroTarga, float tariffaGiornalieraEuro, short portataKg, float lunghezzaCm, float larghezzaCm, float altezzaCm){
        super(marca, modello, numeroTarga, tariffaGiornalieraEuro);
        this.portataKg = portataKg;
        this.lunghezzaCm = lunghezzaCm;
        this.larghezzaCm = larghezzaCm;
        this.altezzaCm = altezzaCm;
    };
    //end costruttori

    public short getPortataKg() {
        return portataKg;
    }

    public float getLunghezzaCm() {
        return lunghezzaCm;
    }

    public float getLarghezzaCm() {
        return larghezzaCm;
    }

    public float getAltezzaCm() {
        return altezzaCm;
    }
    //end metodi getter


    public void setPortataKg(short portataKg) {
        this.portataKg = portataKg;
    }

    public void setLunghezzaCm(float lunghezzaCm) {
        this.lunghezzaCm = lunghezzaCm;
    }

    public void setLarghezzaCm(float larghezzaCm) {
        this.larghezzaCm = larghezzaCm;
    }

    public void setAltezzaCm(float altezzaCm) {
        this.altezzaCm = altezzaCm;
    }
    //end metodi setter

    public Furgone registraFurgone(){
        Scanner input = new Scanner(System.in);
        while(true){
            try{
                leggiDati(input);
                System.out.println("Scrivi la portata in Kg: ");
                this.portataKg = input.nextShort();
                System.out.println("Scrivere lunghezza, larghezza, altezza in cm (separate da ','): ");
                String lunghezzaLarghezzaAltezza = input.nextLine();
                String array[] = lunghezzaLarghezzaAltezza.split(",");
                this.lunghezzaCm = Float.parseFloat(array[0]);
                this.larghezzaCm =Float.parseFloat(array[1]);
                this.altezzaCm = Float.parseFloat(array[2]);
                break;
            }catch(InputMismatchException ie){
                ie.printStackTrace();
                System.out.println("INSERIRE VALORI APPROPRIATI!!!");
            }catch (NumberFormatException ne){
                ne.printStackTrace();
                System.out.println("INSERIRE VALORI APPROPRIATI");
            }
        }//end while
        input.close();

        Furgone furgone = new Furgone(getMarca(), getModello(), getNumeroTarga(), getTariffaGionralieraEuro(), this.portataKg, this.lunghezzaCm, this.larghezzaCm, this.altezzaCm);

        return furgone;

    }//end registrFurgone
    @Override
    public String toString(){
        return "Marca: " + getMarca() + "\n" + "Modello: " + getModello() + "\n" + "Targa: " + getNumeroTarga() + "\n" + "Tariffa giornaliera: " + getTariffaGionralieraEuro() + "\n" + "Portata in Kg: " + this.portataKg + "\n" + "Lunghezza cm: " + this.lunghezzaCm + "\n" + "Larghezza cm: " + this.larghezzaCm + "\n" + "Altezza cm: " + this.altezzaCm;
    }
}
