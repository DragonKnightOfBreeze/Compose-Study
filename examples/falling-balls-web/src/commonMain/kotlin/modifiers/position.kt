package org.jetbrains.compose.common.demo

import androidx.compose.runtime.Composable
import org.jetbrains.compose.common.ui.ExperimentalComposeWebWidgetsApi
import org.jetbrains.compose.common.ui.Modifier
import org.jetbrains.compose.common.ui.unit.Dp

@OptIn(ExperimentalComposeWebWidgetsApi::class)
@Composable
expect fun Modifier.position(width: Dp, height: Dp): Modifier