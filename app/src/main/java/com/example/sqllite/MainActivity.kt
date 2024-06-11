package com.example.sqllite

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sqllite.ui.theme.SqlliteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SqlliteTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
                Controle()
            }
        }
    }
}

@Composable
fun Controle(){
    var nome by remember { mutableStateOf("") }
    var bairro by remember { mutableStateOf("") }
    var cep by remember { mutableStateOf("") }
    var cidade by remember { mutableStateOf("") }
    var estado by remember { mutableStateOf("") }

    Column(Modifier.fillMaxWidth(),
        Arrangement.Center) {
        Row(Modifier.fillMaxWidth(),
            Arrangement.Center) {
                Text(text = "Cadastro", fontSize = 20.sp )
        }
        Divider(modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 20.dp))
        Row(Modifier.fillMaxWidth(),
            Arrangement.Center) {
            TextField(value = nome, onValueChange ={novoValor -> nome = novoValor},
                label = {Text("Nome: ")}
            )
        }
        Spacer(modifier = Modifier.height(16.dp))

        Row(Modifier.fillMaxWidth(),
            Arrangement.Center) {
            TextField(value = cep,

                onValueChange = { novoValor -> cep = novoValor },
                label = { Text("CEP: ") }
            )
        }
        Spacer(modifier = Modifier.height(16.dp))

        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(value = cidade,

                onValueChange = { novoValor -> cidade = novoValor },
                label = { Text("Cidade: ") }
            )
        }
        Spacer(modifier = Modifier.height(16.dp))

        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center
        ) {
            TextField(value = estado,

                onValueChange = { novoValor -> estado = novoValor },
                label = { Text("Estado") }
            )
        }
        Spacer(modifier = Modifier.height(16.dp)) // Adiciona espaço vertical

        Row(Modifier
            .fillMaxWidth(),
            Arrangement.Center
        ){

            Button (onClick = {}) {
                Text(text = "Cadastrar")
            }
        }
    }
}
@Composable
@Preview
fun registerPreviw(){
    Surface (
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ){
        Controle()
    }
}


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SqlliteTheme {
        Greeting("Android")
    }
}