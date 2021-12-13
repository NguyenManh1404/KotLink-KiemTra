package com.example.foodapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodapp.R
import com.example.foodapp.uitel.loadImage
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)


        val intss = intent
        var nameF = intss.getStringExtra("NAMET")
        var desF = intss.getStringExtra("DESCRIT")
        var imgF = intss.getStringExtra("IMGURI")

        nameDetailTextView.text = nameF
        descriptionDetailTextView.text = desF
        teacherDetailImageView.loadImage(imgF)
    }
}