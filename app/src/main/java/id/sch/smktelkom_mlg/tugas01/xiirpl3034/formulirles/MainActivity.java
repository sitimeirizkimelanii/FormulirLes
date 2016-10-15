package id.sch.smktelkom_mlg.tugas01.xiirpl3034.formulirles;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  implements CompoundButton.OnCheckedChangeListener {
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

        findViewById(R.id.buttonSubmit).setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view){

                doClick();
            }
        });

        cbSenin.setOnCheckedChangeListener(this);
        cbRabu.setOnCheckedChangeListener(this);
        cbJumat.setOnCheckedChangeListener(this);

    }

    private void doClick() {
        if (isValid()) {
            String nama = etNama.getText().toString();
            if (spKelas.getSelectedItem().equals("1")){
                tvHasil.setText(nama + "mengikuti kursus dengan biaya /thn : Rp500.000");
            }
            else if (spKelas.getSelectedItem().equals("2")){
                tvHasil.setText(nama + "mengikuti kursus dengan biaya /thn : Rp500.000");
            }
            else if (spKelas.getSelectedItem().equals("3")){
                tvHasil.setText(nama + "mengikuti kursus dengan biaya /thn : Rp500.000");
            }
            else if(spKelas.getSelectedItem().equals("4")){
                tvHasil.setText(nama + "mengikuti kursus dengan biaya /thn : Rp1.000.000");
            }
            else if(spKelas.getSelectedItem().equals("5")){
                tvHasil.setText(nama + "mengikuti kursus dengan biaya /thn : Rp1.000.000");
            }
            else if(spKelas.getSelectedItem().equals("6")){
                tvHasil.setText(nama + "mengikuti kursus dengan biaya /thn : Rp1.000.000");
            }
            else if(spKelas.getSelectedItem().equals("7")){
                tvHasil.setText(nama + "mengikuti kursus dengan biaya /thn : Rp1.500.000");
            }
            else if(spKelas.getSelectedItem().equals("8")){
                tvHasil.setText(nama + "mengikuti kursus dengan biaya /thn : Rp1.500.000");
            }
            else if(spKelas.getSelectedItem().equals("9")){
                tvHasil.setText(nama + "mengikuti kursus dengan biaya /thn : Rp1.700.000");
            }
            else if(spKelas.getSelectedItem().equals("10")){
                tvHasil.setText(nama + "mengikuti kursus dengan biaya /thn : Rp.2.000.000");
            }
            else if(spKelas.getSelectedItem().equals("11")){
                tvHasil.setText(nama + "mengikuti kursus dengan biaya /thn : Rp.2.000.000");
            }else

            tvHasil.setText(nama + "mengikuti kursus dengan biaya /thn : Rp2.500.000");

            String hasil = null; //untuk menampilkan radiobutton yang ada pada radiogrup

            if(rgJenjang.getCheckedRadioButtonId()!=-1){
                RadioButton rb = (RadioButton)findViewById(rgJenjang.getCheckedRadioButtonId());
                hasil = rb.getText().toString();
            }
            tvHasil1.setText("Jenjang : " + hasil);

            //untuk checkbox
            String hari="Hari yang anda pilih (maksimal 3):\n";
            int startlen=hari.length();
            if(cbSenin.isChecked()) hari+=cbSenin.getText()+"\n";
            if(cbRabu.isChecked()) hari+=cbRabu.getText()+"\n";
            if(cbJumat.isChecked()) hari+=cbJumat.getText()+"\n";


            if(hari.length()==startlen) hasil+="Tidak ada pada pilihan";

            tvPilihH.setText(hari);


        }


    }

    private boolean isValid() {
        boolean valid = true;

        String nama = etNama.getText().toString();


        if(nama.isEmpty()){
            etNama.setError("Nama belum diisi");
            valid = false;
        }
        else if(nama.length()<10){

            etNama.setError("Nama minimal 10 karakter");
            valid = false;
        }
        else{

            etNama.setError(null);
        }

        return valid ;


    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        if(isChecked) nHari+=1;
        else nHari-=1;

        tvHari.setText("Hari("+nHari+") terpilih");

    }
}
