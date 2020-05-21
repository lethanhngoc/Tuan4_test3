package com.example.tuan4_3


import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    var popularity: Double,
    var vote_count: Int,
    var video: Boolean,
    var poster_path: String,
    var id: Int,
    //var adult: Boolean,
    //var backdrop_path: String,
   // var original_language: String,
    var original_title: String,
    //var genre_ids: List<Int>,
    var title: String,
    var vote_average: Double,
    var overview: String
   // var release_date: String

) :Parcelable{

}