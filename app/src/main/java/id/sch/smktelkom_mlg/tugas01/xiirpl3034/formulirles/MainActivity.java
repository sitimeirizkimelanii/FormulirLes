package id.sch.smktelkom_mlg.tugas01.xiirpl3034.formulirles;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNama;
    Spinner spKelas;
    RadioGroup rgJenjang;
    // RadioButton rdSD, rdSMP, rdSMA;
    CheckBox cbSenin, cbRabu, cbJumat;
    TextView tvHasil, tvHasil1, tvPilihH, tvHari;
    int nHari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNama = (EditText) findViewById(R.id.editTextNama);
        spKelas = (Spinner) findViewById(R.id.spinnerKelas);
        rgJenjang = (RadioGroup) findViewById(R.id.radioGroupJenjang);
        //rdSD = (RadioButton) findViewById(R.id.radioButtonSD);
        cbSenin = (CheckBox) findViewById(R.id.checkBoxSenin);
        cbRabu = (CheckBox) findViewById(R.id.checkBoxRabu);
        cbJumat = (CheckBox) findViewById(R.id.checkBoxJumat);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);
        tvHasil1 = (TextView) findViewById(R.id.textViewHasil1);
        tvHari = (TextView) findViewById(R.id.textViewHari);
        tvPilihH = (TextView) findViewById(R.id.textViewPilihH);

    }
}
