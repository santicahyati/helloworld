package com.mobile.myaplikasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int skorA=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tambahpoint(View view) {
        skorA = skorA + 3;
        TextView textView = findViewById(R.id.scA);
        textView.setText(String.valueOf(skorA));
    }
}
