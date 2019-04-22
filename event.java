
import com.sun.org.apache.xpath.internal.operations.Plus;
import java.awt.*;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.Font;
import java.awt.color.ColorSpace;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class Main extends JFrame implements ActionListener {

    static Connection conn;

    int prev = -1;
    int z = 0;
    
   
    

    JLabel title = new JLabel("Event Management System");
    JButton login_bt = new JButton("Login");
    JLabel Studentname = new JLabel(" Enter Name   ");
    JTextField enter_student_name = new JTextField();
    JLabel stallName = new JLabel(" Enter Stall Name    ");
    JTextField enter_stall = new JTextField();
    JLabel age = new JLabel(" Enter Age       ");
    JTextField enter_age = new JTextField();
    JLabel college = new JLabel(" Enter College");
    JTextField enter_college = new JTextField();
    JLabel event = new JLabel(" Enter Event    ");
    JTextField enter_event = new JTextField();
    ButtonGroup group = new ButtonGroup();
    JPanel vendor_panel = new JPanel(new GridLayout(6, 1));
    JPanel sponsor_panel = new JPanel(new GridLayout(4, 1));
    JLabel sponsorName = new JLabel("Enter Sponsor Name  ");
    JTextField enter_sponsor = new JTextField();
    JLabel amount = new JLabel("Enter amount                ");
    JTextField enter_amount = new JTextField();
    JPanel participant_regnow = new JPanel(new FlowLayout());
    JPanel sponsor_regnow = new JPanel(new FlowLayout());
    JPanel vendor_regnow = new JPanel(new FlowLayout());
    JLabel sponsor_company = new JLabel("Enter sponor company");
    JTextField enter_sponsor_company = new JTextField();
    JFrame events_frame = new JFrame();
    
    JButton back=new JButton();

    JFrame sponsor_frame = new JFrame();
    JLabel display_vendor_name = new JLabel("Vendor name");
    JLabel display_Vendor_company = new JLabel("Company name");
    JLabel display_vendor_nostall = new JLabel("No of stalls");
    JLabel display_vendor_openingtime = new JLabel("Opening time");
    JLabel display_vendor_closingtime = new JLabel("Closing time");
    JButton vendor_alter = new JButton("ALTER");
    JButton vendor_delete = new JButton("DELETE");
    JLabel opening_time_label = new JLabel("Alter opening time");
    JLabel closing_time_label = new JLabel("Alter closing time");
    JLabel nostalls_label = new JLabel("Alter number of stalls");
    JTextField opening_time_field = new JTextField();
    JTextField closing_time_field = new JTextField();
    JTextField nostalls_field = new JTextField();
    JLabel enter_no_of_stalls = new JLabel("Enter the number of stalls");
    JTextField enter_no_of_stalls_field = new JTextField();
    JLabel enter_openingtime = new JLabel("Enter the opening time");
    JLabel enter_closingtime = new JLabel("Enter the closing time");
    JTextField enter_openingtime_field = new JTextField();
    JTextField enter_closingtime_field = new JTextField();
    JLabel enter_vendor_company = new JLabel("Enter the name of the company");
    JTextField enter_vendor_company_field = new JTextField();

    JLabel login = new JLabel("Login");
    JLabel username = new JLabel();
    JTextField username_field = new JTextField();
    JPasswordField password_field = new JPasswordField();

    JLabel password = new JLabel();
    JLabel register = new JLabel("New User? ");
    JButton reg_bt = new JButton("Register");
    JPanel panel = new JPanel(new FlowLayout());

    JPanel panel1 = new JPanel(new FlowLayout());
    JPanel panel2 = new JPanel(new FlowLayout());
    JPanel panel3 = new JPanel(new FlowLayout());
    JPanel panel4 = new JPanel(new FlowLayout());
    JPanel panel5 = new JPanel(new FlowLayout());
    JPanel panel9 = new JPanel(new FlowLayout());

    JFrame register_frame = new JFrame();
    JFrame participant_frame = new JFrame();
    JFrame vendor_frame = new JFrame();

    JLabel display_participant_name = new JLabel("Name");
    JLabel display_participant_age = new JLabel("        Age");
    JLabel display_participant_college = new JLabel("   College");
    JLabel display_participant_event = new JLabel("      Event");

    JButton participant_new = new JButton("New");
    JButton participant_search = new JButton("Search");
    JButton participant_delete = new JButton("Delete");
    Choice participant_choice = new Choice();
    JButton participant_confirm = new JButton("Confirm");

    JLabel display_sponsor_name = new JLabel("Name");
    JLabel display_sponsor_company = new JLabel("Company");
    JLabel display_sponsor_amount = new JLabel("Amount");
    JTextField alter_amount_field = new JTextField();
    JButton sponsor_alter = new JButton("Alter amount");
    JButton sponsor_delete = new JButton("Delete");
    JLabel sponsor_amount_label = new JLabel("Alter the amount");

    JLabel register_label = new JLabel("Register Your Account");
    JLabel enter_username = new JLabel("Set Username");
    JLabel enter_password = new JLabel("Set Password");
    JTextField enter_ufield = new JTextField();
    JPasswordField enter_pfield = new JPasswordField();

    JComboBox type = new JComboBox();

    JButton participant_regButton = new JButton("Register Now");
    JButton sponsor_regButton = new JButton("Register Now");
    JButton vendor_regButton = new JButton("Register Now");

    JPanel temp = new JPanel();
    JCheckBox vendor = new JCheckBox("vendor");
    JCheckBox participant = new JCheckBox("participant");
    JCheckBox sponsor = new JCheckBox("sponsor");
    JLabel vendorName = new JLabel("  Enter Name             ");
    JTextField enter_vendor_name = new JTextField();
    JPanel participant_choice_panel = new JPanel(new FlowLayout());

    public Main() throws SQLException {
        events_frame.setLayout(new GridLayout(1, 2));
        
        vendor_panel.setBorder(BorderFactory.createLineBorder(new Color(17,12,17), 10));
        
        participant_frame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent we) {
            }

            @Override
            public void windowClosing(WindowEvent we) {
           
                    participant_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                                        vendor_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                                        sponsor_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                                        

                    
                 
                   
               
               
                
                   
            }

            @Override
            public void windowClosed(WindowEvent we) {
            }

            @Override
            public void windowIconified(WindowEvent we) {
            }

            @Override
            public void windowDeiconified(WindowEvent we) {
            }

            @Override
            public void windowActivated(WindowEvent we) {
            }

            @Override
            public void windowDeactivated(WindowEvent we) {
            }
        });
        
        
        
        vendor_frame.addWindowListener(new WindowListener() {
             @Override
            public void windowOpened(WindowEvent we) {
            }

            @Override
            public void windowClosing(WindowEvent we) {
           
                    vendor_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    participant_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    sponsor_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                    
                 
                   
               
               
                
                   
            }

            @Override
            public void windowClosed(WindowEvent we) {
                
            }

            @Override
            public void windowIconified(WindowEvent we) {
            }

            @Override
            public void windowDeiconified(WindowEvent we) {
            }

            @Override
            public void windowActivated(WindowEvent we) {
            }

            @Override
            public void windowDeactivated(WindowEvent we) {
            }
        });
        
       
        
        
        sponsor_frame.addWindowListener(new WindowListener() {
             @Override
            public void windowOpened(WindowEvent we) {
            }

            @Override
            public void windowClosing(WindowEvent we) {
           
                    vendor_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    participant_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    sponsor_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                    
                 
                   
               
               
                
                   
            }

            @Override
            public void windowClosed(WindowEvent we) {
                
            }

            @Override
            public void windowIconified(WindowEvent we) {
            }

            @Override
            public void windowDeiconified(WindowEvent we) {
            }

            @Override
            public void windowActivated(WindowEvent we) {
            }

            @Override
            public void windowDeactivated(WindowEvent we) {
            }
        });
        
        
        
         register_frame.addWindowListener(new WindowListener() 
        {
             @Override
            public void windowOpened(WindowEvent we) {
            }

            @Override
            public void windowClosing(WindowEvent we) {
                register_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            
           
             }

            @Override
            public void windowClosed(WindowEvent we) {
                
            }

            @Override
            public void windowIconified(WindowEvent we) {
            }

            @Override
            public void windowDeiconified(WindowEvent we) {
            }

            @Override
            public void windowActivated(WindowEvent we) {
            }

            @Override
            public void windowDeactivated(WindowEvent we) {
            }
        });
         
         events_frame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent we) {
            }

            @Override
            public void windowClosing(WindowEvent we) {
                events_frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                events_frame.getContentPane().removeAll();
                
                
              
            }

            @Override
            public void windowClosed(WindowEvent we) {
            }

            @Override
            public void windowIconified(WindowEvent we) {
            }

            @Override
            public void windowDeiconified(WindowEvent we) {
            }

            @Override
            public void windowActivated(WindowEvent we) {
            }

            @Override
            public void windowDeactivated(WindowEvent we) {
            }
        });
         
         
         
        
        
        
        
        
        login.setFont(new Font("Comic Sans Ms", Font.PLAIN, 40));
        display_participant_name.setFont(new Font("Arial Rounded MT", Font.PLAIN,40));
        display_participant_age.setFont(new Font("Arial Rounded MT", Font.PLAIN,40));
        display_participant_college.setFont(new Font("Arial Rounded MT", Font.PLAIN,40));
        display_participant_event.setFont(new Font("Arial Rounded MT", Font.PLAIN,40));

        Color clr1 = new Color(245, 255, 250);
        events_frame.setVisible(false);
        events_frame.setBackground(Color.WHITE);
        events_frame.setSize(new Dimension(1200, 800));

        class danceoffpicture extends JPanel {

            private BufferedImage image;

            public danceoffpicture() {
                this.setBackground(clr1);
                try {
                    image = ImageIO.read(new File("C:\\Users\\Utkarsh\\Desktop\\danceoffpic.jpg"));
                } catch (IOException ex) {
                    // handle exception...
                }
            }

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, (this.getWidth() / 2) - 150, 0, this); // see javadoc for more info on the parameters            
            }

        }

        class pictureobj extends JPanel {

            public BufferedImage image;
            int x;

            public pictureobj(String s, int x, Color c) {
                this.setBorder(javax.swing.BorderFactory.createEmptyBorder());

                this.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.GRAY));
                this.setBackground(c);
                this.x = x;
                try {
                    image = ImageIO.read(new File(s));
                } catch (IOException ex) {
                    // handle exception...
                }

            }

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, (this.getWidth() / 2) - this.x, 0, this); // see javadoc for more info on the parameters            
            }
        }

        class participantpicture extends JPanel {

            private BufferedImage image;

            public participantpicture() {
                this.setBackground(Color.WHITE);
                try {
                    image = ImageIO.read(new File("C:\\Users\\Utkarsh\\Desktop\\participantpic.png"));
                } catch (IOException ex) {
                    // handle exception...
                }

            }

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, (this.getWidth() / 2) - 150, 0, this); // see javadoc for more info on the parameters            
            }

        }
        
       

        username_field.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        username_field.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.GRAY));
        password_field.setBorder(javax.swing.BorderFactory.createEmptyBorder());

        password_field.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.GRAY));

        username_field.setBackground(clr1);
        password_field.setBackground(clr1);
        
        

        this.setBackground(clr1);
        class eventpicture extends JPanel {

            private BufferedImage image;

            public eventpicture() {
                this.setBackground(Color.WHITE);
                System.out.println(this.getWidth());
                System.out.println(this.getHeight());
                this.setPreferredSize(new Dimension(1920, 400));

                try {
                    image = ImageIO.read(new File("C:\\Users\\Utkarsh\\Desktop\\pic.jpg"));

                } catch (IOException ex) {
                    // handle exception...
                }
            }

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, (this.getWidth() / 2) - 230, 0, this); // see javadoc for more info on the parameters            
            }

        }

        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/eventmanagementsystem?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root", "passwdis0");   // For MySQL

        Statement stmt = conn.createStatement();

        System.out.println("the connection works");

        String query = "select * from events";
        ResultSet set = stmt.executeQuery(query);
        while (set.next()) {
            String name = set.getString("name");
            participant_choice.addItem(name);

        }

        participant_regnow.add(participant_regButton);
        vendor_regnow.add(vendor_regButton);
        sponsor_regnow.add(sponsor_regButton);

        vendor_frame.setVisible(false);
        vendor_frame.setLayout(new GridLayout(1, 2));
        vendor_frame.setSize(1920,1080);
        sponsor_frame.setVisible(false);
        sponsor_frame.setLayout(new GridLayout(1, 2));
        sponsor_frame.setSize(1920,1080);


        participant_frame.setLayout(new GridLayout(1,2));
        JPanel grid_panel=new JPanel(new GridLayout(2, 1));
        
        
