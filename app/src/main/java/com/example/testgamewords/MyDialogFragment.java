package com.example.testgamewords;

import android.app.AlertDialog;
import android.content.Context;

import androidx.annotation.NonNull;

public class MyDialogFragment extends androidx.appcompat.app.AlertDialog {


    public MyDialogFragment(@NonNull Context context) {
        super(context);

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Важное сообщение!")
                .setMessage("Закройте окно!")
                .setIcon(R.drawable.bg_setting)
                .setCancelable(false)
                .setNegativeButton("ОК, иду на балкон",
                        (dialog, id) -> dialog.cancel());
        AlertDialog alert = builder.create();

        if (alert.getWindow() != null)
            alert.getWindow().getAttributes().windowAnimations = R.style.SlidingDialogAnimation;

        alert.show();
    }
}
