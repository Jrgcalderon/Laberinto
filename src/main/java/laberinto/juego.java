package laberinto;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author milton
 */
public class juego extends javax.swing.JFrame {
    /* Variables bloqueo = 0, disponible = 1, fuego = 2 */
    int btn_11 = 1, btn_12 = 1, btn_13 = 1;
    int btn_21 = 1, btn_22 = 1, btn_23 = 1;
    int btn_31 = 1, btn_32 = 1, btn_33 = 1;
    int btn_41 = 1, btn_42 = 1, btn_43 = 1;
    
    boolean muro = false;
    boolean fuego = false;

    public juego() {
        initComponents();
        inicio();
    }
    
    public void inicio(){
        btn11.setBackground(Color.black);
        btn12.setBackground(Color.white);
        btn13.setBackground(Color.white);
        btn21.setBackground(Color.white);
        btn22.setBackground(Color.white);
        btn23.setBackground(Color.white);
        btn31.setBackground(Color.white);
        btn32.setBackground(Color.white);
        btn33.setBackground(Color.white);
        btn41.setBackground(Color.white);
        btn42.setBackground(Color.white);
        btn43.setBackground(Color.green);
        
        muro = false;
        fuego = false;
        
        btnFuego.setEnabled(true);
        
        btn_11 = 1; btn_12 = 1; btn_13 = 1;
        btn_21 = 1; btn_22 = 1; btn_23 = 1;
        btn_31 = 1; btn_32 = 1; btn_33 = 1;
        btn_41 = 1; btn_42 = 1; btn_43 = 1;
    }
    
    public void ganar(){
        JOptionPane.showMessageDialog(null, "El laberinto se ha completado correctamente :) ");
        inicio();
    }
    
