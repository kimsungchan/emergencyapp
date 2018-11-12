package com.example.user.emergencyapp;

import android.app.ListActivity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.util.Base64;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.content.pm.Signature;



import java.security.MessageDigest;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try{
            PackageInfo info = getPackageManager().getPackageInfo(getPackageName(), PackageManager.GET_SIGNATURES);
            for (Signature signature : info.signatures) {
                MessageDigest md;
                md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                String key = new String(Base64.encode(md.digest(), 0));
                Log.d("Hash key:", "!!!!!!!"+key+"!!!!!!");
            }
        } catch (Exception e){
            Log.e("name not found", e.toString());
        }
        ListAdapter adapter = new DemoListAdapter(this, DemoListItem.DEMO_LIST_ITEMS);
        setListAdapter(adapter);
    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        DemoListItem demo = (DemoListItem) getListAdapter().getItem(position);
        startActivity(new Intent(this, demo.activity));
    }

}
