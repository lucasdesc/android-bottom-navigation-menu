package com.empresa.lucas.app;

import android.annotation.SuppressLint;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.fragment.app.FragmentTransaction;
import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;

import com.empresa.lucas.app.Fragments.FragmentProfile;
import com.empresa.lucas.app.Fragments.FragmentHome;
import com.empresa.lucas.app.Fragments.FragmentChat;
import com.empresa.lucas.app.Fragments.FragmentSearch;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigationView = (BottomNavigationView) findViewById(R.id.navigationView);
        navigationView.setOnNavigationItemSelectedListener(this);
        navigationView.setSelectedItemId(R.id.navigation_home);

    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.navigation_home: {
                Fragment homeFragment = FragmentHome.newInstance();
                openFragment(homeFragment);
                break;
            }
            case R.id.navigation_search: {
                Fragment searchFragment = FragmentSearch.newInstance();
                openFragment(searchFragment);
                break;
            }
            case R.id.navigation_chat: {
                Fragment chatFragment = FragmentChat.newInstance();
                openFragment(chatFragment);
                break;
            }
            case R.id.navigation_profile: {
                Fragment profileFragment = FragmentProfile.newInstance();
                openFragment(profileFragment);
                break;
            }
        }

        return true;
    }

    private void openFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}

