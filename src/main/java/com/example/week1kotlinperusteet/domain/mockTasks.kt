package com.example.week1kotlinperusteet.domain

import java.time.LocalDate

val mockTasks = listOf(
    Task(id=1, title="syö hedelmäsalaattia1", description="1", priority=1,dueDate=LocalDate.now().plusDays(1), false),
    Task(id=2, title="syö hedelmäsalaattia2", description="2", priority=2,dueDate=LocalDate.now().plusDays(2), false),
    Task(id=3, title="syö hedelmäsalaattia3", description="3", priority=3,dueDate=LocalDate.now().plusDays(3), true),
    Task(id=4, title="syö hedelmäsalaattia4", description="4", priority=4,dueDate=LocalDate.now().plusDays(4), false),
    Task(id=5, title="syö hedelmäsalaattia5", description="5", priority=5,dueDate=LocalDate.now().plusDays(5), true),
)