package arena;
import java.util.Random; import java.util.Scanner;
public class Arena {
     public static void main(String[] args) {
        Random r = new Random();
        Scanner input = new Scanner(System.in);
        warrior w1 = new warrior(); warrior w2 = new warrior();
        byte n ;
        
        System.out.println("Welcome to the arena! "+ "\nName your first warrior : ");
        w1.name = input.nextLine();
        System.out.println("Name your second warrior :");
        w2.name = input.nextLine();
          
n=(byte)r.nextInt(5);
w1.chooseEquipment(n);
        System.out.println(w1.name+" gets equipment : "+w1.equipment);
n=(byte)r.nextInt(5);
w2.chooseEquipment(n);
        System.out.println(w2.name+" gets equipment :"+w2.equipment);
    
    while (w1.health > 0 && w2.health > 0){
n = (byte)r.nextInt(11);
        System.out.println("\nIts "+ w1.name+"'s turn ");
w2.gethit(n,w1.equipment);
        
    if(w2.health >0){
try { Thread.sleep(1000); }
catch (Exception e) {}

n = (byte)r.nextInt(11);
            System.out.println("\nIts "+w2.name+"'s turn ");
w1.gethit(n,w2.equipment);}
            
        System.out.println("\n__________End of raund. Remaining healths : "
            +"\n"+w1.name+"'s healh: "+w1.health);
            System.out.println(w2.name+"'s health: "+w2.health+"\n__________");}
        
    if (w1.health >0)
            System.out.println(w1.name+" Won!");
    if (w2.health >0)
            System.out.println("\n"+w2.name+" Won!");
            }}