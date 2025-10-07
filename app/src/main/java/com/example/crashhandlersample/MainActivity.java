
package com.example.crashhandlersample;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.crashhandlersample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inflate and get instance of binding
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        // set content view to binding's root
        setContentView(binding.getRoot());
        
        binding.button.setOnClickListener( e -> {
            throw new RuntimeException("the application to cracking");
        });
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.binding = null;
    }
}
