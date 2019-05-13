package truong.giang.aaaa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class cau3 extends AppCompatActivity {

    Button btnBack, btnResult, btnNext;
    Spinner spn1, spn2, spn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cau3);
        setControl();
        setEven();
    }

    private void setControl() {
        btnBack = findViewById(R.id.btnBack3);
        btnNext = findViewById(R.id.btnNext3);
        btnResult = findViewById(R.id.btnResult3);
        spn1 = findViewById(R.id.spn1);
        spn2 = findViewById(R.id.spn2);
        spn3 = findViewById(R.id.spn3);
    }

    private void setEven() {
//        final Bundle bundle = new Bundle(NhanDuLieu());
//        btnResult.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(cau3.this, man7.class);
//                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
//                XuLy(bundle);
//                intent.putExtra("dulieu", bundle);
//                startActivity(intent);
//            }
//        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spn1.setSelection(3);
                Toast.makeText(cau3.this, spn1.getSelectedItemPosition()+ " ", Toast.LENGTH_SHORT).show();
            }
        });
//        btnBack.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(cau3.this, cau2.class);
//                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
//                XuLy(bundle);
//                intent.putExtra("dulieu", bundle);
//                startActivity(intent);
//
//            }
//        });
    }

    private void XuLy(Bundle bundle) {
        String string = "";
        string += spn1.getSelectedItemId()+ " ";
        string += spn2.getSelectedItem()+ " ";
        string += spn3.getSelectedItem()+ " ";
        bundle.putString("cau3", string);

    }
    private Bundle NhanDuLieu(){
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("dulieu");
        return bundle;
    }
}