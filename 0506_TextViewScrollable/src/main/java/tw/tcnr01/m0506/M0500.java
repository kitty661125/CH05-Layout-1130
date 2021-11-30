package tw.tcnr01.m0506;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;
import android.text.method.ScrollingMovementMethod;


public class M0500 extends AppCompatActivity {

    private TextView msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m0500);
        setupViewcomponent();  //自定義方法
    }
    private void setupViewcomponent() {

        msg=(TextView)findViewById(R.id.m0506_msg);
        msg.setMovementMethod(ScrollingMovementMethod.getInstance());


    }
}