package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.foodapp.view.CartActivity
import com.example.foodapp.view.InfoActivity
import com.example.foodapp.view.ItemsActivity
import com.example.foodapp.view.UploadActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btnViewAll.setOnClickListener {
            startActivity(Intent(this, ItemsActivity::class.java))
        }
        btnAddInfo.setOnClickListener {
            startActivity(Intent(this, UploadActivity::class.java))
        }
        btnInfo.setOnClickListener {
            startActivity(Intent(this, InfoActivity::class.java))
        }
    }
}