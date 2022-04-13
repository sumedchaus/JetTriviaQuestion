package com.cs.jettriviaquestion.screens

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.cs.jettriviaquestion.components.Questions


@Composable
fun TriviaHome(viewModel :QuestionsViewModel = hiltViewModel()) {

    Questions(viewModel = viewModel)
}
