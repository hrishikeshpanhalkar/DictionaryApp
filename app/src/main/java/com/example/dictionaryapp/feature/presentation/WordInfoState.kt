package com.example.dictionaryapp.feature.presentation

import com.example.dictionaryapp.feature.domain.model.WordInfo

data class WordInfoState (
    val wordInfoItems: List<WordInfo> = emptyList(),
    val isLoading: Boolean = false
)
