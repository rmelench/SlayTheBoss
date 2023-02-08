package Game;

import static Game.Game.day;
import Game.Player;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        System.out.println("display created");
        // methods concerning display go here
        initComponents();
        //Player player = new Player(45,50,10,false,false,5,10,0);
        endDay();
        updateStatus();
        updateAction();
        questPanel.setVisible(false);
        trainPanel.setVisible(false);
        shopPanel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        train = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        actionTerminal = new javax.swing.JTextArea();
        shop = new javax.swing.JButton();
        rest = new javax.swing.JButton();
        quest = new javax.swing.JButton();
        currentDay = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        statusTerminal = new javax.swing.JTextArea();
        faq = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        questPanel = new javax.swing.JPanel();
        easyQuest = new javax.swing.JButton();
        normalQuest = new javax.swing.JButton();
        hardButton = new javax.swing.JButton();
        bossButton = new javax.swing.JButton();
        trainPanel = new javax.swing.JPanel();
        strButt = new javax.swing.JButton();
        agiButt = new javax.swing.JButton();
        endButt = new javax.swing.JButton();
        shopPanel = new javax.swing.JPanel();
        weaponUpButt = new javax.swing.JButton();
        armorUpButt = new javax.swing.JButton();
        potButt = new javax.swing.JButton();
        title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        train.setText("Train");
        train.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trainActionPerformed(evt);
            }
        });

        actionTerminal.setEditable(false);
        actionTerminal.setColumns(20);
        actionTerminal.setRows(5);
        jScrollPane1.setViewportView(actionTerminal);

        shop.setText("Shop");
        shop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shopActionPerformed(evt);
            }
        });

        rest.setText("Rest");
        rest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonPressed(evt);
            }
        });

        quest.setText("Quest");
        quest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                questActionPerformed(evt);
            }
        });

        currentDay.setEditable(false);
        currentDay.setText("Day: ");
        currentDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentDayActionPerformed(evt);
            }
        });

        statusTerminal.setEditable(false);
        statusTerminal.setColumns(20);
        statusTerminal.setRows(5);
        jScrollPane2.setViewportView(statusTerminal);

        faq.setText("How to Play");
        faq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faqActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayout(new javax.swing.OverlayLayout(jLayeredPane1));

        easyQuest.setText("Easy");
        easyQuest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonPressed(evt);
            }
        });

        normalQuest.setText("Normal");
        normalQuest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonPressed(evt);
            }
        });

        hardButton.setText("Slay the Boss");
        hardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonPressed(evt);
            }
        });

        bossButton.setText("Hard");
        bossButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonPressed(evt);
            }
        });

        javax.swing.GroupLayout questPanelLayout = new javax.swing.GroupLayout(questPanel);
        questPanel.setLayout(questPanelLayout);
        questPanelLayout.setHorizontalGroup(
            questPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(questPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hardButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(questPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(easyQuest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(normalQuest, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bossButton, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        questPanelLayout.setVerticalGroup(
            questPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(questPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(easyQuest, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(normalQuest, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(bossButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(hardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane1.add(questPanel);

        strButt.setText("Strength");
        strButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonPressed(evt);
            }
        });

        agiButt.setText("Agility");
        agiButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonPressed(evt);
            }
        });

        endButt.setText("Endurance");
        endButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonPressed(evt);
            }
        });

        javax.swing.GroupLayout trainPanelLayout = new javax.swing.GroupLayout(trainPanel);
        trainPanel.setLayout(trainPanelLayout);
        trainPanelLayout.setHorizontalGroup(
            trainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(trainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(endButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(strButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(agiButt, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        trainPanelLayout.setVerticalGroup(
            trainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(trainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(strButt, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(agiButt, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(endButt, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane1.add(trainPanel);

        weaponUpButt.setText("Weapon Upgrade");
        weaponUpButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonPressed(evt);
            }
        });

        armorUpButt.setText("Armor Upgrade");
        armorUpButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonPressed(evt);
            }
        });

        potButt.setText("Purchase Healing Potion");
        potButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonPressed(evt);
            }
        });

        javax.swing.GroupLayout shopPanelLayout = new javax.swing.GroupLayout(shopPanel);
        shopPanel.setLayout(shopPanelLayout);
        shopPanelLayout.setHorizontalGroup(
            shopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shopPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(shopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(potButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(weaponUpButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(armorUpButt, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        shopPanelLayout.setVerticalGroup(
            shopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shopPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(weaponUpButt, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(armorUpButt, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(potButt, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane1.add(shopPanel);

        title.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Slay the Boss");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(quest, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(train, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rest, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(shop, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(faq, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(currentDay, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                                .addComponent(faq)
                                .addGap(20, 20, 20))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(currentDay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quest, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(train, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rest, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(shop, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void faqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faqActionPerformed
        // TODO add your handling code here:
        javax.swing.JOptionPane.showMessageDialog(null,"You have 30 days to Slay the Boss. Within this time, you may spend your days as you wish, but on the final day the Boss must be faced."
                + "\n Should you have enough gold to rest, then rest you may. Should you have enough gold to upgrade your armaments, then upgrade you shall."
                + "\n Quests are your only means of acquiring more of this precious resource, and quests require strength."
                + "\n Increase your strength, endurance, and agility through training and hone your skills so you can withstand the harsher trials laid before you."
                + "\n\n TIP: Healing potions are a great way of ensuring survival, but if you lack the strength to complete a quest then do not expect to be rewarded for your wasted efforts."
                + "\n\nAnd always remember: the Boss must be Slayed.","How to Play",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_faqActionPerformed

    private void currentDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentDayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_currentDayActionPerformed

    private void questActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_questActionPerformed
        // TODO add your handling code here:
        questPanel.setVisible(true);
        trainPanel.setVisible(false);
        shopPanel.setVisible(false);
    }//GEN-LAST:event_questActionPerformed

    private void shopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shopActionPerformed
        // TODO add your handling code here:
        questPanel.setVisible(false);
        trainPanel.setVisible(false);
        shopPanel.setVisible(true);
    }//GEN-LAST:event_shopActionPerformed

    private void trainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trainActionPerformed
        // TODO add your handling code here:
        questPanel.setVisible(false);
        trainPanel.setVisible(true);
        shopPanel.setVisible(false);
    }//GEN-LAST:event_trainActionPerformed

    private void menuButtonPressed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonPressed
        // TODO add your handling code here:
        onButtonPressed((javax.swing.JButton)evt.getSource());
    }//GEN-LAST:event_menuButtonPressed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea actionTerminal;
    private javax.swing.JButton agiButt;
    private javax.swing.JButton armorUpButt;
    private javax.swing.JButton bossButton;
    private javax.swing.JTextField currentDay;
    private javax.swing.JButton easyQuest;
    private javax.swing.JButton endButt;
    private javax.swing.JButton faq;
    private javax.swing.JButton hardButton;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton normalQuest;
    private javax.swing.JButton potButt;
    private javax.swing.JButton quest;
    private javax.swing.JPanel questPanel;
    private javax.swing.JButton rest;
    private javax.swing.JButton shop;
    private javax.swing.JPanel shopPanel;
    private javax.swing.JTextArea statusTerminal;
    private javax.swing.JButton strButt;
    private javax.swing.JLabel title;
    private javax.swing.JButton train;
    private javax.swing.JPanel trainPanel;
    private javax.swing.JButton weaponUpButt;
    // End of variables declaration//GEN-END:variables
    
    // menu outputs
    public static String output1;
    public static String output2;
    public int day = Game.day;
    public static String dayOutput;

    // menu output string getter and setters
    public static String getOutput1() {
        return output1;
    }

    public static String getOutput2() {
        return output2;
    }

    public static void setOutput1(String output1) {
        Menu.output1 = output1;
    }
    
    public static void setOutput2(String output2) {
        Menu.output2 = output2;
    }

    //initialize player stats
    static int hpMax = Player.getHpMax();
    static int hpCurrent = Player.getHpCurrent();
    static boolean isDead = Player.isIsDead();
    static int atk = Player.getAtk();
    static int gold = Player.getGold();
    static int eva = Player.getEva();
    static boolean dodged = Player.isDodged();
    static int potNum = Player.getPotNum();
    public static int weaponItemLevel = 1;
    public static int armorItemLevel = 1;
    
    //create objects for quests
    Easy e = new Easy();
    Normal n = new Normal();
    Hard h = new Hard();
    Boss b = new Boss();
    
    //updates display w/ detailed events
    private void updateAction(){
        actionTerminal.setText(output1);
    }
    
    // updates the player status window
    private void updateStatus(){
        updateStatusOutput();
        statusTerminal.setText(output2);
        //System.out.println("stat display updated");
    }
    
    // updates the string output to the status terminal, can be called by other classes to update output2
    public static void updateStatusOutput(){
        Menu.output2 = "Health: " + Player.getHpCurrent()+"/"+Player.getHpMax() + "\nAttack: " + Player.getAtk() + "\nDodge Chance: " +
            Player.getEva()+"%" + "\nGold: " + Player.getGold() + "\nHealing Potions: " + Player.getPotNum();
        //System.out.println("stat string output updated");
    }

    // clears the display and iterates the day
    public void endDay(){
        //output1 = "A new day!";
        Game.day++;
        dayOutput = "Day: " + Game.day;
        currentDay.setText(dayOutput);
    }
    
    private void onButtonPressed(javax.swing.JButton code){
        
        hpMax = Player.getHpMax();
        hpCurrent = Player.getHpCurrent();
        isDead = Player.isIsDead();
        atk = Player.getAtk();
        gold = Player.getGold();
        eva = Player.getEva();
        dodged = Player.isDodged();
        potNum = Player.getPotNum();
        
        String buttonText = code.getText();
        
        if(buttonText == "Weapon Upgrade"){
                if(gold >= 5 * weaponItemLevel){
                    Player.setAtk(atk += 5);
                    Player.setGold(gold -= (5 * weaponItemLevel)) ;
                    weaponItemLevel++;
                }

                else{
                    output1 = "You have run out of gold!\n\nTIP: Complete quests to earn gold.";
                }
        }

        else if(buttonText == "Armor Upgrade"){
            if(gold >= 5 * armorItemLevel){
                Player.setHpMax(hpMax += 20) ;
                Player.setGold(gold -= 5 * armorItemLevel);
                armorItemLevel++;
            }

            else{
                output1 = "You have run out of gold!\n\nTIP: Complete quests to earn gold!";
            } 
        }

        else if(buttonText == "Purchase Healing Potion"){
            if(gold >= 10){
                Player.setPotNum(potNum += 1) ;
                //Subtracts healing potion cost from player inventory
                Player.setGold(gold -= 10);
            }

            else{
                output1 = "You do not have enough gold to purchase any potions!\n\nTIP: Complete quests to earn gold!";
            }
        }
        
        else if(buttonText == "Normal"){
            if(Game.day <= 26){
                Player.setGold(gold += 75);
                Game.day += 4;
                n.damageCalc();
                endDay();
            }
            
            else{
                output1 = "This quest will take too long to complete!";
            }
        }
        
        else if(buttonText == "Hard"){
            if(Game.day <= 24){
                Player.setGold(gold += 150);
                Game.day += 6;
                h.damageCalc();
                endDay();
            }
            
            else{
                output1 = "This quest will take too long to complete!";
            }
        }
        
        else if(Game.day < 31){
            //output1 = "A new day!";
            if(buttonText=="Strength"){
                Player.setAtk(atk += 2);
                if(eva > 0){
                    Player.setEva(eva -= 1);
                }
                endDay();
            }

            else if(buttonText=="Agility"){
                if(eva >= 75){
                    output1 = "You have already maxed your Evasion! You can no longer train this stat...";  
                }

                else if(eva < 75){
                    
                    //Sets the evasion, current HP and Max HP
                    Player.setEva(eva += 5);
                    Player.setHpCurrent(hpCurrent -= 5);
                    Player.setHpMax(hpMax -= 5);
                    //player can kill themselves through agility training - INTENDED FUNCTION
                    if(hpCurrent<=0){
                    //Player.setIsDead(true);
                    Game.endGame();
                    }
                    endDay();
                }
            }

            else if(buttonText == "Endurance"){
                Player.setHpMax(hpMax += 10);
                if(atk > 0){
                    Player.setAtk(atk -= 1);  
                }
            endDay();
            }

            else if(buttonText == "Easy"){
                Player.setGold(gold += 10);
                e.damageCalc();
                endDay();
            }

            else if(buttonText == "Rest" && gold >= 5){
                int restResponse = JOptionPane.showConfirmDialog(null,"Do you wish to rest for the day to recuperate from your wounds?\n(This will end the day)", "Rest Confirmation",JOptionPane.YES_NO_OPTION);               
                
                if(restResponse == JOptionPane.YES_OPTION && hpCurrent < hpMax){
                    System.out.println("Player chose to rest");
                    //set player hp to max capacity, subtract 5 gold
                    Player.setHpCurrent(hpMax);
                    Player.setGold(gold-=5);
                    endDay();    
                }
                
                else if(hpCurrent == hpMax){
                    output1 = "You are already full HP";
                }

                else if(restResponse == JOptionPane.NO_OPTION){    
                }
                
                else{
                    output1 = "You are out of time, you can't rest, you need to slay the boss!";  
                }    
            }
            
            else if(buttonText == "Slay the Boss"){
                output1 = "It is not yet time.";
            }
        }
        
        else if(buttonText == "Slay the Boss" && Game.day == 31){
            b.fight();
            endDay();
        }
        
        else{
            output1 = "You are out of time, You need to try to slay the boss!";
        }
    //Updated the terminals
    updateStatus();
    updateAction();
    }
}