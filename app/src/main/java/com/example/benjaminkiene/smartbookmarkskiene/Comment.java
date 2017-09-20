package com.example.benjaminkiene.smartbookmarkskiene;
import java.util.Date;
/**
 * Created by Benjamin KIENE on 20/09/2017.
 */

public class Comment {
    int Id;
    int BookId;
    String Comment;
    Date Date;

    public Comment()
    {

    }

    public Comment(int id, int bookId, String comment, Date date)
    {
        Id = id;
        BookId = bookId;
        Comment = comment;
        Date = date;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getBookId() {
        return BookId;
    }

    public void setBookId(int bookId) {
        BookId = bookId;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public String toString()
    {
        return Comment.substring(0,50) + " - " +Date;
    }
}
