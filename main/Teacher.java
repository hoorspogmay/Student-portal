package main;

import java.awt.Color;
import static java.lang.System.exit;

/**
 *
 * @author hoors
 */
public class Teacher extends javax.swing.JFrame {

    /**
     * Creates new form TeacherMenu
     */
    public Teacher() {
        initComponents();
        Color col = new Color(245,210,245);
        getContentPane().setBackground(col);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        courseButton = new javax.swing.JButton();
        detailsButton = new javax.swing.JButton();
        announcementGUI = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        PowerOffButton = new javax.swing.JButton();
        logoutButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 210, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        courseButton.setBackground(new java.awt.Color(255, 204, 255));
        courseButton.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        courseButton.setText("Course");
        courseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseButtonActionPerformed(evt);
            }
        });
        jPanel1.add(courseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 225, 63));

        detailsButton.setBackground(new java.awt.Color(255, 204, 255));
        detailsButton.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        detailsButton.setText("Student Details");
        detailsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailsButtonActionPerformed(evt);
            }
        });
        jPanel1.add(detailsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 225, 66));

        announcementGUI.setBackground(new java.awt.Color(255, 204, 255));
        announcementGUI.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        announcementGUI.setText("Announcement");
        announcementGUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                announcementGUIActionPerformed(evt);
            }
        });
        jPanel1.add(announcementGUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 225, 66));

        backButton.setBackground(new java.awt.Color(255, 204, 255));
        backButton.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 90, 90));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to Teacher Center");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 357, 53));

        PowerOffButton.setBackground(new java.awt.Color(255, 204, 255));
        PowerOffButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/off .png"))); // NOI18N
        PowerOffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PowerOffButtonActionPerformed(evt);
            }
        });
        jPanel1.add(PowerOffButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, 86, 82));

        logoutButton1.setBackground(new java.awt.Color(255, 204, 255));
        logoutButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        logoutButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(logoutButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, 90, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void courseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseButtonActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherCourseGUI().setVisible(true);
            }
        });
    }//GEN-LAST:event_courseButtonActionPerformed

    private void announcementGUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_announcementGUIActionPerformed
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherAnnouncementGUI().setVisible(true);
            }
        });
    }//GEN-LAST:event_announcementGUIActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.toBack();
        TeacherLoginGUI login = new TeacherLoginGUI();
        login.setVisible(true);
        login.toFront();
    }//GEN-LAST:event_backButtonActionPerformed

    private void detailsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailsButtonActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayStudentDataGUI().setVisible(true);
            }
        });  
    }//GEN-LAST:event_detailsButtonActionPerformed

    private void PowerOffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PowerOffButtonActionPerformed
        exit(0);
    }//GEN-LAST:event_PowerOffButtonActionPerformed

    private void logoutButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButton1ActionPerformed
        this.toBack();
        LoginPage login = new LoginPage();
        login.setVisible(true);
        login.toFront();
    }//GEN-LAST:event_logoutButton1ActionPerformed

    public static void main(String args[]) {
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PowerOffButton;
    private javax.swing.JButton announcementGUI;
    private javax.swing.JButton backButton;
    private javax.swing.JButton courseButton;
    private javax.swing.JButton detailsButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutButton1;
    // End of variables declaration//GEN-END:variables
}
