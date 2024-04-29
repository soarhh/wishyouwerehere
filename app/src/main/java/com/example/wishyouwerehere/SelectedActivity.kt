package com.example.wishyouwerehere

import android.os.Build
import android.os.Bundle
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class SelectedActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.SelectedActivity)
        setContentView(R.layout.activity_selected)
//         Get Location object passed from MainActivity
        val locationObj = intent.getParcelableExtra<Location>("location")
        val selectedName = findViewById<TextView>(R.id.selected_name)
        val selectedLocation = findViewById<TextView>(R.id.selected_location)
        val selectedDate = findViewById<TextView>(R.id.selected_date)
        val selectedDescription = findViewById<TextView>(R.id.selected_description)
        val selectedImage = findViewById<ImageView>(R.id.selected_image)
        val selectedRating = findViewById<RatingBar>(R.id.selected_rating)

        locationObj?.let {
            selectedName.text = locationObj.name
            selectedLocation.text = locationObj.location
            selectedDate.text = locationObj.date
            selectedDescription.text = locationObj.description
            selectedImage.setImageResource(resources.getIdentifier(locationObj.imageName, "drawable", packageName))
            selectedRating.rating = locationObj.rating.toFloat()
        }
    }
}