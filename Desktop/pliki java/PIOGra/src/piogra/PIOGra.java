
package piogra;

import piogra.players.PlayerHuman;
import piogra.players.PlayerComp;
import piogra.players.Player;
import java.util.Random;


public class PIOGra {

    public static void main(String[] args) { 
        
        Player player = new PlayerComp();
        Random r = new Random();
        player.setName("Janek");
        player.setName(null);
        while(true){
            int randomInt1 = r.nextInt(6)+1;
            int randomInt2 = player.guess();             
            if(randomInt1 == randomInt2){
                System.out.println(player.getName()+" wygrał, wylosowana liczba to "+randomInt1);
                break; 
            } else {
                System.out.println(player.getName() + " wylosował zła liczbę, poprawna to :"
                        +randomInt1+" a "+player.getName()+" wylosował : "+randomInt2);
            }            
            
        }
    }
}
