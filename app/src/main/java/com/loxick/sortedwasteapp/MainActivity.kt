package com.loxick.sortedwasteapp

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.linearGradient(
                            listOf(
                                Color(0xFC522380),
                                Color(0xFC4A307C),
                                Color(0xFF725F19)
                            )
                        )
                    )
                    .verticalScroll(state = ScrollState(0)),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Сортировка Мусора", fontSize = 35.sp, color = Color.White, modifier = Modifier.padding(40.dp))
                Row(
                    modifier = Modifier
                        .fillMaxSize(),
                    horizontalArrangement = Arrangement.SpaceAround,
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(text = "Стекло", color = Color.White, fontSize = 20.sp)
                        glass()
                        glass()
                        glass()
                        glass()
                        glass()
                        glass()
                        glass()
                        glass()
                    }
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(text = "Пластик", color = Color.White, fontSize = 20.sp)
                        plastic()
                        plastic()
                        plastic()
                        plastic()
                        plastic()
                        plastic()
                        plastic()
                        plastic()
                    }
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(text = "Отходы", color = Color.White, fontSize = 20.sp)
                        waste()
                        waste()
                        waste()
                        waste()
                        waste()
                        waste()
                        waste()
                        waste()
                    }
                }
            }
        }
    }
}


@Composable
private fun glass(){
    val contextt = LocalContext.current
    Card(
        modifier = Modifier
            .padding(3.dp, 20.dp, 0.dp, 0.dp)
            .width(100.dp)
            .height(100.dp)
            .clickable { ->
                Toast
                    .makeText(contextt, "Это стекло", LENGTH_SHORT)
                    .show()
            },
        shape = RoundedCornerShape(30.dp)
    ) {
        Image(painter = painterResource(id = R.drawable.glass),
            contentDescription = "", modifier = Modifier.fillMaxSize())
    }
}

@Composable
private fun plastic(){
    val contextt = LocalContext.current
    Card(
        modifier = Modifier
            .padding(3.dp, 20.dp, 0.dp, 0.dp)
            .width(100.dp)
            .height(100.dp)
            .clickable { ->
                Toast
                    .makeText(contextt, "Это пластик", LENGTH_SHORT)
                    .show()
            },
        shape = RoundedCornerShape(30.dp)
    ) {
        Image(painter = painterResource(id = R.drawable.waterbottle),
            contentDescription = "", modifier = Modifier.fillMaxSize())
    }
}

@Composable
private fun waste(){
    val contextt = LocalContext.current
    Card(
        modifier = Modifier
            .padding(3.dp, 20.dp, 0.dp, 0.dp)
            .width(100.dp)
            .height(100.dp)
            .clickable { ->
                Toast
                    .makeText(contextt, "Это отходы", LENGTH_SHORT)
                    .show()
            },
        shape = RoundedCornerShape(30.dp)
    ) {
        Image(painter = painterResource(id = R.drawable.garbage),
            contentDescription = "", modifier = Modifier.fillMaxSize())
    }
}