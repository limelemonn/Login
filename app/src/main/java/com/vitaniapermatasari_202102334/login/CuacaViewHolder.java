package com.vitaniapermatasari_202102334.login;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CuacaViewHolder extends RecyclerView.ViewHolder {
    public ImageView cuacaImageView;
    public TextView namaTextView,deskripsiText,tglWaktuView,suhuTextView;

    public CuacaViewHolder(@NonNull View itemView) {
        super(itemView);

        cuacaImageView = (ImageView) itemView.findViewById(R.id.cuacaImageView);
        namaTextView =  (TextView) itemView.findViewById(R.id.namaTextView);
        deskripsiText = (TextView) itemView.findViewById(R.id.deskripsiTextView);
        tglWaktuView = (TextView) itemView.findViewById(R.id.tglWaktuTextView);
        suhuTextView = (TextView) itemView.findViewById(R.id.suhuTextView);
    }
}
