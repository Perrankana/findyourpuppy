/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.perrankana.findyourpuppy.ui.grid

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.perrankana.findyourpuppy.puppies
import com.perrankana.findyourpuppy.ui.puppy.PuppyListCard
import com.perrankana.findyourpuppy.ui.theme.MyTheme
import com.perrankana.findyourpuppy.viewmodel.PuppyListItem
import com.perrankana.findyourpuppy.viewmodel.toListItem

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PuppyGrid(puppies: List<PuppyListItem>, onClick: (Int) -> Unit) {
    LazyVerticalGrid(
        contentPadding = PaddingValues(4.dp),
        cells = GridCells.Adaptive(minSize = 180.dp),
    ) {
        itemsIndexed(puppies) { index, puppy ->
            PuppyListCard(puppy = puppy, onClick = { onClick(index) })
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun LightPreview() {
    MyTheme {
        PuppyGrid(puppies.map { it.toListItem() }) {}
    }
}
