package com.example.baicanhan_ck;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class TaskActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        // Khởi tạo Bottom Navigation
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        // Đặt Task là màn hình mặc định
        bottomNavigationView.setSelectedItemId(R.id.nav_task);

        // Xử lý sự kiện khi chọn menu
        bottomNavigationView.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.nav_task) {
                // Mặc định đang ở TaskActivity
                return true;
            } else if (item.getItemId() == R.id.nav_profile) {
                // Chuyển sang ProfileActivity
                Intent intent = new Intent(TaskActivity.this, ProfileActivity.class);
                startActivity(intent);
                return true;
            }
            return false;
        });

    }
}
