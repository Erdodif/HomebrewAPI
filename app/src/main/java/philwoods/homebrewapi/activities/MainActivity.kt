package philwoods.homebrewapi.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import philwoods.homebrewapi.R
import philwoods.homebrewapi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
    }
}