package com.hasan.mathsukrevision;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_open_formulas, btn_open_revision, btn_timer, btn_notes, btn_aqa, btn_edexcel, btn_ocr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_open_formulas = (Button) findViewById(R.id.btn_open_formulas);
        btn_open_formulas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ViewFormulas.class);
                startActivity(i);
            }
        });

        btn_open_revision = (Button) findViewById(R.id.btn_open_revision);
        btn_open_revision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRevisionActivity();
            }
        });

        btn_timer = (Button) findViewById(R.id.btn_timer);
        btn_timer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTimerActivity();
            }
        });

        btn_notes = (Button) findViewById(R.id.btn_notes);
        btn_notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNotesActivity();
            }
        });

        btn_aqa = (Button) findViewById(R.id.btn_aqa);
        btn_aqa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAqaActivity();
            }
        });

        btn_edexcel = (Button) findViewById(R.id.btn_edexcel);
        btn_edexcel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEdexcelActivity();
            }
        });

        btn_ocr = (Button) findViewById(R.id.btn_ocr);
        btn_ocr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOcrActivity();
            }
        });
    }

    public void openRevisionActivity() {
            Intent i = new Intent(this, RevisionActivity.class);
            startActivity(i);
        }

    public void openTimerActivity() {
        Intent i = new Intent(this, TimerActivity.class);
        startActivity(i);
    }

    public void openNotesActivity() {
        Intent i = new Intent(this, NotesActivity.class);
        startActivity(i);
    }

        public void openAqaActivity() {
            Intent i = new Intent(this, AqaActivity.class);
            startActivity(i);
        }

        public void openEdexcelActivity() {
            Intent i = new Intent(this, EdexcelActivity.class);
            startActivity(i);
        }

        public void openOcrActivity() {
            Intent i = new Intent(this, OcrActivity.class);
            startActivity(i);
        }

}