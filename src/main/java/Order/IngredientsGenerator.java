package Order;

public class IngredientsGenerator {

    public static Ingredients getIngredients(String[] ingredientIds) {
        return new Ingredients(ingredientIds);
    }
}
