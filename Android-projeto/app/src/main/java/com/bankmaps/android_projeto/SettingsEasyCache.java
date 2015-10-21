package com.bankmaps.android_projeto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.vincentbrison.openlibraries.android.dualcache.lib.DualCacheContextUtils;
import com.vincentbrison.openlibraries.android.dualcache.lib.DualCacheLogUtils;
import butterknife.ButterKnife;
import butterknife.InjectView;

public class SettingsEasyCache extends AppCompatActivity {

    //CHECKSTYLE:OFF
    @InjectView(R.id.activity_settings_edittext_ram_cache_size) protected EditText mEditTextSizeRam;
    @InjectView(R.id.activity_settings_edittext_disk_cache_size) protected EditText mEditTextSizeDisk;
    @InjectView(R.id.activity_settings_edittext_cache_id) protected EditText mEditTextIdCache;
    @InjectView(R.id.activity_settings_button_demo) protected Button mButtonDemo;
    //CHECKSTYLE:ON

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_settings_easy_cache);
        ButterKnife.inject(this);

        DualCacheLogUtils.enableLog();
        DualCacheContextUtils.setContext(getApplicationContext());

        mButtonDemo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SettingsEasyCache.this, DemoActivityEasyCache.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);

                intent.putExtra(DemoActivityEasyCache.EXTRA_DISK_CACHE_SIZE,
                        Integer.parseInt(mEditTextSizeDisk.getText().toString()));
                intent.putExtra(DemoActivityEasyCache.EXTRA_RAM_CACHE_SIZE,
                        Integer.parseInt(mEditTextSizeRam.getText().toString()));
                intent.putExtra(DemoActivityEasyCache.EXTRA_ID_CACHE, mEditTextIdCache.getText().toString());
                startActivity(intent);
            }
        });
    }
}
