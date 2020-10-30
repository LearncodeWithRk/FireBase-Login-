package in.learncodewithrk.appsigninsignupcreateprofile;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class service extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
        BottomNavigationView bottomNavigationView = (BottomNavigationView)
                findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.service_ng:
                                Intent service_ng = new Intent(service.this, service.class);
                                startActivity(service_ng);
                                break;
                            case R.id.action_home:
                                Intent action_home = new Intent(service.this, nghome_page.class);
                                startActivity(action_home);
                                break;
                            case R.id.action_profile:
                                Intent inentProfile = new Intent(service.this, ProfileActivity.class);
                                startActivity(inentProfile);
                                break;
                        }
                        return true;
                    }
                });
    }
}