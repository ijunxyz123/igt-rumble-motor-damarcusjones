package com.arcade1up.igt_rumble_motor;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import com.arcade1up.igtsdk.IGTMotor;

public class MainActivity extends AppCompatActivity {

    private int rumbleDuration = 0;
    private TextView tvDuration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set a change listener on the SeekBar
        SeekBar seekBar = findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(seekBarChangeListener);

        // Get textview
        tvDuration = findViewById(R.id.textView_ms);

        // Set default label
        rumbleDuration = seekBar.getProgress();
        updateDurationLabel();

        // Rumble button
        Button buttonRumble = findViewById(R.id.button_rumble);
        buttonRumble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Rumble duration is in ms
                IGTMotor.rumble(rumbleDuration);
            }
        });
    }

    SeekBar.OnSeekBarChangeListener seekBarChangeListener = new SeekBar.OnSeekBarChangeListener() {
        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            // Update rumble duration and label
            rumbleDuration = progress;
            updateDurationLabel();
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {}

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {}
    };

    private void updateDurationLabel() {
        tvDuration.setText(Integer.toString(rumbleDuration) + "ms");
    }
}