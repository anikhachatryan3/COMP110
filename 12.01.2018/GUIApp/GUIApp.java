//Name: Ani Khachatryan
//Date: 12.01.2018
//App: GUIApp
//Purpose:

//awt
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Cursor;

//awt event
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

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
import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.JInternalFrame;
import javax.swing.SwingUtilities;

//swing event
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;

//swing tree
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;


public class GUIApp {

   private JFrame frame;
   private JPanel panel;
   private JScrollPane scrollPane;
   private JDesktopPane desktop;
   private JSplitPane splitPane;
   private JPanel labelPanel;
   private JLabel statusLabel;
   private JMenuBar menuBar;
   private JMenu fileMenu;
   private JMenu helpMenu;
   private JMenuItem exitItem;
   private JMenuItem aboutItem;
   
   //constructor
   public GUIApp() {
      
      initComponents();
      statusLabel.setText("Initialization complete.");
      
   }
   
   //create a GUI and make it visible to user
   private void initComponents() {
      
      setLookAndFeel();
      buildDesktop();
      buildMenu();
      addMenuListeners();
      buildPanel();
      buildFrame();
      
      try {
         
         UIManager.setLookAndFeel(
            UIManager.getCrossPlatformLookAndFeelClassName()
         );
         
      }
      catch(Exception e) {
         
         e.printStackTrace();
         
      }
      
      //create a new frame and give it a title
//      frame.setDefaultLookAndFeelDecorated(true);
//      frame = new JFrame("My GUI Application");
//      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//      frame.setLayout(new BorderLayout());
      
      desktop = new JDesktopPane();
//      panel = new JPanel();
//      splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
//      scrollPane = new JScrollPane();
//      labelPanel = new JPanel();
//      statusLabel = new JLabel();
      
      //set border, size, and layout
      labelPanel.setLayout(new BorderLayout());
      
//      statusLabel.setBorder(BorderFactory.createLoweredBevelBorder());
//      statusLabel.setMinimumSize(new Dimension(0, 18));
//      statusLabel.setPreferredSize(new Dimension(0, 18));
      
      //add a label to the GUI
      JLabel label = new JLabel("Hey, this is my first GUI app!");
      frame.getContentPane().add(label);
      
//      //build menu
//      JMenuBar menuBar = new JMenuBar();
//      JMenu fileMenu = new JMenu("File");
//      JMenu helpMenu = new JMenu("Help");
//      JMenuItem exitItem = new JMenuItem("Exit");
//      JMenuItem aboutItem = new JMenuItem("About");
//      fileMenu.add(exitItem);
//      helpMenu.add(aboutItem);
//      menuBar.add(fileMenu);
//      menuBar.add(helpMenu);
      
      //setup the panel
//      panel.setLayout(new BorderLayout());
      splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
//      splitPane.setOneTouchExpandable(true);
//      splitPane.setDividerLocation(200);
//      splitPane.setContinuousLayout(true);
//
//      splitPane.add(desktop, JSplitPane.RIGHT);
//      splitPane.add(scrollPane, JSplitPane.LEFT);
      
      panel.add(splitPane, BorderLayout.CENTER);
      labelPanel.add(statusLabel, BorderLayout.CENTER);
      
      //setup and show frame
//      frame.getContentPane().add(labelPanel, BorderLayout.SOUTH);
//      frame.getContentPane().add(panel, BorderLayout.CENTER);
      
      //show GUI
//      frame.setSize(1280, 800);
//      frame.setJMenuBar(menuBar);
//      frame.setVisible(true);
      
      //add listeners to exit menu item
//      exitItem.addActionListener(
//
//         new java.awt.event.ActionListener() {
//
//            public void actionPerformed(ActionEvent e) {
//               exitActionPerformed();
//            }
//
//         }
//
//      );
//
//      //add listeners to about menu item
//      aboutItem.addActionListener(
//
//         new java.awt.event.ActionListener() {
//
//            public void actionPerformed(ActionEvent e) {
//               aboutActionPerformed();
//            }
//
//         }
//
//      );

   } //end of initComponents
   
   private void setLookAndFeel() {
      
      try {
         
         UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
         
      }
      catch(Exception e) {
         
         e.printStackTrace();
         
      }
      
   }
   
   private void buildDesktop() {
      
      desktop = new JDesktopPane();
      
   }
   
   private void buildMenu() {
      
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
      
   }
   
   //add these methods somewhere inside MyFirstGUIApp
   public void exitActionPerformed() {
      frame.dispose();
   }
   
   public void aboutActionPerformed() {
      JOptionPane.showMessageDialog(null, "Thanks for using my app!");
   }
   
   private void addMenuListeners() {
      
      //add listener for exit menu item
      exitItem.addActionListener(
         new java.awt.event.ActionListener() {
         
            public void actionPerformed(ActionEvent e) {
            
               exitActionPerformed();
               
            }
         
         }
      );
      
      //add listener for about menu item
      aboutItem.addActionListener(
      
         new java.awt.event.ActionListener() {
         
            public void actionPerformed(ActionEvent e) {
            
               aboutActionPerformed();
            
            }
         
         }
      
      );
      
   } //end addMenuListeners
   
   private void buildPanel() {
      
      panel = new JPanel();
      splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
      scrollPane = new JScrollPane();
      labelPanel = new JPanel();
      statusLabel = new JLabel();
      
      statusLabel.setBorder(BorderFactory.createLoweredBevelBorder());
      statusLabel.setMinimumSize(new Dimension(0, 18));
      statusLabel.setPreferredSize(new Dimension(0, 18));
      
      splitPane.setOneTouchExpandable(true);
      splitPane.setDividerLocation(200);
      splitPane.setContinuousLayout(true);
      splitPane.add(desktop, JSplitPane.RIGHT);
      splitPane.add(scrollPane, JSplitPane.LEFT);
      
      panel.setLayout(new BorderLayout());
      panel.add(splitPane, BorderLayout.CENTER);
      
      labelPanel.setLayout(new BorderLayout());
      labelPanel.add(statusLabel, BorderLayout.CENTER);
      
   } //end buildPanel
   
   private void buildFrame() {
      
      //create a new frame and show it
      frame.setDefaultLookAndFeelDecorated(true);
      frame = new JFrame("My GUI Application");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLayout(new BorderLayout());
      frame.setIconImage(Toolkit.getDefaultToolkit().getImage("images/csun.gif"));
      
      //add label panel
      frame.getContentPane().add(labelPanel, BorderLayout.SOUTH);
      
      //add main panel
      frame.getContentPane().add(panel, BorderLayout.CENTER);
      
      //add menu bar
      frame.setJMenuBar(menuBar);
      frame.setSize(1280, 800);
      frame.setVisible(true);
      
   } //end buildFrame

}
