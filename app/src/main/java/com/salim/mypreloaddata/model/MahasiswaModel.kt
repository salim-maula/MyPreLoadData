package com.salim.mypreloaddata.model

import android.os.Parcelable
import androidx.versionedparcelable.ParcelField
import kotlinx.parcelize.Parcelize

@Parcelize
data class MahasiswaModel (
    var id: Int = 0,
    var name: String? = null,
    var nim: String? = null
) : Parcelable