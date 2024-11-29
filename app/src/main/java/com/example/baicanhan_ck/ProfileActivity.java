package com.example.baicanhan_ck;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ProfileActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);

        // Khởi tạo Bottom Navigation
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        // Đặt Profile là màn hình mặc định
        bottomNavigationView.setSelectedItemId(R.id.nav_profile);

        // Xử lý sự kiện khi chọn menu
        bottomNavigationView.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.nav_task) {
                // Chuyển sang TaskActivity
                Intent intent = new Intent(ProfileActivity.this, TaskActivity.class);
                startActivity(intent);
                return true;
            } else if (item.getItemId() == R.id.nav_profile) {
                // Mặc định đang ở ProfileActivity
                return true;
            }
            return false;
        });

    }
}
