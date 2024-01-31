import java.util.ArrayList;
import java.util.Collections;

/**
 * Write a description of class Simulation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Simulation {

    final static boolean DEBUGGING = false;
    
    
    public Simulation ( ) {
        this (200);
    }
    
    public Simulation (int gameCount) {

    ArrayList<Player> players = new ArrayList<Player>();
    Player p1 = new TitForTat( );
    Player p2 = new Player ( );
    Player p3 = new Competitor();
    Player p4 = new RandomChooser();
    Player p5 = new Unforgiving();

    players.add(p1);
    players.add(p2);
    players.add(p3);
    players.add(p4);
    players.add(p5);


    for (int x = 0; x < 500; x++) {
        for (int k=0; k<gameCount; k++) {

            Player subject1 = players.get((int)(Math.random()*players.size()));
            Player subject2 = players.get((int)(Math.random()*players.size()));
            boolean p1cooperated = subject1.cooperates();
            boolean p2cooperated = subject2.cooperates();

            if (p1cooperated) {
                if (p2cooperated) {
                    subject1.increaseScore (3);
                    subject2.increaseScore (3);
                } else {
                    subject1.increaseScore (0);
                    subject2.increaseScore (5);
                }
            } else {
                if (p2cooperated) {
                    subject1.increaseScore (5);
                    subject2.increaseScore (0);
                } else {
                    subject1.increaseScore (1) ;
                    subject2.increaseScore (1);
                }
            }
            if (DEBUGGING) {
                System.out.println ("p1 " + p1cooperated + ", p2 " + p2cooperated);
                System.out.println ("p1 score = " + subject1.score ( ) + ", p2 score = " + subject2.score ( ));
            }
    
            subject1.remember (p2cooperated);
            subject2.remember (p1cooperated);
        }
        
    }
    Collections.sort(players);
        System.out.println (players);

        
    }
    

}
