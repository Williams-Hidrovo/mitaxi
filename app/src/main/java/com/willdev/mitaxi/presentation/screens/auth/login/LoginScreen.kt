package com.willdev.mitaxi.presentation.screens.auth.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBars
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.willdev.mitaxi.R
import com.willdev.mitaxi.presentation.components.DefaultTextField
import com.willdev.mitaxi.presentation.navigation.screen.auth.AuthScreen

//las vistas se declaran como funciones
@Composable
fun LoginScreen(navHostController: NavHostController) {
    //colores
    val primary = colorResource(id = R.color.primary)
    val secondary = colorResource(id = R.color.secondary)
    val tertiary= colorResource(id = R.color.tertiary)
    val quaternary=colorResource(id = R.color.quaternary)

    //variables
    val email = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }

    //siempre hay una parte que es Scaffold
    Scaffold (
        contentWindowInsets = WindowInsets.navigationBars
    ) {paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    color = secondary
                )
                .padding(paddingValues)
        )//los componentes que se escribas desde aqui seran sobrepuestos
        {
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = "Login",
                    color = primary,
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.rotate(90f).padding(top = 20.dp),

                    )
                Spacer(modifier = Modifier.height(150.dp))
                Text(
                    text = "Registro",
                    color = primary,
                    fontSize = 27.sp,
                    modifier = Modifier
                        .clickable {navHostController.navigate(route = AuthScreen.Register.route)  }
                        .rotate(90f)
                        .padding(top = 35.dp),

                    //modifier = Modifier.graphicsLayer { rotationZ=90f }.padding(top = 30.dp),

                )
                Spacer(modifier = Modifier.height(250.dp))
            }
            Box(modifier =Modifier
                .fillMaxSize()
                .padding(start = 60.dp, bottom = 35.dp)
                .background(
                    Brush.verticalGradient(
                        colors = listOf(secondary, quaternary)
                    ),
                    shape = RoundedCornerShape(
                        bottomStart = 35.dp,
                        topStart = 10.dp,
                    )
                )
            ){
                Column (
                    modifier = Modifier
                        .statusBarsPadding()
                        .padding(start = 20.dp)
                ){
                    Spacer(Modifier.height(20.dp))
                    Text(
                        text = "Welcome",
                        fontSize = 30.sp,
                        color = primary,
                        fontWeight = FontWeight.Bold,
                    )
                    Text(
                        text = "back...",
                        fontSize = 30.sp,
                        color = primary,
                        fontWeight = FontWeight.Bold,
                    )
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(end = 10.dp)
                    ){
                        Image(
                            modifier = Modifier
                                .size(120.dp)
                                .align(Alignment.CenterEnd),
                            painter = painterResource(id=R.drawable.taxi2),
                            contentDescription = "Taxi"
                        )
                    }

                    Text(
                        text = "Log in",
                        fontSize = 20.sp,
                        color = primary,
                        fontWeight = FontWeight.Bold,
                    )
                    Spacer(modifier = Modifier.height(50.dp))
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(end = 20.dp)

                    ){
                        DefaultTextField(
                            modifier = Modifier,
                            value = email.value,
                            label = "Email",
                            onValueChange = {
                                email.value=it
                            },
                            icon = Icons.Outlined.Email,
                            hideText = false,
                            keyboardType = KeyboardType.Email
                        )

                        Spacer(
                            modifier = Modifier.height(15.dp)
                        )
                        DefaultTextField(
                            modifier = Modifier,
                            value = password.value,
                            label = "Password",
                            onValueChange = {
                                password.value=it
                            },
                            icon = Icons.Outlined.Lock,
                            hideText = true,
                        )
                    }

                    Spacer(modifier = Modifier.weight(1f))


                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(20.dp),
                        modifier = Modifier
                            .padding(bottom = 40.dp)
                    ){
                        Button(
                            modifier = Modifier
                                .fillMaxWidth(0.8f)
                                .padding(end = 20.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = tertiary
                            ),
                            onClick = {
                                println("el valor de email es: ${email.value} ")
                                println("el valor de email es: ${password.value} ")
                            }
                        ) {
                            Text(
                                color = secondary,
                                text = "LOGIN",
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Spacer(
                                modifier = Modifier.width(25.dp)
                                    .height(1.dp)
                                    .background(color = primary)
                            )
                            Text(
                                modifier = Modifier.padding(horizontal = 10.dp),
                                text = "O",
                                color = primary
                            )
                            Spacer(
                                modifier = Modifier.width(25.dp)
                                    .height(1.dp)
                                    .background(color = primary)
                            )

                        }

                        Row (
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center
                        ){
                            Text(
                                text = "No tienes cuenta? ",
                                color = primary
                            )
                            Text(
                                text = " registrate",
                                color = primary,
                                fontWeight = FontWeight.Bold

                            )
                        }
                    }



                }

            }

        }


    }
}
