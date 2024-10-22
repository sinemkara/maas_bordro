package com.example.maas_bordro;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText et_ad,et_cck;
RadioButton bkr,evlı,dul,kıra,kndev;
CheckBox ing,alm,rus;
Button hsp;
TextView sonuc;
Spinner sp;
int x;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_ad=findViewById(R.id.et_ad);
        et_cck=findViewById(R.id.et_cck);
        bkr=findViewById(R.id.bkr);
        evlı=findViewById(R.id.evlı);
        dul=findViewById(R.id.dul);
        kıra=findViewById(R.id.kıra);
        kndev=findViewById(R.id.kndev);
        ing=findViewById(R.id.ing);
        alm=findViewById(R.id.alm);
        rus=findViewById(R.id.rus);
        hsp=findViewById(R.id.hsp);
        sonuc=findViewById(R.id.sonuc);
        sp=findViewById(R.id.sp);

        hsp.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                x = 1000;
                int toplam = 0;  // Toplam değeri için bir değişken

                if (bkr.isChecked()) {
                    toplam += 0;
                }
                if (evlı.isChecked()) {
                    toplam += 75;
                }
                if (dul.isChecked()) {
                    toplam += 0;
                }
                if (kıra.isChecked()) {
                    toplam += 50;
                }
                if (kndev.isChecked()) {
                    toplam += 0;
                }
                if(ing.isChecked()){
                    toplam+=30;
                }
                if (alm.isChecked()){
                    toplam+=30;
                }
                if (rus.isChecked()){
                    toplam+=30;
                }
                // Spinner'dan seçilen pozisyonu al
                int selectedPosition = sp.getSelectedItemPosition();

                // Spinner'dan seçilen pozisyona göre işlem yap
                if (selectedPosition==0){}
                else if (selectedPosition == 1) {
                    toplam += 130;
                } else if (selectedPosition == 2) {
                    toplam += 170;
                } else if (selectedPosition == 3) {
                    toplam += 210;
                } else if (selectedPosition == 4) {
                    toplam += 250;
                }
                try {
                    // EditText içeriğini alın ve kontrolsüz bir şekilde parseInt kullanarak sayıya dönüştürün.
                    int cocukSayisi = Integer.parseInt(et_cck.getText().toString());

                    // Çocuk sayısına göre kontrol yapısı.
                    if (cocukSayisi==0){
                        Toast.makeText(MainActivity.this, "Lütfen 0'dan büyük sayı giriniz", Toast.LENGTH_LONG).show();
                    }
                    if (cocukSayisi == 1) {
                        toplam += 30;
                    } else if (cocukSayisi == 2) {
                        toplam += 60;
                    } else if (cocukSayisi == 3) {
                        toplam += 90;
                    } else if (cocukSayisi>3){
                        // 1, 2 veya 3 çocuk dışında bir sayı girildiyse burada bir işlem yapabilirsiniz.
                        Toast.makeText(getApplicationContext(), "Maximum 3 çocuk", Toast.LENGTH_SHORT).show();
                    }
                } catch (NumberFormatException e) {
                    // Kullanıcı sayısal olmayan bir değer girdiyse, burada bir işlem yapabilirsiniz.
                    Toast.makeText(getApplicationContext(), "Lütfen çocuk sayısını giriniz.", Toast.LENGTH_SHORT).show();
                }


                sonuc.setText(et_ad.getText().toString().toUpperCase() + "'in Maaşı =" + Integer.toString(x + toplam)+"'dir");
            }
        });//HESAP BİTİŞ
        /*sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                int x=1000;
                if (position == 0) {
                    sonuc.setText(Integer.toString(x + 130));
                    Toast.makeText(getApplicationContext(), "Sonuç =" + Integer.toString(x +130), Toast.LENGTH_SHORT).show();
                } else if (position == 1) {
                    sonuc.setText(Integer.toString(x +170));
                    Toast.makeText(getApplicationContext(), "Sonuç =" + Integer.toString(x +170), Toast.LENGTH_SHORT).show();
                } else if (position == 2) {
                    sonuc.setText(Integer.toString(x +210));
                    Toast.makeText(getApplicationContext(), "Sonuç =" + Integer.toString(x +210), Toast.LENGTH_SHORT).show();
                } else if (position == 3) {
                    sonuc.setText(Integer.toString(x +250));
                    Toast.makeText(getApplicationContext(), "Sonuç =" + Integer.toString(x +250), Toast.LENGTH_SHORT).show();
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });*///SPİNNER BİTİŞ



        /*hsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=1000;
                if (bkr.isChecked()){sonuc.setText("Toplam="+Integer.toString(x+0));}
                if (evlı.isChecked()){sonuc.setText("Toplam="+Integer.toString(x+75));}
                if (dul.isChecked()){sonuc.setText("Toplam="+Integer.toString(x+0));}
                if (kıra.isChecked()){sonuc.setText("Toplam="+Integer.toString(x+50));}
                if (kndev.isChecked()){sonuc.setText("Toplam="+Integer.toString(x+0));}

            }
        });*/



}}