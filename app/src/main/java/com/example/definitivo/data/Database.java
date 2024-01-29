package com.example.definitivo.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Database extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "JaEsticDB";
    public Database(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);

    }
    @Override
    public void onCreate(SQLiteDatabase db) {

        // Tabla de categorías
        String createCategoriesTable = "CREATE TABLE CATEGORIES " +
                "(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "name VARCHAR NOT NULL" +
                ")";
        db.execSQL(createCategoriesTable);

        // Tabla de productos
        String createProductsTable = "CREATE TABLE PRODUCTS " +
                "(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "name TEXT NOT NULL," +
                "category_id INTEGER NOT NULL," +
                "description VARCHAR," +
                "image_reference VARCHAR," +
                "FOREIGN KEY (category_id) REFERENCES CATEGORIES(id)" +
                ")";
        db.execSQL(createProductsTable);


        //Tabla de usuarios
        String createUserTable = "CREATE TABLE USERS " +
                "(" +
                "username VARCHAR PRIMARY KEY," +
                "password VARCHAR PRIMARY KEY" +
                ")";

        db.execSQL(createUserTable);

        //Inserts categorias
        String insertCategoria1 = "INSERT INTO CATEGORIES (name) VALUES (Italian)";
        String insertCategoria2 = "INSERT INTO CATEGORIES (name) VALUES (American)";
        String insertCategoria3 = "INSERT INTO CATEGORIES (name) VALUES (Japanese)";
        String insertCategoria4 = "INSERT INTO CATEGORIES (name) VALUES (Drinks)";
        String insertCategoria5 = "INSERT INTO CATEGORIES (name) VALUES (Vegetarian)";
        String insertCategoria6 = "INSERT INTO CATEGORIES (name) VALUES (Arabian)";

        db.execSQL(insertCategoria1);
        db.execSQL(insertCategoria2);
        db.execSQL(insertCategoria3);
        db.execSQL(insertCategoria4);
        db.execSQL(insertCategoria5);
        db.execSQL(insertCategoria6);

        // Inserts Products

        //ITALIAN
        String insertProduct1 = "INSERT INTO PRODUCTS (name, category_id, image_reference, description) VALUES ('Margherita Pizza', 1, '@drawable/1MargheritaPizza', 'Tradition meets taste with our Margherita Pizza. Featuring a thin crust, rich tomato sauce, fresh mozzarella, and aromatic basil leaves, this pizza is a classic Italian delight.')";
        String insertProduct2 = "INSERT INTO PRODUCTS (name, category_id, image_reference, description) VALUES ('Penne Arrabbiata', 1, '@drawable/2PenneArrabbiata', 'Ignite your taste buds with our Penne Arrabbiata. Al dente penne pasta coated in a spicy tomato sauce, blended with garlic and red chili flakes for a flavorful kick.')";
        String insertProduct3 = "INSERT INTO PRODUCTS (name, category_id, image_reference, description) VALUES ('Tiramisu', 1, '@drawable/3Tiramisu', 'Indulge in the exquisite taste of our Tiramisu. Layers of coffee-soaked ladyfingers, velvety mascarpone, and a dusting of cocoa create a heavenly Italian dessert experience.')";

        //AMERICAN
        String insertProduct4 = "INSERT INTO PRODUCTS (name, category_id, image_reference, description) VALUES ('Classic Burger', 2, '@drawable/4ClassicBurger', 'Experience the classic American flavors with our Classic Burger. A perfectly grilled beef patty topped with fresh lettuce, ripe tomato slices, and gooey melted cheese, all nestled within a soft, toasted bun.')";
        String insertProduct5 = "INSERT INTO PRODUCTS (name, category_id, image_reference, description) VALUES ('Chicken Wings', 2, '@drawable/5ChickenWings', 'Enjoy a basket of our Chicken Wings – crispy on the outside, tender on the inside. Choose from a variety of flavorful sauces to elevate your wing experience.')";
        String insertProduct6 = "INSERT INTO PRODUCTS (name, category_id, image_reference, description) VALUES ('Cheese Fries', 2, '@drawable/6CheeseFries', 'Indulge in the ultimate comfort food – Cheese Fries. Golden fries topped with a generous serving of melted cheese for a savory and satisfying treat.')";

        //JAPANESE
        String insertProduct7 = "INSERT INTO PRODUCTS (name, category_id, image_reference, description) VALUES ('Sushi Combo', 3, '@drawable/7SushiCombo', 'Embark on a culinary journey with our Sushi Combo. A delightful assortment of sushi rolls and sashimi that showcases the artistry of Japanese cuisine.')";
        String insertProduct8 = "INSERT INTO PRODUCTS (name, category_id, image_reference, description) VALUES ('Miso Soup', 3, '@drawable/8MisoSoup', 'Savor the authentic flavors of Japan with our Miso Soup. A warm and comforting broth with tofu and seaweed, this soup is a classic Japanese favorite.')";
        String insertProduct9 = "INSERT INTO PRODUCTS (name, category_id, image_reference, description) VALUES ('Edamame', 3, '@drawable/9Edamame', 'Experience the simplicity and freshness of Edamame. These steamed soybeans, lightly salted, make for a nutritious and delightful snack.')";

        //DRINKS
        String insertProduct10 = "INSERT INTO PRODUCTS (name, category_id, image_reference, description) VALUES ('Soda', 4, '@drawable/10Soda', 'Quench your thirst with our refreshing Soda. A bubbly and effervescent beverage that complements any meal or serves as a standalone refreshing drink.')";
        String insertProduct11 = "INSERT INTO PRODUCTS (name, category_id, image_reference, description) VALUES ('Iced Tea', 4, '@drawable/11IcedTea', 'Cool down with our Iced Tea – a chilled and flavorful tea served over ice. A perfect companion for a hot day or any time you crave a refreshing beverage.')";
        String insertProduct12 = "INSERT INTO PRODUCTS (name, category_id, image_reference, description) VALUES ('Smoothie', 4, '@drawable/12Smoothie', 'Revitalize your day with our Smoothie. A blend of fresh fruits, yogurt, and ice, creating a delicious and nutritious drink bursting with natural flavors.')";

        //VEGETARIAN
        String insertProduct13 = "INSERT INTO PRODUCTS (name, category_id, image_reference, description) VALUES ('Vegetarian Pizza', 5, '@drawable/13VegetarianPizza', 'Savor the goodness of our Vegetarian Pizza. Topped with an array of fresh vegetables, rich tomato sauce, and melted cheese, it-s a flavorful and satisfying option for vegetarians.')";
        String insertProduct14 = "INSERT INTO PRODUCTS (name, category_id, image_reference, description) VALUES ('Quinoa Salad', 5, '@drawable/14QuinoaSalad', 'Elevate your dining experience with our Quinoa Salad. A nutritious blend of quinoa, fresh vegetables, and a light dressing, perfect for a healthy and delicious meal.')";
        String insertProduct15 = "INSERT INTO PRODUCTS (name, category_id, image_reference, description) VALUES ('Stuffed Bell Peppers', 5, '@drawable/15StuffedBellPeppers', 'Delight in our Stuffed Bell Peppers. Bell peppers filled with a savory mixture of rice, vegetables, and herbs, creating a hearty and flavorful dish.')";

        //ARABIC
        String insertProduct16 = "INSERT INTO PRODUCTS (name, category_id, image_reference, description) VALUES ('Hummus Plate', 6, '@drawable/16HummusPlate', 'Experience the Mediterranean delight of our Hummus Plate. Creamy hummus served with pita bread, olives, and fresh vegetables for a satisfying and flavorful appetizer.')";
        String insertProduct17 = "INSERT INTO PRODUCTS (name, category_id, image_reference, description) VALUES ('Falafel Wrap', 6, '@drawable/17FalafelWrap', 'Enjoy the flavors of the Middle East with our Falafel Wrap. Crispy falafel balls, fresh veggies, and tahini sauce wrapped in a warm pita, creating a delicious and satisfying meal.')";
        String insertProduct18 = "INSERT INTO PRODUCTS (name, category_id, image_reference, description) VALUES ('Baklava', 6, '@drawable/18Baklava', 'Indulge your sweet tooth with our Baklava. Layers of flaky pastry, nuts, and honey create a decadent and irresistible dessert, capturing the essence of Arabian cuisine.')";


        db.execSQL(insertProduct1);
        db.execSQL(insertProduct2);
        db.execSQL(insertProduct3);
        db.execSQL(insertProduct4);
        db.execSQL(insertProduct5);
        db.execSQL(insertProduct6);
        db.execSQL(insertProduct7);
        db.execSQL(insertProduct8);
        db.execSQL(insertProduct9);
        db.execSQL(insertProduct10);
        db.execSQL(insertProduct11);
        db.execSQL(insertProduct12);
        db.execSQL(insertProduct13);
        db.execSQL(insertProduct14);
        db.execSQL(insertProduct15);
        db.execSQL(insertProduct16);
        db.execSQL(insertProduct17);
        db.execSQL(insertProduct18);

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
