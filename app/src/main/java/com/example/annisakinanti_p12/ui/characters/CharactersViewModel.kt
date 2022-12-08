package com.example.annisakinanti_p12.ui.characters

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.annisakinanti_p12.data.repository.CharacterRepository

class CharactersViewModel @ViewModelInject constructor(
    private val repository: CharacterRepository
) : ViewModel() {

    val characters = repository.getCharacters()
}
