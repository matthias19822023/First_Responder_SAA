package de.firstresponder.saa;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;
import android.graphics.Color;

public class MainActivity extends Activity {
    private WebView webView;
    private TextView status;

    @Override public void onCreate(Bundle state) {
        super.onCreate(state);
        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setPadding(24, 32, 24, 24);
        root.setBackgroundColor(Color.WHITE);
        TextView title = new TextView(this);
        title.setText("FirstResponder – Diagnose");
        title.setTextSize(23);
        title.setTextColor(Color.BLACK);
        root.addView(title);
        status = new TextView(this);
        status.setText("Android-Start erfolgreich. Bitte 'SAA öffnen' wählen.");
        status.setTextSize(16);
        status.setTextColor(Color.DKGRAY);
        root.addView(status);
        Button open = new Button(this);
        open.setText("SAA öffnen");
        root.addView(open);
        setContentView(root);
        open.setOnClickListener(v -> {
            try {
                open.setEnabled(false);
                status.setText("WebView wird initialisiert …");
                webView = new WebView(this);
                webView.setWebViewClient(new WebViewClient() {
                    @Override public void onPageFinished(WebView view, String url) {
                        status.setText("HTML-Seite geladen: " + url);
                    }
                    @Override public void onReceivedError(WebView view, android.webkit.WebResourceRequest request, android.webkit.WebResourceError error) {
                        if (request.isForMainFrame()) status.setText("WebView-Fehler: " + error.getDescription());
                    }
                });
                WebSettings settings = webView.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setAllowFileAccess(true);
                settings.setAllowContentAccess(false);
                settings.setDomStorageEnabled(true);
                settings.setBlockNetworkLoads(true);
                root.addView(webView, new LinearLayout.LayoutParams(-1, 0, 1));
                webView.loadUrl("file:///android_asset/index.html");
            } catch (Throwable t) {
                status.setText("Startfehler: " + android.util.Log.getStackTraceString(t));
                open.setEnabled(true);
            }
        });
    }

    @Override public void onBackPressed() {
        if (webView != null) {
            webView.evaluateJavascript("(function(){var b=document.getElementById('bottom-back');if(b&&!b.disabled){b.click();return true;}return false;})()", result -> {
                if ("false".equals(result)) { webView.destroy(); webView = null; recreate(); }
            });
        } else super.onBackPressed();
    }
    @Override protected void onDestroy() {
        if (webView != null) { webView.destroy(); webView = null; }
        super.onDestroy();
    }
}
