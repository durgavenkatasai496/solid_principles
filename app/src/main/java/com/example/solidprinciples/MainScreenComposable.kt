package com.example.solidprinciples

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.example.solidprinciples.single_responsiblity_principle.StringValidator


@Composable
fun MainScreenComposable() {

    var isStringChecking = remember { mutableStateOf("ABCDEF") }

    Column(modifier = Modifier.fillMaxSize().statusBarsPadding(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        var stringValidator = StringValidator()
        var outPut = stringValidator.isValidString(isStringChecking.value.toString())
        var lengthChecking = stringValidator.lengthChecking(isStringChecking.value)

        Text(lengthChecking.toString(), fontSize = 30.sp, modifier = Modifier)

    }
}