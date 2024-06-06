package br.com.fiap.locawebee.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.locawebee.R
import br.com.fiap.locawebee.ui.theme.PoppinsRegular
import br.com.fiap.locawebee.ui.theme.PoppinsSemiBold

@Composable
fun Intro6() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)
    ){
        Box(
            modifier = Modifier
                .align(Alignment.Center)
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.fundo_premio),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
            Column(
                verticalArrangement = Arrangement.Top,
                modifier = Modifier.background(Color(0xff1F41BB))
            ) {
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
                            text = "Parabéns",
                            fontSize = 14.sp,
                            fontFamily = PoppinsSemiBold,
                            textAlign = TextAlign.Center,
                            color = Color.White,
                            modifier = Modifier.width(144.dp)
                        )
                        LinearProgressIndicator(
                            progress = 1f,
                            modifier = Modifier
                                .height(20.dp)
                                .width(230.dp)
                                .align(Alignment.CenterHorizontally),
                            trackColor = Color(0xffF1F4FF),
                            color = Color(0xffE2AA44),
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
            Column (verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ){
                BoxWithConstraints(
                    modifier = Modifier
                        .height(154.dp)
                        .width(338.dp)
                        .background(Color(0xffF9F9F9), shape = RoundedCornerShape(13.dp))
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.medalha),
                        contentDescription = "imagem medalha premio",
                        modifier = Modifier
                            .size(width = 114.dp, height = 114.dp)
                            .align(Alignment.TopCenter)
                            .offset(y = (-80).dp)
                    )
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(horizontal = 20.dp)
                    ) {
                        Text(
                            text = "Prêmio Diário\n" +
                                    "Concedido!",
                            fontSize = 24.sp,
                            fontFamily = PoppinsSemiBold,
                            textAlign = TextAlign.Center,
                            color = Color(0xff1D1F33),
                            modifier = Modifier.padding(top = 30.dp)
                        )
                    }
                }
                Spacer(modifier = Modifier.height(50.dp))
                BoxWithConstraints(
                    modifier = Modifier
                        .height(193.dp)
                        .width(338.dp)
                        .background(Color(0xffF9F9F9), shape = RoundedCornerShape(13.dp))
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.bee_logo),
                        contentDescription = "icone locawebee",
                        modifier = Modifier
                            .size(width = 88.dp, height = 75.dp)
                            .align(Alignment.TopCenter)
                            .offset(y = (-40).dp)
                    )
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(horizontal = 20.dp)
                    ) {
                        val text = buildAnnotatedString {
                            withStyle(style = SpanStyle(color = Color(0xff1D1F33), fontWeight = FontWeight.Normal)) {
                                append("Toda ")
                            }
                            withStyle(style = SpanStyle(color = Color(0xff1D1F33), fontWeight = FontWeight.SemiBold)) {
                                append("00:00h ")
                            }
                            withStyle(style = SpanStyle(color = Color(0xff1D1F33), fontWeight = FontWeight.Normal)) {
                                append("se você deixou sua\n"+
                                        "caixa de entrada limpa e organizada.\n" +
                                        "Receba uma medalha por\n" +
                                        "sua total ")
                            }
                            withStyle(style = SpanStyle(color = Color(0xff1D1F33), fontWeight = FontWeight.SemiBold)) {
                                append("dedicação!")
                            }
                        }
                        Text(
                            text = text,
                            fontSize = 16.sp,
                            fontFamily = PoppinsRegular,
                            textAlign = TextAlign.Center,
                            color = Color(0xff1D1F33),
                            modifier = Modifier.padding(top = 20.dp)
                        )
                    }
                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(Color(0xff1F41BB)),
                        modifier = Modifier
                            .align(Alignment.BottomCenter)
                            .width(220.dp)
                            .height(31.dp)
                            .offset(y = 10.dp),
                        shape = RoundedCornerShape(10.dp),
                        contentPadding = PaddingValues(5.dp),
                        elevation = ButtonDefaults.buttonElevation(25.dp)
                    ) {
                        Text(
                            text = "Próximo",
                            color = Color.White,
                            fontSize = 16.sp,
                            fontFamily = PoppinsSemiBold,
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }
        Box (
            modifier = Modifier
                .align(Alignment.Center)
                .padding(top = 650.dp)
                .background(Color(0xff1D1F33))
                .border(1.dp, Color(0xffFFFFFF))
        ){
            Row (
                horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.CenterHorizontally),
                modifier = Modifier
                    .fillMaxWidth()
                    .width(380.dp)
                    .height(58.dp)
            ){
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(0xff1D1F33)),
                    contentPadding = PaddingValues(5.dp),
                    modifier = Modifier
                        .size(48.dp)
                        .shadow(10.dp, shape = RoundedCornerShape(4.dp), clip = true)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.pasta_icon),
                        contentDescription = "ícone pastas categorias email",
                        modifier = Modifier
                            .size(width = 29.dp, height = 29.dp)
                            .padding(1.dp)
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(0xff1D1F33)),
                    contentPadding = PaddingValues(5.dp),
                    modifier = Modifier
                        .size(48.dp)
                        .shadow(10.dp, shape = RoundedCornerShape(4.dp), clip = true)

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.pasta_icon),
                        contentDescription = "ícone pastas categorias email",
                        modifier = Modifier
                            .size(width = 29.dp, height = 29.dp)
                            .padding(1.dp)
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(0xff1D1F33)),
                    contentPadding = PaddingValues(5.dp),
                    modifier = Modifier
                        .size(48.dp)
                        .shadow(10.dp, shape = RoundedCornerShape(4.dp), clip = true)

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.pasta_icon),
                        contentDescription = "ícone pastas categorias email",
                        modifier = Modifier
                            .size(width = 29.dp, height = 29.dp)
                            .padding(1.dp)
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(0xff1D1F33)),
                    contentPadding = PaddingValues(5.dp),
                    modifier = Modifier
                        .size(48.dp)
                        .shadow(10.dp, shape = RoundedCornerShape(4.dp), clip = true)

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.pasta_icon),
                        contentDescription = "ícone pastas categorias email",
                        modifier = Modifier
                            .size(width = 29.dp, height = 29.dp)
                            .padding(1.dp)
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(0xff1D1F33)),
                    contentPadding = PaddingValues(5.dp),
                    modifier = Modifier
                        .size(48.dp)
                        .shadow(10.dp, shape = RoundedCornerShape(4.dp), clip = true)

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.pasta_icon),
                        contentDescription = "ícone pastas categorias email",
                        modifier = Modifier
                            .size(width = 29.dp, height = 29.dp)
                            .padding(1.dp)
                    )
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(0xff1D1F33)),
                    contentPadding = PaddingValues(5.dp),
                    modifier = Modifier
                        .size(48.dp)
                        .shadow(10.dp, shape = RoundedCornerShape(4.dp), clip = true)

                ) {
                    Image(
                        painter = painterResource(id = R.drawable.pasta_icon),
                        contentDescription = "ícone pastas categorias email",
                        modifier = Modifier
                            .size(width = 29.dp, height = 29.dp)
                            .padding(1.dp)
                    )
                }
            }
        }
        Box (
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .background(Color(0xff1D1F33))
                .border(1.dp, Color(0xffFFFFFF)),
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(40.dp, Alignment.CenterHorizontally),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .width(375.dp)
                    .height(76.dp)
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(0xff1D1F33)),
                    contentPadding = PaddingValues(5.dp),
                    modifier = Modifier
                        .size(48.dp)
                        .shadow(10.dp, shape = RoundedCornerShape(4.dp), clip = true)

                ) {
                    Icon(imageVector = Icons.Default.Settings , contentDescription = "ícone settings",
                        tint = Color.White, modifier = Modifier.size(45.dp))
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(0xff1D1F33)),
                    contentPadding = PaddingValues(5.dp),
                    modifier = Modifier
                        .size(48.dp)
                        .shadow(10.dp, shape = RoundedCornerShape(4.dp), clip = true)

                ) {
                    Icon(imageVector = Icons.Default.Search, contentDescription = "ícone pesquisa",
                        tint = Color.White, modifier = Modifier.size(45.dp))
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(0xff1D1F33)),
                    contentPadding = PaddingValues(5.dp),
                    modifier = Modifier
                        .size(48.dp)
                        .shadow(10.dp, shape = RoundedCornerShape(4.dp), clip = true)

                ) {
                    Icon(imageVector = Icons.Default.DateRange, contentDescription = "ícone calendário",
                        tint = Color.White, modifier = Modifier.size(45.dp))
                }
                Button(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(Color(0xff1D1F33)),
                    contentPadding = PaddingValues(5.dp),
                    modifier = Modifier
                        .size(48.dp)
                        .shadow(10.dp, shape = RoundedCornerShape(4.dp), clip = true)

                ) {
                    Icon(imageVector = Icons.Default.Star, contentDescription = "ícone favoritos",
                        tint = Color(color = 0xffFBBC24), modifier = Modifier.size(45.dp))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Intro6Preview() {
    Surface(
        modifier = Modifier.fillMaxWidth()
    ) {
        Intro6()
    }
}