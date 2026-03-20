package src;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelJuego extends JPanel {

    public PanelJuego(){
        setPreferredSize(new Dimension(640, 320));
        setBackground(Color.BLACK);
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.setColor(Color.WHITE);

        // Texto original
        g.drawString("Base grafica del juego lista", 20, 20);

        // Datos solicitados
        g.drawString("Nombre Alumno: Juan Perez Lopez", 20, 50);
        g.drawString("Grupo: 25A", 20, 70);
        g.drawString("Turno: Matutino", 20, 90);
        g.drawString("Año de ejecucion: 2026", 20, 110);
    }
}