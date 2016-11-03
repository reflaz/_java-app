/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxinvoiceautomationsystem;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

/**
 *
 * @author Refly IDFA
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        showLabelIcon(labelImportFolder, LABEL_ICON_ERROR);
        hideLabelIcon(labelImportFolder);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelImportFolder = new javax.swing.JLabel();
        textfieldImportFolder = new javax.swing.JTextField();
        buttonImportFolder = new javax.swing.JButton();
        labelExportFolder = new javax.swing.JLabel();
        textfieldExportFolder = new javax.swing.JTextField();
        buttonExportFolder = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textareaResult = new javax.swing.JTextArea();
        labelImportIcon = new javax.swing.JLabel();
        labelExportIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelImportFolder.setText("Import Folder");

        textfieldImportFolder.setEditable(false);
        textfieldImportFolder.setBackground(new java.awt.Color(255, 255, 255));
        textfieldImportFolder.setToolTipText("");
        textfieldImportFolder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textfieldImportFolderMouseClicked(evt);
            }
        });

        buttonImportFolder.setText("Browse");
        buttonImportFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonImportFolderActionPerformed(evt);
            }
        });

        labelExportFolder.setText("Export Folder");

        textfieldExportFolder.setEditable(false);
        textfieldExportFolder.setBackground(new java.awt.Color(255, 255, 255));
        textfieldExportFolder.setToolTipText("");
        textfieldExportFolder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textfieldExportFolderMouseClicked(evt);
            }
        });

        buttonExportFolder.setText("Browse");
        buttonExportFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExportFolderActionPerformed(evt);
            }
        });

        jButton1.setText("Execute");

        jScrollPane2.setBorder(null);

        textareaResult.setBackground(new java.awt.Color(240, 240, 240));
        textareaResult.setColumns(20);
        textareaResult.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        textareaResult.setRows(5);
        textareaResult.setBorder(javax.swing.BorderFactory.createTitledBorder("result"));
        jScrollPane2.setViewportView(textareaResult);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textfieldImportFolder, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonImportFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textfieldExportFolder, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonExportFolder, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelExportFolder)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelExportIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelImportFolder)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelImportIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buttonExportFolder, buttonImportFolder, jButton1});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelImportFolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelImportIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfieldImportFolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonImportFolder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelExportFolder)
                    .addComponent(labelExportIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textfieldExportFolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonExportFolder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonImportFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonImportFolderActionPerformed
        // TODO add your handling code here:
        if (!filePathChooser(FILEPATH_OPTION_IMPORT)) {
            complete = false;
        }
    }//GEN-LAST:event_buttonImportFolderActionPerformed

    private void textfieldImportFolderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textfieldImportFolderMouseClicked
        // TODO add your handling code here:
        if (!filePathChooser(FILEPATH_OPTION_IMPORT)) {
            complete = false;
        }
    }//GEN-LAST:event_textfieldImportFolderMouseClicked

    private void buttonExportFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExportFolderActionPerformed
        // TODO add your handling code here:
        if (!filePathChooser(FILEPATH_OPTION_EXPORT)) {
            complete = false;
        }
    }//GEN-LAST:event_buttonExportFolderActionPerformed

    private void textfieldExportFolderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textfieldExportFolderMouseClicked
        // TODO add your handling code here:
        if (!filePathChooser(FILEPATH_OPTION_EXPORT)) {
            complete = false;
        }
    }//GEN-LAST:event_textfieldExportFolderMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    private void showLabelIcon(JLabel label, String labelIcon) {
        label.setIcon(new ImageIcon(((ImageIcon) UIManager.getIcon(labelIcon)).
                getImage().getScaledInstance(label.getHeight(), label.getHeight(), Image.SCALE_SMOOTH)));
    }

    private void hideLabelIcon(JLabel label) {
        label.setIcon(null);
    }

    private void showTextFieldFilepathToolTip(JTextField textfield, String text) {
        if (text == null || text.trim().isEmpty()) {
            textfield.setToolTipText("");
        } else {
            textfield.setToolTipText(text);
        }
    }

    private boolean filePathChooser(int filepathOption) {
        boolean complete = true;

        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int returnVal = chooser.showDialog(this, "Select Folder");

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            if (filepathOption == FILEPATH_OPTION_IMPORT) {
                textareaResult.append("Selecting import folder...\n");
                textfieldImportFolder.setText(chooser.getSelectedFile().getAbsolutePath());

                for (String[] filepathImportConstraints : filepathImportConstraints) {
                    File file = new File(chooser.getSelectedFile().getAbsolutePath() + "\\" + filepathImportConstraints[1]);

                    if (!file.exists()) {
                        textareaResult.append("File " + filepathImportConstraints[1] + " is missing\n");
                        complete = false;
                    }
                }
                if (!complete) {
                    showLabelIcon(labelImportIcon, LABEL_ICON_ERROR);
                    showTextFieldFilepathToolTip(textfieldImportFolder, "One or more files are missing");
                } else {
                    filepathImport = chooser.getSelectedFile().getAbsolutePath();
                    textareaResult.append("Import folder selected\n");
                    hideLabelIcon(labelImportIcon);
                    showTextFieldFilepathToolTip(textfieldImportFolder, filepathImport);
                }
            } else if (filepathOption == FILEPATH_OPTION_EXPORT) {
                textareaResult.append("Selecting export folder...\n");
                textfieldExportFolder.setText(chooser.getSelectedFile().getAbsolutePath());
                filepathExport = chooser.getSelectedFile().getAbsolutePath();
                textareaResult.append("Export folder selected\n");
                showTextFieldFilepathToolTip(textfieldExportFolder, filepathExport);
            }
        }

        System.out.println(filepathImport);
        System.out.println(filepathExport);
        return complete;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonExportFolder;
    private javax.swing.JButton buttonImportFolder;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelExportFolder;
    private javax.swing.JLabel labelExportIcon;
    private javax.swing.JLabel labelImportFolder;
    private javax.swing.JLabel labelImportIcon;
    private javax.swing.JTextArea textareaResult;
    private javax.swing.JTextField textfieldExportFolder;
    private javax.swing.JTextField textfieldImportFolder;
    // End of variables declaration//GEN-END:variables
    private final int FILEPATH_OPTION_IMPORT = 1;
    private final int FILEPATH_OPTION_EXPORT = 2;

    private final String[][] filepathImportConstraints = {
        {"Adjustment", "adjustment.csv"},
        {"Adrress", "address.csv"}
    };

    private final String LABEL_ICON_WARNING = "OptionPane.warningIcon";
    private final String LABEL_ICON_ERROR = "OptionPane.errorIcon";
    private final String LABEL_ICON_OK = "OptionPane.errorIcon";

    private String filepathImport = "";
    private String filepathExport = "";

    private boolean complete = true;
}
