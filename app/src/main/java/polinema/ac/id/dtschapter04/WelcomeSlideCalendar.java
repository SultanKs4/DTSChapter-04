package polinema.ac.id.dtschapter04;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WelcomeSlideCalendar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_slide_calendar);
    }

    public void clickGetStarted(View view){
        Intent i = new Intent(WelcomeSlideCalendar.this, WelcomeSlideSuperhero.class);
        startActivity(i);
    }

    public void clickLogin(View view){
        Intent i = new Intent(WelcomeSlideCalendar.this, WelcomBack.class);
        startActivity(i);
    }
    public void clickContactUs(View view){
        Intent i = new Intent(Intent.ACTION_SENDTO);
//        HANDLER ALL APP
//        i.setType("text/plain");
//        HANDLER MAIL APP ONLY
        i.setData(Uri.parse("mailto:"));
        i.putExtra(Intent.EXTRA_EMAIL, new String[]{"dts@polinema.ac.id","wri@polinema.ac.id"});
        i.putExtra(Intent.EXTRA_CC, new String[]{"sultan@polinema.ac.id"});
        i.putExtra(Intent.EXTRA_BCC, new String[]{"ardan@polinema.ac.id"});
        i.putExtra(Intent.EXTRA_SUBJECT, "Test Email");
        i.putExtra(Intent.EXTRA_TEXT,"Welcome to DTS 2019");
        startActivity(i.createChooser(i, "Choose email client"));
    }
}
