package com.example.benjaminkiene.smartbookmarkskiene;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class LivresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livres);

        ListView lvLivre = (ListView)findViewById(R.id.lvLivre);
        BooksBDD booksBdd = new BooksBDD(this);

        MyDatas md = new MyDatas(this,null);
        ArrayAdapter<Book> arbook = new ArrayAdapter<Book>(this,R.layout.activity_livres, (List<Book>) booksBdd.getLivres());
        lvLivre.setAdapter(arbook);

        //Lorsqu'on clique sur un livre
        lvLivre.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
                public void onItemClick(AdapterView<?> adapter, View v, int position,
                                        long arg3)
            {
                String value = (String)adapter.getItemAtPosition(position);
                startActivity(new Intent(LivresActivity.this, CommentairesActivity.class));
            }
        });
    }
}
