import java.util.Scanner;

public class LeituraGertrudes  { 
    public static void main (String [] args){
        Scanner scan = new Scanner (System.in);
        
        int paginas;
        paginas = scan.nextInt();

        int porDia = 3;

        paginas /= porDia;

        System.out.print(paginas+" dias");

    }
}