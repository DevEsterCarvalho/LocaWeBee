package br.com.fiap.locawebee.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.locawebee.R
import br.com.fiap.locawebee.ui.theme.PoppinsBold
import br.com.fiap.locawebee.ui.theme.PoppinsMedium
import br.com.fiap.locawebee.ui.theme.PoppinsSemiBold

@Composable
fun Login() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xffFFFFFF)),
    ) {
        Image(
            painter = painterResource(id = R.drawable.fundo_localwebee),
            contentDescription = "fundo LocaWeBee",
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.TopCenter)
        )

        Column (
            verticalArrangement = Arrangement.SpaceAround,
            modifier = Modifier
                .padding(start = 0.dp, top = 60.dp)
        ){
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Acesse sua conta",
                    color = (Color.White),
                    fontSize = 30.sp,
                    fontFamily = PoppinsBold,
                    textAlign = TextAlign.Center)
                Text(
                    text = "Sentimos sua falta!\n" +
                            "Digite seus dados",
                    color = (Color.White),
                    fontSize = 20.sp,
                    fontFamily = PoppinsSemiBold,
                    textAlign = TextAlign.Center)
            }
            Spacer(modifier = Modifier.height(180.dp))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
            ) {
                OutlinedTextField(value = "", onValueChange = {},
                    shape = RoundedCornerShape(10.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedContainerColor = Color(0xffF1F4FF),
                        unfocusedContainerColor = Color(0xffF1F4FF),
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent),
                            modifier = Modifier
                        .width(309.dp)
                        .height(47.dp)
                        .shadow(4.dp, RoundedCornerShape(10.dp)),
                    label = {
                        Text(
                            text = "exemplo@locaweb.com.br",
                            color = Color(color = 0xff626262),
                            fontSize = 16.sp,
                            fontFamily = PoppinsMedium,
                            textAlign = TextAlign.Center
                        )
                    },
                    placeholder = {
                        Text(
                            text = "Digite o seu e-mail: ",
                            color = Color(color = 0xff626262),
                            fontSize = 16.sp,
                            fontFamily = PoppinsMedium,
                            textAlign = TextAlign.Center
                        )
                    }
                )
                Spacer(modifier = Modifier.height(15.dp))
                OutlinedTextField(value = "", onValueChange = {},
                    shape = RoundedCornerShape(10.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedContainerColor = Color(0xffF1F4FF),
                        unfocusedContainerColor = Color(0xffF1F4FF),
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent),
                    modifier = Modifier
                        .width(309.dp)
                        .height(47.dp)
                        .shadow(4.dp, RoundedCornerShape(10.dp)),
                    label = {
                        Text(
                            text = "Senha",
                            color = Color(color = 0xff626262),
                            fontSize = 16.sp,
                            fontFamily = PoppinsMedium,
                            textAlign = TextAlign.Center,
                        )
                    },
                    placeholder = {
                        Text(
                            text = "Digite a sua senha: ",
                            color = Color(color = 0xff626262),
                            fontSize = 16.sp,
                            fontFamily = PoppinsMedium,
                            textAlign = TextAlign.Center
                        )
                    }
                )
                Text(
                    text = "Esqueceu sua senha?",
                    color = (Color(0xff1F41BB)),
                    fontSize = 14.sp,
                    fontFamily = PoppinsSemiBold,
                    textAlign = TextAlign.End,
                    modifier = Modifier
                        .padding(top = 10.dp, end = 20.dp)
                        .fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(20.dp))
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(Color(0xff1F41BB)),
                    shape = RoundedCornerShape(10.dp),
                    contentPadding = PaddingValues(5.dp),
                    elevation = ButtonDefaults.buttonElevation(3.dp),
                    modifier = Modifier
                        .width(307.dp)
                        .height(48.dp)
                ) {
                    Text(
                        text = "Entrar",
                        color = (Color.White),
                        fontSize = 16.sp,
                        fontFamily = PoppinsSemiBold,
                        textAlign = TextAlign.Center,
                    )
                }
                Spacer(modifier = Modifier.height(20.dp))
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(Color(0xffFFFFFF)),
                    shape = RoundedCornerShape(10.dp),
                    contentPadding = PaddingValues(5.dp),
                    elevation = ButtonDefaults.buttonElevation(3.dp),
                    modifier = Modifier
                        .width(309.dp)
                        .padding(bottom = 50.dp),
                ) {
                    Text(
                        text = "Criar nova conta",
                        color = (Color(color = 0xff494949)),
                        fontSize = 16.sp,
                        fontFamily = PoppinsSemiBold,
                        textAlign = TextAlign.Center,
                    )
                }
            }
        }
    }

}

@Preview(showSystemUi = true)
@Composable
fun LoginPreview() {
    Surface (
        modifier = Modifier.fillMaxWidth()
    ) {
        Login()
    }
}


