package android.firstapp.com.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Test extends AppCompatActivity {

    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        btn=findViewById(R.id.button);
        // implicit intents
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(ACTION_VIEW, Uri.parse("http://www.google.com"));
//                startActivity(intent);

//                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "Your Phone_number"));
//                startActivity(intent);
            }
        });

       // explicit intents call an activity
       /* Bundle extras = getIntent().getExtras();

        if (extras != null) {
            String name = extras.getString("name");
            int age = extras.getInt("age");
        }*/
    }
}
