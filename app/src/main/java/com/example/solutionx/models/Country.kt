package am.leon.solutionx.domain.models

import android.os.Parcelable
import com.example.solutionx.adapter.SingleSelection


data class Country(
    override var id: Int,
    override var name: String,
    val currency: String,
    val code: String,
    val phoneCode: String,
    val flag: String,
    override var selected: Boolean
) : SingleSelection