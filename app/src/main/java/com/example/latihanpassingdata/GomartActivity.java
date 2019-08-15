package com.example.latihanpassingdata;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GomartActivity extends AppCompatActivity {

    EditText txtNama;
    EditText txtAlamat;
    EditText txtPesan;
    Button btn_gomart;


    String nama,pesan,alamat;


    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gomart);


        txtNama = (EditText) findViewById(R.id.TextNama);
        txtAlamat = (EditText) findViewById(R.id.TextAlamat);
        txtPesan = (EditText) findViewById(R.id.TextPesan);
        btn_gomart = (Button) findViewById(R.id.btn_order_gomart);

        btn_gomart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                passingData();
            }
        });

    }

    public void passingData() {
        nama = txtNama.getText().toString();
        pesan = txtPesan.getText().toString();
        alamat = txtAlamat.getText().toString();

        if(nama.isEmpty()){
            txtNama.setError("nama harus di isi");
            txtNama.requestFocus();
            return;
        } if(alamat.isEmpty()){
            txtAlamat.setError("Pesan harus di isi");
            txtAlamat.requestFocus();
            return;
        } if(pesan.isEmpty()){
            txtPesan.setError("Alamat harus di isi");
            txtPesan.requestFocus();
            return;
        }

        Intent order = new Intent(GomartActivity.this, DetailOrderGomart.class);
        order.putExtra("nama", nama);
        order.putExtra("pesan", pesan);
        order.putExtra("alamat", alamat);

        startActivity(order);
        finish();
    }


}
