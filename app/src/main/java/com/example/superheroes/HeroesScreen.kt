package com.example.superheroes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.superheroes.datasource.Datasource
import com.example.superheroes.model.Hero
import com.example.superheroes.ui.theme.SuperheroesTheme
import com.example.superheroes.ui.theme.md_theme_light_secondaryContainer

@Composable
fun CardOfHero(hero: Hero) {
    Box(
        modifier = Modifier
            .wrapContentSize(align = Alignment.TopCenter)
            .padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 8.dp)
            .background(
                color = MaterialTheme.colorScheme.primary,
                shape = MaterialTheme.shapes.medium
            )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 16.dp, bottom = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier.width(width = 250.dp)
            ) {
                Text(
                    text = stringResource(hero.name),
                    style = MaterialTheme.typography.displaySmall,
                    color = MaterialTheme.colorScheme.onPrimary
                )
                Text(
                    text = stringResource(hero.description),
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onPrimary
                )
            }
            Box(
                modifier = Modifier.padding(end = 16.dp)
            ) {
                Image(
                    painter = painterResource(hero.image),
                    contentDescription = null,
                    modifier = Modifier
                        .size(72.dp)
                        .clip(shape = MaterialTheme.shapes.small)
                )
            }
        }
    }
}

@Composable
fun ShowListOfCardHero() {
    LazyColumn {
        items(Datasource().reloadData()) {
            CardOfHero(hero = it)
        }
    }
}

@Composable
fun ShowApp() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = stringResource(R.string.app_name),
            style = MaterialTheme.typography.displayLarge
        )
        ShowListOfCardHero()
    }
}

@Composable
@Preview(showSystemUi = true, showBackground = true)
fun ShowPreview() {
    SuperheroesTheme {
        ShowApp()
    }
}