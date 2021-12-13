package com.example.foodapp.model

import com.google.firebase.database.Exclude

data class Food(
    var name:String?=null,
    var imageUrl:String?=null,
    @get:Exclude
    @set:Exclude
    var key:String?=null,
    var description:String?=null


)