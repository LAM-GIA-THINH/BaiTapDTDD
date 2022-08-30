package com.example.baitapbmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView height =(TextView) findViewById(R.id.height);
        TextView weight =(TextView) findViewById(R.id.weight);
        TextView ketqua =(TextView) findViewById(R.id.ketqua);
        TextView chiso =(TextView) findViewById(R.id.chiso);
        MaterialButton tinhbtn = (MaterialButton) findViewById(R.id.tinhbtn);

        tinhbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double heightcm = Double.parseDouble(height.getText().toString());
                double weightkg = Double.parseDouble(weight.getText().toString());

                double BMI = heightcm / Math.pow(weightkg, 2) * 10000;
                chiso.setText(String.valueOf(BMI));
                        if (BMI < 18)
                            ketqua.setText("Bạn hơi gầy");
                        else if (18 <= BMI && BMI < 25)
                            ketqua.setText("Bạn bình thường");
                        else if (25 <= BMI && BMI < 30)
                            ketqua.setText("Bạn béo phì độ 1");
                        else if (30 <= BMI && BMI < 35)
                            ketqua.setText("Bạn béo phì độ 2");
                        else if (35 <= BMI)
                            ketqua.setText("Bạn béo phì độ 3");

                }

        });

}
}