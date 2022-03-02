package teste;
import exemploswitch.Exemploswitch;
import java.util.Scanner;

 public class teste {
     public static void main(String[] args) {
         Scanner ler= new Scanner(System.in);
         Exemploswitch p1=new Exemploswitch();
         System.out.println("Digite o nº da estação: ");
         System.out.println(" 1 - Verão.");
         System.out.println(" 2 - Outono.");
         System.out.println(" 3 - Inverno.");
         System.out.println(" 4 - Primavera.");
         System.out.print(" => ");
         p1.setOpcao(ler.nextInt());
         System.out.println(p1);
     }
 
}
