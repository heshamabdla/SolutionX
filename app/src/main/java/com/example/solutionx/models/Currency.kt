package am.leon.solutionx.domain.models

import android.os.Parcelable
import com.example.solutionx.adapter.SingleSelection

data class Currency(
    override var id: Int,
    override var name: String,
    val sign: String,
    val code: String,
    override var selected: Boolean
) : SingleSelection