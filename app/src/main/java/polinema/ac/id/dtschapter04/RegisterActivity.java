package polinema.ac.id.dtschapter04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import polinema.ac.id.dtschapter04.models.Register;

public class RegisterActivity extends AppCompatActivity {
    private final  String TAG = RegisterActivity.class.getName();
    public static final String Key_RegisterActivity = "Key_RegisterActivity";
    EditText editTextName, editTextDob, editTextUsername, editTextPassword;
//    RadioButton radioButtonMale, radioButtonFemale;
    RadioButton radioButtonGender;
    RadioGroup radioGroupGender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        editTextName = findViewById(R.id.register_edt_text_name);
        editTextDob = findViewById(R.id.register_edt_text_dob);
        editTextUsername = findViewById(R.id.register_edt_username);
        editTextPassword = findViewById(R.id.register_edt_password);
//        radioButtonMale = findViewById(R.id.register_rb_male);
//        radioButtonFemale = findViewById(R.id.register_rb_female);
        radioGroupGender = findViewById(R.id.register_rg_gender);
    }

    public void postSignUp (View view){
        String password = editTextPassword.getText().toString();
        String username = editTextUsername.getText().toString();
        String name = editTextName.getText().toString();
//        String gender = radioButtonMale.isChecked() ? "Male" : "Female";

//        get gender ID
        int selectedGender = radioGroupGender.getCheckedRadioButtonId();
//        id radio button for address binding view
        radioButtonGender = findViewById(selectedGender);
        String gender = radioButtonGender.getText().toString();

        String dob = editTextDob.getText().toString();

        Register register = new Register(name, dob, gender, username, password);

//        Log.d(TAG,"postSignUp: " + password);
//        Log.d(TAG,"postSignUp: " + username);
//        Log.d(TAG,"postSignUp: " + name);
//        Log.d(TAG,"postSignUp: " + gender);
//        Log.d(TAG,"postSignUp: " + dob);

        Intent i = new Intent(RegisterActivity.this, RegisterResultActivity.class);
        i.putExtra(Key_RegisterActivity, register);
        startActivity(i);
    }
}
