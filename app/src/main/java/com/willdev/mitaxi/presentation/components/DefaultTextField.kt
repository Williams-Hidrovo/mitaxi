package com.willdev.mitaxi.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.willdev.mitaxi.R

@Composable
fun DefaultTextField(
    modifier: Modifier,
    label:String,
    value:String,
    icon:ImageVector,
    onValueChange:(value:String) -> Unit,
    keyboardType:KeyboardType=KeyboardType.Text,
    hideText:Boolean=false,

    ){
    val primary = colorResource(id = R.color.primary )


    Box(
        modifier = modifier
            .height(55.dp)
            .background(
                color = Color.White,
                shape = RoundedCornerShape(topStart = 20.dp, bottomEnd = 20.dp)
            )
    ){
        TextField(
            value = value,
            onValueChange={text -> onValueChange(text)},
            label={
                Text(text = label)
            },
            leadingIcon = {
                Row (){
                    Icon(
                        imageVector = icon,
                        contentDescription = null
                    )
                    Spacer(modifier=Modifier.width(10.dp))
                    Spacer(
                        modifier = Modifier.width(1.dp).height(20.dp).background(primary)
                    )
                }

            },
            keyboardOptions = KeyboardOptions(keyboardType=keyboardType),
            visualTransformation = if (hideText) PasswordVisualTransformation() else VisualTransformation.None,
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent
            )

        )

    }

}