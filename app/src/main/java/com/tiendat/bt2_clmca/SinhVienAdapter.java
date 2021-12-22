package com.tiendat.bt2_clmca;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SinhVienAdapter extends BaseAdapter {
    final ArrayList<SinhVienmodel> listSinhVien;
    private TextView textView;

    public SinhVienAdapter(ArrayList<SinhVienmodel> listSinhVien) {
        this.listSinhVien = listSinhVien;
    }


    public int getCount(){
        return  listSinhVien.size();

    }
    public Object getItem(int position)
    {
        return listSinhVien.get(position);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewLSinhVien = null;
        SinhVienmodel sinhVienmodel = (SinhVienmodel) getItem(i);

        textView =(TextView) viewLSinhVien.findViewById(R.id.tvTen);
        textView =(TextView) viewLSinhVien.findViewById(R.id.tvGia);

        return viewLSinhVien;
    }


}
