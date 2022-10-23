package com.example.terminal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ShellTool shellTool=new ShellTool();

        EditText text=(EditText)findViewById(R.id.shellInput);
        TextView shellOut=findViewById(R.id.shellResult);
        Button exc=findViewById(R.id.button);
        exc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shellOut.setText(shellTool.getShellResult(text.getText().toString()));
            }
        });

    }
}