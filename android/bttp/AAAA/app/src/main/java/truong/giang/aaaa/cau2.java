package truong.giang.aaaa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class cau2 extends AppCompatActivity {

    Button btnBack, btnResult, btnNext;
    CheckBox cb1, cb2, cb3, cb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cau11);
        setControl();
        setEven();
    }

    private void setControl() {
        btnBack = findViewById(R.id.btnBack2);
        btnNext = findViewById(R.id.btnNext2);
        btnResult = findViewById(R.id.btnResult2);
        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        cb4 = findViewById(R.id.cb4);

    }

    private void setEven() {
        final Bundle bundle = new Bundle(NhanDuLieu());
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cau2.this, man7.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                XuLy(bundle);
                intent.putExtra("dulieu", bundle);
                startActivity(intent);
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cau2.this, cau3.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                XuLy(bundle);
                intent.putExtra("dulieu", bundle);
                startActivity(intent);
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cau2.this, cau1.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                XuLy(bundle);
                intent.putExtra("dulieu", bundle);
                startActivity(intent);

            }
        });


    }

    private void XuLy(Bundle bundle) {
        String cau2= "";
        if(cb1.isChecked())
            cau2 += cb1.getText() + " ";
        if(cb2.isChecked())
            cau2 += cb2.getText() + " ";
        if(cb3.isChecked())
            cau2 += cb3.getText() + " ";
        if(cb4.isChecked())
            cau2 += cb4.getText() + " ";
        bundle.putString("cau2", cau2);

    }

    private Bundle NhanDuLieu(){
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("dulieu");
        return bundle;
    }
}

