package truong.giang.bai2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    CheckBox cbRau ;
    CheckBox cbKinh, cbTai;
    ImageView imgKinh;
    ImageView imgRau, imgTai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControl();
        addEvent();
    }

    private void addEvent() {
        cbRau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cbRau.isChecked())
                {
                    imgRau.setVisibility(View.VISIBLE);
                }
                else {
                    imgRau.setVisibility(View.INVISIBLE);
                }
            }
        });
        cbKinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cbKinh.isChecked())
                {
                    imgKinh.setVisibility(View.VISIBLE);
                }
                else {
                    imgKinh.setVisibility(View.INVISIBLE);
                }
            }
        });
        cbTai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cbTai.isChecked())
                {
                    imgTai.setVisibility(View.VISIBLE);
                }
                else {
                    imgTai.setVisibility(View.INVISIBLE);
                }
            }
        });
    }

    private void addControl() {
        cbKinh = findViewById(R.id.cbKinh);
        cbRau =  findViewById(R.id.cbRau);
        imgKinh = findViewById(R.id.imgKinh);
        imgRau=findViewById(R.id.imgRau);
        cbTai = findViewById(R.id.cbTai);
        imgTai = findViewById(R.id.imgTai);


    }

}
