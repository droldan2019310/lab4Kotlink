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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Close

import androidx.compose.material3.Divider
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laboratorio4.R

@Composable
fun EmergencyScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.white))
            .wrapContentSize(Alignment.TopCenter)
            .verticalScroll(rememberScrollState())
            .padding(0.dp, 0.dp, 0.dp, 40.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {


            IconButton(
                onClick = {
                    // Handle icon button click
                },
                modifier = Modifier.size(48.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = "Close",
                    tint = Color(R.color.green)
                )
            }

            Text(
                text = "Emergency Contacts",
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .weight(1f)
                    .wrapContentWidth(Alignment.CenterHorizontally),
                fontSize = 20.sp,
            )
        }
        Divider(color = Color.Gray, thickness = 0.2.dp)


        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            val image = painterResource(R.drawable.ic_emergency_red)
            Box{
                Image(
                    painter = image,
                    contentDescription="CAMPUS CENTRAL",
                    modifier = Modifier
                        .size(110.dp),

                )
            }   
            
            Column(
                modifier = Modifier.padding(20.dp)
            ){
                Text(text = "EMERGENCIAS", fontWeight = FontWeight.Bold, fontSize = 18.sp, color=Color.Black)

                Text(text="Si se presenta un incidente o un percance por favor marca el número de emergencia y rápidamente te apoyamos.",
                    fontSize = 15.sp, color=Color(51, 45, 45))
            }
        }

        Button(
            onClick = {
                      //handler
            },
            modifier = Modifier
                .padding(16.dp).fillMaxWidth(),
            colors=ButtonDefaults.buttonColors(backgroundColor = Color(0xFF078B45)),

        ) {
            Row {
                Icon(
                    imageVector = Icons.Default.Call,
                    contentDescription = "Call emergengy",
                    tint = Color.White,
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "Call 5978-1736", color = Color.White)
            }
        }

        //clinicas

        Divider(color = Color.Gray, thickness = 0.2.dp)


        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            val image = painterResource(R.drawable.clinica)
            Box{
                Image(
                    painter = image,
                    contentDescription="CAMPUS CENTRAL",
                    modifier = Modifier
                        .size(100.dp),

                    )
            }

            Column(
                modifier = Modifier.padding(20.dp)
            ){
                Text(text = "Clínica UVG", fontWeight = FontWeight.Bold, fontSize = 18.sp, color=Color.Black)

                Text(text="La Clínica UVG, presta los siguientes servicios:\n",
                    fontSize = 15.sp, color=Color(51, 45, 45))

                Text(text="• Atención a Emergencias " +
                        "\n • Atención Primaria a Enfermedades Comunes"+
                        "\n • Plan Educacional sobre Enfermedades\n",
                    fontSize = 15.sp, color=Color(51, 45, 45))

                Text(text="Horario de Atención: 7:00 AM a 8:30 PM \n"+
                    "Campus Central Edificio F 119-120",
                    fontSize = 15.sp, color=Color(51, 45, 45))
            }
        }

        Button(
            onClick = {
                //handler
            },
            modifier = Modifier
                .padding(16.dp).fillMaxWidth(),
            colors=ButtonDefaults.buttonColors(backgroundColor = Color(0xFF078B45)),

            ) {
            Row {
                Icon(
                    imageVector = Icons.Default.Call,
                    contentDescription = "Call emergengy",
                    tint = Color.White,
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "Call 2507-1500 ext 21312", color = Color.White)
            }
        }
    }
}