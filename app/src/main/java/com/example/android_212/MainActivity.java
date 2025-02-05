package com.example.android_212;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

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
        //ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
         //   Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
          //  v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
          //  return insets;
       // });

        findViewById(R.id.button).setOnClickListener(this::OnButtonPlusClick);
        findViewById(R.id.button1).setOnClickListener(this::OnButtonMinusClick);
    }

    private void OnButtonPlusClick(View view){
       TextView tv =  findViewById( R.id.textView );
       String text = tv.getText().toString();
       int myInt = Integer.parseInt(text) + 1;
       text = Integer.toString(myInt);
       tv.setText(text);
    }

    private void OnButtonMinusClick(View view){
        TextView tv =  findViewById( R.id.textView );
        String text = tv.getText().toString();
        int myInt = Integer.parseInt(text) - 1;
        text = Integer.toString(myInt);
        tv.setText(text);
    }
}