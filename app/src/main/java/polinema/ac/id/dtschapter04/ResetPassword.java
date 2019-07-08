package polinema.ac.id.dtschapter04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ResetPassword extends AppCompatActivity {
    EditText editTextResetCode, editTextNewPwd, editTextConfirmPwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
        editTextResetCode = findViewById(R.id.edit_reset_code);
        editTextNewPwd = findViewById(R.id.edit_new_pwd);
        editTextConfirmPwd = findViewById(R.id.edit_confirm_new_pwd);
    }
    public void postChangePassword(View view){
        if (TextUtils.isEmpty(editTextResetCode.getText().toString().trim()) ||
            TextUtils.isEmpty(editTextConfirmPwd.getText().toString().trim()) ||
            TextUtils.isEmpty(editTextNewPwd.getText().toString().trim())){
            Toast.makeText(view.getContext(), "Tidak boleh kosong!", Toast.LENGTH_SHORT).show();
        } else if (editTextNewPwd.getText().toString().trim().length() > 15 ||
                   editTextConfirmPwd.getText().toString().trim().length() > 15){
            Toast.makeText(view.getContext(), "Password max length 15 character", Toast.LENGTH_SHORT).show();
        } else if (!TextUtils.equals(editTextNewPwd.getText().toString().trim(), editTextConfirmPwd.getText().toString().trim())) {
            Toast.makeText(view.getContext(), "Password must same", Toast.LENGTH_SHORT).show();
        } else {
            Intent i = new Intent(ResetPassword.this, success.class);
            startActivity(i);
        }
    }
}
