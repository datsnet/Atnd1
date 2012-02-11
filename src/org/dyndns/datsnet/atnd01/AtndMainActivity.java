package org.dyndns.datsnet.atnd01;

import org.dyndns.datsnet.atnd1.R;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class AtndMainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        WebView webview = (WebView)findViewById(R.id.webView1);
        webview.loadUrl("http://atnd.org/");
    }
}