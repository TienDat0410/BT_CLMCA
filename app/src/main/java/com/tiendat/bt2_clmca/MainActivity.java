package com.tiendat.bt2_clmca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<SinhVienmodel> sinhVienmodelArrayList;
    SinhVienAdapter sinhVienAdapter;
    ListView listViewSinhvien;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sinhVienmodelArrayList = new ArrayList<>();
        sinhVienmodelArrayList.add(new SinhVienmodel("user1", 1000, "ngon", R.drawable.user1));
        sinhVienmodelArrayList.add(new SinhVienmodel("user2", 3000, "ngon", R.drawable.user1));
        sinhVienAdapter = new SinhVienAdapter(sinhVienmodelArrayList);
        listViewSinhvien = (ListView) findViewById(R.id.lvSinhVien);
        listViewSinhvien.setAdapter(sinhVienAdapter);

        listViewSinhvien.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                SinhVienmodel product = (SinhVienmodel) sinhVienAdapter.getItem(i) ;
                Toast.makeText(MainActivity.this, product.ten, Toast.LENGTH_LONG).show();
            }
        });
    }

    public void clickitem(View view) {
    }
}