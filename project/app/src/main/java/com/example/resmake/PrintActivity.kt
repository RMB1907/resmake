package com.example.resmake

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.resmake.databinding.ActivityPrintBinding

class PrintActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPrintBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize the binding object
        binding = ActivityPrintBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configure WebView
       /* val webView: WebView = binding.webView
        webView.settings.javaScriptEnabled = true

        // Enable cookies
        val cookieManager = CookieManager.getInstance()
        cookieManager.setAcceptCookie(true)
        cookieManager.setAcceptThirdPartyCookies(webView, true)

        // Set WebViewClient to manage URL loading
        webView.webViewClient = WebViewClient()

        // Load Overleaf URL
        webView.loadUrl("https://www.overleaf.com/login")*/
    }
}
