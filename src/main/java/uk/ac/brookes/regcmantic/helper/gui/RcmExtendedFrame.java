/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * RcmExtendedFrame.java
 *
 * Created on 15-Dec-2011, 09:39:50
 */

package uk.ac.brookes.regcmantic.helper.gui;

import javax.swing.JLabel;
import javax.swing.JPanel;
import uk.ac.brookes.regcmantic.rcm.main.Settings;

/**
 * Use this frame as a gui template for each frame I create in this project.
 * @author Krish
 */
public class RcmExtendedFrame extends RcmFrame {

    /** Creates new form RcmExtendedFrame */
    public RcmExtendedFrame() {
        init();
        process();
        setVisible(true);    
    }
    private void init(){
        initComponents();
    }
    private void process(){
        
    }

    public JLabel getLblImage() {
        return lblImage;
    }

    public void setLblImage(JLabel lblImage) {
        this.lblImage = lblImage;
    }

    public JLabel getLblTitle() {
        return lblTitle;
    }

    public void setLblTitle(JLabel lblTitle) {
        this.lblTitle = lblTitle;
    }

    public JPanel getPnHeader() {
        return pnHeader;
    }

    public void setPnHeader(JPanel pnHeader) {
        this.pnHeader = pnHeader;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnHeader = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnHeader.setBackground(java.awt.Color.darkGray);

        lblImage.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        lblImage.setForeground(new java.awt.Color(204, 255, 204));
        lblImage.setHorizontalAlignment(JLabel.RIGHT);
        lblImage.setIcon(Settings.BANNER_IMAGE);

        lblTitle.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(204, 255, 204));
        lblTitle.setIcon(Settings.ICON_SMALL);
        lblTitle.setText(titleOnLabel);

        javax.swing.GroupLayout pnHeaderLayout = new javax.swing.GroupLayout(pnHeader);
        pnHeader.setLayout(pnHeaderLayout);
        pnHeaderLayout.setHorizontalGroup(
            pnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHeaderLayout.createSequentialGroup()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnHeaderLayout.setVerticalGroup(
            pnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHeaderLayout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(533, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnHeader;
    // End of variables declaration//GEN-END:variables
    private String titleOnLabel = " RegCMantic Title";
    }
