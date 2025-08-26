package ogustavoress.com.github.fundamentos_jetpack_compose.componentes

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun SimpleTextField(padding: Modifier) {
    TextField(
        value = "Digite seu nome",
        onValueChange = {/*todo*/},
        label = {
            Text(text = "Nome")
        }
    )
}