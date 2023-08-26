package com.alistar.rentax.component

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.rounded.LocationOn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.alistar.rentax.ui.Colors

@Composable
fun TopAppBar() {
    Row(
        modifier = Modifier
            .height(74.dp)
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Column(
            modifier = Modifier.weight(1f),
        ) {
            Text(
                text = "RentaX",
                color = Colors.white,
                style = MaterialTheme.typography.h6,
                fontWeight = FontWeight(300),
            )
            Row(
                modifier = Modifier.padding(top = 6.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Icon(
                    imageVector = Icons.Rounded.LocationOn,
                    contentDescription = "Location",
                    modifier = Modifier.size(16.dp),
                    tint = MaterialTheme.colors.secondary,
                )
                Text(
                    text = "St. Celina, Delawere 10299",
                    modifier = Modifier.padding(start = 8.dp),
                    color = MaterialTheme.colors.secondary,
                    style = MaterialTheme.typography.body2,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1,
                    fontWeight = FontWeight(300),
                )
            }
        }
        IconButton(
            onClick = {},
        ) {
            Icon(
                imageVector = Icons.Outlined.Notifications,
                contentDescription = "Location",
                tint = Colors.white,
            )
        }
        Box(Modifier.size(54.dp)) {
            Image(
                painter = painterResource("avatar.jpg"),
                contentDescription = "Avatar",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize()
                    .clip(CircleShape),
            )
            Icon(
                imageVector = Icons.Filled.AddCircle,
                modifier = Modifier
                    .size(22.dp)
                    .clip(CircleShape)
                    .background(MaterialTheme.colors.surface)
                    .padding(1.dp)
                    .align(Alignment.BottomEnd),
                contentDescription = "Location",
                tint = Colors.yellow,
            )
        }
    }
}

@Preview
@Composable
fun TopAppBarPreview() {
    MaterialTheme {
        TopAppBar()
    }
}
