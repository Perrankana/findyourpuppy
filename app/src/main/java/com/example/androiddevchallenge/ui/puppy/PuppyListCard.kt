package com.example.androiddevchallenge.ui.puppy

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.typography
import com.example.androiddevchallenge.viewmodel.PuppyListItem

@Composable
fun PuppyListCard(puppy: PuppyListItem, onClick: () -> Unit) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(4.dp)
            .clickable(onClick = onClick)
    ) {
        Card(
            elevation = 4.dp
        ) {
            Column(
                modifier = Modifier.padding(bottom = 16.dp)
            ) {
                Image(
                    painter = painterResource(puppy.image),
                    contentDescription = puppy.name,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(160.dp)
                        .padding(bottom = 4.dp),
                    contentScale = ContentScale.Crop
                )
                Text(
                    text = puppy.name, style = typography.h6,
                    modifier = Modifier.padding(start = 16.dp),
                    color = MaterialTheme.colors.primary
                )
                Text(
                    text = puppy.description,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(start = 16.dp)
                )
            }
        }
    }
}

@Composable
private fun dummyPuppyListCard() {
    PuppyListCard(puppy = PuppyListItem(
        name = "Browny",
        description = """Adult • Coonhound""",
        image = R.drawable.chip_small
    ), onClick = { /*TODO*/ })
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme {
        dummyPuppyListCard()
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun DarkPreview() {
    MyTheme(darkTheme = true) {
        dummyPuppyListCard()
    }
}