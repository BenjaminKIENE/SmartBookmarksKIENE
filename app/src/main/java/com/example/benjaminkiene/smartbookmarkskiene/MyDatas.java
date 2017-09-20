package com.example.benjaminkiene.smartbookmarkskiene;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.List;

/**
 * Created by Benjamin KIENE on 20/09/2017.
 */

public class MyDatas extends SQLiteOpenHelper
{

    private static final String DATABASE_NAME = "MaBase";

    private static final int DATABASE_VERSION = 1;

    public MyDatas(Context context, SQLiteDatabase.CursorFactory factory) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("CREATE TABLE \"Books\" (\"id\" INTEGER PRIMARY KEY  AUTOINCREMENT  NOT NULL , \"title\" VARCHAR NOT NULL , \"author\" VARCHAR NOT NULL , \"genre\" VARCHAR NOT NULL ); \n" +
                "CREATE TABLE \"Comments\" (\"id\"  PRIMARY KEY  NOT NULL , \"bookId\"  NOT NULL , \"comment\"  NOT NULL , \"date\"  NOT NULL ); \n" +
                "INSERT INTO \"Books\" VALUES(1,'Les fleurs du mal','Charles Baudelaire','Poèmes'); \n" +
                "INSERT INTO \"Books\" VALUES(2,'Germinal','Emile Zola','Roman'); \n" +
                "INSERT INTO \"Books\" VALUES(3,'Les misérables','Victor Hugo','Roman'); \n" +
                "INSERT INTO \"Books\" VALUES(4,'1984','George Orwell','Science-Fiction'); \n" +
                "INSERT INTO \"Books\" VALUES(5,'Le Meilleur des mondes','Aldous Huxley','Science-Fiction'); \n" +
                "INSERT INTO \"Books\" VALUES(6,'Vingt mille lieues sous les mers','Jules Verne','Aventure'); \n" +
                "INSERT INTO \"Books\" VALUES(7,'Les Trois Mousquetaires','Alexandre Dumas','Aventure');");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE Books;");
        sqLiteDatabase.execSQL("DROP TABLE Comments;");
        onCreate(sqLiteDatabase);
    }

}
