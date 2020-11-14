package projet.esmi.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class Cours3 extends AppCompatActivity {

    EditText ed1, ed2;
    Button b1;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cours3);

        ed1 = findViewById(R.id.chanteur);
        ed2 = findViewById(R.id.titre);
        b1 = findViewById(R.id.search);
        text = findViewById(R.id.resultat);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RequestQueue queue = Volley.newRequestQueue(Cours3.this);
                String url ="https://api.lyrics.ovh/v1/"+ed1.getText().toString()+"/"+ed2.getText().toString()+"";
                
                StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                // Display the first 500 characters of the response string.
                                text.setText("Response is: "+ response.substring(0,550));

                            }
                        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        text.setText("Ne marche pas");
                    }
                });
                queue.add(stringRequest);

            }
        });


    }
}