//        participant_frame.add(new participantpicture());


        JPanel tempJPanel1 = new JPanel(new GridLayout(2,1));
        tempJPanel1.add(display_participant_name);
   
        tempJPanel1.setBackground(Color.WHITE);
        tempJPanel1.add(display_participant_age);
        JPanel picture_panel=new JPanel(new GridLayout(2, 1));
        picture_panel.add(new participantpicture());
        
        

        JPanel tempJPanel2 = new JPanel(new GridLayout(2, 1));
        tempJPanel2.setBackground(Color.WHITE);

        tempJPanel2.add(display_participant_college);
      
        tempJPanel2.add(display_participant_event);
        grid_panel.add(tempJPanel1);
        grid_panel.add(tempJPanel2);
        picture_panel.add(grid_panel);
        participant_frame.add(picture_panel);
//        participant_frame.add();

        JPanel participant_button_panel = new JPanel(new GridLayout(6, 1));
        participant_button_panel.setBackground(new Color(17,12,17));
        JLabel welcome_participant=new JLabel(" Hello,Participant");
        welcome_participant.setFont(new Font("Arial Rounded MT",Font.PLAIN,60));
        welcome_participant.setForeground(Color.WHITE);
        JTextArea participation_instruction=new JTextArea();
        participation_instruction.setEditable(false);
        participation_instruction.setText("Thanks for taking part in our events,here you can register for \n a new event,search for other events "
                + "or deregister from a \nparticular event,Cheers!");
        
        participation_instruction.setBackground(new Color(17,12,17));
        participation_instruction.setFont(new Font("Arial Rounded MT",Font.PLAIN,30));
        participation_instruction.setForeground(Color.WHITE);
         participation_instruction.setBorder(BorderFactory.createLineBorder(new Color(17,12,17),10));

        
        
        
           JPanel small_panel1=new JPanel();
                      JPanel small_panel2=new JPanel();
                      small_panel2.setBorder(BorderFactory.createLineBorder(new Color(17,12,17),10));
           JPanel small_panel3=new JPanel();
           JPanel small_panel4=new JPanel();
           JPanel small_panel5=new JPanel();
           JPanel small_panel6=new JPanel();
           

           small_panel1.setBackground(new Color(17,12,17));
           small_panel2.setBackground(new Color(17,12,17));
           small_panel3.setBackground(new Color(17,12,17));
           small_panel4.setBackground(new Color(17,12,17));
           small_panel5.setBackground(new Color(17,12,17));
           small_panel6.setBackground(new Color(17,12,17));

           
                      
           small_panel1.add(participant_choice);
           small_panel2.add(participation_instruction);
           small_panel3.add(participant_new);
           small_panel4.add(participant_search);
           small_panel5.add(participant_delete);
           
           
           
           participant_new.setPreferredSize(new Dimension(150,70));
           participant_search.setPreferredSize(new Dimension(150,70));
           participant_delete.setPreferredSize(new Dimension(150,70));
           participant_choice.setPreferredSize(new Dimension(400,50));
           


           
           
           
           
           
        
        
       participant_button_panel.add(welcome_participant);
       participant_button_panel.add(small_panel2);
        participant_button_panel.add(small_panel1);
        participant_button_panel.add(small_panel3);
        participant_button_panel.add(small_panel4);
        participant_button_panel.add(small_panel5);

        participant_frame.add(participant_button_panel);
        participant_frame.setVisible(false);
        
        
        
        
        
        
        
         JPanel sponsor_grid_panel1=new JPanel(new GridLayout(2,1));
         JPanel sponsor_grid_Panel2=new JPanel(new GridLayout(4, 1));
         JPanel sponsor_info=new JPanel(new GridLayout(3, 1));
         JLabel welcome_sponsor=new JLabel("Welcome,Sponsor");
                 welcome_sponsor.setFont(new Font("Arial Rounded MT",Font.PLAIN,60));
                 
                 sponsor_grid_Panel2.setBackground(new Color(17,12,17));
                 
                 
                 JTextArea sponsor_instruction=new JTextArea();
                 sponsor_instruction.setEditable(false);
                 sponsor_instruction.setBackground(new Color(17,12,17));
                  sponsor_instruction.setForeground(Color.WHITE);
                  sponsor_instruction.setFont(new Font("Arial Rounded MT",Font.PLAIN,30));
                  sponsor_instruction.setText("Thank you for sponsoring our events, we couldn't have pulled off \n all our events sspowithout your help and support if you wish \n to alter the amount you can do so below.");
                      
          welcome_sponsor.setBackground(new Color(17,12,17));
          welcome_sponsor.setForeground(Color.WHITE);
        
         sponsor_info.add(display_sponsor_name);
         sponsor_info.add(display_sponsor_company);
         sponsor_info.add(display_sponsor_amount);
         
         display_sponsor_amount.setFont(new Font("Arial Rounded MT",Font.PLAIN,40));
                  display_sponsor_company.setFont(new Font("Arial Rounded MT",Font.PLAIN,40));
         display_sponsor_name.setFont(new Font("Arial Rounded MT",Font.PLAIN,40));


         
         sponsor_info.setBackground(Color.WHITE);
         JPanel sponsor_small_panel1=new JPanel(new FlowLayout());
          JPanel sponsor_small_panel2=new JPanel(new FlowLayout());
          sponsor_small_panel1.add(sponsor_amount_label);
          sponsor_small_panel1.add(alter_amount_field);
           sponsor_small_panel2.add(sponsor_alter);
           sponsor_small_panel2.add(sponsor_delete);
           sponsor_amount_label.setForeground(Color.WHITE);
           sponsor_amount_label.setFont(new Font("Arial Rounded MT",Font.PLAIN,30));
           sponsor_small_panel1.setBackground(new Color(17,12,17));
                      sponsor_small_panel2.setBackground(new Color(17,12,17));

           
           sponsor_alter.setPreferredSize(new Dimension(150,70));
           sponsor_delete.setPreferredSize(new Dimension(150,70));
           

         
           
         
         sponsor_grid_panel1.add(new pictureobj("C:\\Users\\Utkarsh\\Desktop\\sponsor.png",400 ,Color.WHITE));
          sponsor_grid_panel1.add(sponsor_info);
          
          
          sponsor_grid_Panel2.add(welcome_sponsor);
          sponsor_grid_Panel2.add(sponsor_instruction);
          sponsor_grid_Panel2.add(sponsor_small_panel1);
          sponsor_grid_Panel2.add(sponsor_small_panel2);
                    

          
          
          
          sponsor_frame.add(sponsor_grid_panel1);
          sponsor_frame.add(sponsor_grid_Panel2);
            
          
          sponsor_instruction.setBorder(BorderFactory.createLineBorder(new Color(17,12,17), 10));
         
          
         

          
         
       
         

