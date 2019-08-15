package com.example.latihanpassingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailOrderGomart extends AppCompatActivity {
    String nama,alamat,pesan;

    TextView tvNama;
    TextView tvAlamat;
    TextView tvPesan;

    Button btn_cancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_order_gomart);

        tvNama = (TextView) findViewById(R.id.textViewNama);
        tvAlamat = (TextView) findViewById(R.id.textViewAlamat);
        tvPesan = (TextView) findViewById(R.id.textViewPesan);
        btn_cancel = (Button) findViewById(R.id.button_cancel);

        getData();

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cancel = new Intent(DetailOrderGomart.this, HomeActivity.class);
                startActivity(cancel);
                finish();
            }
        });

    }

    public void getData() {
        nama = getIntent().getStringExtra("nama");
        pesan= getIntent().getStringExtra("pesan");
        alamat = getIntent().getStringExtra("alamat");

        tvNama.setText(nama);
        tvAlamat.setText(alamat);
        tvPesan.setText(pesan);

    }


}
