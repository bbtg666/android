package truong.giang.aaaa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ToggleButton;

public class cau4 extends AppCompatActivity {

    Button btnBack, btnResult, btnNext;
    ToggleButton tgb1, tgb2, tgb3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cau5);
        setControl();
        setEven();
    }

    private void setControl() {
        btnBack = findViewById(R.id.btnBack4);
        btnNext = findViewById(R.id.btnNext4);
        btnResult = findViewById(R.id.btnResult4);
        tgb1 = findViewById(R.id.tg1);
        tgb2 = findViewById(R.id.tg2);
        tgb3 = findViewById(R.id.tg3);
    }

    private void setEven() {
        final Bundle bundle = new Bundle(NhanDuLieu());
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cau4.this, man7.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                XuLy(bundle);
                intent.putExtra("dulieu", bundle);
                startActivity(intent);
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cau4.this, cau5.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                XuLy(bundle);
                intent.putExtra("dulieu", bundle);
                startActivity(intent);
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cau4.this, cau3.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                XuLy(bundle);
                intent.putExtra("dulieu", bundle);
                startActivity(intent);

            }
        });

    }

    private void XuLy(Bundle bundle) {
        String string = "";
        string += tgb1.isChecked() + " ";
        string += tgb2.isChecked() + " ";
        string += tgb3.isChecked() + " ";
        bundle.putString("cau4", string);

    }

    private Bundle NhanDuLieu(){
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("dulieu");
        return bundle;
    }
}

