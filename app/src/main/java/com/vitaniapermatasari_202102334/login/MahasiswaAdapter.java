package com.vitaniapermatasari_202102334.login;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaViewHolder>
{
    private List<MahasiswaModel> _mahasiswaModelList;

    public MahasiswaAdapter(TampilMahasiswaActivity tampilMahasiswaActivity, List<MahasiswaModel> _mahasiswaModelList)
    {
        this._mahasiswaModelList = _mahasiswaModelList;
    }

    @NonNull
    @Override
    public MahasiswaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.list_mahasiswa , parent, false);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MahasiswaViewHolder holder, int position) {

    }

    @Override
    public int getItemCount()
    {
        int count = 0;
        if (_mahasiswaModelList != null){
            count = _mahasiswaModelList.size();
        }
        return count;
    }
}
