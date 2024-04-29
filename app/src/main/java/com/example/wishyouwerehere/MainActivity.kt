package com.example.wishyouwerehere

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialise location objects with its specific data for each object variable.
        val locationObj1 = Location(
            "Fortress",
            "Emporium Melbourne",
            "1/03/2024",
            "Fortress is the ultimate games culture and experiences company, creating awe-inspiring destinations. The first venue of its kind, Fortress Melbourne is a multi-level complex spanning over 2,500 square metres.",
            "fortress",
            3
        )
        val locationObj2 = Location(
            "Crown Casino",
            "Southbank",
            "19/01/2024",
            "Crown Melbourne is a casino and resort located on the south bank of the Yarra River, in Melbourne, Australia. Crown Casino is a subsidiary of Crown Resorts, and was the first casino of the now-international Crown brand.",
            "crown",
            5
        )
        val locationObj3 = Location(
            "State Library of Victoria",
            "Melbounrne Central",
            "12/02/2024",
            "State Library Victoria is the state library of Victoria, Australia. Located in Melbourne, it was established in 1854 as the Melbourne Public Library, making it Australia's oldest public library and one of the first free libraries in the world.",
            "library",
            4
        )
        val locationObj4 = Location(
            "Flinders St Station",
            "Cnr Flinders St & Swanston St",
            "28/04/2024",
            "Flinders Street railway station is a train station located on the corner of Flinders and Swanston streets in Melbourne, Victoria, Australia. It is the busiest train station in Australia, serving the entire metropolitan rail network.",
            "flinders",
            2
        )

        // find each title element and set name to each respective location objects name
        findViewById<TextView>(R.id.locationTitle1).text = locationObj1.name
        findViewById<TextView>(R.id.locationTitle2).text = locationObj2.name
        findViewById<TextView>(R.id.locationTitle3).text = locationObj3.name
        findViewById<TextView>(R.id.locationTitle4).text = locationObj4.name

        // find each rating element and set its rating to each respective location object rating
        findViewById<RatingBar>(R.id.locationRating1).rating = locationObj1.rating.toFloat()
        findViewById<RatingBar>(R.id.locationRating2).rating = locationObj2.rating.toFloat()
        findViewById<RatingBar>(R.id.locationRating3).rating = locationObj3.rating.toFloat()
        findViewById<RatingBar>(R.id.locationRating4).rating = locationObj4.rating.toFloat()


        // find and attach click listener to each ImageView element and add intent
        findViewById<ImageView>(R.id.locationImage1).setOnClickListener {
            val intent = Intent(this, SelectedActivity::class.java).apply {
                putExtra("location", locationObj1)
            }
            startActivity(intent)
        }

        findViewById<ImageView>(R.id.locationImage2).setOnClickListener {
            val intent = Intent(this, SelectedActivity::class.java).apply {
                putExtra("location", locationObj2)
            }
            startActivity(intent)
        }

        findViewById<ImageView>(R.id.locationImage3).setOnClickListener {
            val intent = Intent(this, SelectedActivity::class.java).apply {
                putExtra("location", locationObj3)
            }
            startActivity(intent)
        }

        findViewById<ImageView>(R.id.locationImage4).setOnClickListener {
           val intent = Intent(this, SelectedActivity::class.java).apply {
                putExtra("location", locationObj4)
            }
            startActivity(intent)
        }
    }
}