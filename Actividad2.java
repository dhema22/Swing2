/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad2;

/**
 *
 * @author adhej
 */
public class Actividad2 extends javax.swing.JFrame{
    
    public Actividad2() {
        initComponents();
    }
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Sueldo Bruto a Neto");
        jLabel2.setText("Bruto anual");
        jLabel3.setText("Numero de pagas");
        jButton1.setText("calcular");
        jLabel4.setText("Sueldo neto anual");
        
        
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        
        jLabel1.setFont(new java.awt.Font("Serif", 1, 12));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                        .addGap(22, 22, 22)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1)
                        .addGap(22, 22, 22)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2)
                        .addGap(22, 22, 22)
                    .addComponent(jLabel4)
                        .addGap(22, 22, 22)
                    .addComponent(jButton1)
                        .addGap(22, 22, 22)
                    .addComponent(jLabel5))
                .addContainerGap(296, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                    .addGap(22, 22, 22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addComponent(jTextField1)
                    .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addComponent(jTextField2)
                    .addGap(22, 22, 22)
                .addComponent(jLabel4)
                    .addGap(22, 22, 22)
                .addComponent(jButton1)
                    .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        pack();
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        double sueldoBruto=Integer.parseInt(jTextField1.getText());
        double sueldoNeto;
        if (sueldoBruto<12450){
            sueldoNeto=sueldoBruto*0.81;
            jLabel5.setText(String.valueOf(sueldoNeto));
        }else if(sueldoBruto>=12450 && sueldoBruto<20200){
            sueldoNeto=sueldoBruto*0.76;
            jLabel5.setText(String.valueOf(sueldoNeto));
        }else if(sueldoBruto>=20200 && sueldoBruto<35200){
            sueldoNeto=sueldoBruto*0.7;
            jLabel5.setText(String.valueOf(sueldoNeto));
        }else if(sueldoBruto>=35200 && sueldoBruto<60000){
            sueldoNeto=sueldoBruto*0.63;
            jLabel5.setText(String.valueOf(sueldoNeto));
        }else if(sueldoBruto>=60000 && sueldoBruto<300000){
            sueldoNeto=sueldoBruto*0.55;
            jLabel5.setText(String.valueOf(sueldoNeto));
        }else{
            sueldoNeto=sueldoBruto*0.53;
            jLabel5.setText(String.valueOf(sueldoNeto));
        }
                
    }                                        

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actividad2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actividad2().setVisible(true);
            }
        });
    }
    
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton jButton1;
}
