package com.heytorress;

import com.birdbrain.Finch;

public class BigBoss extends Finch {
    

    public void dance(){   
        //plays 
        for (int i = 0; i < 2; i++){
                setMove("F",50,50);
                setMove("B",50,50);
                setTurn("R",45,100);
                setMove("F",30,100);
                setMove("B",30,100);
                setTurn("L",45,100);
                setTurn("L",45,100);
                setMove("F",30,100);
                setMove("B",30,100);
                setTurn("R",415,100);

                }
            }

        //G G A B | B A G E
//G G A B | B A G E
//E E F# G | A G F# E
//E E F# G | A G F# E
        public void music(){
           //plays music 
            System.out.println("MUSIC IS RUNNING");
            playNote(67, 1);
            pause(1.1);
            //SAME NOTE :PAUSE"
            // playNote(65, 16);
            pause(0.5);
            playNote(67, 16);
            pause(1.1);
            playNote(69, 16);
            pause(1.1);
            playNote(71, 016);
            pause(1.1);
//"PAUSE"
            playNote(60, 16);
            pause(1.1);

            playNote(71, 016);
            pause(1.1);
            playNote(69, 016);
            pause(1.1);
            playNote(67, 016);
            pause(1.1);
            playNote(64, 016);
            pause(1.1);
//SECOND LINE SAME AS FIRST
            playNote(67, 16);
            pause(1.1);
            playNote(65, 0.2);
            pause(1.1);
            playNote(67, 016);
            pause(1.1);
            playNote(69, 016);
            pause(1.1);
            playNote(71, 016);
//"PAUSE"
            playNote(60, 016);
            pause(1.1);

            playNote(71, 016);
            pause(1.1);
            playNote(69, 016);
            pause(1.1);
            playNote(67, 016);
            pause(1.1);
            playNote(64, 016);
            pause(1.1);
//THIRD LINE DIFFRENT            
            playNote(64, 016);
            pause(1.1);
            playNote(64, 016);
            pause(1.1);
            playNote(66, 016);
            pause(1.1);
            playNote(67, 016);
            pause(1.1);
//"PAUSE"
            playNote(60, 016);
            pause(1.1);

            playNote(69, 016);
            pause(1.1);
            playNote(67, 016);
            pause(1.1);
            playNote(66, 016);
            pause(1.1);
            playNote(64, 016);
            pause(1.1);

            //FOURTH LINE DIFFRENT            
            playNote(64, 016);
            pause(1.1);
            playNote(64, 016);
            pause(1.1);
            playNote(66, 016);
            pause(1.1);
            playNote(67, 016);
            pause(1.1);
//"PAUSE"
            playNote(60, 016);
            pause(1.1);

            playNote(69, 016);
            pause(1.1);
            playNote(67, 016);
            pause(1.1);
            playNote(66, 016);
            pause(1.1);
            playNote(64, 1.1);
            pause(1.1);


            }
}
