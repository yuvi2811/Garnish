import java.sql.*;
import javax.swing.JOptionPane;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Final_Bill1.java
 *
 * Created on Dec 6, 2017, 7:29:37 PM
 */

/**
 *
 * @author Yuvansh
 */
public class Final_Bill1 extends javax.swing.JFrame {
 Connection con=null;
    Statement stmt=null;
    ResultSet rs=null;
    /** Creates new form Final_Bill1 */
    public Final_Bill1() {
        initComponents();
         fi.setCaretPosition(0);
         try{
            Class.forName("com.mysql.jdbc.Driver");
        Connection    cton= DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "");
            Statement sttmt = cton.createStatement();
       rs = sttmt.executeQuery("Select * from phone1;");
   while(rs.next()){
         String pt=rs.getString("pn");
         pn.setText(""+pt);
   }
        } catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
         try{
            Class.forName("com.mysql.jdbc.Driver");
             con= DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "");
            stmt = con.createStatement();
             rs = stmt.executeQuery("select * from billing1 where phone_number='"+pn.getText()+"';");

            while(rs.next()){
              
                int pri = rs.getInt("price");
                   String ad = rs.getString("Address");
                   String md = rs.getString("DELIVERY_MODE");
                   int nopp=rs.getInt("no_of_people");
                  String  phn=rs.getString("phone_number");
                   String cn=rs.getString("cust_name");
                   String mp=rs.getString("mode_of_payment");
                  Date dt=rs.getDate("date");
                  String  onn=rs.getString("odr_no");

              da.setText(""+dt);
              tamt.setText(""+pri);
              nopl.setText(""+nopp);
              pn.setText(""+phn);
              cu.setText(""+cn);
              mopy.setText(""+mp);
              orn.setText(""+onn);
              delmd.setText(""+md);
              adr.setText(""+ad);
            }
         }
          catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        /**/
        int n=1;
        try{
            Class.forName("com.mysql.jdbc.Driver");
             con= DriverManager.getConnection("jdbc:mysql://localhost/project", "root", "");
            stmt = con.createStatement();
            rs = stmt.executeQuery("select item from billing1 where phone_number ='"+pn.getText()+"';");

            while(rs.next()){
            String i=rs.getString("item");
            fi.append("\n"+n++ +"  "+i+"\n");
            }
         }
          catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        da = new javax.swing.JTextField();
        cu = new javax.swing.JTextField();
        pn = new javax.swing.JTextField();
        mopy = new javax.swing.JTextField();
        tamt = new javax.swing.JTextField();
        nopl = new javax.swing.JTextField();
        orn = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        fi = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        adr = new javax.swing.JTextField();
        delmd = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(720, 620));
        getContentPane().setLayout(null);

        jLabel8.setBackground(new java.awt.Color(204, 204, 255));
        jLabel8.setForeground(new java.awt.Color(255, 255, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/471074.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(10, 10, 200, 90);

        jLabel2.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("NO OF PEOPLE");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 310, 190, 30);

        jLabel3.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("ORDER NUMBER");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 150, 190, 30);

        jLabel4.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("DATE");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 110, 190, 30);

        jLabel5.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("CUSTOMER NAME");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 190, 190, 30);

        jLabel6.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("PHONE NUMBER");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 230, 190, 30);

        jLabel7.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("MODE OF PAYMENT");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 400, 190, 20);

        jLabel9.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 0));
        jLabel9.setText("TOTAL AMOUNT");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(60, 540, 190, 30);

        jLabel10.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("FOOD ITEMS");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(60, 460, 190, 30);

        da.setEditable(false);
        getContentPane().add(da);
        da.setBounds(320, 110, 160, 30);

        cu.setEditable(false);
        getContentPane().add(cu);
        cu.setBounds(320, 190, 160, 30);

        pn.setEditable(false);
        getContentPane().add(pn);
        pn.setBounds(320, 230, 160, 30);

        mopy.setEditable(false);
        getContentPane().add(mopy);
        mopy.setBounds(320, 390, 160, 30);

        tamt.setEditable(false);
        getContentPane().add(tamt);
        tamt.setBounds(320, 540, 160, 30);

        nopl.setEditable(false);
        getContentPane().add(nopl);
        nopl.setBounds(320, 310, 160, 30);

        orn.setEditable(false);
        orn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ornActionPerformed(evt);
            }
        });
        getContentPane().add(orn);
        orn.setBounds(320, 150, 160, 30);

        fi.setColumns(20);
        fi.setEditable(false);
        fi.setLineWrap(true);
        fi.setRows(5);
        fi.setWrapStyleWord(true);
        jScrollPane1.setViewportView(fi);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(320, 430, 160, 100);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon.png"))); // NOI18N
        jButton6.setToolTipText("<html><font color=\"RED\" face=\"JOKERMAN\">HOME</font></html>");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(200, 20, 50, 50);

        jLabel11.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 0));
        jLabel11.setText("ADDRESS");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(60, 280, 100, 20);

        adr.setEditable(false);
        getContentPane().add(adr);
        adr.setBounds(320, 270, 160, 30);

        delmd.setEditable(false);
        getContentPane().add(delmd);
        delmd.setBounds(320, 350, 160, 30);

        jLabel12.setFont(new java.awt.Font("Andalus", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 0));
        jLabel12.setText("DELIVERY MODE");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(60, 360, 170, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo-cloud-solutions-background-5.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 580);

        setSize(new java.awt.Dimension(717, 620));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ornActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_ornActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
          int dialogButton = JOptionPane.YES_NO_OPTION;
          int o= JOptionPane.showConfirmDialog(null,"WANNA GIVE FEEDBACK","FEEDBACK",dialogButton);
             if(o == JOptionPane.YES_OPTION){
                        try{
            Class.forName("com.mysql.jdbc.Driver");
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        stmt= con.createStatement();
        int ros = stmt.executeUpdate("delete from phone where pn='"+pn.getText()+"';");
        }
             catch(Exception e)
                 {
            JOptionPane.showMessageDialog(null,e);
        }
           Feedback_Form ff=new Feedback_Form();
           ff.setVisible(true);
           this.setVisible(false);
             } else
          if(o == JOptionPane.NO_OPTION){
                     try{
            Class.forName("com.mysql.jdbc.Driver");
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        stmt= con.createStatement();
        int ros = stmt.executeUpdate("delete from phone where pn='"+pn.getText()+"';");
        }
             catch(Exception e)
                 {
            JOptionPane.showMessageDialog(null,e);
        }
        Welcome_Screen_ ws=new Welcome_Screen_();
        ws.setVisible(true);
        this.setVisible(false);
          }
}//GEN-LAST:event_jButton6ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Final_Bill1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adr;
    private javax.swing.JTextField cu;
    private javax.swing.JTextField da;
    private javax.swing.JTextField delmd;
    private javax.swing.JTextArea fi;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mopy;
    private javax.swing.JTextField nopl;
    private javax.swing.JTextField orn;
    private javax.swing.JTextField pn;
    private javax.swing.JTextField tamt;
    // End of variables declaration//GEN-END:variables

}
