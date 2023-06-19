package com.example.androidapp.Models

import com.google.gson.annotations.SerializedName

class Course {
    @SerializedName("courseId")
    var courseId : String = ""

    @SerializedName("courseName")
    var courseName : String = ""

    @SerializedName("subject")
    var subject : String = ""

    @SerializedName("code")
    var code : Int = 0

    @SerializedName("description")
    var description : String = ""

    @SerializedName("credit")
    var credit : Float = 0.0f

    @SerializedName("availability")
    var availability : String = ""

    @SerializedName("onlineTerms")
    var onlineTerm : String = ""

    @SerializedName("coreqs")
    var coreqs : String = ""

    @SerializedName("antireqs")
    var antireqs : String = ""

    @SerializedName("likeRating")
    var likeRating : Float = 0.0f

    @SerializedName("easyRating")
    var easyRating : Float = 0.0f

    @SerializedName("usefulRating")
    var usefulRating: Float = 0.0f
}