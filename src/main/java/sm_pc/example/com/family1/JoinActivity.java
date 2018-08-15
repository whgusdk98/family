package sm_pc.example.com.family1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class JoinActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.activity_join);

    }
    public void joinClick (View v){
        Intent intent1 = new Intent(getApplicationContext(), SuccessActivity.class);
        startActivity(intent1);
    }

}
