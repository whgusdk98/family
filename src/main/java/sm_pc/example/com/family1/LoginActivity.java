package sm_pc.example.com.family1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        /*final EditText idText= (EditText) findViewById(R.id.idText);
        final EditText passwordText= (EditText) findViewById(R.id.passwordText);
        Button loginButton= (Button) findViewById(R.id.loginButton);
        Button findButton= (Button) findViewById(R.id.findButton);
        Button joinButton= (Button) findViewById(R.id.joinButton);*/

        }

    public void startClick(View v) {
        Intent intent = new Intent(this, JoinActivity.class);
        startActivity(intent);
    }
    public void loginClick(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
