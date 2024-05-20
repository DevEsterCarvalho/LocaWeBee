package br.com.fiap.locawebee.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.locawebee.R


@Composable
fun BemVindo() {
    Box(
        modifier = Modifier
            .fillMaxSize(), contentAlignment = Alignment.Center
    ) {
        Column(
            verticalArrangement = Arrangement.Center
        ) {
            Card(
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.bee_logo),
                    contentDescription = "ícone do projeto saúde integrada",
                    modifier = Modifier.size(width = 191.dp, height = 165.dp),
                    contentScale = ContentScale.Fit
                )
            }
            Text(text = "LocaWeBEE")
            Text(text = "Conheça uma forma divertida de gerenciar seu e-mail")
        }
        Row(
            //verticalArrangement = Arrangement.Center
        ){
            Button(onClick = {},
                colors = ButtonDefaults.buttonColors(Color(0xff1F41BB)),
                modifier = Modifier
                    .width(142.dp)
                    .height(45.dp),
                shape = RoundedCornerShape(6.dp),
                contentPadding = PaddingValues(5.dp)
            )
            {
                Text(text = "Entrar",
                    color = (Color.White),
                    fontSize = 16.sp,
                    //fontFamily = InterBold,
                    textAlign = TextAlign.Center
                )
            }
            Spacer(modifier = Modifier.width(16.dp))
            Button(onClick = {},
                border = BorderStroke(1.dp, (Color.White)),
                colors = ButtonDefaults.buttonColors(Color.White),
                modifier = Modifier
                    .width(142.dp)
                    .height(45.dp),
                shape = RoundedCornerShape(6.dp),

                ){
                Text(text = "Cadastrar",
                    color = (Color(0xff0A0A0A)),
                    fontSize = 16.sp,
                    //fontFamily = InterBold,
                    textAlign = TextAlign.Center
                )
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun BemVindoPreview() {
    Surface (modifier = Modifier.fillMaxWidth()
    ) {
        BemVindo()
    }
}

