package com.example.railkamalov.dagger2test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GameSession session = new GameSession();
        DaggerGameComponent.create().inject(session);

        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText(session.data.hello);
    }
}
