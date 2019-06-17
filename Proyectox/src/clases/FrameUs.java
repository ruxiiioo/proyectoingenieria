/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;
import clases.Principal;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.List;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import org.edisoncor.gui.util.Avatar;


/**
 *
 * @author pedro
 */
public class FrameUs extends javax.swing.JInternalFrame {
    public FrameUs() {
        ocultarBarraTitulo();
        initComponents();    
        modificar();
        setVisible(rootPaneCheckingEnabled);
        show();
    }
    public void modificar(){
        java.util.List<Avatar> avatares = new ArrayList<Avatar>();
        avatares.add(new Avatar("Usuarios", loadImage("/imagenes/Categorias/user.png")));        
        avatares.add(new Avatar("Mapa", loadImage("/imagenes/Categorias/mapa.png")));
        avatares.add(new Avatar("Nodos", loadImage("/imagenes/Categorias/nodo.png")));
        avatares.add(new Avatar("Salir", loadImage("/imagenes/Categorias/salir.png")));
        
        PanelCategoriasx.setAvatars(avatares);
        
    }
    private static Image loadImage(String fileName) {
        try {
            return ImageIO.read(JFrame.class.getResource(fileName));
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    private JComponent Barra;
    public void ocultarBarraTitulo(){
        Barra = ((javax.swing.plaf.basic.BasicInternalFrameUI) getUI()).getNorthPane();
        Dimension dimBarra = Barra.getPreferredSize();
        Barra.setSize(0,0);
        Barra.setPreferredSize(new Dimension(0,0));
        repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        panelShadow1 = new org.edisoncor.gui.panel.PanelShadow();
        jLabel1 = new javax.swing.JLabel();
        PanelCategoriasx = new org.edisoncor.gui.panel.PanelAvatarChooser();

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Categorias");

        PanelCategoriasx.setColorPrimario(new java.awt.Color(255, 255, 255));
        PanelCategoriasx.setColorSecundario(new java.awt.Color(204, 204, 204));
        PanelCategoriasx.setFont(new java.awt.Font("1543HumaneJenson", 0, 24)); // NOI18N
        PanelCategoriasx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelCategoriasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelCategoriasxLayout = new javax.swing.GroupLayout(PanelCategoriasx);
        PanelCategoriasx.setLayout(PanelCategoriasxLayout);
        PanelCategoriasxLayout.setHorizontalGroup(
            PanelCategoriasxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 724, Short.MAX_VALUE)
        );
        PanelCategoriasxLayout.setVerticalGroup(
            PanelCategoriasxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelShadow1Layout = new javax.swing.GroupLayout(panelShadow1);
        panelShadow1.setLayout(panelShadow1Layout);
        panelShadow1Layout.setHorizontalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 555, Short.MAX_VALUE))
                    .addComponent(PanelCategoriasx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelCategoriasx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(panelShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PanelCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelCategoriasMouseClicked
        String cadena;

        cadena = PanelCategoriasx.getSelectedtitulo().toString();
        System.out.println(cadena);
        switch (cadena){
            case "Nodos":
            nodos();
            break;
            case "Usuarios":
            usuario();
            break;
            case "Salir":
            break;

        }
    }//GEN-LAST:event_PanelCategoriasMouseClicked
    public static String  T(){
        return "";
    }
    public void nodos(){
        VentanaPrincipal o=new VentanaPrincipal();
        o.show();
        
        setVisible(false);
    }
    
    public void usuario(){
        Usuarios o=new Usuarios ();
        Principal.contenedor.add(o);
        setVisible(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private transient org.edisoncor.gui.panel.PanelAvatarChooser PanelCategoriasx;
    private javax.swing.JLabel jLabel1;
    public static org.edisoncor.gui.panel.PanelImage panelImage1;
    private org.edisoncor.gui.panel.PanelShadow panelShadow1;
    // End of variables declaration//GEN-END:variables
}
