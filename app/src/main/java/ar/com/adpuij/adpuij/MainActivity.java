package ar.com.adpuij.adpuij;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnOnClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* btnOnClick=(Button)findViewById(R.id.button2);
        btnOnClick.setOnClickListener(this);*/
        findViewById(R.id.button1).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.button4).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        Intent intent;

        switch (v.getId()){
            case R.id.button1:
                intent = new Intent(this,Institucion.class);
                startActivity(intent);
                break;
            case R.id.button2:
                intent = new Intent(this,Liga.class);
                startActivity(intent);
                break;

        }

    }
}
