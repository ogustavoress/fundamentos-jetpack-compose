@Preview
@Composable
fun SimpleButton(count: Int, onClick : () -> Unit) {
    Button(
        onClick = onClick, modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(text = "Confirmar", modifier = Modifier.padding(4.dp))
    }
}

@Preview
@Composable
fun InitialScreen(modifier: Modifier = Modifier) {
    var count by remember {mutableStateOf(0)}

    Column(modifier = modifier.fillMaxSize()) {
        // Content
        Column(
            modifier = Modifier.weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Quantidade de cliques : $count",
                fontSize = 20.sp,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
        }
        SimpleButton(count = count, onClick = {count++})
    }
}