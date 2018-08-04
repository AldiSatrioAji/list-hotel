package com.example.chopper.rxwithretrofitandgroupie.model

data class Location(
    val street: String,
    val city: String,
    val state: String,
    val postcode: Int,
    val coordinates: Coordinates,
    val timezone: Timezone
)