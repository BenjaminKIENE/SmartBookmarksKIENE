package com.example.benjaminkiene.smartbookmarkskiene;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.List;

public class AddCommentaireActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_commentaire);
        Spinner spinnerLivres = (Spinner) findViewById(R.id.spinnerLivres);
        BooksBDD booksBdd = new BooksBDD(this);
        MyDatas md = new MyDatas(this,null);
        Button btnAddLivre = (Button)findViewById(R.id.btnAjouterLivre);
        Button btnValider = (Button)findViewById(R.id.btnValider);
        Button btnAnnuler = (Button)findViewById(R.id.btnAnnuler);

        ArrayAdapter<Book> adapterLivre = new ArrayAdapter<Book>(this, android.R.layout.simple_spinner_item, (List<Book>) booksBdd.getLivres());
        adapterLivre.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerLivres.setAdapter(adapterLivre);
    }
}
