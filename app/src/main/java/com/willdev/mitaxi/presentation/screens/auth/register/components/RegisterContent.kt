package com.willdev.mitaxi.presentation.screens.auth.register.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.willdev.mitaxi.R
import com.willdev.mitaxi.presentation.components.DefaultButton
import com.willdev.mitaxi.presentation.components.DefaultOutLineTextField


@Composable
fun RegisterContent(navHostController: NavHostController,paddingValues: PaddingValues){

    //colores
    val primary = colorResource(id = R.color.primary)
    val secondary = colorResource(id = R.color.secondary)
    val colorTitles= colorResource(id = R.color.colorTitles)

    //variables
    val nombre = remember { mutableStateOf("") }
    val apellido = remember { mutableStateOf("") }
    val email = remember { mutableStateOf("") }
    val telefono = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }
    val confPassword = remember { mutableStateOf("") }

    //-----------------------vista

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)
            .background(color = primary)
    ){
        Column(
            modifier = Modifier
                .fillMaxHeight(0.8f)
                .padding(start = 15.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Login",
                color = colorTitles,
                fontSize = 27.sp,
                modifier = Modifier
                    .clickable {navHostController.popBackStack()  }
                    .rotate(90f)
                    .padding(top = 35.dp),
            )
            Spacer(modifier = Modifier.height(150.dp))
            Text(
                text = "Registro",
                color = colorTitles,
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .rotate(90f)
                    .padding(top = 100.dp),
            )
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 60.dp, bottom = 30.dp)
                .background(
                    color = secondary,
                    shape = RoundedCornerShape(bottomStart = 35.dp, topStart = 35.dp)
                )

        ){
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(15.dp),

                modifier = Modifier
                    .statusBarsPadding()
            ){
                Box (
                    modifier = Modifier
                        .fillMaxWidth()
                ){
                    Image(
                        painter = painterResource(R.drawable.localizacion),
                        contentDescription = "mapa",
                        modifier = Modifier
                            .height(130.dp)
                            .align(Alignment.Center)
                    )
                }
                //Spacer(modifier = Modifier.weight(1f))
                Spacer(modifier = Modifier
                    .height(10.dp))
                DefaultOutLineTextField(
                    modifier = Modifier,
                    value = nombre.value,
                    label = "Nombre",
                    icon = Icons.Outlined.Person,
                    keyboardType = KeyboardType.Text,
                    onValueChange = {
                        nombre.value=it
                    },
                    height = 45
                )
                DefaultOutLineTextField(
                    modifier = Modifier,
                    value = nombre.value,
                    label = "Apellido",
                    icon = Icons.Outlined.Person,
                    keyboardType = KeyboardType.Text,
                    onValueChange = {
                        apellido.value=it
                    },
                    height = 45
                )
                DefaultOutLineTextField(
                    modifier = Modifier,
                    value = nombre.value,
                    label = "Email",
                    icon = Icons.Outlined.Email,
                    keyboardType = KeyboardType.Email,
                    onValueChange = {
                        email.value=it
                    },
                    height = 45
                )
                DefaultOutLineTextField(
                    modifier = Modifier,
                    value = nombre.value,
                    label = "Telefono",
                    icon = Icons.Outlined.Phone,
                    keyboardType = KeyboardType.Number,
                    onValueChange = {
                        telefono.value=it
                    },
                    height = 45
                )
                DefaultOutLineTextField(
                    modifier = Modifier,
                    value = nombre.value,
                    label = "Password",
                    icon = Icons.Outlined.Lock,
                    keyboardType = KeyboardType.Text,
                    onValueChange = {
                        password.value=it
                    },
                    hideText = true,
                    height = 45
                )
                DefaultOutLineTextField(
                    modifier = Modifier,
                    value = nombre.value,
                    label = "Confirmar Password",
                    icon = Icons.Outlined.Lock,
                    keyboardType = KeyboardType.Text,
                    onValueChange = {
                        confPassword.value=it
                    },
                    hideText = true,
                    height = 45
                )

                Spacer(modifier = Modifier.height(5.dp))

                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                    //.background(Color.Red)
                ){
                    DefaultButton(
                        text = "Registrar",
                        modifier = Modifier,
                        onClick = {},
                        width = 0.9f,
                        height = 40.dp
                    )
                }

                Row (
                    horizontalArrangement = Arrangement.spacedBy(5.dp),
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Spacer(
                        modifier = Modifier
                            .width(20.dp)
                            .height(2.dp)
                            .background(Color.White)
                    )
                    Text(
                        text = "O",
                        color = Color.White

                    )
                    Spacer(
                        modifier = Modifier
                            .width(20.dp)
                            .height(2.dp)
                            .background(Color.White)
                    )
                }

                Row (
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ){
                    Text(
                        text = "Ya tienes una cuenta? ",
                        color = Color.White
                    )
                    Text(
                        text = " Inicia sesión",
                        color = colorTitles,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .clickable {navHostController.popBackStack()  }


                    )
                }

            }

        }

    }

}