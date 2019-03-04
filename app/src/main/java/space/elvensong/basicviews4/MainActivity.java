package space.elvensong.basicviews4;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TimePickerDialog.OnTimeSetListener dialogListener = new TimePickerDialog.OnTimeSetListener()  {
        @Override
        public void onTimeSet(TimePicker timePicker, int i, int i1)  {

            Toast.makeText(getApplicationContext(), String.valueOf(i), Toast.LENGTH_SHORT).show();

        }
    };

    Calendar cal = Calendar.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showTimeDialog();
    }

    public void showTimeDialog()  {
        new TimePickerDialog(MainActivity.this, dialogListener,
                cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE),
                false).show();
    }
}
