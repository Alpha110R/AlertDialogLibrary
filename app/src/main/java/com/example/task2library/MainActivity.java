package com.example.task2library;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mylibrary.AlertDialogManager;
import com.example.mylibrary.Utils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        Utils.showAlertDialog(this, "ASD", "rrrrr", "OK", "CANCAL", 0, new AlertDialogManager.AlertDialogListener() {
            @Override
            public void onPositiveClick() {
                Toast.makeText(MainActivity.this, "sdf",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNegativeClick() {
                Toast.makeText(MainActivity.this, "saaaaaadf",Toast.LENGTH_SHORT).show();

            }

        });
    }

}
