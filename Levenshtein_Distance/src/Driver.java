
public class Driver {

	 public static void main(String args[]) {
		 try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        //</editor-fold>

	        /* Create and display the form */
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	               GUI g= new GUI();
	                g.setVisible(true);
	                g.setLocation(500,250);
	                g.setSize(1150,533);
	                
	            }
	        });
	       
	    }
	
}
