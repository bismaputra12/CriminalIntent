package edu.arizona.cast.emeraldbismaputra.criminalintent

import java.util.*

data class Crime(val id: UUID,
                var title: String = "",
                var date: Date = Date(),
                var isSolved: Boolean = false)