//        sponsor_frame.add(new JPanel(new FlowLayout()).add(display_sponsor_name));
//        sponsor_frame.add(new JPanel(new FlowLayout()).add(display_sponsor_company));
//        sponsor_frame.add(new JPanel(new FlowLayout()).add(display_sponsor_amount));
//        JPanel sponsor_choice_panel = new JPanel(new FlowLayout());
        alter_amount_field.setPreferredSize(new Dimension(400,50));
//        sponsor_choice_panel.add(sponsor_amount_label);
//        sponsor_choice_panel.add(alter_amount_field);
//        sponsor_choice_panel.add(sponsor_alter);
//        sponsor_frame.add(sponsor_choice_panel);
//        sponsor_delete.setPreferredSize(new Dimension(100, 30));
//        JPanel temp_use = new JPanel(new FlowLayout());
//        temp_use.add(sponsor_delete);
//        sponsor_frame.add(new JPanel(new FlowLayout()).add(temp_use));
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        JPanel vendor_picture_panel=new JPanel();
        JPanel vendor_grid_panel=new JPanel(new GridLayout(2,1));
        vendor_grid_panel.add(new pictureobj("C:\\Users\\Utkarsh\\Desktop\\vendor.jpg",500 ,Color.WHITE));
        vendor_grid_panel.setBackground(Color.WHITE);
        
        JPanel vendor_info_panel1=new JPanel();
          JPanel vendor_info_panel2=new JPanel();
        JPanel vendor_info_panel3=new JPanel();
        JPanel vendor_info_panel4=new JPanel();
        JPanel vendor_info_panel5=new JPanel();
        
        
        vendor_info_panel1.add(display_vendor_name);
        
         vendor_info_panel2.add(display_Vendor_company);
        vendor_info_panel3.add(display_vendor_nostall);
        vendor_info_panel4.add(display_vendor_openingtime);
        vendor_info_panel5.add(display_vendor_closingtime);
        
        
          display_Vendor_company.setFont(new Font("Arial Rounded MT",Font.PLAIN,30));
                    display_vendor_name.setFont(new Font("Arial Rounded MT",Font.PLAIN,30));
          display_vendor_nostall.setFont(new Font("Arial Rounded MT",Font.PLAIN,30));
          display_vendor_openingtime.setFont(new Font("Arial Rounded MT",Font.PLAIN,30));
          display_vendor_closingtime.setFont(new Font("Arial Rounded MT",Font.PLAIN,30));


        
        
        vendor_info_panel1.setBackground(Color.WHITE);
        vendor_info_panel2.setBackground(Color.WHITE);
        vendor_info_panel3.setBackground(Color.WHITE);
        vendor_info_panel4.setBackground(Color.WHITE);
        vendor_info_panel5.setBackground(Color.WHITE);

                
             
        
        JPanel vendor_info=new JPanel(new GridLayout(5,1));
        vendor_info.add(vendor_info_panel1);
        vendor_info.add(vendor_info_panel2);
        vendor_info.add(vendor_info_panel3);
        vendor_info.add(vendor_info_panel4);
        vendor_info.add(vendor_info_panel5);
        vendor_grid_panel.add(vendor_info);
        
        
        
        
        
        
        
        
             
                
                JPanel vendor_grid_panel2=new JPanel(new GridLayout(6,1));
                
                JPanel vendor_small_panel1=new JPanel();
                 JPanel vendor_small_panel2=new JPanel();
                JPanel vendor_small_panel3=new JPanel(new FlowLayout());
                JPanel vendor_small_panel4=new JPanel(new FlowLayout());
                JPanel vendor_small_panel5=new JPanel(new FlowLayout());
                JPanel vendor_small_panel6=new JPanel(new FlowLayout());
                
                vendor_small_panel1.setBackground(new Color(17,12,17));
                vendor_small_panel6.setBackground(new Color(17,12,17));
                vendor_small_panel2.setBackground(new Color(17,12,17));
                vendor_small_panel3.setBackground(new Color(17,12,17));
                vendor_small_panel4.setBackground(new Color(17,12,17));
                vendor_small_panel5.setBackground(new Color(17,12,17));

                
                
                
                


  JLabel welcome_vendor=new JLabel("Welcome,Vendor");
  welcome_vendor.setForeground(Color.WHITE);
  
  welcome_vendor.setFont(new Font("Arial Rounded MT",Font.PLAIN,60));
  
  JTextArea vendor_instruction=new JTextArea();
  vendor_instruction.setBackground(new Color(17,12,17));
  vendor_instruction.setForeground(Color.WHITE);
  
  vendor_instruction.setEditable(false);
  vendor_instruction.setText("Thanks for setting up your stalls in our events, we hope you to have \n good sales,here you can alter the timing and number of \n your stalls below");
  vendor_instruction.setFont(new Font("Arial Rounded MT",Font.PLAIN,30));

  
  
  vendor_instruction.setBorder(BorderFactory.createLineBorder(new Color(17,12,17),10));
 
  vendor_small_panel3.add(nostalls_label);
    vendor_small_panel3.add(nostalls_field);
      vendor_small_panel4.add(opening_time_label);
  vendor_small_panel4.add(opening_time_field);
    vendor_small_panel5.add(closing_time_label);
  vendor_small_panel5.add(closing_time_field);
  vendor_small_panel6.add(vendor_alter);
  vendor_small_panel6.add(vendor_delete);
  
  
    nostalls_label.setFont(new Font("Arial Rounded MT",Font.PLAIN,30));
     opening_time_label.setFont(new Font("Arial Rounded MT",Font.PLAIN,30));
  closing_time_label.setFont(new Font("Arial Rounded MT",Font.PLAIN,30));


  
  
  nostalls_label.setForeground(Color.WHITE);
   opening_time_label.setForeground(Color.WHITE);
  closing_time_label.setForeground(Color.WHITE);
     vendor_delete.setPreferredSize(new Dimension(150,70));
      vendor_alter.setPreferredSize(new Dimension(150,70));



  
  
  



  
  
  
 
 
 vendor_grid_panel2.add(welcome_vendor);
  vendor_grid_panel2.add(vendor_instruction);

 
  vendor_grid_panel2.add(vendor_small_panel3);
 vendor_grid_panel2.add(vendor_small_panel4);
 vendor_grid_panel2.add(vendor_small_panel5);
  vendor_grid_panel2.add(vendor_small_panel6);

 vendor_grid_panel2.setBackground(new Color(17,12,17));
 


 

   vendor_frame.add(vendor_grid_panel);
   vendor_frame.add(vendor_grid_panel2);
        
        
        
        
        

