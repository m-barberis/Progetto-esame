package com.matteo.gateopener;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "MainActivity";
    private Button bttRecord;
    private TextView tvSpeaker;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

    }

    void initViews() {
        bttRecord = findViewById(R.id.bttRecord);
        tvSpeaker = findViewById(R.id.tvSpeaker);
    }
}