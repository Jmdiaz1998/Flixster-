package com.codepath.flixster

import com.google.gson.annotations.SerializedName

/**
 * The Model for storing a single movie from the movie API
 *
 * SerializedName tags MUST match the JSON response for the
 * object to correctly parse with the gson library.
 */

data class Movie(
    val title: String,
    val overview: String,
    val poster_path: String,
)



