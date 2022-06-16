package com.example.test_jetpack_compose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.test_jetpack_compose.ui.theme.Test_jetpack_composeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainView(name = "Tom")
        }
    }

@Composable
fun MainView(name: String) {
    Column(Modifier.background(Color.LightGray).fillMaxWidth(1f).fillMaxHeight(1f)) {
        Text(text = "Hello $name!", Modifier.align(Alignment.CenterHorizontally))
        Spacer(modifier = Modifier.padding(top = 30.dp))
        Text(text = "I try to use jetPack, click on the image below", style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.ExtraBold, fontStyle = FontStyle.Italic), color = Color.Red, modifier = Modifier.align(
            Alignment.CenterHorizontally), textAlign = TextAlign.Center)
        Spacer(modifier = Modifier
            .padding(top = 30.dp)
            .align(Alignment.CenterHorizontally))
        Image(
            painterResource(R.drawable.jetpack),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .width(150.dp)
                .height(50.dp)
                .align(Alignment.CenterHorizontally)
                .clickable { makeToast() })
    }
}

private fun makeToast(){
    Toast.makeText(this,"success!",Toast.LENGTH_SHORT).show()
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Test_jetpack_composeTheme {
        MainView("Tom")
        }
    }
}