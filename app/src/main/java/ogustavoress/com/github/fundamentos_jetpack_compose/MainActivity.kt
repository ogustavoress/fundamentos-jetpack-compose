package ogustavoress.com.github.fundamentos_jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import ogustavoress.com.github.fundamentos_jetpack_compose.ui.theme.FundamentosjetpackcomposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FundamentosjetpackcomposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TextoCustomizado(
                        "Primeira função composable",
                        modifier = Modifier.padding(innerPadding)
                    )
                    Inicial(Modifier.padding(innerPadding))

                }
            }
        }
    }
}

@Composable
fun Inicial(modifier: Modifier) {
    Column (modifier = modifier.background(color = Color.Blue)){
        TextoCustomizado("Primeira função composable")
        TextoCustomizado("Seja bem-vindo")
        TextoCustomizado("Olá, usuário")
        Row {
            TextoCustomizado("Seja bem-vindo")
            TextoCustomizado("Olá, usuário")
        }
    }

}

@Composable
fun TextoCustomizado(texto: String, modifier: Modifier = Modifier) {
    Text(
        text = texto,
        color = Color.White,
        modifier = modifier
    )

}

@Preview(showBackground = true)
@Composable
fun PreviewFuncaoInicial() {
    FundamentosjetpackcomposeTheme {
        Inicial()
    }
}
