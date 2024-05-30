package br.com.fiap.locawebee.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.locawebee.R
import br.com.fiap.locawebee.ui.theme.PoppinsMedium
import br.com.fiap.locawebee.ui.theme.PoppinsRegular
import br.com.fiap.locawebee.ui.theme.PoppinsSemiBold

@Composable
fun NovoEmail2() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
    ){
        Column(
            verticalArrangement = Arrangement.Top,
        ){
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(start = 20.dp, bottom = 10.dp, top = 10.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.bee_logo),
                    contentDescription = "ícone do projeto LocaWeBee",
                    modifier = Modifier.size(width = 62.dp, height = 53.dp)

                )
                Spacer(modifier = Modifier.width(8.dp))
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()

                ) {
                    Text(
                        text = "Tudo organizado!",
                        fontSize = 14.sp,
                        fontFamily = PoppinsRegular,
                        textAlign = TextAlign.Center,
                        color = Color.Black,
                        modifier = Modifier.width(144.dp)
                    )
                    LinearProgressIndicator(
                        progress = 0f, // Progresso fixo
                        modifier = Modifier
                            .height(20.dp) // Altura fixa
                            .width(230.dp)
                            .align(Alignment.CenterHorizontally),
                        trackColor = Color(0xffF1F4FF),
                        strokeCap = StrokeCap.Round
                    )
                }
            }
            Box(
                modifier = Modifier
                    .width(393.dp)
                    .height(2.dp)
                    .background(Color.LightGray)
            )
        }
        Box(modifier = Modifier
            .align(Alignment.Center)
            .padding(bottom = 100.dp)
        ){
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
            ){
                Row {
                    Text(
                        text = "Novo E-mail ",
                        color = Color(0xff000000),
                        fontSize = 18.sp,
                        fontFamily = PoppinsSemiBold,
                        textAlign = TextAlign.Start,
                        modifier = Modifier.padding(start = 2.dp)
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                TextField(
                    value = "",
                    onValueChange = {},
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedContainerColor = Color(0xffF1F4FF),
                        unfocusedContainerColor = Color(0xffF1F4FF),
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    modifier = Modifier
                        .width(309.dp)
                        .height(45.dp),
                    label = {
                        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.CenterStart) {
                            Text(
                                text = "Para: ",
                                color = Color(0xff626262),
                                fontSize = 16.sp,
                                fontFamily = PoppinsMedium,
                                textAlign = TextAlign.Start,
                                modifier = Modifier.padding(start = 2.dp)
                            )
                        }
                    },
                    textStyle = LocalTextStyle.current.copy(
                        fontSize = 16.sp,
                        fontFamily = PoppinsMedium,
                        textAlign = TextAlign.Start,
                        color = Color(0xff626262)
                    ),
                    singleLine = true,
                    placeholder = {
                        Text(
                            text = "Digite o e-mail:",
                            color = Color(0xff626262),
                            fontSize = 16.sp,
                            fontFamily = PoppinsMedium,
                            textAlign = TextAlign.Start
                        )
                    }
                )
                Spacer(modifier = Modifier.height(10.dp))
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedContainerColor = Color(0xffF1F4FF),
                        unfocusedContainerColor = Color(0xffF1F4FF),
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    modifier = Modifier
                        .width(309.dp)
                        .height(45.dp),
                    label = {
                        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.CenterStart) {
                            Text(
                                text = "Cópia: ",
                                color = Color(0xff626262),
                                fontSize = 16.sp,
                                fontFamily = PoppinsMedium,
                                textAlign = TextAlign.Start,
                                modifier = Modifier.padding(start = 2.dp)
                            )
                        }
                    },
                    textStyle = LocalTextStyle.current.copy(
                        fontSize = 16.sp,
                        fontFamily = PoppinsMedium,
                        textAlign = TextAlign.Start,
                        color = Color(0xff626262)
                    ),
                    singleLine = true,
                    placeholder = {
                        Text(
                            text = "Digite o e-mail:",
                            color = Color(0xff626262),
                            fontSize = 16.sp,
                            fontFamily = PoppinsMedium,
                            textAlign = TextAlign.Start
                        )
                    }
                )
                Spacer(modifier = Modifier.height(10.dp))
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedContainerColor = Color(0xffF1F4FF),
                        unfocusedContainerColor = Color(0xffF1F4FF),
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent
                    ),
                    modifier = Modifier
                        .width(309.dp)
                        .height(45.dp),
                    label = {
                        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.CenterStart) {
                            Text(
                                text = "Assunto: ",
                                color = Color(0xff626262),
                                fontSize = 16.sp,
                                fontFamily = PoppinsMedium,
                                textAlign = TextAlign.Start,
                                modifier = Modifier.padding(start = 2.dp)
                            )
                        }
                    },
                    textStyle = LocalTextStyle.current.copy(
                        fontSize = 16.sp,
                        fontFamily = PoppinsMedium,
                        textAlign = TextAlign.Start,
                        color = Color(0xff626262)
                    ),
                    singleLine = true,
                    placeholder = {
                        Text(
                            text = "Assunto: ",
                            color = Color(0xff626262),
                            fontSize = 16.sp,
                            fontFamily = PoppinsMedium,
                            textAlign = TextAlign.Start
                        )
                    }
                )
                Spacer(modifier = Modifier.height(10.dp))
                OutlinedTextField(value = "", onValueChange = {},
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedContainerColor = Color(0xffF1F4FF),
                        unfocusedContainerColor = Color(0xffF1F4FF),
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent),
                    modifier = Modifier
                        .width(309.dp)
                        .height(347.dp),
                    label = {
                        Text(
                            text = "Bom dia! Como você está?",
                            color = Color(color = 0xff626262),
                            fontSize = 16.sp,
                            fontFamily = PoppinsMedium,
                            textAlign = TextAlign.Center,
                        )
                    },
                    placeholder = {
                        Text(
                            text = "Digite aqui o conteúdo ",
                            color = Color(color = 0xff626262),
                            fontSize = 16.sp,
                            fontFamily = PoppinsMedium,
                            textAlign = TextAlign.Center
                        )
                    }
                )
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun NovoEmail2Preview() {
    Surface(
        modifier = Modifier.fillMaxWidth()
    ) {
        NovoEmail2()
    }
}