package com.example.week1kotlinperusteet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import com.example.week1kotlinperusteet.domain.mockTasks
import com.example.week1kotlinperusteet.ui.HomeScreen

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                HomeScreen(tasks = mockTasks)
            }
        }
    }
}
