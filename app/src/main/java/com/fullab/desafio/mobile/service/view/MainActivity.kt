package com.fullab.desafio.mobile.service.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.fullab.desafio.mobile.R
import com.fullab.desafio.mobile.application.CategoryApplication

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CategoryApplication().getCategoryTree(
            {
                Log.e("ERROR", "Message: ${it.localizedMessage}", it)
            },
            {
                Log.d("SUCCESS", "List: $it")
            }
        )
    }
}
