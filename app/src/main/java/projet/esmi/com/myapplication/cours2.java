package projet.esmi.com.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class cours2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cours2);

        WebView page = findViewById(R.id.web1);

       page.getSettings().setJavaScriptEnabled(true);
       page.loadUrl("https://www.facebook.com");

    }
}
