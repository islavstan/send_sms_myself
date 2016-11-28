package com.islavdroid.sms;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.app.Activity;
import android.app.AlertDialog;
public class MainActivity extends Activity implements OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.button1).setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        String phoneNumber = ((EditText)
                findViewById(R.id.editView1)).getText().toString();
        try {
            SmsManager.getDefault().sendTextMessage(phoneNumber, null, "Hello SMS!", null, null);
        } catch (Exception e) {
            AlertDialog.Builder alertDialogBuilder = new
                    AlertDialog.Builder(this);
            AlertDialog dialog = alertDialogBuilder.create();


            dialog.setMessage(e.getMessage());


            dialog.show();


        }


    }


}