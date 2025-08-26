package ogustavoress.com.github.fundamentos_jetpack_compose.componentes

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun SimpleOutlineTextField(padding: Modifier) {
    var text by remember {
        mutableStateOf("")
    }
    var isError by remember {
        mutableStateOf(false)
    }

    TextField(
        modifier = Modifier,
        value = text,
        onValueChange = {
                novoValorDigitado : String ->
            text = novoValorDigitado
            isError = novoValorDigitado.contains("0")
        },
        label = {
            Text(text = "Nome")
        },
        isError = isError
    )
}