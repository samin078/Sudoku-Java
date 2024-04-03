
package Sudoku;

import Main.DBConnection;
import Main.Selection;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
//import static sudoku.Sudoku.full;
//import static sudoku.Sudoku.mat;
//import static sudoku.Sudoku.prev;
import swing.Button;
import swing.MyTextField;


public class fourContinue  implements ActionListener,MouseListener{
    
    
    int number = 4;
    int chkcount=3;
    static int chkhint;
    static int k;
    static int lev;
    static String t ;
    
    
    
    Color bg = new Color(44, 40, 57);
    Color c1 = new Color(230, 221, 196);
    Color c2 = new Color(230, 245, 241);
    Color c3 = new Color(204, 204, 204);
    Color cg = new Color(54, 174, 124);
    Color cr = new Color(235, 83, 83);
    
    int[] mat[];
    int[] full[];
    int[] prev[];
    
    
    JFrame frame = new JFrame();
    MyTextField[][] txt = new MyTextField[4][4];
    JPanel[][] topPanel = new JPanel[4][4];
    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    Button chkButton = new Button();
    Button hintButton = new Button();
    Button submitButton = new Button();
    Button restartButton = new Button();
    Button backButton = new Button();
    Button saveButton = new Button();
    
    
    JLabel timeLabel = new JLabel();
    long elapsedTime = 0;
    long seconds = 0;
    long minutes = 0;
    long hours = 0;
    boolean started = false;
    String seconds_string = String.format("%02d", seconds);
    String minutes_string = String.format("%02d", minutes);
    String hours_string = String.format("%02d", hours);
    

    public fourContinue(String time,  int hint, int check, int level) {
        
        t =time;
        chkhint=hint;
        chkcount = check;
        
        lev = level;
        
        mat = new int [number][number];
        full = new int [number][number];
        prev = new int [number][number];
        
        String s1 = t.substring(6, 8);
        String s2 = t.substring(3,5 );
        String s3 = t.substring(0, 2);
        
        
        seconds = Integer.parseInt(s1);
        minutes = Integer.parseInt(s2);
        hours = Integer.parseInt(s3);
        elapsedTime = (hours * 3600000) + ((minutes )*60000) + ((seconds )* 1000 );
        
        
        
        start();
        panel = new JPanel();
        panel.setBounds(200, 200, 300, 300);
        panel.setLayout(new GridLayout(number, number, 8, 8));
        panel.setBackground(bg);
        panel.setVisible(true);
        
        panel2.setBounds(800, 300, 225, 125);
        panel2.setLayout(new GridLayout(3, 2,10,20));
        panel2.setBackground(bg);
        panel2.setVisible(true);
        
        
        
        frame.setTitle("4by4");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1300, 700);
        frame.getContentPane().setBackground(bg);
        frame.setLayout(null);
        


        for (int i = 0; i < number; i++) {

            for (int j = 0; j < number; j++) {
                
                topPanel[i][j] = new JPanel();
                topPanel[i][j].setLayout(new GridLayout(2, 2));
                txt[i][j] = new MyTextField();

                if((i>=2 && i<=3) && (j>=2 && j<=3))
                    txt[i][j].setBackground(c1);
                if((i>=0 && i<=1) && (j>=0 && j<=1))
                    txt[i][j].setBackground(c1);
                
                //txt[i][j].setBackground(c3);
                txt[i][j].setForeground(new Color(24, 29, 49));
                txt[i][j].setHorizontalAlignment(JTextField.CENTER);
                txt[i][j].setFont(new Font("sansserif", Font.BOLD, 22));
                txt[i][j].addActionListener(this);
                txt[i][j].addMouseListener(this);
                
                txt[i][j].setDocument(new limitTextTest(1));
                
                txt[i][j].addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyTyped(java.awt.event.KeyEvent e) {
                        char c = e.getKeyChar();
                        if (!Character.isDigit(c)) {
                            e.consume();
                        }
                    }
                });
                

