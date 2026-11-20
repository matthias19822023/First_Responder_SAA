package de.firstresponder.saa;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;
import android.view.KeyEvent;

public class MainActivity extends Activity {
    private WebView webView;
    @Override public void onCreate(Bundle state) {
        super.onCreate(state);
        webView = new WebView(this);
        webView.setWebViewClient(new WebViewClient());
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(false);
        settings.setDomStorageEnabled(true);
        settings.setBlockNetworkLoads(true);
        setContentView(webView);
        webView.loadUrl("file:///android_asset/index.html");
    }
    @Override public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            webView.evaluateJavascript("(function(){var b=document.getElementById('bottom-back'); if(b && !b.disabled){b.click();return true;}return false;})()", result -> {
                if ("false".equals(result)) finish();
            });
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
    @Override protected void onDestroy() {
        if (webView != null) { webView.destroy(); webView = null; }
        super.onDestroy();
    }
}
