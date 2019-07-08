package polinema.ac.id.dtschapter04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class WelcomBack extends AppCompatActivity {
    EditText editTextEmail, editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcom_back);
        editTextEmail = findViewById(R.id.edit_username);
        editTextPassword = findViewById(R.id.edit_pwd);
    }

    public void clickForgot (View view){
        Intent i = new Intent(WelcomBack.this, ForgotPassword.class);
        startActivity(i);
    }

    public void clickSignUp (View view){
        Intent i = new Intent(WelcomBack.this, RegisterActivity.class);
        startActivity(i);
    }

    public void postLogin (View view){
        // Validasi input email dan password kosong
        if(TextUtils.isEmpty(editTextEmail.getText().toString().trim()) &&
                TextUtils.isEmpty(editTextPassword.getText().toString().trim())) {
            Toast.makeText(view.getContext(), "Email dan Password tidak boleh kosong!",
                    Toast.LENGTH_LONG).show();
        }
        // Validasi input email kosong
        else if(TextUtils.isEmpty(editTextEmail.getText().toString().trim())) {
            Toast.makeText(view.getContext(), "Email tidak boleh kosong!", Toast.LENGTH_LONG).show();
        }
        // Validasi inputan tipe email
        else if(!isValidEmail(editTextEmail.getText().toString().trim())) {
            Toast.makeText(view.getContext(), "Email tidak valid!", Toast.LENGTH_LONG).show();
        }
        else if(TextUtils.isEmpty(editTextPassword.getText().toString())){
            Toast.makeText(view.getContext(), "Password tidak boleh kosong!", Toast.LENGTH_LONG).show();
        }
        else {
            Intent i = new Intent(WelcomBack.this, success.class);
            startActivity(i);
        }
    }

    public static boolean isValidEmail(CharSequence email) {
        return (Patterns.EMAIL_ADDRESS.matcher(email).matches());
    }
}
