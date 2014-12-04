
/*
*   I learnt about using scanners and useDelimiter at: http://www.javapractices.com/topic/TopicAction.do?Id=87
*/
// TEXT AREA .APPEND 
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter; 
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
        

public class Form1 extends javax.swing.JFrame {
    //Create a file chooser
    JFileChooser chooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter("Leopard", "leo", "lpr");
    String Current_file_name = "blank.leo";
    String[] fileClass_Name_array;
    String fileClass_Name = "blank";
    
    int nextLoopVal = 0;
    String inCodeVal = "nope";
    String[] inCodeValArray;
    /*String[] variableArrayList;
    int varSizearraylist = 0;*/
    //File jfile = null;
    //File cfile = null;
    /*String file_path;
    String[] fileStr;
    String fileStrval0;*/
    
//FileChooser chooser = new FileChooser();
    public Form1() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jTextArea2.setBackground(new java.awt.Color(204, 204, 255));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(102, 102, 255));
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jTabbedPane1.addTab("Leopard Code", jScrollPane2);

        jTextArea4.setEditable(false);
        jTextArea4.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea4.setColumns(20);
        jTextArea4.setForeground(new java.awt.Color(51, 255, 0));
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jTabbedPane1.addTab("Java Output (non-editable -- just to see behind the scenes)", jScrollPane4);

        jTextArea5.setEditable(false);
        jTextArea5.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea5.setColumns(20);
        jTextArea5.setForeground(new java.awt.Color(51, 255, 0));
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        jTabbedPane1.addTab("x", jScrollPane5);

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea3.setColumns(20);
        jTextArea3.setForeground(new java.awt.Color(51, 255, 0));
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jTabbedPane1.addTab("y", jScrollPane3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1254, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setLabel("New Project ...");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setLabel("Open Project");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Save Project");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Build");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Build Project");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Convert To Java");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Current_file_name = JOptionPane.showInputDialog("Please specify a project name (without .leo extention)") + ".leo";        
        jTextArea2.setText("");   
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(Form1.this); // Initially the parent container was called "Parent" as online tutorials said, but it gave errors, so researched parent containers and I just replaced it with "Form1.this" (Name of this file) -- Result is it opens
        if(returnVal == JFileChooser.APPROVE_OPTION) {
        /*System.out.println("You chose to open this file: " +
        chooser.getSelectedFile().getName());*/
        Current_file_name = chooser.getSelectedFile().getAbsolutePath();
        JOptionPane.showMessageDialog(null,Current_file_name.toString());
        //JOptionPane.showMessageDialog(null, "l" + Current_file_name);
        fileClass_Name = chooser.getSelectedFile().getName();
        /*fileStr = fileClass_Name.split(".");
        fileStrval0 = fileStr[0];*/
        
            /*###################################################*/
            /*############# Buffered Reader Below ###############*/
            //<editor-fold defaultstate="collapsed" desc="READS THE BYTES OF THE FILE AND IMPORTS THEM INTO CODE">
            
            
        BufferedReader opnreader = null; 
		try {                               //The Reason for the try is so that every the variable 'reader' can be re used every time a file is opened, its taken as blank, compared to mthod commented right below here.
			String sOCurrentLine;  // Checks the current line being read                                                       //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
			opnreader = new BufferedReader(new FileReader(Current_file_name)); //Another option would be BufferedReader reader = new BufferedReader(new FileReader('file_here'));
			while ((sOCurrentLine = opnreader.readLine()) != null) { //Reads line's of code
				jTextArea2.append(sOCurrentLine + "\n"); // Reads my .leo files line by line, and 'appends' the text to my jTextArea2, ready to get scanned over into java code into jTextArea4. Also adds a new line to my java code for every line it reads.
			}
		} catch (IOException ex) { //IOException class reads all the errors and exceptions that have occured
			ex.printStackTrace(); //if there's an error, log it.
		} finally {
			try {
				if (opnreader != null)opnreader.close(); // ---- Once has read till the last line, close the buffered reader. Has now finished reading the whole .leo/.lpr file
			} catch (IOException exept) {
				exept.printStackTrace();
			}
		}
                //</editor-fold> 
    }//GEN-LAST:event_jMenuItem2ActionPerformed
    }
        private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        jTextArea5.setText("");
        jTextArea3.setText("");
        jTextArea4.setText("");
        nextLoopVal = 0; 
        inCodeValArray = inCodeVal.split(",");
        
        //<editor-fold defaultstate="collapsed" desc="[Auto-Save Function] Update new .leo file">
        File file = null;
        try {
			String content = jTextArea2.getText(); //The content for the new file
                        if (Current_file_name.equalsIgnoreCase("")){ //if no current project is open
                            Current_file_name = JOptionPane.showInputDialog("Please specify a project name (without .leo extention)") + ".leo"; //if there isn't already a project opened, save it as a new one.
                        }
                        else //if a project is currently open
                        {
                            file = new File(Current_file_name); //Saves to the Project that is currently opened.
                        }
                        //fileClass_Name_array = fileClass_Name.split(".");
                        //fileClass_Name = fileClass_Name_array[0];
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
		} catch (IOException e) {
			e.printStackTrace();
		}
        // </editor-fold>                                                 -- WORKS.
        //<editor-fold defaultstate="collapsed" desc="[Splitter] Splits array files into String[] array's">
        jTextArea4.setText("");
        
        //<editor-fold defaultstate="collapsed" desc="Loads Leopard Array File to String">
        String LeoArray = null;
            
        BufferedReader reader = null; 
		try {                               //The Reason for the try is so that every the variable 'reader' can be re used every time a file is opened, its taken as blank, compared to mthod commented right below here.
			String sCurrentLine;  // Checks the current line being read                                                       //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
			reader = new BufferedReader(new FileReader("LeoList.lplist")); //Another option would be BufferedReader reader = new BufferedReader(new FileReader('file_here'));
			while ((sCurrentLine = reader.readLine()) != null) { //Reads line's of code
				jTextArea3.append(sCurrentLine + "\n"); // Reads my .leo files line by line, and 'appends' the text to my jTextArea2, ready to get scanned over into java code into jTextArea4. Also adds a new line to my java code for every line it reads.
			}
		} catch (IOException ex) { //IOException class reads all the errors and exceptions that have occured
			ex.printStackTrace(); //if there's an error, log it.
		} finally {
			try {
				if (reader != null)reader.close(); // ---- Once has read till the last line, close the buffered reader. Has now finished reading the whole .leo/.lpr file
			} catch (IOException exept) {
				exept.printStackTrace();
			}
		}
                //</editor-fold>                 -- WORKS
        //<editor-fold defaultstate="collapsed" desc="Loads Java Array File to String">
                String JavaArray = null;
            
       BufferedReader readerj = null; 
		try {                               //The Reason for the try is so that every the variable 'reader' can be re used every time a file is opened, its taken as blank, compared to mthod commented right below here.
			String sCurrentLine;  // Checks the current line being read                                                       //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
			readerj = new BufferedReader(new FileReader("JavaList.lplist")); //Another option would be BufferedReader reader = new BufferedReader(new FileReader('file_here'));
			while ((sCurrentLine = readerj.readLine()) != null) { //Reads line's of code
				jTextArea5.append(sCurrentLine + "\n"); // Reads my .leo files line by line, and 'appends' the text to my jTextArea2, ready to get scanned over into java code into jTextArea4. Also adds a new line to my java code for every line it reads.
			}
		} catch (IOException ex) { //IOException class reads all the errors and exceptions that have occured
			ex.printStackTrace(); //if there's an error, log it.
		} finally {
			try {
				if (readerj != null)readerj.close(); // ---- Once has read till the last line, close the buffered reader. Has now finished reading the whole .leo/.lpr file
			} catch (IOException exept) {
				exept.printStackTrace();
			}
		}
                //</editor-fold>                    -- WORKS
        //<editor-fold defaultstate="collapsed" desc="Splits into array files">
        
        // ####  LINES OF CODE ############################################    
        String delimiter = "\n"; //used to be §                        //##
        String[] LeoTokens = jTextArea3.getText().split(delimiter);    //##     Splits the Text into Lines, stores in array (list of lines and their String value)
        String[] JavaTokens = jTextArea5.getText().split(delimiter);   //##       ## Psuedocode ##{
        String[] LeoCodeTokens = jTextArea2.getText().split(delimiter);//##     leoTokens == LeoList.lplist; javaTokens == JavaList.lplist; LeoCodeTokens == MyCodeLineByLine;
        // ################################################################      }
        
        // #### WORDS ##################
        String Delim2 = " +";       //##
        String[] LeoTokensWords;    //##                                         Splits the Lines into Words,
        String[] LeoCodeTokensWords;//##                                         stores in array (list of words of each lines; Each value of array as String)
        String[] JavaTokensWords;   //##
        // #############################
        //</editor-fold> 
        // </editor-fold>
        //<editor-fold defaultstate="collapsed" desc="[<compiler> NEW] Scans each line of jTextArea and parses it to Java Code">
        for (String LeoCodeToken : LeoCodeTokens) {  //Loops for each line in my code language (jTextArea2) //NET Beans automatically changed the regular for loop to this
            nextLoopVal ++;
            inCodeValArray = inCodeVal.split(",");
            
            if (LeoCodeToken.equalsIgnoreCase("class"))
                jTextArea4.append("public class temp\n");
            else if (LeoCodeToken.equalsIgnoreCase("start"))
                jTextArea4.append("{\n");
            else if (LeoCodeToken.equalsIgnoreCase("end"))
                jTextArea4.append("}\n");
            else if (LeoCodeToken.equalsIgnoreCase("needs javax"))
                jTextArea4.append("import javax.*;\n");
            else if (LeoCodeToken.equalsIgnoreCase("needs swing"))
                jTextArea4.append("import javax.swing.*;\n");
            else if (LeoCodeToken.equalsIgnoreCase("main"))
                jTextArea4.append("public static void main (String[] args)\n");
            else if (LeoCodeToken.equalsIgnoreCase("msg")){
                inCodeValArray = inCodeVal.split(",");
                for (String element : inCodeValArray){
                    if (LeoCodeTokens[nextLoopVal].equalsIgnoreCase(element))
                        jTextArea4.append("JOptionPane.showMessageDialog(null,"+element+");\n");
                    else
                        jTextArea4.append("JOptionPane.showMessageDialog(null,\""+LeoCodeTokens[nextLoopVal]+"\");\n");    
                }
            }
            else if (LeoCodeToken.equalsIgnoreCase("val")){
                inCodeVal = inCodeVal + "," + LeoCodeTokens[nextLoopVal];
                if (isDoubleParse(LeoCodeTokens[nextLoopVal+1])){
                    //jTextArea4.append("double "+LeoCodeTokens[nextLoopVal]+ " = "+ LeoCodeTokens[nextLoopVal+1] + ";\n");
                    if (LeoCodeTokens[nextLoopVal+2].equalsIgnoreCase("input")){
                        jTextArea4.append("double "+LeoCodeTokens[nextLoopVal]+ " = Double.parseDouble(JOptionPane.showInputDialog(\""+LeoCodeTokens[nextLoopVal+3]+"\"));\n");
                    }
                    else{
                        jTextArea4.append("double "+LeoCodeTokens[nextLoopVal]+ " = "+ LeoCodeTokens[nextLoopVal+1] + ";\n");
                    }
                } 
                else if (isIntegerParse(LeoCodeTokens[nextLoopVal+1])){
                    
                }
                else {
                    
                }
                
            }
                                                                                
        }
        // </editor-fold>
        //<editor-fold defaultstate="collapsed" desc="[.java creater] create new .Java file">
        File jfile = null;
        
        try {
			String jcontent = jTextArea4.getText(); //The content for the new file
                        /*if (Current_file_name.equalsIgnoreCase("")){ //if no current project is open
                            Current_file_name = JOptionPane.showInputDialog("Please specify a project name (without .leo extention)") + ".leo" + ".java"; //if there isn't already a project opened, save it as a new one.
                        }
                        else //if a project is currently open
                        {*/
                            jfile = new File("temp.java"); //Saves to the Project that is currently opened.
                        //}
                        //fileClass_Name_array = fileClass_Name.split(".");
                        //fileClass_Name = fileClass_Name_array[0];
			// if file doesnt exists, then create it
			if (!jfile.exists()) {
				jfile.createNewFile();
			}
 
			FileWriter fw = new FileWriter(jfile.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(jcontent);
			bw.close();
 
			System.out.println("Done Compiling to Java File, \n Running.java file now.");
 
		} catch (IOException e) {
			e.printStackTrace();
                        
		}
        // </editor-fold>
        //<editor-fold defaultstate="collapsed" desc="[Compile in javac] compiles teh .java file through javac (java compiler) into a .class file">
            try {
            // Execute command
            //String command = "cmd /c start cmd.exe";
                // Execute command
                //String command = "javac temp.java";
                /*Process child = *///Runtime.getRuntime().exec(command);
                Runtime.getRuntime().exec("javac temp.java");
                Runtime.getRuntime().exec("java temp");
                //File cfile = new File("temp.class");
                //cfile = new File("temp.class");
                
                //jfile.delete();
            // Get output stream to write from it
            /*OutputStream out = child.getOutputStream();

            out.write("cd C:/ /r/n".getBytes());
            out.flush();
            out.write("dir /r/n".getBytes());
            out.close();*/
} catch (IOException e) {
}
        // </editor-fold>
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed
    public static boolean isDoubleParse(String s) {
        if( s == null ) return false;
        try {
            Double.parseDouble(s);
            return true;
    } catch (NumberFormatException e) {
            return false;
    }
    }
    public static boolean isIntegerParse(String s) {
        if( s == null ) return false;
        try {
            Integer.parseInt(s);
            return true;
    } catch (NumberFormatException e) {
            return false;
    }
    }
    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        //<editor-fold defaultstate="collapsed" desc="[Auto-Save Function] Update new .leo file">
        
        File file = null;
        try {
			String content = jTextArea2.getText(); //The content for the new file
                        if (Current_file_name.equalsIgnoreCase("")){ //if no current project is open
                            Current_file_name = JOptionPane.showInputDialog("Please specify a project name"); //if there isn't already a project opened, save it as a new one.
                        }
                        else //if a project is currently open
                        {
                            file = new File(Current_file_name); //Saves to the Project that is currently opened.
                        }
                        
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
 
			System.out.println("Done");
 
		} catch (IOException e) {
			e.printStackTrace();
		}
        // </editor-fold>        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        //<editor-fold defaultstate="collapsed" desc="[Splitter] Splits array files into String[] array's">
        jTextArea4.setText("");
        
        //<editor-fold defaultstate="collapsed" desc="Loads Leopard Array File to String">
        String LeoArray = null;
            
        BufferedReader reader = null; 
		try {                               //The Reason for the try is so that every the variable 'reader' can be re used every time a file is opened, its taken as blank, compared to mthod commented right below here.
			String sCurrentLine;  // Checks the current line being read                                                       //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
			reader = new BufferedReader(new FileReader("LeoList.lplist")); //Another option would be BufferedReader reader = new BufferedReader(new FileReader('file_here'));
			while ((sCurrentLine = reader.readLine()) != null) { //Reads line's of code
				jTextArea3.append(sCurrentLine + "\n"); // Reads my .leo files line by line, and 'appends' the text to my jTextArea2, ready to get scanned over into java code into jTextArea4. Also adds a new line to my java code for every line it reads.
			}
		} catch (IOException ex) { //IOException class reads all the errors and exceptions that have occured
			ex.printStackTrace(); //if there's an error, log it.
		} finally {
			try {
				if (reader != null)reader.close(); // ---- Once has read till the last line, close the buffered reader. Has now finished reading the whole .leo/.lpr file
			} catch (IOException exept) {
				exept.printStackTrace();
			}
		}
                //</editor-fold>                 -- WORKS
        //<editor-fold defaultstate="collapsed" desc="Loads Java Array File to String">
                String JavaArray = null;
            
       BufferedReader readerj = null; 
		try {                               //The Reason for the try is so that every the variable 'reader' can be re used every time a file is opened, its taken as blank, compared to mthod commented right below here.
			String sCurrentLine;  // Checks the current line being read                                                       //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
			readerj = new BufferedReader(new FileReader("JavaList.lplist")); //Another option would be BufferedReader reader = new BufferedReader(new FileReader('file_here'));
			while ((sCurrentLine = readerj.readLine()) != null) { //Reads line's of code
				jTextArea5.append(sCurrentLine + "\n"); // Reads my .leo files line by line, and 'appends' the text to my jTextArea2, ready to get scanned over into java code into jTextArea4. Also adds a new line to my java code for every line it reads.
			}
		} catch (IOException ex) { //IOException class reads all the errors and exceptions that have occured
			ex.printStackTrace(); //if there's an error, log it.
		} finally {
			try {
				if (readerj != null)readerj.close(); // ---- Once has read till the last line, close the buffered reader. Has now finished reading the whole .leo/.lpr file
			} catch (IOException exept) {
				exept.printStackTrace();
			}
		}
                //</editor-fold>                    -- WORKS
        //<editor-fold defaultstate="collapsed" desc="Splits into array files">
        
        // ####  LINES OF CODE ############################################    
        String delimiter = "\n"; //used to be §                        //##
        String[] LeoTokens = jTextArea3.getText().split(delimiter);    //##     Splits the Text into Lines, stores in array (list of lines and their String value)
        String[] JavaTokens = jTextArea5.getText().split(delimiter);   //##       ## Psuedocode ##{
        String[] LeoCodeTokens = jTextArea2.getText().split(delimiter);//##     leoTokens == LeoList.lplist; javaTokens == JavaList.lplist; LeoCodeTokens == MyCodeLineByLine;
        // ################################################################      }
        
        // #### WORDS ##################
        String Delim2 = " +";       //##
        String[] LeoTokensWords;    //##                                         Splits the Lines into Words,
        String[] LeoCodeTokensWords;//##                                         stores in array (list of words of each lines; Each value of array as String)
        String[] JavaTokensWords;   //##
        // #############################
        //</editor-fold> 
        // </editor-fold>
        //<editor-fold defaultstate="collapsed" desc="[<compiler> NEW] Scans each line of jTextArea and parses it to Java Code">
        for (String LeoCodeToken : LeoCodeTokens) {  //Loops for each line in my code language (jTextArea2) //NET Beans automatically changed the regular for loop to this
            nextLoopVal ++;
            
            if (LeoCodeToken.equalsIgnoreCase("class"))
                jTextArea4.append("public class temp\n");
            else if (LeoCodeToken.equalsIgnoreCase("start"))
                jTextArea4.append("{\n");
            else if (LeoCodeToken.equalsIgnoreCase("end"))
                jTextArea4.append("}\n");
            else if (LeoCodeToken.equalsIgnoreCase("needs javax"))
                jTextArea4.append("import javax.*;\n");
            else if (LeoCodeToken.equalsIgnoreCase("needs swing"))
                jTextArea4.append("import javax.swing.*;\n");
            else if (LeoCodeToken.equalsIgnoreCase("main"))
                jTextArea4.append("public static void main (String[] args)\n");
            else if (LeoCodeToken.equalsIgnoreCase("msg")){
                for (String element : inCodeValArray){
                    if (LeoCodeTokens[nextLoopVal].equalsIgnoreCase(element))
                        jTextArea4.append("JOptionPane.showMessageDialog(null,"+element+");\n");
                    else
                        jTextArea4.append("JOptionPane.showMessageDialog(null,\""+LeoCodeTokens[nextLoopVal]+"\");\n");    
                }
            }
            else if (LeoCodeToken.equalsIgnoreCase("val")){
                if (isDoubleParse(LeoCodeTokens[nextLoopVal+1])){
                    //jTextArea4.append("double "+LeoCodeTokens[nextLoopVal]+ " = "+ LeoCodeTokens[nextLoopVal+1] + ";\n");
                    if (LeoCodeTokens[nextLoopVal+2].equalsIgnoreCase("input")){
                        jTextArea4.append("double "+LeoCodeTokens[nextLoopVal]+ " = Double.parseDouble(JOptionPane.showInputDialog(\""+LeoCodeTokens[nextLoopVal+3]+"\"));\n");
                    }
                    else{
                        jTextArea4.append("double "+LeoCodeTokens[nextLoopVal]+ " = "+ LeoCodeTokens[nextLoopVal+1] + ";\n");
                    }
                } 
                else if (isIntegerParse(LeoCodeTokens[nextLoopVal+1])){
                    
                }
                else {
                    
                }
                
            }
                                                                                
        }
        // </editor-fold> // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jMenuItem5ActionPerformed
    
    /**
     * @param args the command line arguments
     */
  
    public static void main(String args[]) throws SecurityException {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold> // This was auto Generated with the Form <<
        //jTextArea4.
        
        //jfile.delete();
        //cfile.delete();
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Form1().setVisible(true);
            }
        });
    }
    
    
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    // End of variables declaration//GEN-END:variables
}
