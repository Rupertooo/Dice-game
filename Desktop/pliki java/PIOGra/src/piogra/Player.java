
package piogra;

import java.util.Random;

public class Player {
    public Player(){    
    }
    
    public int guess()
    {
        Random r = new Random();
        return(r.nextInt(6)+1);
    }
    
}
