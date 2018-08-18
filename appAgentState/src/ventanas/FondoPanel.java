package ventanas;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class FondoPanel extends JPanel {

	ImageIcon imagen;
	String nombre;
	
	public FondoPanel(String nombre) {
		
		this.nombre = nombre;
				
	}

	public void paint(Graphics g) {
		
		Dimension tamanio=getSize();
		
		imagen=new ImageIcon(getClass().getResource(nombre));
		g.drawImage(imagen.getImage(), 0,0, tamanio.width, tamanio.height, null);
		setOpaque(false);
		super.paint(g);
	}
	
}
