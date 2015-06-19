/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Duan
 */
public class Score {
    String number;
    int chinese;
    int math;
    int english;
    int computer;
    int politics;

    Score(String number, int chinese, int math,
            int english, int computer, int politics) {
        this.chinese=chinese;
        this.computer=computer;
        this.math=math;
        this.english=english;
        this.politics=politics;
    }
    
}
