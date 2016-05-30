import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class GUI extends javax.swing.JFrame {

	 // Variables declaration    
	
	private String target, source;
	private int result;
	private Distance d;
	
    private JButton Find;
    private JButton Details;
    private JButton Exit;
    private JButton Clear;
    
    
    private JLabel jLabel1;
    private JLabel jLabel2,jLabel4;
    public static JLabel jLabel5,jLabel6;
    private JLabel jLabel3;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1, jScrollPane2;
    public static JTextArea ta, ta2;
    private JTextField t1;
    private JTextField t2;
    private JTextField t3;
    
    public static  JTextArea ta4;
    public static JTextArea ta6;
  
    // End of variables declaration                   
    public static void add(String text) {
        ta.append(text);
    }
    
    public static void add2(String text2) {
        ta2.append(text2);
    }
  
    public static void add5(String text2) {
    	ta4.append(text2);
    }
  
    public static void add6(String text2) {
    	ta6.append(text2);
    }
  
    public GUI() {
    
    	
        super("Lavenstein Distance Using Wagner-Fischer Algorithm");
        initComponents();
        d= new Distance();
        
       }
 private void initComponents() {
  // Object intantiation 
        Details = new JButton();
        Find = new JButton();
        Exit = new JButton();
        Clear = new JButton();

        jScrollPane1 = new JScrollPane();
        jScrollPane2 = new JScrollPane();

        jPanel1 = new JPanel();
        jPanel2 = new JPanel();

        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
         
        ta = new JTextArea();
        ta2=new JTextArea();
        t3 = new JTextField();
        t1 = new JTextField();
        t2 = new JTextField();
        
        ta4 = new JTextArea();
        ta6 = new JTextArea();
       
        // end of object instantiation
       
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
       // fomalities for GUI components and their creation.
       
        Details.setText("Details>>");
        Exit.setText("Exit");
        Find.setText("Find Edit Distance");
        Clear.setText("Clear Text Area");
        
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
  //-----------------------Handling events here-------------------------------
  
        Find.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
       
            source= t1.getText();
            target= t2.getText();
            ta.append("Brief Description of the Edits Performed:\n");
               
            result= d.getLevenshteinDistance(source, target); 
              t3.setText(""+ (int) result);
               
              
            }
        });
        ta2.setBackground(new java.awt.Color(51,204,255));
        Details.setForeground(new java.awt.Color(153, 0, 51));
        Details.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ta.setVisible(true);
                Clear.setVisible(true);       
            	
            }
        });
        Clear.setVisible(false);
        Clear.setForeground(new java.awt.Color(153, 0, 51));
        Clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ta.setText("");
                
            	
            }
        });

        Exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                System.exit(0);
            }
        });

    
        ta.addComponentListener(new ComponentAdapter() {
            public void componentHidden(ComponentEvent evt) {
            
            
            }
        });
        
       
//-----------------------End of event handling area----------------------------------------------------------
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(ta);

        
        jLabel1.setText("Target String: ");
        jLabel2.setText("Source String: ");
        jLabel3.setText("Minimum # of Moves: ");

        Find.setFocusable(true);
        Find.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Find.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        ta.setVisible(false);
        ta.setColumns(26);
        ta.setSize(200,200);
        ta.setRows(20);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(Find, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t3)))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Find, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        Clear.setForeground(new java.awt.Color(153, 0, 51));
        Clear.setText("Clear Text Area");
        
        Clear.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
                       ta.setText("");
                       ta2.setText("");
                       ta4.setText("");
                       ta6.setText("");
                       
                       

            }
        });

        Exit.setText("Exit");

        ta2.setBackground(new java.awt.Color(51, 204, 255));
        ta2.setColumns(20);
        ta2.setRows(5);
        jScrollPane2.setViewportView(ta2);

        jLabel4.setBackground(new java.awt.Color(51, 255, 255));
        jLabel4.setForeground(new java.awt.Color(153, 0, 51));
        jLabel4.setText("Alignment Path for the Algorithm Implementation:");

    
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Details, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(ta6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 192, Short.MAX_VALUE))
                            .addComponent(ta4))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Details, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ta4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ta6)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
                        .addGap(21, 21, 21)
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
   pack();
    }

       
}
