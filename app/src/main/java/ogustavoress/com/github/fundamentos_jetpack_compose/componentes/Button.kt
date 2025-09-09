@Preview
@Composable
fun SimpleButton() {
    Button(
        onClick = { /*TODO*/ }, modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(text = "Confirmar", modifier = Modifier.padding(4.dp))
    }
}

@Preview
@Composable
fun InitialScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()) {
        // Content
        Column(
            modifier = Modifier.weight(1f),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Quantidade de cliques",
                fontSize = 20.sp,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )
        }
        SimpleButton()
    }
}