/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author admin
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.List;
public class ReturnBook_page extends javax.swing.JFrame {
    
    private boolean isSearchPerformed = false; // Tracks whether the search has been performed

    /**
     * Creates new form ReturnBook_page
     */
    public ReturnBook_page() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Book_id = new javax.swing.JTextField();
        Student_id = new javax.swing.JTextField();
        Clearbtn = new javax.swing.JButton();
        Returnbtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Issue_date = new javax.swing.JTextField();
        Due_date = new javax.swing.JTextField();
        Searchbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel1.setText("Book id:");

        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel2.setText("Issue date:");

        jLabel3.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel3.setText("Student Id:");

        jLabel4.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        jLabel4.setText("Due date:");

        Book_id.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        Book_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Book_idActionPerformed(evt);
            }
        });

        Student_id.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        Student_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Student_idActionPerformed(evt);
            }
        });

        Clearbtn.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        Clearbtn.setText("Clear");
        Clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearbtnActionPerformed(evt);
            }
        });

        Returnbtn.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        Returnbtn.setText("Return");
        Returnbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnbtnActionPerformed(evt);
            }
        });

        jButton3.setText("back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Constantia", 3, 48)); // NOI18N
        jLabel5.setText("Return BOOK");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addComponent(jLabel5)
                .addContainerGap(335, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(14, 14, 14))
        );

        Issue_date.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        Issue_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Issue_dateActionPerformed(evt);
            }
        });

        Due_date.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        Due_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Due_dateActionPerformed(evt);
            }
        });

        Searchbtn.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        Searchbtn.setText("Search");
        Searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(11, 11, 11)
                                            .addComponent(jLabel4)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Book_id, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(Searchbtn))
                                    .addComponent(Issue_date, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Due_date, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Student_id, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Returnbtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Clearbtn))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Book_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Searchbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Student_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Issue_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Due_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Returnbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Book_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Book_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Book_idActionPerformed

    private void Student_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Student_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Student_idActionPerformed

    private void ClearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearbtnActionPerformed
        Book_id.setText("");
        Student_id.setText("");
        Due_date.setText("");
        Issue_date.setText("");
    }//GEN-LAST:event_ClearbtnActionPerformed

    private void ReturnbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnbtnActionPerformed

        
        String book_id = Book_id.getText();      // Get Book ID input
        String student_id = Student_id.getText(); // Get Student ID input
        String returnBook = "Yes";

        
        // Check if the Search Button was pressed first
        if (!isSearchPerformed) {
            JOptionPane.showMessageDialog(this, 
                "Please search for the book and student IDs first.", 
                "Action Required", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Check if Issue Date and Due Date are displayed
        String issueDate = Issue_date.getText().trim();
        String dueDate = Due_date.getText().trim();

        if (issueDate.isEmpty() || dueDate.isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                "Please search and confirm the book's Issue Date and Due Date before returning.", 
                "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Check if Book ID and Student ID are input
        if (book_id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please input Book ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (student_id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please input Student ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Initialize variables for processing the return
        boolean bookExists = false;
        boolean studentExists = false;
        boolean bookReturned = false;

        List<String> fileLines = new ArrayList<>();

        try {
            // Read the file and check for Book ID, Student ID, and Return Status
            BufferedReader reader = new BufferedReader(new FileReader("LibraryManagementSystem.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                fileLines.add(line);

                if (line.trim().equalsIgnoreCase("Book ID: " + book_id)) {
                    bookExists = true;
                }
                if (bookExists && line.trim().equalsIgnoreCase("Student ID: " + student_id)) {
                    studentExists = true;
                }
                if (bookExists && studentExists && line.trim().startsWith("Return Status:")) {
                    String returnStatus = line.trim().substring("Return Status:".length()).trim();
                    if ("Yes".equalsIgnoreCase(returnStatus)) {
                        bookReturned = true;
                    }
                    break;
                }
            }
            reader.close();

            // Process return if both IDs are valid
            if (bookExists && studentExists) {
                if (bookReturned) {
                    JOptionPane.showMessageDialog(this, 
                        "This book has already been returned.", 
                        "Return Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Update the return status in the file
                    for (int i = 0; i < fileLines.size(); i++) {
                        if (fileLines.get(i).trim().equalsIgnoreCase("Book ID: " + book_id)) {
                            for (int j = i + 1; j < fileLines.size(); j++) {
                                if (fileLines.get(j).trim().startsWith("Return Status:")) {
                                    fileLines.set(j, "Return Status: " + returnBook);
                                    break;
                                }
                            }
                            break;
                        }
                    }

                    // Write the updated content back to the file
                    BufferedWriter writer = new BufferedWriter(new FileWriter("LibraryManagementSystem.txt"));
                    for (String updatedLine : fileLines) {
                        writer.write(updatedLine);
                        writer.newLine();
                    }
                    writer.close();

                    // Notify the user of the successful return
                    JOptionPane.showMessageDialog(this, "The book has been successfully returned!");
                }
            } else {
                // Display specific errors if either Book ID or Student ID is not valid
                if (!bookExists) {
                    JOptionPane.showMessageDialog(this, "Incorrect Book ID.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                if (!studentExists) {
                    JOptionPane.showMessageDialog(this, "Incorrect Student ID.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "File Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_ReturnbtnActionPerformed

        
        
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        NewBook_page nbpage = new NewBook_page();
        setVisible(false);
        nbpage.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Issue_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Issue_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Issue_dateActionPerformed

    private void Due_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Due_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Due_dateActionPerformed

    private void SearchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchbtnActionPerformed
               
        isSearchPerformed = true; // Check if the Search button is perform
        String book_id = Book_id.getText();      // Get Book ID input
        String student_id = Student_id.getText(); // Get Student ID input

        // Validate if Book ID and Student ID are input
        if (book_id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please input Book ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (student_id.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please input Student ID.", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        boolean bookExists = false;
        boolean studentExists = false;
        String issue_date = null;
        String due_date = null;

        try {
            // Open the file and search for Book ID and Student ID
            BufferedReader reader = new BufferedReader(new FileReader("LibraryManagementSystem.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                // Check if the Book ID matches
                if (line.trim().equalsIgnoreCase("Book ID: " + book_id)) {
                    bookExists = true;
                    // Search for Issue Date and Due Date following the Book ID
                    while ((line = reader.readLine()) != null) {
                        if (line.trim().startsWith("Issue Date:")) {
                           issue_date = line.trim().substring("Issue Date:".length()).trim();
                        } else if (line.trim().startsWith("Due Date:")) {
                            due_date = line.trim().substring("Due Date:".length()).trim();
                        }
                        // If both dates are found, break the loop
                        if (issue_date != null && due_date != null) {
                            break;
                        }
                    }
                }

                // Check if the Student ID matches
                if (line.trim().equalsIgnoreCase("Student ID: " + student_id)) {
                    studentExists = true;
                }
            
                // If both Book and Student are found, break the loop
                if (bookExists && studentExists) {
                    break;
                }
            }
            reader.close();

            // Display results if both Book ID and Student ID exist
            if (bookExists && studentExists) {
                // Display Issue and Due Date if found
                if (issue_date != null && due_date != null) {
                    Issue_date.setText(issue_date);
                    Due_date.setText(due_date);
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Issue Date and Due Date not found.", 
                            "Data Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                // Show error messages if Book ID or Student ID is not found
                if (!bookExists) {
                    JOptionPane.showMessageDialog(this, "Incorrect Book ID.", "Error", JOptionPane.ERROR_MESSAGE);
                }
                if (!studentExists) {
                    JOptionPane.showMessageDialog(this, "Incorrect Student ID.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error reading from file: " + e.getMessage(), "File Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_SearchbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReturnBook_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnBook_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnBook_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBook_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBook_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Book_id;
    private javax.swing.JButton Clearbtn;
    private javax.swing.JTextField Due_date;
    private javax.swing.JTextField Issue_date;
    private javax.swing.JButton Returnbtn;
    private javax.swing.JButton Searchbtn;
    private javax.swing.JTextField Student_id;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
