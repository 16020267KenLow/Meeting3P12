package sg.edu.rp.c346.meeting3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    Spinner spn1;
    WebView wvMyPage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spn1 = findViewById(R.id.spinner1);
        wvMyPage = findViewById(R.id.webViewMyPage);

        wvMyPage.setWebViewClient(new WebViewClient());
        spn1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        String url = "https://www.google.com";
                        wvMyPage.loadUrl(url);
                        break;
                    case 1:
                        String turl = "https://www.rp.edu.sg/";
                        wvMyPage.loadUrl(turl);

                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                String url = "https://www.google.com";
                wvMyPage.loadUrl(url);

            }
        });

    }
}


