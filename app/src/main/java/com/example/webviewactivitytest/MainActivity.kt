package com.example.webviewactivitytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {

    private val webView: WebView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "KotlinApp"
        val webView = findViewById<WebView>(R.id.webView)
        WebView.setWebContentsDebuggingEnabled(true);
        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://preview-m.tagesspiegel.de/berlin/zu-viele-woelfe-brandenburgs-bauernverband-befuerwortet-jagd-auf-woelfe-und-erntet-kritik/27522818.html")
//        webView.loadUrl("https://clients.opinary.com/test-pages/test-iframes/page-standard-ifame.html")
//        webView.loadUrl("https://clients.opinary.com/test-pages/test-iframes/page-with-blob-iframe.html")
//        webView.loadUrl("https://clients.opinary.com/xandr_sponsored_ams_placeholder/editorial-test.html")
        val webSettings = webView.settings
        webSettings.javaScriptEnabled = true;
    }

    override fun onBackPressed() {
        if (webView!!.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}