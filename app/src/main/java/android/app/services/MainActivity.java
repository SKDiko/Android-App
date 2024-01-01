package android.app.services;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    //Set Title bar Text
    public void setActionBarTitle(String title) {
        Objects.requireNonNull(getSupportActionBar()).setTitle(title);
    }
    //Main Method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Get the bottom navigation bar
        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        //Get Navigation bar Selected item
        bottomNav.setOnItemSelectedListener(navListener);
        //bottomNav.setOnNavigationItemSelectedListener(navListener);
        // Get and display fragment Home fragment when app is started
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(
                    R.id.fragment_container, new Nav_Courses()
            ).commit();
        }
    }
    // Get and display selected fragment
    @SuppressLint("NonConstantResourceId")
    private final BottomNavigationView.OnNavigationItemSelectedListener navListener =
            item -> {
                Fragment selectedFragment;
                switch (item.getItemId()) {
                    case R.id.nav_home:
                        selectedFragment = new Nav_Courses();
                        break;
                    case R.id.nav_calculate:
                        selectedFragment = new Nav_Calculate();
                        break;
                    case R.id.nav_send:
                        selectedFragment = new Nav_Apply();
                        break;
                    case R.id.nav_help:
                        selectedFragment = new Nav_Help();
                        break;
                    default:
                        selectedFragment = null;
                }
                getSupportFragmentManager().beginTransaction().replace(
                        R.id.fragment_container, selectedFragment
                ).commit();
                return true;
    };
}