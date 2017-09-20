package com.example.benjaminkiene.smartbookmarkskiene;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class CommentairesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commentaires);


        ListView lvComments = (ListView)findViewById(R.id.lvComments);
        CommentsBDD commentsBdd = new CommentsBDD(this);

        MyDatas md = new MyDatas(this,null);
        ArrayAdapter<Comment> arcomment = new ArrayAdapter<Comment>(this,R.layout.activity_livres, (List<Comment>) commentsBdd.getComments());
        lvComments.setAdapter(arcomment);
    }
}
