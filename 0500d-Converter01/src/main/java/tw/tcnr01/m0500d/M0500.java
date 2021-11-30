package tw.tcnr01.m0500d;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class M0500 extends AppCompatActivity {

    private EditText e001;
    private Button b001;
    private TextView t003;

    private DecimalFormat poodsFormate;
    private String ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0500);
        setupViewComponent();
    }

    private void setupViewComponent() {
        e001=(EditText)findViewById(R.id.m0500_e001);
        b001=(Button)findViewById(R.id.m0500_b001);
        t003=(TextView)findViewById(R.id.m0500_t003);
        b001.setOnClickListener(B001on);

    }



    private View.OnClickListener B001on=new View.OnClickListener(){

        @Override
        public void onClick(View v) {
//            DecimalFormat poodsFormate=new DecimalFormat("0.00000");
            poodsFormate=new DecimalFormat("0.00000");
            if(e001.getText().toString().length()>0){
                ans = poodsFormate.format(Float.parseFloat(e001.getText().toString())*2.20462262);
                t003.setText(ans);

            }else{
                t003.setText("輸入為空值");
            }
        }
    };

}