package com.example.mylibrary;

import android.content.Context;
import android.content.DialogInterface;

import androidx.appcompat.app.AlertDialog;

public class AlertDialogManager {

    private Context mContext;

    public AlertDialogManager(Context context) {
        mContext = context;
    }

    public void showAlertDialog(String title, String message, String positiveButtonText, String negativeButtonText, int iconResourceId, final AlertDialogListener listener) {

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(mContext);

        alertDialogBuilder.setTitle(title);
        alertDialogBuilder.setMessage(message);
        if (iconResourceId != 0) {
            alertDialogBuilder.setIcon(iconResourceId);
        }

        alertDialogBuilder.setPositiveButton(positiveButtonText, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                // Call the listener method when the positive button is clicked
                listener.onPositiveClick();
            }
        });

        alertDialogBuilder.setNegativeButton(negativeButtonText, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                // Call the listener method when the negative button is clicked
                listener.onNegativeClick();
            }
        });

        // Create and show the dialog
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    // Define an interface for the listener to handle the button clicks
    public interface AlertDialogListener {
        void onPositiveClick();
        void onNegativeClick();
    }
}