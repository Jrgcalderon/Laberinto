
package com.mycompany.laberinto;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

/**
 *
 * @author Jrg
 */
public class Personaje {
    
    Laberinto lab=new Laberinto();
    private int x=40;
    private int y=40;
    private final int ancho=40;
    private final int alto=40;
    private final int movimiento=40;
    
    
    public void paint(Graphics grafico)
    {
        grafico.setColor(Color.red);
        grafico.fillOval(x, y, ancho, alto);
        
        grafico.setColor(Color.black);
        grafico.drawOval(x, y, ancho, alto);
    }
    
    public void teclaPresionda(KeyEvent evento)
    {
        int [][]laberinto=lab.obtieneLaberinto();
        if(evento.getKeyCode()==37)//tecla izquierda
        {
            if(laberinto[y/40][(x/40)-1]!=1)
            {
               x=x-movimiento; 
            }
        }
        if(evento.getKeyCode()==39)//tecla derecha
        {
            if(laberinto[y/40][(x/40)+1]!=1)
            {
                x=x+movimiento;
            }
        }
        if(evento.getKeyCode()==40)//tecla abajo
        {
            if(laberinto[(y/40)+1][x/40]!=1)
            {
                y=y+movimiento;
            }
        }
        if(evento.getKeyCode()==38)//tecla ariba
        {   
            if(laberinto[(y/40)-1][x/40]!=1)
            {
               y=y-movimiento;
            }
        }
    }
}
