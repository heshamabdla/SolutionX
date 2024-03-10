package am.leon.solutionx.domain.models

import android.os.Parcelable
import com.example.solutionx.adapter.SingleSelection

data class Filter(
    override var id: Int,
    override var name: String,
    override var selected: Boolean
) : SingleSelection