    public void perder(){
        JOptionPane.showMessageDialog(null, "Game Over, no hay salida :( ");
        inicio();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn13 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn23 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn33 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn31 = new javax.swing.JButton();
        btn32 = new javax.swing.JButton();
        btnMuro = new javax.swing.JButton();
        btnFuego = new javax.swing.JButton();
        btn41 = new javax.swing.JButton();
        btn42 = new javax.swing.JButton();
        btn43 = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });

        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        btn23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn23ActionPerformed(evt);
            }
        });

        btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn22ActionPerformed(evt);
            }
        });

        btn33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn33ActionPerformed(evt);
            }
        });

        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });

        btn31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn31ActionPerformed(evt);
            }
        });

        btn32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn32ActionPerformed(evt);
            }
        });

        btnMuro.setBackground(new java.awt.Color(255, 51, 51));
        btnMuro.setText("MURO");
        btnMuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMuroActionPerformed(evt);
            }
        });

        btnFuego.setBackground(new java.awt.Color(255, 51, 51));
        btnFuego.setText("FUEGO");
        btnFuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuegoActionPerformed(evt);
            }
        });

        btn41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn41ActionPerformed(evt);
            }
        });

        btn42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn42ActionPerformed(evt);
            }
        });

        btn43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn43ActionPerformed(evt);
            }
        });

        btnIniciar.setBackground(new java.awt.Color(255, 51, 51));
        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btn41, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn42, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn43, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn31, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btn32, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btn33, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFuego, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMuro, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn22, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn32, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn33, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn21, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn31, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnMuro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFuego, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn42, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn43, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn41, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        if(muro == true){
            if(btn13.getBackground() == Color.red)
                JOptionPane.showMessageDialog(null, "Lo sentimos no puede poner un muro aquí");
            else{
                btn_13 = 0;
                btn13.setBackground(Color.blue);
            }
        }
        
        if(fuego == true){
            if(btn13.getBackground() == Color.blue)
                JOptionPane.showMessageDialog(null, "Lo sentimos no puede poner el fuego aquí");
            else{
                btn_13 = 2;
                btn13.setBackground(Color.red);
                fuego = false;
                btnFuego.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        if(muro == true){
            if(btn12.getBackground() == Color.red)
                JOptionPane.showMessageDialog(null, "Lo sentimos no puede poner un muro aquí");
            else{
                btn_12 = 0;
                btn12.setBackground(Color.blue);
            }
        }
        
        if(fuego == true){
            if(btn12.getBackground() == Color.blue)
                JOptionPane.showMessageDialog(null, "Lo sentimos no puede poner el fuego aquí");
            else{
                btn_12 = 2;
                btn12.setBackground(Color.red);
                fuego = false;
                btnFuego.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn23ActionPerformed
        if(muro == true){
            if(btn23.getBackground() == Color.red)
                JOptionPane.showMessageDialog(null, "Lo sentimos no puede poner un muro aquí");
            else{
                btn_23 = 0;
                btn23.setBackground(Color.blue);
            }
        }
        
        if(fuego == true){
            if(btn23.getBackground() == Color.blue)
                JOptionPane.showMessageDialog(null, "Lo sentimos no puede poner el fuego aquí");
            else{
                btn_23 = 2;
                btn23.setBackground(Color.red);
                fuego = false;
                btnFuego.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btn23ActionPerformed

    private void btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22ActionPerformed
        if(muro == true){
            if(btn22.getBackground() == Color.red)
                JOptionPane.showMessageDialog(null, "Lo sentimos no puede poner un muro aquí");
            else{
                btn_22 = 0;
                btn22.setBackground(Color.blue);
            }
        }
        
        if(fuego == true){
            if(btn22.getBackground() == Color.blue)
                JOptionPane.showMessageDialog(null, "Lo sentimos no puede poner el fuego aquí");
            else{
                btn_22 = 2;
                btn22.setBackground(Color.red);
                fuego = false;
                btnFuego.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btn22ActionPerformed

    private void btn33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn33ActionPerformed
        if(muro == true){
            if(btn33.getBackground() == Color.red)
                JOptionPane.showMessageDialog(null, "Lo sentimos no puede poner un muro aquí");
            else{
                btn_33 = 0;
                btn33.setBackground(Color.blue);
            }
        }
        
        if(fuego == true){
            if(btn33.getBackground() == Color.blue)
                JOptionPane.showMessageDialog(null, "Lo sentimos no puede poner el fuego aquí");
            else{
                btn_33 = 2;
                btn33.setBackground(Color.red);
                fuego = false;
                btnFuego.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btn33ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed

    }//GEN-LAST:event_btn11ActionPerformed

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        if(muro == true){
            if(btn21.getBackground() == Color.red)
                JOptionPane.showMessageDialog(null, "Lo sentimos no puede poner un muro aquí");
            else{
                btn_21 = 0;
                btn21.setBackground(Color.blue);
            }
        }
        
        if(fuego == true){
            if(btn21.getBackground() == Color.blue)
                JOptionPane.showMessageDialog(null, "Lo sentimos no puede poner el fuego aquí");
            else{
                btn_21 = 2;
                btn21.setBackground(Color.red);
                fuego = false;
                btnFuego.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btn21ActionPerformed

    private void btn31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn31ActionPerformed
        if(muro == true){
            if(btn31.getBackground() == Color.red)
                JOptionPane.showMessageDialog(null, "Lo sentimos no puede poner un muro aquí");
            else{
                btn_31 = 0;
                btn31.setBackground(Color.blue);
            }
        }
        
        if(fuego == true){
            if(btn31.getBackground() == Color.blue)
                JOptionPane.showMessageDialog(null, "Lo sentimos no puede poner el fuego aquí");
            else{
                btn_31 = 2;
                btn31.setBackground(Color.red);
                fuego = false;
                btnFuego.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btn31ActionPerformed

    private void btn32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn32ActionPerformed
        if(muro == true){
            if(btn32.getBackground() == Color.red)
                JOptionPane.showMessageDialog(null, "Lo sentimos no puede poner un muro aquí");
            else{
                btn_32 = 0;
                btn32.setBackground(Color.blue);
            }
        }
        
        if(fuego == true){
            if(btn32.getBackground() == Color.blue)
                JOptionPane.showMessageDialog(null, "Lo sentimos no puede poner el fuego aquí");
            else{
                btn_32 = 2;
                btn32.setBackground(Color.red);
                fuego = false;
                btnFuego.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btn32ActionPerformed

    private void btnMuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMuroActionPerformed
        muro = true;
        fuego = false;
    }//GEN-LAST:event_btnMuroActionPerformed

    private void btnFuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuegoActionPerformed
        fuego = true;
        muro = false;
    }//GEN-LAST:event_btnFuegoActionPerformed

    private void btn41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn41ActionPerformed
        if(muro == true){
            if(btn41.getBackground() == Color.red)
                JOptionPane.showMessageDialog(null, "Lo sentimos no puede poner un muro aquí");
            else{
                btn_41 = 0;
                btn41.setBackground(Color.blue);
            }
        }
        
        if(fuego == true){
            if(btn41.getBackground() == Color.blue)
                JOptionPane.showMessageDialog(null, "Lo sentimos no puede poner el fuego aquí");
            else{
                btn_41 = 2;
                btn41.setBackground(Color.red);
                fuego = false;
                btnFuego.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btn41ActionPerformed

    private void btn42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn42ActionPerformed
        if(muro == true){
            if(btn42.getBackground() == Color.red)
                JOptionPane.showMessageDialog(null, "Lo sentimos no puede poner un muro aquí");
            else{
                btn_42 = 0;
                btn42.setBackground(Color.blue);
            }
        }
        
        if(fuego == true){
            if(btn42.getBackground() == Color.blue)
                JOptionPane.showMessageDialog(null, "Lo sentimos no puede poner el fuego aquí");
            else{
                btn_42 = 2;
                btn42.setBackground(Color.red);
                fuego = false;
                btnFuego.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btn42ActionPerformed

    private void btn43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn43ActionPerformed
        if(muro == true){
            if(btn43.getBackground() == Color.red)
                JOptionPane.showMessageDialog(null, "Lo sentimos no puede poner un muro aquí");
            else{
                btn_43 = 0;
                btn43.setBackground(Color.blue);
            }
        }
        
        if(fuego == true){
            if(btn43.getBackground() == Color.blue)
                JOptionPane.showMessageDialog(null, "Lo sentimos no puede poner el fuego aquí");
            else{
                btn_43 = 2;
                btn43.setBackground(Color.red);
                fuego = false;
                btnFuego.setEnabled(false);
            }
        }
    }//GEN-LAST:event_btn43ActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        if (btn_33 != 1 && btn_42 != 1 || btn_12 != 1 && btn_21 != 1 || btn_21 != 1 && btn_22 != 1 && btn_23 != 1 ||
            btn_31 != 1 && btn_32 != 1 && btn_33 != 1 || btn_12 != 1 && btn_22 != 1 && btn_31 != 1 ||
            btn_41 != 1 && btn_32 != 1 && btn_23 != 1 || btn_21 != 1 && btn_32 != 1 && btn_23 != 1 ||
            btn_12 != 1 && btn_22 != 1 && btn_32 != 1 && btn_42 != 1 || btn_23 != 1 && btn_32 != 1 && btn_42 != 1 ||
            btn_13 != 1 && btn_23 != 1 && btn_32 != 1 && btn_42 != 1 || btn_13 != 1 && btn_22 != 1 && btn_31 != 1 ||
            btn_13 != 1 && btn_22 != 1 && btn_21 != 1 || btn_23 != 1 && btn_32 != 1 && btn_31 != 1 ||
            btn_21 != 1 && btn_22 != 1 && btn_33 != 1 || btn_21 != 1 && btn_32 != 1 && btn_33 != 1 ||
            btn_41 != 1 && btn_32 != 1 && btn_33 != 1 || btn_13 != 1 && btn_22 != 1 && btn_32 != 1 && btn_41 != 1 ||
            btn_13 != 1 && btn_22 != 1 && btn_32 != 1 && btn_42 != 1 || btn_21 != 1 && btn_22 != 1 && btn_32 != 1 ||
            btn_21 != 1 && btn_31 != 1 && btn_32 != 1 || btn_31 != 1 && btn_22 != 1 && btn_23 != 1 ||
            btn_41 != 1 && btn_32 != 1 && btn_33 != 1){
                perder();
        }else{
                if (btn_12 == 1){
                    if (btn_13 == 1){
                        if (btn_23 == 1){
                            if (btn_33 == 1){
                                btn12.setBackground(Color.black);
                                btn13.setBackground(Color.black);
                                btn23.setBackground(Color.black);
                                btn33.setBackground(Color.black);
                                ganar();
                            }
                            else{
                                if (btn_22 == 1){
                                    if (btn_32 == 1){
                                        if (btn_42 == 1){
                                            btn12.setBackground(Color.black);
                                            btn22.setBackground(Color.black);
                                            btn32.setBackground(Color.black);
                                            btn42.setBackground(Color.black);
                                            ganar();
                                        }
                                    }
                                    else{
                                        if(btn_31 == 1){
                                            if(btn_41 == 1){
                                                if(btn_42 == 1){
                                                    btn21.setBackground(Color.black);
                                                    btn31.setBackground(Color.black);
                                                    btn41.setBackground(Color.black);
                                                    btn42.setBackground(Color.black);
                                                    ganar();
                                                }
                                            }
                                        }
                                    }
                                }
                            }

                        } // b23
                        else{
                            if (btn_22 == 1){
                                if (btn_32 == 1){
                                    if (btn_42 == 1){
                                        btn21.setBackground(Color.black);
                                        btn31.setBackground(Color.black);
                                        btn41.setBackground(Color.black);
                                        btn42.setBackground(Color.black);
                                        ganar();
                                    }
                                    else{
                                        if (btn_33 == 1){
                                            btn21.setBackground(Color.black);
                                            btn31.setBackground(Color.black);
                                            btn32.setBackground(Color.black);
                                            btn33.setBackground(Color.black);
                                            ganar();
                                        }
                                    }
                                } // b32
                                else{
                                    if (btn_21 == 1){
                                        if (btn_31 == 1){
                                            if (btn_41 == 1){
                                                if (btn_42 == 1){
                                                    btn21.setBackground(Color.black);
                                                    btn31.setBackground(Color.black);
                                                    btn41.setBackground(Color.black);
                                                    btn42.setBackground(Color.black);
                                                    ganar();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } 
                    else{                        
                        if (btn_22 == 1){
                            if (btn_23 == 1){
                                if (btn_33 == 1){
                                    btn12.setBackground(Color.black);
                                    btn22.setBackground(Color.black);
                                    btn23.setBackground(Color.black);
                                    btn33.setBackground(Color.black);
                                    ganar();
                                }                              
                            }
                            else{
                                if(btn_32 == 1){
                                    btn32.setBackground(Color.black);

                                    if(btn_33 == 1){
                                        btn33.setBackground(Color.black);
                                        ganar();
                                    }
                                    else{
                                        if (btn_42 == 1){
                                            btn42.setBackground(Color.black);
                                            ganar();
                                        }
                                        else{
                                            perder();
                                        }
                                    }
                                }
                                else{
                                    if (btn_21 == 1){
                                        btn21.setBackground(Color.black);
                                        if (btn_31 == 1){
                                            btn31.setBackground(Color.black);

                                            if (btn_41 == 1){
                                                btn41.setBackground(Color.black);

                                                if (btn_42 == 1){
                                                    btn42.setBackground(Color.black);
                                                    ganar();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } // b22
                        else{
                            if(btn_31 == 1){
                                if(btn_41 == 1){
                                    if (btn_42 == 1){
                                        btn21.setBackground(Color.black);
                                        btn31.setBackground(Color.black);
                                        btn41.setBackground(Color.black);
                                        btn42.setBackground(Color.black);
                                        ganar();
                                    }
                                    else{
                                        if (btn_32 == 1){
                                            if (btn_33 == 1){
                                                btn21.setBackground(Color.black);
                                                btn31.setBackground(Color.black);
                                                btn32.setBackground(Color.black);
                                                btn33.setBackground(Color.black);
                                                ganar();
                                            }
                                        }
                                    }
                                }
                                else{
                                    if(btn_32 == 1){
                                        if(btn_33 == 1){
                                            btn21.setBackground(Color.black);
                                            btn31.setBackground(Color.black);
                                            btn32.setBackground(Color.black);
                                            btn33.setBackground(Color.black);
                                            ganar();
                                        }
                                        else{
                                            if(btn_42 == 1){
                                                btn21.setBackground(Color.black);
                                                btn31.setBackground(Color.black);
                                                btn32.setBackground(Color.black);
                                                btn42.setBackground(Color.black);
                                                ganar();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                else{
                    if (btn_21 == 1){
                        btn21.setBackground(Color.black);

                        if (btn_31 == 1){
                            btn31.setBackground(Color.black);

                            if (btn_41 == 1){
                                btn41.setBackground(Color.black);

                                if (btn_42 == 1){
                                    btn42.setBackground(Color.black);

                                    if (btn_43 == 1){
                                        btn43.setBackground(Color.black);
                                        ganar();
                                    }
                                }
                            }
                        }
                        else{
                            if (btn_22 == 1){
                                btn22.setBackground(Color.black);

                                if (btn_23 == 1){
                                    btn23.setBackground(Color.black);

                                    if (btn_33 == 1){
                                        btn33.setBackground(Color.black);
                                        ganar();
                                    }
                                }
                                else{
                                    if (btn_32 == 1){
                                        btn32.setBackground(Color.black);

                                        if (btn_33 == 1){
                                            btn33.setBackground(Color.black);
                                            ganar();
                                        }
                                        else{
                                            if (btn_42 == 1){
                                                btn42.setBackground(Color.black);
                                                ganar();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }

                }
            }
    }//GEN-LAST:event_btnIniciarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn23;
    private javax.swing.JButton btn31;
    private javax.swing.JButton btn32;
    private javax.swing.JButton btn33;
    private javax.swing.JButton btn41;
    private javax.swing.JButton btn42;
    private javax.swing.JButton btn43;
    private javax.swing.JButton btnFuego;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnMuro;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
