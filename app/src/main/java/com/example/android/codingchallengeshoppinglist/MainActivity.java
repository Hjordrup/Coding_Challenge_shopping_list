package com.example.android.codingchallengeshoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView listItem1;
    private TextView listItem2;
    private TextView listItem3;
    private TextView listItem4;
    private TextView listItem5;
    private TextView listItem6;
    private TextView listItem7;
    private TextView listItem8;
    private TextView listItem9;
    private TextView listItem10;
    public static final int TEXT_REQUEST = 1;
    public int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listItem1 = findViewById(R.id.main_item1);
        listItem2 = findViewById(R.id.main_item2);
        listItem3 = findViewById(R.id.main_item3);
        listItem4 = findViewById(R.id.main_item4);
        listItem5 = findViewById(R.id.main_item5);
        listItem6 = findViewById(R.id.main_item6);
        listItem7 = findViewById(R.id.main_item7);
        listItem8 = findViewById(R.id.main_item8);
        listItem9 = findViewById(R.id.main_item9);
        listItem10 = findViewById(R.id.main_item10);

    }

    public void addItemLaunch(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    @Override
    public void onActivityResult(int requestCode,
                                 int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == TEXT_REQUEST) {
            if (resultCode == RESULT_OK) {
                String reply = data.getStringExtra(MainActivity2.EXTRA_REPLY);
                data.getStringExtra(MainActivity2.EXTRA_REPLY);
                addItemToList(reply);
            }
        }
    }

    public void addItemToList(String returnItem){
        switch (count){
            case 10: {
             listItem10.setText(returnItem);
             listItem10.setVisibility(View.VISIBLE);
             count++;
             break;
            }
            case 1: {
                listItem1.setText(returnItem);
                listItem1.setVisibility(View.VISIBLE);
                count++;
                break;
            }
            case 2: {
                listItem2.setText(returnItem);
                listItem2.setVisibility(View.VISIBLE);
                count++;
                break;
            }
            case 3: {
                listItem3.setText(returnItem);
                listItem3.setVisibility(View.VISIBLE);
                count++;
                break;
            }
            case 4: {
                listItem4.setText(returnItem);
                listItem4.setVisibility(View.VISIBLE);
                count++;
                break;
            }
            case 5: {
                listItem5.setText(returnItem);
                listItem5.setVisibility(View.VISIBLE);
                count++;
                break;
            }
            case 6: {
                listItem6.setText(returnItem);
                listItem6.setVisibility(View.VISIBLE);
                count++;
                break;
            }
            case 7: {
                listItem7.setText(returnItem);
                listItem7.setVisibility(View.VISIBLE);
                count++;
                break;
            }
            case 8: {
                listItem8.setText(returnItem);
                listItem8.setVisibility(View.VISIBLE);
                count++;
                break;
            }
            case 9: {
                listItem9.setText(returnItem);
                listItem9.setVisibility(View.VISIBLE);
                count++;
                break;
            }
            default:{
                break;
            }
        }

    }

}