                panel.add(txt[i][j]);
            }
        }
        
        timeLabel.setBounds(800, 180, 225, 60);
        timeLabel.setFont(new Font("Verdana", Font.PLAIN, 35));
        timeLabel.setBackground(c1);
        timeLabel.setForeground(new Color(24, 29, 49));
        timeLabel.setBorder(BorderFactory.createBevelBorder(1));
        timeLabel.setOpaque(true);
        timeLabel.setHorizontalAlignment(JTextField.CENTER);
        timeLabel.setText(t);
        
        chkButton.setFont(new Font("Verdana", Font.PLAIN, 20));
        chkButton.setBackground(c1);
        chkButton.setForeground(new Color(24, 29, 49));
        //chkButton.setBorder(BorderFactory.createBevelBorder(3));
        //chkButton.setOpaque(true);
        chkButton.setHorizontalAlignment(JTextField.CENTER);
        chkButton.setFocusable(false);
        chkButton.setText("Check("+chkcount+")");
        chkButton.addActionListener(this);
        //chkButton.addMouseListener(this);
        
        hintButton.setFont(new Font("Verdana", Font.PLAIN, 20));
        hintButton.setBackground(c1);
        hintButton.setForeground(new Color(24, 29, 49));
        //hintButton.setBorder(BorderFactory.createBevelBorder(1));
       
        //hintButton.setOpaque(true);
        hintButton.setHorizontalAlignment(JTextField.CENTER);
        hintButton.setFocusable(false);
        hintButton.setText("Hint("+chkhint+")");
        hintButton.addActionListener(this);
        //hintButton.addMouseListener(this);
        
        
        submitButton.setFont(new Font("Verdana", Font.PLAIN, 20));
        submitButton.setBackground(c1);
        submitButton.setForeground(new Color(24, 29, 49));
        submitButton.setHorizontalAlignment(JTextField.CENTER);
        submitButton.setFocusable(false);
        submitButton.setText("Submit");
        submitButton.addActionListener(this);
        
        
        restartButton.setFont(new Font("Verdana", Font.PLAIN, 20));
        restartButton.setBackground(c1);
        restartButton.setForeground(new Color(24, 29, 49));
        restartButton.setHorizontalAlignment(JTextField.CENTER);
        restartButton.setFocusable(false);
        restartButton.setText("Restart");
        restartButton.addActionListener(this);
        
        
        backButton.setFont(new Font("Verdana", Font.PLAIN, 20));
        backButton.setBackground(c1);
        backButton.setForeground(new Color(24, 29, 49));
        backButton.setHorizontalAlignment(JTextField.CENTER);
        backButton.setFocusable(false);
        backButton.setText("Back");
        backButton.addActionListener(this);
        
        
        saveButton.setFont(new Font("Verdana", Font.PLAIN, 20));
        saveButton.setBackground(c1);
        saveButton.setForeground(new Color(24, 29, 49));
        saveButton.setHorizontalAlignment(JTextField.CENTER);
        saveButton.setFocusable(false);
        saveButton.setText("save");
        saveButton.addActionListener(this);
        
        
        //panel2.add(timeLabel);
        panel2.add(chkButton);
        panel2.add(hintButton);
        panel2.add(submitButton);
        panel2.add(restartButton);
        panel2.add(backButton);
        panel2.add(saveButton);
        
        frame.add(panel);
        frame.add(panel2);
        //frame.add(panel2);
        frame.add(timeLabel);
        frame.setVisible(true);
        setValue();
        //save();
        
    }
    
    
    
    public void setValue()  {
        int N = number;
        
        getPrev();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (prev[i][j] != 0) {
                    txt[i][j].setText(Integer.toString(prev[i][j]));
                    txt[i][j].setEditable(false);
                    //System.out.print(mat[i][j] + " ");
                }else if(mat[i][j] != 0){
                    txt[i][j].setText(Integer.toString(mat[i][j]));
                    txt[i][j].setEditable(true);
                }
                //else txt[i][j].setText("");
                
            }
           // System.out.println();
        }
    }
    
    void start() {
        
        
        //started = false;
        timeLabel.setText(t);
        timer.start();
        
    }
    
    void stop() {
        timer.stop();
    }
    
    
    
    Timer timer = new Timer(1000, new ActionListener() {

        
        @Override
        public void actionPerformed(ActionEvent e) {

            elapsedTime = elapsedTime + 1000;
            hours = (elapsedTime / 3600000);
            minutes = (elapsedTime / 60000) % 60;
            seconds = (elapsedTime / 1000) % 60;
            seconds_string = String.format("%02d", seconds);
            minutes_string = String.format("%02d", minutes);
            hours_string = String.format("%02d", hours);
            timeLabel.setText(hours_string + ":" + minutes_string + ":" + seconds_string);

        }

    });
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        for (int i = 0; i < number; i++) {
                for (int j = 0; j < number; j++) {
                    //mat[i][j]=tx
                    if (txt[i][j].getText().length()!=0) {
                        mat[i][j]=Integer.parseInt(txt[i][j].getText());
                        //System.out.println((char) Integer.parseInt(txt[i][j].getText()));
                    }
                }
            }

             
        if (e.getSource() == chkButton && chkcount>0) {
            
            chkcount--;
            chkButton.setText("Check("+chkcount+")");
            Thread thread = new Thread() {

                public void run() {
                    for (int i = 0; i < number; i++) {
                        for (int j = 0; j < number; j++) {
                            if (full[i][j]!=mat[i][j] && txt[i][j].getText().length()!=0) {
                                txt[i][j].setBackground(cr);
                            }
                        }
                    }
                    // Duration of Check
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    for (int i = 0; i < number; i++) {
                        for (int j = 0; j < number; j++) {
                            //mat[i][j]=tx
                            if (full[i][j]!=mat[i][j]) {
                                
                                //txt[i][j].setForeground(new Color(24, 29, 49)); 
                                if ((i >= 2 && i <= 3) && (j >= 2 && j <= 3))
                                    txt[i][j].setBackground(c1);
                                else if ((i >= 0 && i <= 1) && (j >= 0 && j <= 1))
                                    txt[i][j].setBackground(c1);
                                else
                                    txt[i][j].setBackground(c2);
                                
                            }
                        }
                    }
                }
        };
        thread.start();
    }else if (e.getSource()==hintButton && chkhint>0){
            chkhint--;
            hintButton.setText("Hint("+chkhint+")");
            
            Thread thread = new Thread() {
                int flag=0;
                public void run() {
            for (int i = 0; i < number; i++) {
                for (int j = 0; j < number; j++) {
                    //mat[i][j]=tx
                    if (txt[i][j].getText().length()==0 || full[i][j]!=mat[i][j]) {
                        txt[i][j].setText(Integer.toString(full[i][j]));
                        txt[i][j].setBackground(cg);
                        flag=1;
                        break; 
                    }
                }
                if(flag==1)break;
            }
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    for (int i = 0; i < number; i++) {
                        for (int j = 0; j < number; j++) {
                            //mat[i][j]=tx
                            if (full[i][j]!=mat[i][j]) {
                                
                                //txt[i][j].setForeground(new Color(24, 29, 49)); 
                                if ((i >= 2 && i <= 3) && (j >= 2 && j <= 3))
                                    txt[i][j].setBackground(c1);
                                else if ((i >= 0 && i <= 1) && (j >= 0 && j <= 1))
                                    txt[i][j].setBackground(c1);
                                else
                                    txt[i][j].setBackground(c2);
                                
                            }
                        }
                    }
                }
        };
        thread.start();
            
            
            
            
    }else if (e.getSource()==submitButton){
        
        int flag=0;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (txt[i][j].getText().length()==0) {
                    flag=1;
                    break; 
                }else if (full[i][j]!=mat[i][j]) {
                    flag=2;
                    break;
                }
            }
        }
        if(flag==1){
            JOptionPane.showMessageDialog(frame, "Fill all the boxes!", "Error",JOptionPane.ERROR_MESSAGE);
        }
        else if(flag==2){
            JOptionPane.showMessageDialog(frame, "Incorrect Answer", "Error",JOptionPane.ERROR_MESSAGE);
        }else {
            stop();
            String time = timeLabel.getText();
            JOptionPane.showMessageDialog(frame, "Congratulations! \nYour Time was "+time);
        }
    }else if (e.getSource()==restartButton){
        
        
        int dialogButton = JOptionPane.YES_NO_OPTION;
            JOptionPane.showConfirmDialog (frame, "Are you sure?","WARNING", dialogButton);
        if(dialogButton == JOptionPane.YES_OPTION) {
                reset();
            if(dialogButton == JOptionPane.NO_OPTION) {
                  frame.remove(dialogButton);
                }
        }
    }else if (e.getSource()==saveButton){
        
        stop();
        savePrev();
        frame.dispose();
        
    }else if (e.getSource()==backButton){
        
        
        int dialogButton = JOptionPane.YES_NO_OPTION;
            JOptionPane.showConfirmDialog (frame, "Are you sure?","WARNING", dialogButton);
        if(dialogButton == JOptionPane.YES_OPTION) {
                frame.dispose();
                  Selection s = new Selection();
                  s.setVisible(true);
            if(dialogButton == JOptionPane.NO_OPTION) {
                  frame.remove(dialogButton);
                }
        }
    }
    
     
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
       
    }
    

    @Override
    public void mouseReleased(MouseEvent e) {
                 
    }
    
    @Override
    public void mouseEntered(MouseEvent e) {
        
        MyTextField txt1 = (MyTextField) e.getComponent();
        
        for (int x = 0; x < number; x++) {
            for (int y = 0; y < number; y++) {
                if (txt[x][y] == txt1) {
                    for (int i = 0; i < number; i++) {
                        txt[i][y].setBackground(c3);
                    }
                    for (int i = 0; i < number; i++) {
                        txt[x][i].setBackground(c3);
                    }
                    if((x<=1) && (y<=1)){
                        for (int i = 0; i <= 1; i++) {
                            for (int j = 0; j <= 1; j++) 
                        txt[i][j].setBackground(c3);
                    }
                    }else if((x<=1) && (y>=2)){
                        
                        for (int i = 0; i <= 1; i++) {
                            for (int j = 2; j <= 3; j++) 
                        txt[i][j].setBackground(c3);
                        }
                    }else if((x>1) && (y>1)){
                        
                        for (int i = 2; i <= 3; i++) {
                            for (int j = 2; j <= 3; j++) 
                        txt[i][j].setBackground(c3);
                        }
                    }else if((x>1) && (y<=1)){
                        
                        for (int i = 2; i <= 3; i++) {
                            for (int j = 0; j <= 1; j++) 
                        txt[i][j].setBackground(c3);
                    }
                    
                    }
                    
                    //else if((i>=0 && i<=1) && (j>=0 && j<=1))
                    //txt[i][j].setBackground(c1);
                }
            }
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if((i>=2 && i<=3) && (j>=2 && j<=3))
                    txt[i][j].setBackground(c1);
                else if((i>=0 && i<=1) && (j>=0 && j<=1))
                    txt[i][j].setBackground(c1);
                else txt[i][j].setBackground(c2); 
            }
        }
    }

    private void reset() {
        elapsedTime = 0;
        seconds = 0;
        minutes = 0;
        hours = 0;
    
        start();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (prev[i][j] != 0) {
                    txt[i][j].setText(Integer.toString(mat[i][j]));
                    txt[i][j].setEditable(false);
                    //System.out.print(mat[i][j] + " ");
                }
                else txt[i][j].setText("");
                
            }
           // System.out.println();
        }
    }
    
    
    class limitTextTest extends PlainDocument {

    private int limit;

    limitTextTest(int limit) {
        super();
        this.limit = limit;
    }

    limitTextTest(int limit, boolean upper) {
        super();
        this.limit = limit;
    }

    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
        if (str == null) {
            return;
        }
        if ((getLength() + str.length()) <= limit) {
            super.insertString(offset, str, attr);
        }
    }
}
    
    
    private void savePrev(){
        Connection dbconn = DBConnection.connectDB();
        if(dbconn != null){
            
        try {
            
            PreparedStatement st;
            String sql = "DELETE FROM saveprev";
                st = (PreparedStatement) dbconn.prepareStatement(sql);
            st.executeUpdate();
            
            sql = "DELETE FROM savemat";
                st = (PreparedStatement) dbconn.prepareStatement(sql);
            st.executeUpdate();
            
            sql = "DELETE FROM savefull";
                st = (PreparedStatement) dbconn.prepareStatement(sql);
            st.executeUpdate();
            
            sql = "DELETE FROM saver";
                st = (PreparedStatement) dbconn.prepareStatement(sql);
            st.executeUpdate();
            
                 sql = "INSERT INTO saveprev (ind, zero, one, two, three) VALUES (?, ?, ?, ?, ?)";
                st = (PreparedStatement) dbconn.prepareStatement(sql);
            for (int i = 1; i < 5; i++) {
                for (int j = 0; j < number; j++) {
                    st.setString(j+2, Integer.toString(prev[i-1][j])); 
                }
                    st.setString(1, Integer.toString(i-1));
                    int res =  st.executeUpdate();
            }
            
            sql = "INSERT INTO savefull (ind, zero, one, two, three) VALUES (?, ?, ?, ?, ?)";
                st = (PreparedStatement) dbconn.prepareStatement(sql);
            for (int i = 1; i < 5; i++) {
                for (int j = 0; j < number; j++) {
                    st.setString(j+2, Integer.toString(full[i-1][j])); 
                }
                    st.setString(1, Integer.toString(i-1));
                    int res =  st.executeUpdate();
            }
            
             sql = "INSERT INTO savemat (ind, zero, one, two, three) VALUES (?, ?, ?, ?, ?)";
                st = (PreparedStatement) dbconn.prepareStatement(sql);
            for (int i = 1; i < 5; i++) {
                for (int j = 0; j < number; j++) {
                    st.setString(j+2, Integer.toString(mat[i-1][j])); 
                }
                    st.setString(1, Integer.toString(i-1));
                    int res =  st.executeUpdate();
            }
            
            sql = "INSERT INTO saver (name, time, level, hint, chek) VALUES (?, ?, ?, ?, ?)";
                st = (PreparedStatement) dbconn.prepareStatement(sql);

                    st.setString(1, "samin");
                    st.setString(2, timeLabel.getText());
                    st.setString(3, Integer.toString(lev));
                    st.setString(4, Integer.toString(chkhint));
                    st.setString(5, Integer.toString(chkcount));
                    int res =  st.executeUpdate();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(fourContinue.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
            System.out.println("The Connection is not available");
        }
    }
    
    
    private void getPrev(){
        Connection dbconn = DBConnection.connectDB();
        if(dbconn != null){    
        try {
            
            PreparedStatement st;
            String sql = "SELECT * FROM savemat";
            st = (PreparedStatement) dbconn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            int i=0;
            while (rs.next()){
            //for (int i = 1; i < 5; i++) {
                
                for (int j = 0; j < number; j++) {
                    mat[i][j]=Integer.parseInt(rs.getString(j+2));  
                }
                i++;
            }
            
            sql = "SELECT * FROM saveprev";
            st = (PreparedStatement) dbconn.prepareStatement(sql);
            rs = st.executeQuery();
            i=0;
            while (rs.next()){
            
                for (int j = 0; j < number; j++) {
                    prev[i][j]=Integer.parseInt(rs.getString(j+2));  
                }
                i++;
            }
            sql = "SELECT * FROM savefull";
            st = (PreparedStatement) dbconn.prepareStatement(sql);
            rs = st.executeQuery();
            i=0;
            while (rs.next()){
                for (int j = 0; j < number; j++) {
                    full[i][j]=Integer.parseInt(rs.getString(j+2));  
                }
                i++;
            }
            /*
            sql = "DELETE FROM saveprev";
                st = (PreparedStatement) dbconn.prepareStatement(sql);
            st.executeUpdate();
            sql = "DELETE FROM savemat";
                st = (PreparedStatement) dbconn.prepareStatement(sql);
            st.executeUpdate();
            sql = "DELETE FROM saver";
                st = (PreparedStatement) dbconn.prepareStatement(sql);
            st.executeUpdate();
            */     
            
        } catch (SQLException ex) {
            Logger.getLogger(fourContinue.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
            System.out.println("The Connection is not available");
        }
    }
    
    
    
    private void update(String name, String time, String level){
        Connection dbconn = DBConnection.connectDB();
        
        if(dbconn != null){   
        try {
            
            PreparedStatement st;
            String sql = "INSERT INTO leaderboard (name, time, level) VALUES (?, ?, ?)";
            st = (PreparedStatement) dbconn.prepareStatement(sql);
            st.setString(1, name); 
            st.setString(2, time);
            st.setString(3, level);
            st.executeUpdate(); 
        } catch (SQLException ex) {
            Logger.getLogger(fourContinue.class.getName()).log(Level.SEVERE, null, ex);
        }
        }else{
            System.out.println("The Connection is not available");
        }
    }
    
    
}
