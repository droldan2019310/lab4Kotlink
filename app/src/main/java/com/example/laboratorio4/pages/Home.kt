package com.example.laboratorio4.pages

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
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laboratorio4.R

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.white))
            .wrapContentSize(Alignment.TopCenter)
            .verticalScroll(rememberScrollState()).padding(0.dp,0.dp,0.dp,40.dp)
    ) {
        Text(
            text = "Campus Central",
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(
                    16.dp
                ),
            fontSize = 20.sp,
        )
        val image = painterResource(R.drawable.campus)
        Box{
            Image(
                painter = image,
                contentDescription="CAMPUS CENTRAL"
            )
        }

        Text(
            text ="DESTACADOS",
            fontWeight = FontWeight.Bold,
            color = Color(105, 104, 102, 255),
            fontSize = 25.sp,
            textAlign = TextAlign.Start,
            modifier = Modifier
                .padding(
                    30.dp
                ),
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Card(
                modifier = Modifier
                    .weight(1f)
                    .padding(8.dp).shadow(
                        elevation = 8.dp,
                        shape = MaterialTheme.shapes.medium, // You can customize the shape
                        clip = false // Set to true to clip the shadow within the shape
                    ),


            ) {
                Column(
                    modifier = Modifier.background(Color.White).fillMaxWidth(1f)
                        .wrapContentSize(Alignment.Center),


                ) {
                    Image(
                        painter = painterResource(R.drawable.sbb_sn_logo),
                        contentDescription = "Service now",
                        modifier = Modifier
                            .size(110.dp),
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Box(
                        modifier = Modifier.background(Color(7,139,69)).fillMaxWidth(1f).padding(6.dp)
                    ){
                        Text(
                            text = "Service Now",
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier,
                            color = Color.White
                        )
                    }


                }
            }

            Card(
                modifier = Modifier
                    .weight(1f)
                    .padding(8.dp).shadow(
                        elevation = 8.dp,
                        shape = MaterialTheme.shapes.medium, // You can customize the shape
                        clip = false // Set to true to clip the shadow within the shape
                    )
            ) {
                Column(
                    modifier = Modifier.background(Color.White).fillMaxWidth(1f)
                        .wrapContentSize(Alignment.Center),


                    ) {
                    Image(
                        painter = painterResource(R.drawable.actualidaduvg),
                        contentDescription = "Actualidad UVG",
                        modifier = Modifier
                            .fillMaxWidth(1f),
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Box(
                        modifier = Modifier.background(Color(105, 104, 102, 255)).fillMaxWidth(1f).padding(6.dp)
                    ){
                        Text(
                            text = "Actualidad UVG",
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier,
                            color = Color.White
                        )
                    }


                }
            }
        }

        Text(
            text ="SERVICIOS Y RECURSOS",
            fontWeight = FontWeight.Bold,
            color = Color(105, 104, 102, 255),
            fontSize = 25.sp,
            textAlign = TextAlign.Start,
            modifier = Modifier
                .padding(
                    30.dp
                ).fillMaxWidth(1f),
        )



        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Card(
                modifier = Modifier
                    .weight(1f)
                    .padding(8.dp).shadow(
                        elevation = 8.dp,
                        shape = MaterialTheme.shapes.medium, // You can customize the shape
                        clip = false // Set to true to clip the shadow within the shape
                    ),


                ) {
                Column(
                    modifier = Modifier.background(Color.White).fillMaxWidth(1f)
                        .wrapContentSize(Alignment.Center),


                    ) {
                    Image(
                        painter = painterResource(R.drawable.servicioesestudiantiles),
                        contentDescription = "Directorio de Servicios Estudiantiles",
                        modifier = Modifier
                            .fillMaxWidth(1f),
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Box(
                        modifier = Modifier.background(Color(7,139,69)).fillMaxWidth(1f).padding(6.dp)
                    ){
                        Text(
                            text = "Directorio de Servicios Estudiantiles",
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier,
                            color = Color.White
                        )
                    }


                }
            }

            Card(
                modifier = Modifier
                    .weight(1f)
                    .padding(8.dp).shadow(
                        elevation = 8.dp,
                        shape = MaterialTheme.shapes.medium, // You can customize the shape
                        clip = false // Set to true to clip the shadow within the shape
                    )
            ) {
                Column(
                    modifier = Modifier.background(Color.White).fillMaxWidth(1f)
                        .wrapContentSize(Alignment.Center),


                    ) {
                    Image(
                        painter = painterResource(R.drawable.biblioteca),
                        contentDescription = "Portal Web Bibliotecas UVG",
                        modifier = Modifier
                            .fillMaxWidth(1f),
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Box(
                        modifier = Modifier.background(Color(105, 104, 102, 255)).fillMaxWidth(1f).padding(6.dp)
                    ){
                        Text(
                            text = "Portal Web Bibliotecas UVG",
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier,
                            color = Color.White
                        )
                    }


                }
            }
        }
    }
}