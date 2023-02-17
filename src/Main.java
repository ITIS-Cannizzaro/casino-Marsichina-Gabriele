import java.util.Random;
import java.util.Scanner;

public class Main {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  Scanner in=new Scanner(System.in);
  Random r=new Random();
  contoGiocatore giocatore=new contoGiocatore(1000);
  contoCasinò casinò=new contoCasinò(100000);
  boolean verifica=true;
  while (verifica){
   System.out.println("inserisci numero");
   int n=in.nextInt();
   if(n>0 && n<7) {
    System.out.println("inserisci somma");
    System.out.println("credito residuo"+ giocatore.getContoGiocatore());
    double somma=in.nextDouble();
    if(somma<=giocatore.getContoGiocatore() && somma<= casinò.getContoCasinò()/5) {
     int dado= r.nextInt(6)+1;
     System.out.println("risultato:"+ dado);
     if(dado==n) {
     System.out.println("hai vinto"); 
     giocatore.addSomma(somma);
     casinò.sottraiConto(somma);
     }
     else {
      System.out.println("hai perso"); 
      casinò.addConto(somma);
      giocatore.sottraiConto(somma);
      }
    }else {
     System.out.println("importo non valido");
    }
    System.out.println("credito residuo"+ giocatore.getContoGiocatore());
    if(giocatore.getContoGiocatore() >0) {
     System.out.println("vuoi continuare?");
     String risposta=in.next();
     if(!risposta.equals("sÃ¬")) {
      verifica=false;
     }
    }else {
     System.out.println("conto esaurito");
     verifica=false;
    }
   }
   else {verifica=false;}
  }
  
 }

}
//classe main
