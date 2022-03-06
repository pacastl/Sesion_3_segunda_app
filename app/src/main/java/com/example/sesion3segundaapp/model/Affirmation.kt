package com.example.sesion3segundaapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.sesion3segundaapp.R

data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)