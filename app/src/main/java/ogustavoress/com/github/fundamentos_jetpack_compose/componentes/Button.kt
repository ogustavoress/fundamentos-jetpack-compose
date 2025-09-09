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

@Composable
fun StyleButton(count: Int, onClick: () -> Unit) {
    Button(
        onClick = onClick, modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        shape = MaterialTheme.shapes.large,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(color = 0xFF1976D2),
            contentColor = Color.White
        ),
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 6.dp,
            pressedElevation = 8.dp
        )
    ) {
        Text(
            text = "Confirmar",
            fontSize = 18.sp,
            color = Color.White,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview
@Composable
fun PreviewStyleButton() {
    var count by remember { mutableStateOf(0) }
    StyleButton(count = count, onClick = { count++ })
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
        StyleButton(count = count, onClick = {count++})
    }
}