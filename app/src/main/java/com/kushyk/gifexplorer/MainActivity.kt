package com.kushyk.gifexplorer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.kushyk.gifexplorer.ui.theme.GifExplorerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier.fillMaxSize(),
            ) {
                TopAppBar {
                    Text(text = "GIF explorer", fontSize = 26.sp)
                    Spacer(Modifier.weight(1f, true))
                    IconButton(onClick = { }) {
                        Icon(Icons.Filled.Info, contentDescription = stringResource(id = R.string.table_or_column))
                    }
                }
            }
        }

    }
}

@Composable
fun TopAppBarCreation() {

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GifExplorerTheme {
        TopAppBar {
            Text(text = "GIF explorer", fontSize = 26.sp)
            Spacer(Modifier.weight(1f, true))
            IconButton(onClick = { }) {
                Icon(Icons.Filled.Info, contentDescription = "Информация о приложении")
            }
        }
    }
}