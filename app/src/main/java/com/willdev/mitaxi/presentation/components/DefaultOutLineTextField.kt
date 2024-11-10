package com.willdev.mitaxi.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DefaultOutLineTextField(
    modifier: Modifier,
    label:String,
    value:String,
    icon:ImageVector,
    onValueChange:(value:String) -> Unit,
    keyboardType:KeyboardType=KeyboardType.Text,
    hideText:Boolean=false,
    height:Int

    ){


    Box(
        contentAlignment = Alignment.TopStart,

        modifier = modifier
            .height(height.dp)
    ){
        OutlinedTextField(
            value = value,
            onValueChange={text -> onValueChange(text)},
            label={
                Text(
                    text = label,
                    color=Color.White,
                    fontSize = 10.sp,
                )

            },
            leadingIcon = {
                Row (){
                    Icon(
                        imageVector = icon,
                        contentDescription = null,
                        tint = Color.White
                    )
                    Spacer(modifier=Modifier.width(10.dp))
                    Spacer(
                        modifier = Modifier.width(1.dp).height(20.dp).background(Color.White)
                    )
                }

            },
            keyboardOptions = KeyboardOptions(keyboardType=keyboardType),
            visualTransformation = if (hideText) PasswordVisualTransformation() else VisualTransformation.None,
            textStyle = TextStyle(
                fontSize = 12.sp,
                color = Color.White
            ),
            singleLine = true,


        )

    }

}