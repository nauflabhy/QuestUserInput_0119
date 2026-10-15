package com.example.prak5

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier


@Composable
fun FormDataDiri(modifier: Modifier = Modifier) {
    // Buat variabel untuk menyimpan data yang diinputkan
    var textNama by remember {mutableStateOf( value = "")}
    var textAlamat by remember {mutableStateOf( value = "")}
    var textJK by remember {mutableStateOf( value = "")}
    val gender:List<String> = listOf("Laki-laki", "Perempuan")


})
