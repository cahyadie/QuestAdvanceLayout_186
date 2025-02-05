package com.example.pam_pertemuan_4

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
@Preview(showBackground = true)

@Composable
fun BelajarLayout(
    modifier: Modifier = Modifier,
){
    Column(
        modifier = modifier.fillMaxSize()
    ){
        HeaderSection2()
        DetailMhs(
            param = "Nama",
            argum = "Muhammad Fikri"
        )
        DetailMhs(
            param = "NIM",
            argum = "20220140186"
        )
        DetailMhs(
            param = "Prodi",
            argum = "Teknologi Informasi"
        )
        DetailMhs(
            param = "Fakultas",
            argum = "Teknik"
        )
        DetailMhs(
            param = "Universitas",
            argum = "Universitas MUhammadiyah Yogyakarta"
        )
        DetailMhs(
            param = "Alamat",
            argum = "Gamping Mengkidul"
        )
        DetailMhs(
            param = "Email",
            argum = "FikriBizeeeer@gmail.com"
        )
    }
}

@Composable
fun HeaderSection2(){
    Box(
        modifier = Modifier.fillMaxWidth().background(Color.LightGray)
    ){
        Row(
            modifier = Modifier.fillMaxWidth().padding(16.dp)
        ){
            Box(
                contentAlignment = Alignment.BottomEnd,
            ){
                Image(painter = painterResource(id = R.drawable.umy),
                    contentDescription = null, modifier = Modifier.clip(CircleShape).size(80.dp)

                )
                Icon(
                    Icons.Filled.Check,
                    contentDescription = null,
                    modifier = Modifier.background(Color.Blue)
                )
            }
            Column(
                modifier = Modifier.padding(start = 14.dp)
            ){
                Text(text = "Teknologi Informasi")
                Text(text = "Universitas Muhammadiyah Yogyakarta")
            }
        }
    }
}

@Composable
fun DetailMhs(param: String, argum:String){
    Column (
        modifier = Modifier.padding(16.dp)
    ){
        Row (
            modifier = Modifier.fillMaxWidth(),
            ///horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(text = param, modifier = Modifier.weight(0.8f))
            Text(text = ":", modifier = Modifier.weight(0.2f))
            Text(text = argum, modifier = Modifier.weight(2f))
        }
    }
}