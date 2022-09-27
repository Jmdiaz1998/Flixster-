package com.codepath.flixster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.flixster.R

/**
 * The MainActivity for the BestSellerList app.
 * Launches a [BestSellerBooksFragment].
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val supportFragmentManager = supportFragmentManager
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.content, BestSellerBooksFragment(), null).commit()
    }
}