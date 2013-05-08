package fi.muni.pv168.gui;

import fi.muni.pv168.backend.Ingredient;
import fi.muni.pv168.backend.MealCategory;
import fi.muni.pv168.backend.MealType;
import fi.muni.pv168.backend.Recipe;
import java.awt.EventQueue;
import java.util.SortedSet;
import java.util.TreeSet;
import javax.swing.DefaultListModel;

/**
 *
 * @author mulan
 */
public class RecipeForm extends javax.swing.JFrame {

    private RecipebookListJFrame hostFrame;
    private IngredientForm ingredientForm;
    
    /**
     * Creates new form RecipeForm
     */
    public RecipeForm(RecipebookListJFrame frame) {
        initComponents();
        this.hostFrame = frame;
        this.ingredientForm = new IngredientForm(this);
        this.ingredientsList.setModel(new DefaultListModel());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NameLabel = new javax.swing.JLabel();
        nameText = new javax.swing.JTextField();
        CancelButton = new javax.swing.JButton();
        OKButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        typeCombo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        categoryCombo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cookingTimeText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        numPortionsText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        instructionsText = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ingredientsList = new javax.swing.JList();
        addIngredientButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        NameLabel.setText("Recipe name:");

        CancelButton.setText("Cancel");
        CancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KillDialog(evt);
            }
        });
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        OKButton.setText("AddRecipe");
        OKButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Meal type");

        typeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Breakfast", "Appetizer", "Soup", "Main dish", "Salad", "Dessert", "Drink" }));

        jLabel2.setText("Meal category");

        categoryCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Meat", "Meatless", "Fish", "Sweet", "Alcoholic", "Nonalcoholic", "Pasta" }));

        jLabel3.setText("Cooking time (in minutes)");

        jLabel4.setText("Number of portions");

        jLabel5.setText("Ingredients:");

        instructionsText.setColumns(20);
        instructionsText.setRows(5);
        jScrollPane1.setViewportView(instructionsText);

        jLabel7.setText("Instructions:");

        jScrollPane2.setViewportView(ingredientsList);

        addIngredientButton.setText("AddIngredient");
        addIngredientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addIngredientButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cookingTimeText, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numPortionsText, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(NameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nameText)
                                    .addComponent(typeCombo, 0, 323, Short.MAX_VALUE)
                                    .addComponent(categoryCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(OKButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CancelButton))
                            .addComponent(addIngredientButton, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(329, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoryCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cookingTimeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numPortionsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addIngredientButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelButton)
                    .addComponent(OKButton))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(354, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(207, 207, 207)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KillDialog(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KillDialog
        this.hide();
    }//GEN-LAST:event_KillDialog

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        nameText.setText("");
        categoryCombo.setSelectedIndex(0);
        typeCombo.setSelectedIndex(0);
        cookingTimeText.setText("");
        numPortionsText.setText("");
        instructionsText.setText("");
        
        ingredientsList.setModel(new DefaultListModel());
        this.setVisible(false);
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void OKButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKButtonActionPerformed
        Recipe r = new Recipe();
        r.setName(nameText.getText());
        r.setCategory(MealCategory.fromInt(categoryCombo.getSelectedIndex()));
        r.setType(MealType.fromInt(typeCombo.getSelectedIndex()));
        r.setCookingTime(Integer.parseInt(cookingTimeText.getText()));
        r.setNumPortions(Integer.parseInt(numPortionsText.getText()));
        r.setInstructions(instructionsText.getText());
        
        SortedSet<Ingredient> ingrs= new TreeSet<Ingredient>();
        
        DefaultListModel model = (DefaultListModel) ingredientsList.getModel();
        for (int i = 0; i < model.getSize(); i++) {
           ingrs.add((Ingredient)model.elementAt(i));
        }

        hostFrame.createRecipe(r, ingrs);
        
        nameText.setText("");
        categoryCombo.setSelectedIndex(0);
        typeCombo.setSelectedIndex(0);
        cookingTimeText.setText("");
        numPortionsText.setText("");
        instructionsText.setText("");
        
        ingredientsList.setModel(new DefaultListModel());
        this.setVisible(false);
    }//GEN-LAST:event_OKButtonActionPerformed

    private void addIngredientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addIngredientButtonActionPerformed
        EventQueue.invokeLater(new Runnable() {

            public void run() {
                ingredientForm.setVisible(true);
            }
            
        });
    }//GEN-LAST:event_addIngredientButtonActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JButton OKButton;
    private javax.swing.JButton addIngredientButton;
    private javax.swing.JComboBox categoryCombo;
    private javax.swing.JTextField cookingTimeText;
    private javax.swing.JList ingredientsList;
    private javax.swing.JTextArea instructionsText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nameText;
    private javax.swing.JTextField numPortionsText;
    private javax.swing.JComboBox typeCombo;
    // End of variables declaration//GEN-END:variables
    
    public void addIngredient(Ingredient ingredient) {
        DefaultListModel model = (DefaultListModel) ingredientsList.getModel();
        model.addElement(ingredient);
        ingredientsList.setModel(model);
    }

}
