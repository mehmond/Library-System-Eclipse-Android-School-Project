package com.librarysystem;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebView;


public class LibraryMain extends Activity {

  
    private WebView mWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mWebView = new WebView(this);
        mWebView.clearCache(true);
        mWebView.setWebChromeClient(new WebChromeClient());
        mWebView.getSettings().supportMultipleWindows();
        mWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        mWebView.getSettings().setLayoutAlgorithm(LayoutAlgorithm.NARROW_COLUMNS);
        mWebView.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
        mWebView.loadUrl("file:///android_asset/index.html");
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setBuiltInZoomControls(true);
        mWebView.getSettings().setDisplayZoomControls(false);
        setContentView(mWebView);
        //setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.library_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.studinfo) {
        	mWebView.loadUrl("file:///android_asset/studentinfo.html");
        }
        if (id == R.id.bnr) {
        	mWebView.loadUrl("file:///android_asset/bnr.html");
        }
        if (id == R.id.bookinv) {
        	mWebView.loadUrl("file:///android_asset/bookinv.html");
        }
        if (id == R.id.over) {
        	mWebView.loadUrl("file:///android_asset/over.html");
        }
        if (id == R.id.reports) {
        	mWebView.loadUrl("file:///android_asset/reports.html");
        }
        if (id == R.id.supplier) {
        	mWebView.loadUrl("file:///android_asset/supplier.html");
        }
        return super.onOptionsItemSelected(item);
    }
}
