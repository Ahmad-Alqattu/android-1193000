package edu.cs.birzeit.bio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button add;
    TextView name;
    EditText to_do;
    Switch sw;
    Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        set();
//         textBios ;
        add.setOnClickListener( (View v) ->{
            TextView textBios = findViewById(R.id.textBio)  ;
            CharSequence text ;
            if(to_do.getText()!=null) {
                if (sw.isChecked())
                    text=  " , " + textBios.getText() + to_do.getText() + " , " + sw.getText();
                else
                    text=  " , " + textBios.getText() + to_do.getText() + " , " + sw.getText();
                textBios.setText(text);



                Context context = getApplicationContext();

                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

    }

    private void set() {


        add = findViewById(R.id.add);
        name = findViewById(R.id.name);
        to_do = findViewById(R.id.T_todo);
        sw = findViewById(R.id.switch1);
        sp = findViewById(R.id.spinner);

    }




}