package polinema.ac.id.dtschapter04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import polinema.ac.id.dtschapter04.models.Register;

public class RegisterResultActivity extends AppCompatActivity {
    TextView resultName, resultDob, resultGender, resultUsername;

    public static final String Key_RegisterActivity = "Key_RegisterActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_result);

        resultName = findViewById(R.id.register_result_name_content);
        resultDob = findViewById(R.id.register_result_dob_content);
        resultGender = findViewById(R.id.register_result_gender_content);
        resultUsername = findViewById(R.id.register_result_username_content);

//        Get String Array berdasarkan key
//        String[] stringsArray = getIntent().getStringArrayExtra(RegisterActivity.Key_RegisterActivity);

        Register register = getIntent().getParcelableExtra(Key_RegisterActivity);

//        Set value to text view
//        resultName.setText(stringsArray[0]);
//        resultDob.setText(stringsArray[1]);
//        resultGender.setText(stringsArray[2]);
//        resultUsername.setText(stringsArray[3]);

//        Set value to text view based on Parcel Object
        resultName.setText(register.getName());
        resultDob.setText(register.getDob());
        resultGender.setText(register.getGender());
        resultUsername.setText(register.getUsername());
    }
}
