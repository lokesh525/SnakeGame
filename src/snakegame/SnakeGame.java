
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
//* and open the template in the editor.
 
//package snakegame;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Lokesh Chandra
 */
class SnakeGame {

    /**
     * @param args the command line arguments
     */
    JFrame jf;

    SnakeGame(){
        jf = new JFrame();
        jf.setBounds(0,0,900,700);
        jf.setBackground(Color.yellow);
        jf.setResizable(false);
        jf.setVisible(true);
		jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new SnakeGame();
    }
    
}
