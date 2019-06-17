
package clases;

import java.awt.Dimension;
import javax.swing.JComponent;
public class MetodosNecesarios extends javax.swing.JInternalFrame{
    private JComponent Barra;
    public void ocultarBarraTitulo(){
        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        Dimension dimBarra = Barra.getPreferredSize();
        Barra.setSize(0,0);
        Barra.setPreferredSize(new Dimension(0,0));
        repaint();
    }
}
