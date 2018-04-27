package com.lh.quang.autocompletetextviewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;


public class MainActivity extends Activity implements TextWatcher{
    //public static final TAG = "Main_Activity";
    TextView txtMsg;
    AutoCompleteTextView txtAutoMsg;
    String[] items = {"Lê", "Hội", "Quang", "Quý", "Hương", "Hướng", "Hường", "Hoa",
            "Quỳnh", "Quân", "Nữ", "Nương","20156304","222222","2223333"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMsg = (TextView)findViewById(R.id.txtMsg);
        txtAutoMsg = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        txtAutoMsg.addTextChangedListener(this);
        txtAutoMsg.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_single_choice,
                items
        ));
        Log.d("Main_Activity", "onCreate: ");

    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        Log.d("Main_Activity", "beforeTextChanged: ");

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        txtMsg.setText(txtAutoMsg.getText());
        Log.d("Main_Activity", "onTextChanged: ");
    }

    @Override
    public void afterTextChanged(Editable editable) {
        Log.d("Main_Activity", "afterTextChanged: ");

    }
}
