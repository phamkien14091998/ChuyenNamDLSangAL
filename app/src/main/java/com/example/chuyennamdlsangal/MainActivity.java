package com.example.chuyennamdlsangal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtNDL ;
    Button btnChuyenDoi;
    TextView txtNAL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNDL=findViewById(R.id.edtNDL);
        btnChuyenDoi=findViewById(R.id.btnChuyenDoi);
        txtNAL= findViewById(R.id.txtNAL);

        btnChuyenDoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String[] can = {"Giáp", "Ất", "Bính", "Đinh", "Mậu", "Kỷ", "Canh", "Tân", "Nhâm", "Quý"};
                String[] chi = {"Tí", "Sửu", "Dần", "Mão", "Thìn", "Tỵ", "Ngọ", "Mùi", "Thân", "Dậu", "Tuất", "Hợi"};
                int NamDL= Integer.parseInt(edtNDL.getText().toString());

                    int sodu_can = (NamDL + 6) % 10;
                    int sodu_chi = (NamDL + 8) % 12;
                    txtNAL.setText("Năm âm lịch : " + can[sodu_can] + " " + chi[sodu_chi]);

            }
        });





    }
}
