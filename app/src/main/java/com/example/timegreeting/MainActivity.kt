package com.example.timegreeting

import android.app.AlertDialog
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val showMessageButton: Button = findViewById(R.id.showMessageButton)
        showMessageButton.setOnClickListener {
            showTimeBasedMessage()
        }
    }

    private fun showTimeBasedMessage() {
        val message = getMessageForCurrentTime()
        
        AlertDialog.Builder(this)
            .setTitle(R.string.dialog_title)
            .setMessage(message)
            .setPositiveButton(R.string.dialog_button_ok) { dialog, _ ->
                dialog.dismiss()
            }
            .show()
    }

    private fun getMessageForCurrentTime(): String {
        val calendar = Calendar.getInstance()
        val hourOfDay = calendar.get(Calendar.HOUR_OF_DAY)

        return when (hourOfDay) {
            in 6..11 -> getString(R.string.morning_message)      // 6 AM - 11:59 AM
            in 12..17 -> getString(R.string.afternoon_message)   // 12 PM - 5:59 PM
            in 18..23 -> getString(R.string.evening_message)     // 6 PM - 11:59 PM
            else -> getString(R.string.night_message)            // 12 AM - 5:59 AM
        }
    }
}
