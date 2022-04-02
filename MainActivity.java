package com.test.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.text.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @SuppressWarnings("unused")
    public WebView webView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new AlertDialog.Builder(MainActivity.this).setTitle("提示").setMessage("本软件仅限学习研究使用").setPositiveButton("进入",null).show();

        WebView webView = findViewById(R.id.webview);
        webView.setWebViewClient(new WebViewClient());
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setUserAgentString("Mozilla/5.0 (iPhone; CPU iPhone OS 11_0 like Mac OS X) AppleWebKit/604.1.38 (KHTML, like Gecko) Version/11.0 Mobile/15A372 Safari/604.1");
        webView.loadUrl("https://plogin.m.jd.com/login/login");
    }

    public void Button_Onclick(View view) {
        String ck = CookieManager.getInstance().getCookie("https://h5.m.jd.com");

        String[] ckl = ck.split(" ");
        StringBuilder out_ck = new StringBuilder();
        for (String c: ckl){
            if (c.contains("pt_pin")){
                out_ck.append(c);
            }else if (c.contains("pt_key")){
                out_ck.append(c);
            }
        }
        Toast.makeText(MainActivity.this, "已复制" +out_ck.toString(), Toast.LENGTH_LONG).show();
        ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
        cm.setText(out_ck);
    }
}

