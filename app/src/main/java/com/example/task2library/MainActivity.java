package com.example.task2library;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mylibrary.AlertDialogManager;
import com.example.mylibrary.AlertDialogUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        AlertDialogUtils.showAlertDialog(this,
                                        "TITLE",
                                    "Message",
                                    "OK",
                                "CANCEL",
                                        0,
                new AlertDialogManager.AlertDialogListener() {
                            @Override
                            public void onPositiveClick() {
                                Toast.makeText(MainActivity.this, "Clicked OK",Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onNegativeClick() {
                                Toast.makeText(MainActivity.this, "Clicked CANCEL",Toast.LENGTH_SHORT).show();

                            }

                });
    }

}
