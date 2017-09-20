package com.example.benjaminkiene.smartbookmarkskiene;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyDatas md = new MyDatas(this,null);
        Button btnLivres = (Button)findViewById(R.id.btnLivres);
        Button btnNotes = (Button)findViewById(R.id.btnNotes);
        Button btnAddCommentaire = (Button)findViewById(R.id.btnCom);
        TextView tvNbLivre = (TextView)findViewById(R.id.txtNbLivres);
        TextView tvNbCom = (TextView)findViewById(R.id.txtNbCom);
        TextView tvNbLivreByCom = (TextView)findViewById(R.id.tvNbComBkyLivre);

        BooksBDD booksBdd = new BooksBDD(this);
        //Affiche ne nombre de livre
        tvNbLivre.setText(booksBdd.countLivres());

        //Dirige vers la liste des livres
        btnLivres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LivresActivity.class));
            }
        });

        //Dirige vers la liste des notes
        btnNotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, NotesActivity.class));
            }
        });

        //Dirige vers l'activité pour ajouter un commentaire
        btnAddCommentaire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AddCommentaireActivity.class));
            }
        });
    }
}
