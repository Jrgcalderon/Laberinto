
package com.mycompany.laberinto;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Jrg
 */
public class Juego extends JPanel{
    
    Laberinto laberinto=new Laberinto();
    Personaje personaje=new Personaje();
    
    public Juego()
    {
        addKeyListener(new KeyListener(){
            
        @Override
        public void keyTyped(KeyEvent e)
                {
                    //throw new UnsupportedOperationException("Not supporte yet.");
                }
        
        @Override
        public void keyPressed(KeyEvent e)
                {
                    //throw new UnsupportedOperationException("Not supporte yet.");
                    personaje.teclaPresionda(e);
                }
        
        @Override
        public void keyReleased(KeyEvent e)
                {
                    //throw new UnsupportedOperationException("Not supporte yet.");
                }
        });
        setFocusable(true);
    }
    
    @Override
    public void paint(Graphics grafico)
    {
        laberinto.paint(grafico);
        personaje.paint(grafico);
    }
    public static void main(String[] args)
    {
        JFrame miventana = new JFrame("Mi Primer Laberinto");
        Juego game= new Juego();
        miventana.add(game);
        
        miventana.setSize(920,540);
        miventana.setLocation(300,200);
        miventana.setVisible(true);
        
        miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        while(true)
        {
            game.repaint();
        }
        
    }
    
}
