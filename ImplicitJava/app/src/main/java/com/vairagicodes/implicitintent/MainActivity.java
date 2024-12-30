package com.vairagicodes.implicitintent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        EditText opeURlEditText = findViewById(R.id.get_url_et);



        Button openUrlButton = findViewById(R.id.open_url_btn);



        openUrlButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = opeURlEditText.getText().toString().trim();
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.putExtra(Intent.EXTRA_SUBJECT, "Email subject");
                intent.putExtra(Intent.EXTRA_TEXT, "Email body");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"john.archibald.campbell@example-pet-store.com"});)
                intent.setData(Uri.parse(url));
                startActivity(intent);



            }
        });



    }
}