package projet.esmi.com.myapplication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class cours1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cours1);

        final Button b3 =findViewById(R.id.d);
        final EditText ed1 =findViewById(R.id.msg1);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valeur = ed1.getText().toString();
               // Toast.makeText(getApplicationContext(), "io eeeee "+valeur, Toast.LENGTH_LONG).show();
                AlertDialog alertDialog = new AlertDialog.Builder(cours1.this).create();
                alertDialog.setTitle("Information");
                alertDialog.setMessage("Welcome to dear user." +valeur);


                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
                    }
                });

                alertDialog.show();

            }
        });
    }
}
