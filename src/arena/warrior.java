
package arena;

/**
 *
 * @author Ahmet
 */
public class warrior {
    String name;
    int health=100;
    String equipment;
    
    void chooseEquipment (int y){
        switch (y){
            case 0:
                equipment = "Sword";
                break;
            case 1:
                equipment = "Shuriken";
                break;
            case 2:
                equipment = "Nunchaku";
                break;
            case 3:
                equipment = "Armor";
                break;
            case 4:
                equipment = "None";
}}
    void gethit (byte x, String wp){
        
        if (equipment =="Armor") {
            switch (wp){
        
case "Sword":
    if (x==1)
        System.out.println("Miss");
        
        else if (x>1 && x<9){
            health = health - ((x+2)-2);
            System.out.println("Dealed "+((x+2)-2)+" damage to opponent.");
           }
        else if (x>=9){
            health = health - ((x*2)+2);
            System.out.println("Critical! Dealed "+(((x*2)+2)-2)+" damage to opponent.");
        }
  break;
    case "Shuriken":
        if (x<= 3)
        System.out.println("Miss");
        
        else if (x>3 && x<10){
            health = health - ((x+3)-2) ;
            System.out.println("Dealed "+((x+3)-2)+" damage to opponent.");
           }
        else if (x == 10){
            health = health - ((x*2)+10);
            System.out.println("Critical! Dealed "+(((x*2)+10)-2)+" damage to opponent.");
        }
        break;
        
        case "Nunchaku":
        if (x==1)
        System.out.println("Miss");
        
        else if (x>2 && x<10){
            health = health - (x+1)-2 ;
            System.out.println("Dealed "+((x+1)-2)+" damage to opponent.");
           }
        else if (x == 10){
            health = health - ((x*2)+1);
            System.out.println("Critical! Dealed "+(((x*2)+1)-2)+" damage to opponent.");
        }
        break;
        
        case "None":
        if (x==1)
        System.out.println("Miss");
        
        else if (x>2 && x<10){
            health = health - (x-2) ;
            System.out.println("Dealed "+(x-1)+" damage to opponent.");
           }
        else if (x == 10){
            health = health - ((x*2)-2);
            System.out.println("Critical! Dealed "+((x*2)-2)+" damage to opponent.");
        }
        break;
            }}
        else 
switch (wp){
 
    case "Sword":
    if (x==1)
        System.out.println("Miss");
        
        else if (x>1 && x<9){
            health = health - (x+2);
            System.out.println("Dealed "+(x+2)+" damage to opponent.");
           }
        else if (x>=9){
            health = health - ((x*2)+2);
            System.out.println("Critical! Dealed "+((x*2)+2)+" damage to opponent.");
        }
  break;
    case "Shuriken":
        if (x<= 3)
        System.out.println("Miss");
        
        else if (x>3 && x<10){
            health = health - (x+3) ;
            System.out.println("Dealed "+(x+3)+" damage to opponent.");
           }
        else if (x == 10){
            health = health - ((x*2)+10);
            System.out.println("Critical! Dealed "+((x*2)+10)+" damage to opponent.");
        }
        break;
        
        case "Nunchaku":
        if (x==1)
        System.out.println("Miss");
        
        else if (x>2 && x<10){
            health = health - (x+1) ;
            System.out.println("Dealed "+(x+1)+" damage to opponent.");
           }
        else if (x == 10){
            health = health - ((x*2)+1);
            System.out.println("Critical! Dealed "+((x*2)+1)+" damage to opponent.");
        }
        break;
        
        case "None":
        if (x==1)
        System.out.println("Miss");
        
        else if (x>2 && x<10){
            health = health - x ;
            System.out.println("Dealed "+(x)+" damage to opponent.");
           }
        else if (x == 10){
            health = health - x*2;
            System.out.println("Critical! Dealed "+(x*2)+" damage to opponent.");
        }
        break;

        case "Armor":
        if (x==1)
        System.out.println("Miss");
        
        else if (x>2 && x<10){
            health = health - x ;
            System.out.println("Dealed "+(x)+" damage to opponent.");
           }
        else if (x == 10){
            health = health - x*2;
            System.out.println("Critical! Dealed "+(x*2)+" damage to opponent.");
        }
        break;
}}}
