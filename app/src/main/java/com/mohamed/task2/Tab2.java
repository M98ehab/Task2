package com.mohamed.task2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * Created by mohamed on 11/24/2017.
 */

public class Tab2 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.tab2,container,false);
        WebView webView = (WebView)rootview.findViewById(R.id.webview2);
        webView.loadUrl("http://www.aapgsuez.net/wuzzuf.html");
        return rootview;
    }
}
