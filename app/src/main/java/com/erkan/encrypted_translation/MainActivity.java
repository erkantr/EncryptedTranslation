package com.erkan.encrypted_translation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText tr;
    int n ;
    Button cevir;
    EditText sifrelenmis;
    String ceviri_cumlesi = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //harf sayısını = n , i=0, i<n,i++
        tr = findViewById(R.id.tr);
        cevir = findViewById(R.id.cevir);
        sifrelenmis = findViewById(R.id.sifrelenmis);
        this.setTitle("Şifrelenmiş Çeviri");

        //String sifrelenmis_harfler  = String.valueOf(sifrelenmis_cumle.charAt(i));
        // abcdefghijklmnoprstuvyzqwx
        // jkglfdisxcvbmherwqaunzopty


            cevir.setOnClickListener(new View.OnClickListener() {
                @SuppressLint("SetTextI18n")
                @Override
                public void onClick(View view) {
                    String trcumle = tr.getText().toString();
                    n = trcumle.length();
                    if (!trcumle.equals("")) {
                        // abcdefghijklmnoprstuvyzqwx
                        // jkglfdisxcvbmherwqaunzopty
                        for (int i = 0; i < n; i++) {
                            String trharfler = String.valueOf(trcumle.charAt(i));
                            switch (trharfler) {
                                case "A":
                                    ceviri_cumlesi = ceviri_cumlesi + "J";
                                    break;
                                case "a":
                                    ceviri_cumlesi = ceviri_cumlesi + "j";
                                    break;
                                case "B":
                                    ceviri_cumlesi = ceviri_cumlesi + "K";
                                    break;
                                case "b":
                                    ceviri_cumlesi = ceviri_cumlesi + "k";
                                    break;
                                case "C":
                                    ceviri_cumlesi = ceviri_cumlesi + "G";
                                    break;
                                case "c":
                                    ceviri_cumlesi = ceviri_cumlesi + "g";
                                    break;
                                case "D":
                                    ceviri_cumlesi = ceviri_cumlesi + "L";
                                    break;
                                case "d":
                                    ceviri_cumlesi = ceviri_cumlesi + "l";
                                    break;
                                case "E":
                                    ceviri_cumlesi = ceviri_cumlesi + "F";
                                    break;
                                case "e":
                                    ceviri_cumlesi = ceviri_cumlesi + "f";
                                    break;
                                case "F":
                                    ceviri_cumlesi = ceviri_cumlesi + "D";
                                    break;
                                case "f":
                                    ceviri_cumlesi = ceviri_cumlesi + "d";
                                    break;
                                case "G":
                                    ceviri_cumlesi = ceviri_cumlesi + "I";
                                    break;
                                case "g":
                                    ceviri_cumlesi = ceviri_cumlesi + "i";
                                    break;
                                case "H":
                                    ceviri_cumlesi = ceviri_cumlesi + "S";
                                    break;
                                case "h":
                                    ceviri_cumlesi = ceviri_cumlesi + "s";
                                    break;
                                case "I":
                                    ceviri_cumlesi = ceviri_cumlesi + "X";
                                    break;
                                case "i":
                                    ceviri_cumlesi = ceviri_cumlesi + "x";
                                    break;
                                case "J":
                                    ceviri_cumlesi = ceviri_cumlesi + "C";
                                    break;
                                case "j":
                                    ceviri_cumlesi = ceviri_cumlesi + "c";
                                    break;
                                case "K":
                                    ceviri_cumlesi = ceviri_cumlesi + "V";
                                    break;
                                case "k":
                                    ceviri_cumlesi = ceviri_cumlesi + "v";
                                    break;
                                case "L":
                                    ceviri_cumlesi = ceviri_cumlesi + "B";
                                    break;
                                case "l":
                                    ceviri_cumlesi = ceviri_cumlesi + "b";
                                    break;
                                case "M":
                                    ceviri_cumlesi = ceviri_cumlesi + "M";
                                    break;
                                case "m":
                                    ceviri_cumlesi = ceviri_cumlesi + "m";
                                    break;
                                case "N":
                                    ceviri_cumlesi = ceviri_cumlesi + "H";
                                    break;
                                case "n":
                                    ceviri_cumlesi = ceviri_cumlesi + "h";
                                    break;
                                case "O":
                                    ceviri_cumlesi = ceviri_cumlesi + "E";
                                    break;
                                case "o":
                                    ceviri_cumlesi = ceviri_cumlesi + "e";
                                    break;
                                case "P":
                                    ceviri_cumlesi = ceviri_cumlesi + "R";
                                    break;
                                case "p":
                                    ceviri_cumlesi = ceviri_cumlesi + "r";
                                    break;
                                case "R":
                                    ceviri_cumlesi = ceviri_cumlesi + "W";
                                    break;
                                case "r":
                                    ceviri_cumlesi = ceviri_cumlesi + "w";
                                    break;
                                case "S":
                                    ceviri_cumlesi = ceviri_cumlesi + "Q";
                                    break;
                                case "s":
                                    ceviri_cumlesi = ceviri_cumlesi + "q";
                                    break;
                                case "T":
                                    ceviri_cumlesi = ceviri_cumlesi + "A";
                                    break;
                                case "t":
                                    ceviri_cumlesi = ceviri_cumlesi + "a";
                                    break;
                                case "U":
                                    ceviri_cumlesi = ceviri_cumlesi + "U";
                                    break;
                                case "u":
                                    ceviri_cumlesi = ceviri_cumlesi + "u";
                                    break;
                                case "V":
                                    ceviri_cumlesi = ceviri_cumlesi + "N";
                                    break;
                                case "v":
                                    ceviri_cumlesi = ceviri_cumlesi + "n";
                                    break;
                                case "Y":
                                    ceviri_cumlesi = ceviri_cumlesi + "Z";
                                    break;
                                case "y":
                                    ceviri_cumlesi = ceviri_cumlesi + "z";
                                    break;
                                case "Z":
                                    ceviri_cumlesi = ceviri_cumlesi + "O";
                                    break;
                                case "z":
                                    ceviri_cumlesi = ceviri_cumlesi + "o";
                                    break;
                                case "Q":
                                    ceviri_cumlesi = ceviri_cumlesi + "P";
                                    break;
                                case "q":
                                    ceviri_cumlesi = ceviri_cumlesi + "p";
                                    break;
                                case "W":
                                    ceviri_cumlesi = ceviri_cumlesi + "T";
                                    break;
                                case "w":
                                    ceviri_cumlesi = ceviri_cumlesi + "t";
                                    break;
                                case "X":
                                    ceviri_cumlesi = ceviri_cumlesi + "Y";
                                    break;
                                case "x":
                                    ceviri_cumlesi = ceviri_cumlesi + "y";
                                    break;
                                case " ":
                                    ceviri_cumlesi = ceviri_cumlesi + " ";
                                    break;
                            }
                        }
                        sifrelenmis.setText(ceviri_cumlesi);
                        ceviri_cumlesi = "";
                    } else {
                        String sifrelenmis_cumle = sifrelenmis.getText().toString();
                        if (!sifrelenmis_cumle.equals("")) {
                            //tr.setText("");
                            n = sifrelenmis_cumle.length();
                            // abcdefghijklmnoprstuvyzqwx
                            // jkglfdisxcvbmherwqaunzopty
                            for (int i = 0; i < n; i++) {
                                String sifrelenmis_harfler = String.valueOf(sifrelenmis_cumle.charAt(i));
                                switch (sifrelenmis_harfler) {
                                    case "J":
                                        ceviri_cumlesi = ceviri_cumlesi + "A";
                                        break;
                                    case "j":
                                        ceviri_cumlesi = ceviri_cumlesi + "a";
                                        break;
                                    case "K":
                                        ceviri_cumlesi = ceviri_cumlesi + "B";
                                        break;
                                    case "k":
                                        ceviri_cumlesi = ceviri_cumlesi + "b";
                                        break;
                                    case "G":
                                        ceviri_cumlesi = ceviri_cumlesi + "C";
                                        break;
                                    case "g":
                                        ceviri_cumlesi = ceviri_cumlesi + "c";
                                        break;
                                    case "L":
                                        ceviri_cumlesi = ceviri_cumlesi + "D";
                                        break;
                                    case "l":
                                        ceviri_cumlesi = ceviri_cumlesi + "d";
                                        break;
                                    case "F":
                                        ceviri_cumlesi = ceviri_cumlesi + "E";
                                        break;
                                    case "f":
                                        ceviri_cumlesi = ceviri_cumlesi + "e";
                                        break;
                                    case "D":
                                        ceviri_cumlesi = ceviri_cumlesi + "F";
                                        break;
                                    case "d":
                                        ceviri_cumlesi = ceviri_cumlesi + "f";
                                        break;
                                    case "I":
                                        ceviri_cumlesi = ceviri_cumlesi + "G";
                                        break;
                                    case "i":
                                        ceviri_cumlesi = ceviri_cumlesi + "g";
                                        break;
                                    case "S":
                                        ceviri_cumlesi = ceviri_cumlesi + "H";
                                        break;
                                    case "s":
                                        ceviri_cumlesi = ceviri_cumlesi + "h";
                                        break;
                                    case "X":
                                        ceviri_cumlesi = ceviri_cumlesi + "I";
                                        break;
                                    case "x":
                                        ceviri_cumlesi = ceviri_cumlesi + "i";
                                        break;
                                    case "C":
                                        ceviri_cumlesi = ceviri_cumlesi + "J";
                                        break;
                                    case "c":
                                        ceviri_cumlesi = ceviri_cumlesi + "j";
                                        break;
                                    case "V":
                                        ceviri_cumlesi = ceviri_cumlesi + "K";
                                        break;
                                    case "v":
                                        ceviri_cumlesi = ceviri_cumlesi + "k";
                                        break;
                                    case "B":
                                        ceviri_cumlesi = ceviri_cumlesi + "L";
                                        break;
                                    case "b":
                                        ceviri_cumlesi = ceviri_cumlesi + "l";
                                        break;
                                    case "M":
                                        ceviri_cumlesi = ceviri_cumlesi + "M";
                                        break;
                                    case "m":
                                        ceviri_cumlesi = ceviri_cumlesi + "m";
                                        break;
                                    case "H":
                                        ceviri_cumlesi = ceviri_cumlesi + "N";
                                        break;
                                    case "h":
                                        ceviri_cumlesi = ceviri_cumlesi + "n";
                                        break;
                                    case "E":
                                        ceviri_cumlesi = ceviri_cumlesi + "O";
                                        break;
                                    case "e":
                                        ceviri_cumlesi = ceviri_cumlesi + "o";
                                        break;
                                    case "R":
                                        ceviri_cumlesi = ceviri_cumlesi + "P";
                                        break;
                                    case "r":
                                        ceviri_cumlesi = ceviri_cumlesi + "p";
                                        break;
                                    case "W":
                                        ceviri_cumlesi = ceviri_cumlesi + "R";
                                        break;
                                    case "w":
                                        ceviri_cumlesi = ceviri_cumlesi + "r";
                                        break;
                                    case "Q":
                                        ceviri_cumlesi = ceviri_cumlesi + "S";
                                        break;
                                    case "q":
                                        ceviri_cumlesi = ceviri_cumlesi + "s";
                                        break;
                                    case "A":
                                        ceviri_cumlesi = ceviri_cumlesi + "T";
                                        break;
                                    case "a":
                                        ceviri_cumlesi = ceviri_cumlesi + "t";
                                        break;
                                    case "U":
                                        ceviri_cumlesi = ceviri_cumlesi + "U";
                                        break;
                                    case "u":
                                        ceviri_cumlesi = ceviri_cumlesi + "u";
                                        break;
                                    case "N":
                                        ceviri_cumlesi = ceviri_cumlesi + "V";
                                        break;
                                    case "n":
                                        ceviri_cumlesi = ceviri_cumlesi + "v";
                                        break;
                                    case "Z":
                                        ceviri_cumlesi = ceviri_cumlesi + "Y";
                                        break;
                                    case "z":
                                        ceviri_cumlesi = ceviri_cumlesi + "y";
                                        break;
                                    case "O":
                                        ceviri_cumlesi = ceviri_cumlesi + "Z";
                                        break;
                                    case "o":
                                        ceviri_cumlesi = ceviri_cumlesi + "z";
                                        break;
                                    case "P":
                                        ceviri_cumlesi = ceviri_cumlesi + "Q";
                                        break;
                                    case "p":
                                        ceviri_cumlesi = ceviri_cumlesi + "q";
                                        break;
                                    case "T":
                                        ceviri_cumlesi = ceviri_cumlesi + "W";
                                        break;
                                    case "t":
                                        ceviri_cumlesi = ceviri_cumlesi + "w";
                                        break;
                                    case "Y":
                                        ceviri_cumlesi = ceviri_cumlesi + "X";
                                        break;
                                    case "y":
                                        ceviri_cumlesi = ceviri_cumlesi + "x";
                                        break;
                                    case " ":
                                        ceviri_cumlesi = ceviri_cumlesi + " ";
                                        break;
                                }
                            }
                            tr.setText(ceviri_cumlesi);
                            ceviri_cumlesi = "";
                        }
                    }
                }
            });


            String cevirilmisHali;

            // abcdefghijklmnoprstuvyzqwx
            // jkglfdisxcvbmherwqaunzopty

        }
}