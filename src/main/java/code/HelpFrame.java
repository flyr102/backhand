/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code;

/**
 *
 * @author conorfryer
 */
public class HelpFrame extends javax.swing.JFrame
{

    /**
     * Creates new form HelpFrame
     */
    public HelpFrame()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        infoText = new javax.swing.JTextArea();
        helpInfoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        infoText.setEditable(false);
        infoText.setColumns(20);
        infoText.setLineWrap(true);
        infoText.setRows(5);
        infoText.setText("Backhand is a statistical tracking app designed for ice hockey with Twitter API integration. Events, such as goals, period start/end, and penalties, can be tweeted with the press of a button.\n\nTo post a tweet, simpily fill out a table row with data and press the \"Tweet\" button. Make sure to include all the required fields, which are denoted with asterisks.\n\nTo delete a goal/penalty, highlight the desired row and press the \"Delete Goal/Penalty\" just below the table.\n\nTo change the team names, simpily edit the text field from the default \"Home\" or \"Away\".\n\nDISCLAIMER: Twitter prevents API applications from posting multiple identical tweets in quick sucession to prevent bot spamming. In the event that tweets are unintentionally identical (e.g., teams are playing back-to-back games and the score after the first period is identical), the easiest fix is to change a team name, which can be done unnoticeably by using the team name's acronym (e.g., Lake Forest Academy -> LFA).\n\nMade by Conor Fryer for APCSA (2021)");
        infoText.setToolTipText("");
        infoText.setWrapStyleWord(true);
        infoText.setCaretPosition(0);
        infoText.setCursor(new java.awt.Cursor(java.awt.Cursor.NW_RESIZE_CURSOR));
        infoText.setInheritsPopupMenu(true);
        jScrollPane1.setViewportView(infoText);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 400, 280));

        helpInfoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        helpInfoLabel.setText("Help/Info");
        getContentPane().add(helpInfoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 0, 400, 20));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel helpInfoLabel;
    private javax.swing.JTextArea infoText;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
