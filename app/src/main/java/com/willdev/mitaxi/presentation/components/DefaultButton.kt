package com.willdev.mitaxi.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun DefaultButton(
    modifier: Modifier,
    text:String,
    onClick:()-> Unit,
    color: Color=Color(0xFF00d38f),
    height:Dp=55.dp,
    width:Float=0.8f,
){
    Button(
        modifier = modifier
            .fillMaxWidth(width)
            .height(height),

        colors = ButtonDefaults.buttonColors(
            containerColor = color
        ),
        onClick = {onClick()}
    ) {
        Text(
            color = Color.White,
            text = text,
            fontWeight = FontWeight.Bold
        )
    }
}