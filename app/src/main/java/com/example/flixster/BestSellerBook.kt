package com.codepath.flixster

import com.google.gson.annotations.SerializedName

/**
 * The Model for storing a single movie from the movie API
 *
 * SerializedName tags MUST match the JSON response for the
 * object to correctly parse with the gson library.
 */

data class Movie(
    var id: String,
    var title: String,
    var description: String,
    var imageURL: String,
)
