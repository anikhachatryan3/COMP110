//Name: Ani Khachatryan
//Date: 12.01.2018
//App: GUIApp
//Purpose:

//awt
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//swing
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSplitPane;
import javax.swing.JScrollPane;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;
//import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class GUIApp {

   private JFrame frame;
   private JDesktopPane desktop;
   private JScrollPane scrollPane;
   private JLabel statusLabel;
   private JPanel panel;
   private JPanel labelPanel;
   private JMenuBar menuBar;
   private JMenu fileMenu;
   private JMenu helpMenu;
   private JSplitPane splitPane;
   
   //constructor
   public GUIApp() {
      
      initComponents();
      statusLabel.setText("Initialization complete.");
      
   }
   
   //create a GUI and make it visible to user
   private void initComponents() {
      
      try {
         
         UIManager.setLookAndFeel(
            UIManager.getCrossPlatformLookAndFeelClassName()
         );
         
      }
      catch(Exception e) {
         
         e.printStackTrace();
         
      }
      
      //create a new frame and give it a title
      frame.setDefaultLookAndFeelDecorated(true);
      frame = new JFrame("My First GUI Application");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLayout(new BorderLayout());
      
      desktop = new JDesktopPane();
      scrollPane = new JScrollPane();
      statusLabel = new JLabel();
      panel = new JPanel();
      labelPanel = new JPanel();
      
      //set border, size, and layout
      labelPanel.setLayout(new BorderLayout());
      
      statusLabel.setBorder(BorderFactory.createLoweredBevelBorder());
      statusLabel.setMinimumSize(new Dimension(0, 18));
      statusLabel.setPreferredSize(new Dimension(0, 18));
      
      //add a label to the GUI
      JLabel label = new JLabel("Hey, this is my first GUI app!");
      frame.getContentPane().add(label);
      
      //build menu
      JMenuBar menuBar = new JMenuBar();
      JMenu fileMenu = new JMenu("File");
      JMenu helpMenu = new JMenu("Help");
      JMenuItem exitItem = new JMenuItem("Exit");
      JMenuItem aboutItem = new JMenuItem("About");
      fileMenu.add(exitItem);
      helpMenu.add(aboutItem);
      menuBar.add(fileMenu);
      menuBar.add(helpMenu);
      
      //setup the panel
      panel.setLayout(new BorderLayout());
      splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
      splitPane.setOneTouchExpandable(true);
      splitPane.setDividerLocation(200);
      splitPane.setContinuousLayout(true);
      
      splitPane.add(desktop, JSplitPane.RIGHT);
      splitPane.add(scrollPane, JSplitPane.LEFT);
      
      panel.add(splitPane, BorderLayout.CENTER);
      labelPanel.add(statusLabel, BorderLayout.CENTER);
      
      //setup and show frame
      frame.getContentPane().add(labelPanel, BorderLayout.SOUTH);
      frame.getContentPane().add(panel, BorderLayout.CENTER);
      
      //show GUI
      frame.setSize(1280, 800);
      frame.setJMenuBar(menuBar);
      frame.setVisible(true);
      
      //add listeners to exit menu item
      exitItem.addActionListener(
                                 
         new java.awt.event.ActionListener() {
         
            public void actionPerformed(ActionEvent e) {
               exitActionPerformed();
            }
         
         }
         
      );
      
      //add listeners to about menu item
      aboutItem.addActionListener(
                                 
         new java.awt.event.ActionListener() {
         
            public void actionPerformed(ActionEvent e) {
               aboutActionPerformed();
            }
         
         }
                                 
      );

   } //end of initComponents
   
   //add these methods somewhere inside MyFirstGUIApp
   public void exitActionPerformed() {
      frame.dispose();
   }
   
   public void aboutActionPerformed() {
      JOptionPane.showMessageDialog(null, "Thanks for using my app!");
   }

}
