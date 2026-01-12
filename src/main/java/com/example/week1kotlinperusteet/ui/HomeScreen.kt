package com.example.week1kotlinperusteet.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.week1kotlinperusteet.domain.Task

@Composable
fun HomeScreen(tasks: List<Task>) {
    Column(
        modifier = Modifier
            .padding(16.dp)
    )
    {
        Text(
            text = "Tehtävälista",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(16.dp))
        tasks.forEach { task ->
            Row(
                modifier = Modifier
                    .padding(8.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            )
            {
                Column {
                    Text(text = task.title)
                    Text(
                        text = "Deadline: ${task.dueDate}",
                        style = MaterialTheme.typography.bodySmall
                    )
                }
                Text(
                    text = if (task.done) " Tehty" else " Ei Tehty"
                )
            }
        }
    }
}
