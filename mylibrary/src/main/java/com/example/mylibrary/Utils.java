package com.example.mylibrary;

import android.content.Context;

public class Utils {

    public static void showAlertDialog(Context context, String title, String message, String positiveButtonText, String negativeButtonText, int iconResourceId, final AlertDialogManager.AlertDialogListener listener) {
        AlertDialogManager alertDialogManager = new AlertDialogManager(context);
        alertDialogManager.showAlertDialog(title, message, positiveButtonText, negativeButtonText, iconResourceId, listener);
    }

}
