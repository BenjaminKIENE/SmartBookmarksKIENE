package com.example.benjaminkiene.smartbookmarkskiene;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Benjamin KIENE on 20/09/2017.
 */

public class BooksBDD {

    private SQLiteDatabase bdd;
    private MyDatas maBaseSQLite;

    public BooksBDD(Context context){
        //On crée la BDD et sa table
        maBaseSQLite = new MyDatas(context, null);
    }

    public void open(){
        //on ouvre la BDD en écriture
        bdd = maBaseSQLite.getWritableDatabase();
    }

    public void close(){
        //on ferme l'accès à la BDD
        bdd.close();
    }

    public SQLiteDatabase getBDD(){
        return bdd;
    }

    //Compte les livres
    public int countLivres()
    {
        Cursor c = bdd.query("Books", new String[] {"id", "title"},null, null, null, null, null);
        return c.getCount();
    }

    //Récupère la liste des livres
    public List<Book> getLivres(){
        List<Book> livres = new ArrayList<>();
        Cursor c = bdd.query("Books", new String[] {"id", "title"},null, null, null, null, "title ASC");
        if (c.moveToFirst()) {
            do {
                Book newBook = new Book();
                newBook.setId(c.getInt(0));
                newBook.setTitre(c.getString(1));

                livres.add(newBook);
            } while(c.moveToNext());
        }
        //si aucun élément n'a été retourné dans la requête, on renvoie null
        if (c.getCount() == 0)
            return null;

        c.close();
        //On retourne le livre
        return livres;
    }
}
