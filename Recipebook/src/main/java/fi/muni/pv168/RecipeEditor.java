package fi.muni.pv168;

import java.util.List;

/**
 * interface that represents editor of the recipes
 * @author Mimo
 */
public interface RecipeEditor {
    
    /** 
     * creates a recipe
     * @param recipe recipe to be created
     */
    void createRecipe(Recipe recipe);
    
    /**
     * deletes a recipe
     * @param recipe recipe to be deleted
     */
    void deleteRecipe(Recipe recipe);
    
    /**
     * edit a recipe
     * @param recipe recipe to be edited 
     */
    void editRecipe(Recipe recipe);
    
    /**
     * adds ingredients into existing recipe
     * @param ingredients list of ingredients to be added
     * @param recipe recipe that ingredients should be added into
     */
    void addIngredientsToRecipe(List<Ingredient> ingredients, Recipe recipe);
    
    /**
     * remove ingredients from existing recipe
     * @param ingredients list of ingredients to be removed
     * @param recipe recipe that ingredients should be removed from
     */
    void removeIngredientsFromRecipe(List<Ingredient> ingredients, Recipe recipe);
    /**
     * remove ingredients from existing recipe
     * @param ingredients string array of ingredients to be removed
     * @param recipe recipe that ingredients should be removed from
     */
    void removeIngredientsFromRecipe(String[] ingredients, Recipe recipe);
}