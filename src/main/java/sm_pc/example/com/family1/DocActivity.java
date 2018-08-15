package sm_pc.example.com.family1;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class DocActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);

        final EditText edittext = (EditText) findViewById(R.id.edittext);
        Button button = (Button) findViewById(R.id.enter);
        final TextView textView = (TextView) findViewById(R.id.firstQuestion);
        final TextView docAnswertext = (TextView) findViewById(R.id.docAnswertext);
        final ImageView mom2 = (ImageView) findViewById(R.id.mom2);
        final ImageView firstText = (ImageView) findViewById(R.id.firstText);
        final TextView firstQuestion = (TextView) findViewById(R.id.firstQuestion);
        final ImageView doctorAnswerImage = (ImageView) findViewById(R.id.doctorAnswerImage);
        final ImageView doctor = (ImageView) findViewById(R.id.doctor);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mom2.setVisibility(ImageView.VISIBLE);
                firstText.setVisibility(ImageView.VISIBLE);
                firstQuestion.setVisibility(TextView.VISIBLE);

                textView.setText(edittext.getText());
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //Do something after 100ms
                        docAnswertext.setText(" 분만 초기의 수축은 30~60초 동안 5~20분 간격입니다.\n 시간이 지나면 60~90초 동안 수축이 2~4분 간격으로 옵니다. ");
                        doctor.setVisibility(ImageView.VISIBLE);
                        doctorAnswerImage.setVisibility(ImageView.VISIBLE);
                        docAnswertext.setVisibility(TextView.VISIBLE);
                    }
                }, 2000);

            }
        });
    }
}