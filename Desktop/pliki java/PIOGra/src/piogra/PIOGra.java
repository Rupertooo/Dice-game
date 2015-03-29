
package piogra;

import java.util.Random;

public class PIOGra {

    public static void main(String[] args) { 
        Player player = new Player();
        Random r = new Random();
        while(true){
            int randomInt1 = r.nextInt(6)+1;
            int randomInt2 = player.guess();            
            if(randomInt1 == randomInt2){
                System.out.println("Gracz wygrał, wylosowana liczba to "+randomInt1);
                break;
            } else {
                System.out.println("Gracz wylosował zła liczbę, poprawna to :"
                        +randomInt1+" a gracz wylosował :"+randomInt2);
            }            
            
        }
    }
}
