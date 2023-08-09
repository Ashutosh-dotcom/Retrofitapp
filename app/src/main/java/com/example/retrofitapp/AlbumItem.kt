package com.example.retrofitapp

import com.google.gson.annotations.SerializedName

data class AlbumItem(
     @SerializedName("id")
     val id : Int,

     @SerializedName("UserId")
     val userId:Int,

     @SerializedName("title")
     val title:String






 ) {

}