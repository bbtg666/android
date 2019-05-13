package truong.giang.aaaa;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.github.angads25.toggle.widget.LabeledSwitch;

public class cau5 extends AppCompatActivity {

    Button btnBack, btnResult, btnNext;
    LabeledSwitch labeledSwitch1,labeledSwitch2,labeledSwitch3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cau6);
        setControl();
        setEven();
    }

    private void setControl() {
        btnBack = findViewById(R.id.btnBack5);
        btnNext = findViewById(R.id.btnNext5);
        btnResult = findViewById(R.id.btnResult5);
        labeledSwitch1=findViewById(R.id.switch1);
        labeledSwitch2=findViewById(R.id.switch2);
        labeledSwitch3=findViewById(R.id.switch3);

    }

    private void setEven() {
        final Bundle bundle = new Bundle(NhanDuLieu());
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cau5.this, man7.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                XuLy(bundle);
                intent.putExtra("dulieu", bundle);
                startActivity(intent);
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cau5.this, man7.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                XuLy(bundle);
                intent.putExtra("dulieu", bundle);
                startActivity(intent);
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cau5.this, cau4.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                XuLy(bundle);
                intent.putExtra("dulieu", bundle);
                startActivity(intent);

            }
        });


    }

    private void XuLy(Bundle bundle) {
        String string = "";
        string += labeledSwitch1.isOn() + " ";
        string += labeledSwitch2.isOn() + " ";
        string += labeledSwitch3.isOn() + " ";
        bundle.putString("cau5", string);
    }

    private Bundle NhanDuLieu(){
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("dulieu");
        return bundle;
    }
}
