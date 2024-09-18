/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Editor;

/**
 *
 * @author Ilija
 */
public class EditorFrame extends javax.swing.JFrame {

    /**
     * Creates new form EditorFrame
     */
    public EditorFrame() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        NewMenuItem = new javax.swing.JMenuItem();
        OpenMenuItem = new javax.swing.JMenuItem();
        SaveMenuItem = new javax.swing.JMenuItem();
        SaveAsMenuItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        PrintMenuItem = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        ExitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        UndoMenuItem = new javax.swing.JMenuItem();
        RedoMenuItem = new javax.swing.JMenuItem();
        CutMenuItem = new javax.swing.JMenuItem();
        CopyMenuItem = new javax.swing.JMenuItem();
        PasteMenuItem = new javax.swing.JMenuItem();
        DeleteMenuItem = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        FindMenuItem = new javax.swing.JMenuItem();
        FindNextMenuItem = new javax.swing.JMenuItem();
        ReplaceMenuItem = new javax.swing.JMenuItem();
        GoToMenuItem = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        SelectAllMenuItem = new javax.swing.JMenuItem();
        TimeDateMenuItem = new javax.swing.JMenuItem();
        formatMenu = new javax.swing.JMenu();
        WordWrapCheckBoxMenuItem = new javax.swing.JCheckBoxMenuItem();
        FontMenuItem = new javax.swing.JMenuItem();
        viewMenu = new javax.swing.JMenu();
        StatusBarCheckBoxMenuItem = new javax.swing.JCheckBoxMenuItem();
        helpMenu = new javax.swing.JMenu();
        AboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("untitled");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        fileMenu.setText("File");

        NewMenuItem.setText("New");
        fileMenu.add(NewMenuItem);

        OpenMenuItem.setLabel("Open");
        fileMenu.add(OpenMenuItem);

        SaveMenuItem.setText("Save");
        SaveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(SaveMenuItem);

        SaveAsMenuItem.setText("Save as...");
        fileMenu.add(SaveAsMenuItem);
        fileMenu.add(jSeparator1);

        PrintMenuItem.setText("Print...");
        fileMenu.add(PrintMenuItem);
        fileMenu.add(jSeparator3);

        ExitMenuItem.setText("Exit");
        fileMenu.add(ExitMenuItem);

        jMenuBar1.add(fileMenu);

        editMenu.setText("Edit");

        UndoMenuItem.setText("Undo");
        editMenu.add(UndoMenuItem);

        RedoMenuItem.setText("Redo");
        editMenu.add(RedoMenuItem);

        CutMenuItem.setText("Cut");
        editMenu.add(CutMenuItem);

        CopyMenuItem.setText("Copy");
        editMenu.add(CopyMenuItem);

        PasteMenuItem.setText("Paste");
        editMenu.add(PasteMenuItem);

        DeleteMenuItem.setText("Delete");
        editMenu.add(DeleteMenuItem);
        editMenu.add(jSeparator4);

        FindMenuItem.setText("Find");
        editMenu.add(FindMenuItem);

        FindNextMenuItem.setText("Find Next");
        editMenu.add(FindNextMenuItem);

        ReplaceMenuItem.setText("Replace");
        editMenu.add(ReplaceMenuItem);

        GoToMenuItem.setText("Go to");
        editMenu.add(GoToMenuItem);
        editMenu.add(jSeparator5);

        SelectAllMenuItem.setText("Select All");
        editMenu.add(SelectAllMenuItem);

        TimeDateMenuItem.setText("Time/Date");
        editMenu.add(TimeDateMenuItem);

        jMenuBar1.add(editMenu);

        formatMenu.setLabel("Format");

        WordWrapCheckBoxMenuItem.setSelected(true);
        WordWrapCheckBoxMenuItem.setText("Word Wrap");
        formatMenu.add(WordWrapCheckBoxMenuItem);

        FontMenuItem.setText("Font");
        formatMenu.add(FontMenuItem);

        jMenuBar1.add(formatMenu);

        viewMenu.setLabel("View");

        StatusBarCheckBoxMenuItem.setSelected(true);
        StatusBarCheckBoxMenuItem.setText("Status Bar");
        viewMenu.add(StatusBarCheckBoxMenuItem);

        jMenuBar1.add(viewMenu);

        helpMenu.setLabel("Help");

        AboutMenuItem.setText("About");
        helpMenu.add(AboutMenuItem);

        jMenuBar1.add(helpMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(EditorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AboutMenuItem;
    private javax.swing.JMenuItem CopyMenuItem;
    private javax.swing.JMenuItem CutMenuItem;
    private javax.swing.JMenuItem DeleteMenuItem;
    private javax.swing.JMenuItem ExitMenuItem;
    private javax.swing.JMenuItem FindMenuItem;
    private javax.swing.JMenuItem FindNextMenuItem;
    private javax.swing.JMenuItem FontMenuItem;
    private javax.swing.JMenuItem GoToMenuItem;
    private javax.swing.JMenuItem NewMenuItem;
    private javax.swing.JMenuItem OpenMenuItem;
    private javax.swing.JMenuItem PasteMenuItem;
    private javax.swing.JMenuItem PrintMenuItem;
    private javax.swing.JMenuItem RedoMenuItem;
    private javax.swing.JMenuItem ReplaceMenuItem;
    private javax.swing.JMenuItem SaveAsMenuItem;
    private javax.swing.JMenuItem SaveMenuItem;
    private javax.swing.JMenuItem SelectAllMenuItem;
    private javax.swing.JCheckBoxMenuItem StatusBarCheckBoxMenuItem;
    private javax.swing.JMenuItem TimeDateMenuItem;
    private javax.swing.JMenuItem UndoMenuItem;
    private javax.swing.JCheckBoxMenuItem WordWrapCheckBoxMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu formatMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JMenu viewMenu;
    // End of variables declaration//GEN-END:variables
}
