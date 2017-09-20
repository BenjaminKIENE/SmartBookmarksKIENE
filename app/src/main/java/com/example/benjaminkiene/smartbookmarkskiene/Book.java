package com.example.benjaminkiene.smartbookmarkskiene;

/**
 * Created by Benjamin KIENE on 20/09/2017.
 */

public class Book {
    int Id;
    String Titre;
    String Author;
    String Genre;

    public Book()
    {

    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public Book(int id, String titre, String author, String genre)
    {
        Id =  id;
        Titre = titre;
        Author = author;
        Genre = genre;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitre() {
        return Titre;
    }

    public void setTitre(String titre) {
        Titre = titre;
    }

    public String ToString()
    {
        return Titre + " - "+ Author + " - " + Genre;
    }
}
