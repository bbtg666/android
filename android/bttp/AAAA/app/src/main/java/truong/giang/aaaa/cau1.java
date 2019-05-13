package truong.giang.aaaa;

import android.content.Intent;
import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class cau1 extends AppCompatActivity {

    Button btnBack, btnResult, btnNext;
    RadioButton rChim, rCho, rCa, rKBiet;
    RadioGroup rdg1, rdg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cau1);
        setControl();
        setEven();
    }

    private void setControl() {
        btnBack = findViewById(R.id.btnBack1);
        btnNext = findViewById(R.id.btnNext1);
        btnResult = findViewById(R.id.btnResult1);
        rChim = findViewById(R.id.rdbChim);
        rCa = findViewById(R.id.rdbCa);
        rCho = findViewById(R.id.rdbCho);
        rKBiet = findViewById(R.id.rdbKoBiet);
        rdg1 = findViewById(R.id.rdg1);
        rdg2 = findViewById(R.id.rdg2);

    }

    private void setEven() {
        final Bundle bundle = new Bundle(NhanDuLieu());
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cau1.this, man7.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                XuLy(bundle);
                intent.putExtra("dulieu", bundle);
                startActivity(intent);
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cau1.this, cau2.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                XuLy(bundle);
                intent.putExtra("dulieu", bundle);
                startActivity(intent);
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cau1.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                XuLy(bundle);
                intent.putExtra("dulieu", bundle);
                startActivity(intent);

            }
        });
        rChim.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                rdg2.clearCheck();

            }
        });
        rCho.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                rdg2.clearCheck();
            }
        });
        rCa.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                rdg1.clearCheck();
            }
        });
        rKBiet.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                rdg1.clearCheck();
            }
        });



//        Toast.makeText(cau1.this, t, Toast.LENGTH_SHORT).show();
    }
    private Bundle NhanDuLieu(){
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("dulieu");
        return bundle;
    }
    private void XuLy(Bundle bundle)
    {
        int id1 = rdg1.getCheckedRadioButtonId();
        switch (id1){
            case R.id.rdbChim: {
                bundle.putString("cau1",rChim.getText().toString());
                break;
            }
            case R.id.rdbCa:{
                bundle.putString("cau1", rCa.getText().toString());
                break;
            }
        }
        int id2 = rdg2.getCheckedRadioButtonId();
        switch (id2){
            case R.id.rdbCho: {
                bundle.putString("cau1",rCho.getText().toString());
                break;
            }
            case R.id.rdbKoBiet:{
                bundle.putString("cau1", rKBiet.getText().toString());
            }
        }

    }

}