//        vendor_frame.add(new JPanel(new FlowLayout()).add(display_vendor_name));
//        vendor_frame.add(new JPanel(new FlowLayout()).add(display_Vendor_company));
//        vendor_frame.add(new JPanel(new FlowLayout()).add(display_vendor_nostall));
//        vendor_frame.add(new JPanel(new FlowLayout()).add(display_vendor_openingtime));
//        vendor_frame.add(new JPanel(new FlowLayout()).add(display_vendor_closingtime));
//        JPanel vendor_choice_panel = new JPanel(new GridLayout(3,1));
//        vendor_choice_panel.add(nostalls_label);
        nostalls_field.setPreferredSize(new Dimension(200, 30));
//        vendor_choice_panel.add(nostalls_field);
//        vendor_choice_panel.add(opening_time_label);
        opening_time_field.setPreferredSize(new Dimension(200, 30));
//        vendor_choice_panel.add(opening_time_field);
//        vendor_choice_panel.add(closing_time_label);
        closing_time_field.setPreferredSize(new Dimension(200, 30));
//        vendor_choice_panel.add(closing_time_field);
//        vendor_choice_panel.add(vendor_alter);
//        JPanel tempuse2 = new JPanel();
//        tempuse2.add(vendor_delete);
//        vendor_frame.add(vendor_choice_panel);
//        vendor_frame.add(new JPanel(new FlowLayout()).add(tempuse2));

        temp.setLayout(new GridLayout(5, 1));

        this.setBackground(Color.GREEN);
        //register_frame.setSize(1920,1000);
        register_frame.setVisible(false);
        register_frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        group.add(vendor);
        group.add(participant);
        group.add(sponsor);

        this.setLayout(new GridLayout(4, 1));

        this.setBackground(clr1);

        register_frame.setLayout(new GridLayout(2, 1));

        title.setFont(new Font("serif", Font.PLAIN, 60));

        username_field.setPreferredSize(new Dimension(200, 30));
        password_field.setPreferredSize(new Dimension(200, 30));
        login.setFont(new Font("serif", Font.PLAIN, 30));
        register.setFont(new Font("serif", Font.PLAIN, 25));
        username.setFont(new Font("serif", Font.PLAIN, 20));
        password.setFont(new Font("serif", Font.PLAIN, 20));
        reg_bt.setPreferredSize(new Dimension(100, 50));
        reg_bt.setFont(new Font("serif", Font.PLAIN, 20));
        login_bt.setPreferredSize(new Dimension(100, 50));
        login_bt.setFont(new Font("serif", Font.PLAIN, 20));
        enter_student_name.setPreferredSize(new Dimension(200, 30));
        enter_college.setPreferredSize(new Dimension(200, 30));
        enter_age.setPreferredSize(new Dimension(200, 30));
        enter_event.setPreferredSize(new Dimension(200, 30));
        enter_vendor_name.setPreferredSize(new Dimension(200, 30));
        enter_stall.setPreferredSize(new Dimension(200, 30));
        enter_sponsor.setPreferredSize(new Dimension(200, 30));
        enter_amount.setPreferredSize(new Dimension(200, 30));

        panel1.setBackground(clr1);
        panel2.setBackground(clr1);
        panel3.setBackground(clr1);
        panel4.setBackground(clr1);
        panel5.setBackground(clr1);
        panel.setBackground(clr1);
        panel9.setBackground(clr1);

        panel.setLayout(new GridLayout(1, 2));

        panel.add(new eventpicture());
        panel.setBackground(clr1);

        panel1.add(login);

        panel2.add(username, new BorderLayout().SOUTH);

        panel2.add(username_field);
        panel2.add(new JLabel("             "));
        panel2.add(password);
        panel2.add(password_field);
        panel2.add(login_bt);
        panel4.add(register);
        panel4.add(reg_bt);

        this.add(panel);

        this.add(panel1);
        this.add(panel2);

        this.add(panel4);

        vendor_regButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    Statement stmt = conn.createStatement();
                    String username = enter_ufield.getText();
                    String password = enter_pfield.getText();

                    String query = "insert into user values(" + "'" + username + "'" + "," + "'" + password + "'" + "," + "'" + "vendor" + "')";
                    System.out.println(query);

                    int count = stmt.executeUpdate(query);
                    System.out.println(count);

                    String name = enter_vendor_name.getText();
                    String stallname = enter_stall.getText();
                    String openingtime = enter_openingtime_field.getText();
                    String closingtime = enter_closingtime_field.getText();
                    int no_of_stalls = Integer.parseInt(enter_no_of_stalls_field.getText());
                    Statement stmt2 = conn.createStatement();
                    String query1 = "insert into vendor values(" + "'" + name + "'" + "," + "'" + stallname + "'" + "," + "'" + no_of_stalls + "'" + "," + "'" + closingtime + "'" + "," + "'" + openingtime + "'" + "," + "'" + username + "'" + "," + "'" + password + "')";
                    int count1 = stmt2.executeUpdate(query1);
                    System.out.println(count1);
                    
                    JOptionPane.showMessageDialog(null,"You are now registered as a vendor");

                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
        
        vendor_alter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    int altered_stalls=Integer.parseInt(nostalls_field.getText());
                    String username=username_field.getText();
                    String openingtime=opening_time_field.getText();
                    String closingtime=closing_time_field.getText();
                    Statement stmt=conn.createStatement();
                    String query1="update vendor set no_of_stalls="+altered_stalls+" where username ="+"'"+username+"'";
                    String query2="update vendor set openingtime ="+"'"+openingtime+"' where username="+"'"+username+"'";
                   String query3="update vendor set closingtime ="+"'"+closingtime+"' where username="+"'"+username+"'";
                   int count1=stmt.executeUpdate(query1);
                   int count2=stmt.executeUpdate(query2);
                   int count3=stmt.executeUpdate(query3);
                    System.out.println(count1+count2+count3);                                                                   

                    
                    
                    
                    
                 
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                
              
            }
        });
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                events_frame.getContentPane().removeAll();
                events_frame.dispose();
                
                
            }
        });
        
        
        
        
        participant_regButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    Statement stmt = conn.createStatement();
                    String username = enter_ufield.getText();
                    String password = enter_pfield.getText();

                    String query = "insert into user values(" + "'" + username + "'" + "," + "'" + password + "'" + "," + "'" + "participant" + "')";
                    System.out.println(query);

                    int count = stmt.executeUpdate(query);
                    System.out.println(count);
                    String name = enter_student_name.getText();
                    String college = enter_college.getText();
                    int age = Integer.parseInt(enter_age.getText());
                    String events = enter_event.getText();

                    String query1 = "insert into participant values(" + "'" + name + "'" + "," + age + "," + "'" + college + "'" + "," + "'" + events + "'" + "," + "'" + username + "'" + "," + "'" + password + "')";

                    System.out.println(query1);

                    Statement stmt2 = conn.createStatement();
                    int count1 = stmt2.executeUpdate(query1);
                    
                    JOptionPane.showMessageDialog(null,"You are now registered as a participant");

                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
        
        
        sponsor_delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                try {
                    String username=username_field.getText();
                    Statement stmt=conn.createStatement();
                    String query="delete from sponsor where username ="+"'"+username+"'";
                    String query2="delete from user where username="+"'"+username+"'";
                    int count=stmt.executeUpdate(query);
                    int count1=stmt.executeUpdate(query2);
                    System.out.println(count);
                    
                    sponsor_frame.dispose();
                    
                    
                    JOptionPane.showMessageDialog(null,"Your account is now deleted");
                    
                    
                    
                    
                    
                    
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
                
                
            }
        });
        
        
        
        vendor_delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                 try {
                    String username=username_field.getText();
                    Statement stmt=conn.createStatement();
                    String query="delete from vendor where username ="+"'"+username+"'";
                    String query2="delete from user where username="+"'"+username+"'";
                    int count=stmt.executeUpdate(query);
                    int count1=stmt.executeUpdate(query2);
                    System.out.println(count);
                    vendor_frame.dispose();
                    
                    
                    
                    JOptionPane.showMessageDialog(null,"Your account is now deleted");
                    
                    
                    
                    
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        

        participant_search.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = "";
                String location = "";
                JPanel temp = new JPanel(new GridLayout(2, 1));
                JTextArea information_area = new JTextArea();
                information_area.setFont(new Font("Serif", Font.PLAIN, 25));
                JTextArea info = new JTextArea();
                ImageIcon back_icon=new ImageIcon("C:\\Users\\Utkarsh\\Desktop\\back.png");
                back.setIcon(back_icon);
                

                String time = "";
                String type = "";
                String image = "";
                String information = "";
                JPanel temp2=new JPanel(new GridLayout(2,1));
            
                temp.setBackground(Color.white);

                {
                    try {
                        events_frame.setTitle(participant_choice.getSelectedItem());

                        Statement stmt = conn.createStatement();
                        String query = "select * from events where name=" + "'" + participant_choice.getSelectedItem() + "'";

                        ResultSet set = stmt.executeQuery(query);

                        while (set.next()) {

                            name = set.getString("name");
                            location = set.getString("location");
                            time = set.getString("time");
                            type = set.getString("type");
                            image = set.getString("image");
                            System.out.println(image);
                            information = set.getString("info");

                            String[] path = image.split("/");
                            image = "";
                            for (int i = 0; i < path.length - 1; i++) {
                                image = image + path[i] + "//";

                            }
                            image = image + path[path.length - 1];
                            System.out.println(image);

                        }
                        temp.add(new pictureobj(image, 400, Color.white));
                        JPanel back_button_panel=new JPanel(new FlowLayout());
                        back_button_panel.setBackground(Color.WHITE);
             back.setBackground(Color.WHITE);
             back.setBorder(BorderFactory.createLineBorder(Color.BLACK,5));
//                        back.setForeground(Color.WHITE);
                        back.setFont(new Font("Arial Rounded MT",Font.PLAIN,30));
                        back.setOpaque(true);
                        
                        back_button_panel.add(back);
                        JPanel empty_panel=new JPanel();
                        empty_panel.setBackground(Color.WHITE);
                        
                       
                        temp.add(back_button_panel);
                        

                        info.setText("Name Of the Event:  " + name + "\n" + "Location:  " + location + "\n" + "Time:  " + time + "\n" + "Type:  " + type);
                        info.setFont(new Font("Serif", Font.BOLD, 35));

                        info.setEditable(false);
                        info.setBorder(javax.swing.BorderFactory.createEmptyBorder());
                        info.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.GRAY));

                        information_area.setText("    " + information);
                        information_area.setEditable(false);
                        information_area.setBorder(javax.swing.BorderFactory.createEmptyBorder());
                        information_area.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.GRAY));

                        temp2.add(info);
                        temp2.add(information_area);
                        
                        information_area.setBackground(new Color(16,12,17));
                        information_area.setForeground(Color.WHITE);
                        info.setBackground(new Color(17,12,17));
                        info.setForeground(Color.WHITE);
                        info.setBorder(BorderFactory.createLineBorder(new Color(17,12,17),10));
                        information_area.setBorder(BorderFactory.createLineBorder(new Color(17,12,17), 10));

                        events_frame.add(temp);
                        events_frame.add(temp2);
                        
                        

                    } catch (SQLException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

                events_frame.setVisible(true);

            }
        });

        sponsor_regButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    Statement stmt = conn.createStatement();
                    String username = enter_ufield.getText();
                    String password = enter_pfield.getText();

                    String query = "insert into user values(" + "'" + username + "'" + "," + "'" + password + "'" + "," + "'" + "sponsor" + "')";
                    System.out.println(query);

                    int count = stmt.executeUpdate(query);
                    System.out.println(count);

                    String sponsorname = enter_sponsor.getText();
                    int amount = Integer.parseInt(enter_amount.getText());
                    String sponsorcompany = enter_sponsor_company.getText();

                    Statement stmt2 = conn.createStatement();

                    String query1 = "insert into sponsor values(" + "'" + sponsorname + "'" + "," + amount + "," + "'" + sponsorcompany + "'" + "," + "'" + username + "'" + "," + "'" + password + "')";
                    int count1 = stmt2.executeUpdate(query1);
                    JOptionPane.showMessageDialog(null,"you are now registered as a Sponsor");

                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        sponsor_alter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                try {
                    int alteramount = Integer.parseInt(alter_amount_field.getText());
                    String username = username_field.getText();
                    String password = password_field.getText();

                    String query = "update sponsor set amount=" + alteramount + " where username = " + "'" + username + "'";

                    Statement stmt = conn.createStatement();

                    int count = stmt.executeUpdate(query);
                    System.out.println(count);
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        participant_new.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    String new_event = participant_choice.getSelectedItem();
                    Statement stmt = conn.createStatement();
                    String events = "";

                    String query = "Select * from participant where username=" + "'" + username_field.getText() + "'";
                    ResultSet set = stmt.executeQuery(query);
                    while (set.next()) {
                        events = set.getString("events");

                    }
                    events = events + "," + participant_choice.getSelectedItem();
                    query = "update participant set events=" + "'" + events + "' where username =" + "'" + username_field.getText() + "'";
                    int count = stmt.executeUpdate(query);
                    System.out.println(count);
                } catch (SQLException ex) {

                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);

                }

            }
        });

        participant_delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

            }
        });

        login_bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
               boolean flag=true;
                try {
                    String username = username_field.getText();
                    String password = password_field.getText();
                    Statement stmt = conn.createStatement();
                    String type = "";

                    int temp = 0;
                    String query = "select * from user";
                    ResultSet set = stmt.executeQuery(query);
                    while (set.next()) {
                        String uname = set.getString("username");
                        String pname = set.getString("password");
                        if (username.equals(uname) == true && password.equals(pname) == true) {
                            type = type + set.getString("type");
                            break;

                        }

                    }
                    if(type.equals(""))
                        flag=false;
                    if(flag)
                    {
                    Statement stmt2 = conn.createStatement();
                    String query1 = "select * from " + type;
                    System.out.println(query1);

                    ResultSet set1 = stmt2.executeQuery(query1);
                    while (set1.next()) {
                        if (type.equals("participant")) {
                            if (set1.getString("username").equals(username) == true && set1.getString("password").equals(password) == true) {
                                display_participant_name.setText("Name:   " + set1.getString("name"));
                                display_participant_age.setText("Age:   " + set1.getInt("age") + "");
                                display_participant_college.setText("College:  " + set1.getString("college"));
                                display_participant_event.setText("Events:   " + set1.getString("events"));

                            }
                        }
                        if (type.equals("vendor")) {
                            if (set1.getString("username").equals(username) == true && set1.getString("password").equals(password) == true) {
                                display_vendor_name.setText("Name:   " + set1.getString("name"));
                                display_Vendor_company.setText("Company: " + set1.getString("stallname"));
                                display_vendor_nostall.setText("Number Of Stalls:  " + set1.getInt("no_of_stalls"));
                                display_vendor_openingtime.setText("Opening Time:   " + set1.getString("openingtime"));
                                display_vendor_closingtime.setText("Closing time:   " + set1.getString("closingtime"));
                                opening_time_field.setText("");
                                closing_time_field.setText("");
                                nostalls_field.setText("");
                                

                            }

                        }
                        if (type.equals("sponsor")) {
                            if (set1.getString("username").equals(username) == true && set1.getString("password").equals(password) == true) {
                                display_sponsor_name.setText("Name: " + set1.getString("sponsorname"));
                                display_sponsor_amount.setText("Amount: " + set1.getString("amount"));
                                display_sponsor_company.setText("Company: " + set1.getString("sponsorcompany"));
                                alter_amount_field.setText("");
                                

                            }
                        }

                    }

                    if (type.equals("participant") == true) {
                        z = 0;
                    }
                    if (type.equals("vendor") == true) {
                        z = 2;
                    }
                    if (type.equals("sponsor") == true) {
                        z = 1;
                    }

                    if (z == 0) {
                        participant_frame.setVisible(true);
                        participant_frame.setSize(1920,1080);
                    }
                    if (z == 1) {
                        sponsor_frame.setVisible(true);
                    }
                    if (z == 2) {
                        vendor_frame.setVisible(true);
                    }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Looks like something is wrong");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    
        
        

        reg_bt.addActionListener(this);
        vendor.addActionListener(this);
        participant.addActionListener(this);
        sponsor.addActionListener(this);
        participant_new.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        participant_delete.addActionListener(this);
        participant_search.addActionListener(this);

        enter_ufield.setPreferredSize(new Dimension(200, 30));
        enter_pfield.setPreferredSize(new Dimension(200, 30));

        JPanel register_label1 = new JPanel(new GridLayout(3, 1));
        JPanel panel6 = new JPanel(new FlowLayout());
        JPanel panel7 = new JPanel(new FlowLayout());
        JPanel panel8 = new JPanel(new GridLayout(5, 1));
        

        
        
        
          
        register_label.setForeground(Color.GRAY);
        register_label.setFont(new Font("Courier New", Font.ITALIC, 40));
        JPanel p1 = new JPanel(new FlowLayout());
        p1.add(register_label);
        register_label1.add(new JPanel(new FlowLayout()));
        register_label1.add(p1);
        register_label1.add(new JPanel(new FlowLayout()));
        register_label1.setBorder(BorderFactory.createEtchedBorder((EtchedBorder.RAISED)));
        JPanel enter_values = new JPanel(new GridLayout(3, 1));
        panel6.setBackground(new Color(17,12,17));
        panel7.setBackground(new Color(17,12,17));
        register_frame.setBackground(new Color(17,12,17));
        panel6.add(enter_username);
        enter_username.setForeground(Color.WHITE);
        enter_password.setForeground(Color.WHITE);
        
         
        panel6.add(enter_ufield);
        panel7.add(enter_password);
        panel7.add(enter_pfield);
        JPanel black_panel=new JPanel();
        black_panel.setBackground(new Color(17,12,17));
        
       enter_values.add(black_panel);
       vendor_regnow.setBackground(new Color(17,12,17));
        enter_values.add(panel6);
        enter_values.add(panel7);
        enter_values.setBackground(new Color(17,12,17));
      
                     

        
       
        JPanel type = new JPanel();
      
       vendor.setFont(new Font("Calibri",Font.PLAIN,40));
       participant.setFont(new Font("Calibri",Font.PLAIN,40));
       sponsor.setFont(new Font("Calibri",Font.PLAIN,40));
       panel8.setBackground(new Color(238,238,238));
    type.setBorder(BorderFactory.createLineBorder(new Color(238,238,238),20));
       type.setBackground(new Color(238,238,238));
         panel8.setBorder(BorderFactory.createLineBorder(new Color(238,238,238),20));

        
        panel8.add(vendor);
        panel8.add(new Label());
        panel8.add(participant);
        panel8.add(new JLabel());
        panel8.add(sponsor);
        type.add(panel8);
        
        

        register_frame.add(new pictureobj("C:\\Users\\Utkarsh\\Desktop\\register.jpg",700,Color.WHITE));
        
        register_frame.add(enter_values);
        //register_frame.add(panel7);
        register_frame.add(type);

        JPanel temp10 = new JPanel(new FlowLayout());
        JPanel temp11 = new JPanel(new FlowLayout());
        JPanel temp12 = new JPanel(new FlowLayout());
        JPanel temp13 = new JPanel(new FlowLayout());
        temp10.setBackground(new Color(17,12,17));
                temp11.setBackground(new Color(17,12,17));

                       temp12.setBackground(new Color(17,12,17));
        temp13.setBackground(new Color(17,12,17));

        Studentname.setForeground(Color.WHITE);
                age.setForeground(Color.WHITE);
        college.setForeground(Color.WHITE);
        event.setForeground(Color.WHITE);
                Studentname.setFont(new Font("Arial Rounded MT",Font.PLAIN,30));
                       age.setFont(new Font("Arial Rounded MT",Font.PLAIN,30));
                              college.setFont(new Font("Arial Rounded MT",Font.PLAIN,30));
                                 event.setFont(new Font("Arial Rounded MT",Font.PLAIN,30));
                                 
                         





        temp10.add(Studentname);
        temp10.add(enter_student_name);
        temp11.add(age);
        temp11.add(enter_age);
        temp12.add(college);
        temp12.add(enter_college);
        temp13.add(event);
        temp13.add(enter_event);
        temp.add(temp10);
        temp.add(temp11);
        temp.add(temp12);
        temp.add(temp13);
        
        JPanel panel_containing_participant_regbt=new JPanel();
        panel_containing_participant_regbt.setBackground(new Color(17,12,17));
        panel_containing_participant_regbt.add(participant_regnow);
        temp.add(panel_containing_participant_regbt);
        participant_regnow.setBackground(new Color(17,12,17));
        sponsor_regnow.setBackground(new Color(17,12,17));
        
        
        
       
        
        

        JPanel temp14 = new JPanel(new FlowLayout());
        JPanel temp15 = new JPanel(new FlowLayout());
        temp14.add(vendorName);
         vendorName.setFont(new Font("Arial Rounded MT",Font.PLAIN,30));
         stallName.setFont(new Font("Arial Rounded MT",Font.PLAIN,30));
         enter_no_of_stalls.setFont(new Font("Arial Rounded MT",Font.PLAIN,30));
         enter_closingtime.setFont(new Font("Arial Rounded MT",Font.PLAIN,30));
         enter_openingtime.setFont(new Font("Arial Rounded MT",Font.PLAIN,30));





        
        temp14.add(enter_vendor_name);
        temp15.add(stallName);
        stallName.setForeground(Color.WHITE);
        
        temp15.add(enter_stall);
        JPanel temp16 = new JPanel(new FlowLayout());
        enter_no_of_stalls_field.setPreferredSize(new Dimension(200, 30));
        enter_closingtime_field.setPreferredSize(new Dimension(200, 30));
        enter_openingtime_field.setPreferredSize(new Dimension(200, 30));

        temp16.add(enter_no_of_stalls);
                enter_no_of_stalls.setForeground(Color.WHITE);

        
        temp16.add(enter_no_of_stalls_field);
        JPanel temp17 = new JPanel(new FlowLayout());
        JPanel temp18 = new JPanel(new FlowLayout());
        temp17.add(enter_closingtime);
                enter_closingtime.setForeground(Color.WHITE);

        temp17.add(enter_closingtime_field);
        temp18.add(enter_openingtime);
              enter_openingtime.setForeground(Color.WHITE);

        temp18.add(enter_openingtime_field);
        vendorName.setForeground(Color.WHITE);
        JPanel panel_containing_vendor_regbt=new JPanel(new FlowLayout());
        panel_containing_vendor_regbt.add(vendor_regnow);
        vendor_regButton.setBackground(new Color(0,128,128));
                participant_regButton.setBackground(new Color(0,128,128));
                        sponsor_regButton.setBackground(new Color(0,128,128));
        ImageIcon username_icon=new ImageIcon("C:\\Users\\Utkarsh\\Desktop\\username.png");
        username.setIcon(username_icon);
        
        ImageIcon password_icon=new ImageIcon("C:\\Users\\Utkarsh\\Desktop\\password.png");
                password.setIcon(password_icon);

        
        
        vendor_regButton.setPreferredSize(new Dimension(150,70));
                sponsor_regButton.setPreferredSize(new Dimension(150,70));
        participant_regButton.setPreferredSize(new Dimension(150,70));

        
        
        temp14.setBackground(new Color(17,12,17));     // changing colors of the vendor panel
        temp15.setBackground(new Color(17,12,17));
        temp16.setBackground(new Color(17,12,17));
        temp17.setBackground(new Color(17,12,17));
        temp18.setBackground(new Color(17,12,17));
        panel_containing_vendor_regbt.setBackground(new Color(17,12,17));

        vendor_panel.add(temp14);
        vendor_panel.add(temp15);
        vendor_panel.add(temp16);

        vendor_panel.add(temp18);
        vendor_panel.add(temp17);
        
        

        vendor_panel.add(panel_containing_vendor_regbt);

        JPanel panel16 = new JPanel(new FlowLayout());
        JPanel panel17 = new JPanel(new FlowLayout());

        panel16.add(sponsorName);
        sponsorName.setForeground(Color.WHITE);
                sponsorName.setFont(new Font("Arial Rounded MT",Font.PLAIN,30));
                      sponsor_company.setFont(new Font("Arial Rounded MT",Font.PLAIN,30));
                      amount.setFont(new Font("Arial Rounded MT",Font.PLAIN,30));
                            enter_username.setFont(new Font("Arial Rounded MT",Font.PLAIN,30));
                                    enter_password.setFont(new Font("Arial Rounded MT",Font.PLAIN,30));
                                            participant.setFont(new Font("Arial Rounded MT",Font.PLAIN,30));
                                                    vendor.setFont(new Font("Arial Rounded MT",Font.PLAIN,30));
                                                            sponsor.setFont(new Font("Arial Rounded MT",Font.PLAIN,30));







        sponsor_company.setForeground(Color.WHITE);
        amount.setForeground(Color.WHITE);
        
        
        panel16.add(enter_sponsor);
        JPanel temp19 = new JPanel(new FlowLayout());
        enter_sponsor_company.setPreferredSize(new Dimension(200, 30));
        temp19.add(sponsor_company);
        temp19.add(enter_sponsor_company);

        panel17.add(amount);
        panel17.add(enter_amount);
        panel16.setBackground(new Color(17,12,17));
        temp19.setBackground(new Color(17,12,17));
        panel17.setBackground(new Color(17,12,17));

        
        sponsor_panel.add(panel16);
        sponsor_panel.add(temp19);
        sponsor_panel.add(panel17);
         JPanel panel_containing_sponsor_regbt=new JPanel();
         panel_containing_sponsor_regbt.setBackground(new Color(17,12,17));
         panel_containing_sponsor_regbt.add(sponsor_regnow);
        sponsor_panel.add(panel_containing_sponsor_regbt);

    }
    
   

    public static void main(String[] args) throws SQLException {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
        }

        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/eventmanagementsystem?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root", "passwdis0");   // For MySQL

        Statement stmt = conn.createStatement();

        System.out.println("the connection works");

        setUIFont(new javax.swing.plaf.FontUIResource("Serif", Font.PLAIN, 20));

        Main ob = new Main();
        ob.setVisible(true);
        ob.setSize(1000, 1000);
        ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Register")) {
            register_frame.revalidate();
            register_frame.repaint();
            pack();
            register_frame.setVisible(true);

        }

        if (e.getActionCommand().equals("vendor")) {

            if (prev == 1) {
                register_frame.remove(temp);
            }
            if (prev == 2) {
                register_frame.remove(sponsor_panel);
            }

            repaint();

            System.out.println(e.getActionCommand());
            register_frame.add(vendor_panel);
            register_frame.revalidate();
            register_frame.repaint();
            pack();
            prev = 0;

        }
        if (e.getActionCommand().equals("participant")) {
            repaint();

            if (prev == 0) {
                register_frame.remove(vendor_panel);
            }
            if (prev == 2) {
                register_frame.remove(sponsor_panel);
            }

            repaint();

            System.out.println(e.getActionCommand());
            register_frame.add(temp);
            register_frame.revalidate();
            register_frame.repaint();
            pack();
            prev = 1;

        }

        if (e.getActionCommand().equals("sponsor")) {

            repaint();

            if (prev == 0) {
                register_frame.remove(vendor_panel);
            }
            if (prev == 1) {
                register_frame.remove(temp);
            }

            repaint();

            System.out.println(e.getActionCommand());
            register_frame.add(sponsor_panel);
            register_frame.revalidate();
            register_frame.repaint();
            pack();
            prev = 2;

        }
        if (e.getActionCommand().equals(login)) {

            if (z == 0) {

                participant_frame.setVisible(true);

            }
        }

    }

    public static void setUIFont(javax.swing.plaf.FontUIResource f) {
        java.util.Enumeration keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
            if (value instanceof javax.swing.plaf.FontUIResource) {
                UIManager.put(key, f);
            }
        }
    }
}
