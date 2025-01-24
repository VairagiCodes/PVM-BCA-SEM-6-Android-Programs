package com.vairagicodes.databaseexample;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.vairagicodes.databaseexample.adapter.NotesAdapter;
import com.vairagicodes.databaseexample.db.DBHelper;
import com.vairagicodes.databaseexample.model.NotesModel;

import java.util.ArrayList;


public class AllNotesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_notes);

        ListView notesListView = findViewById(R.id.notes_list_view);

        DBHelper dbHelper = new DBHelper(AllNotesActivity.this);
        dbHelper.getWritableDatabase();


        ArrayList<NotesModel> notesModels = (ArrayList<NotesModel>) dbHelper.fetchAllNotes();

        NotesAdapter notesAdapter = new NotesAdapter(this, notesModels);

        notesListView.setAdapter(notesAdapter);

        notesListView.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}