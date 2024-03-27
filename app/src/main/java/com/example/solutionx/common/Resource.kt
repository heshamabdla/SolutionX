

import com.example.solutionx.common.exception.SolutionXException

sealed class Resource<out Model> {

    data class Progress<Model>(val loading: Boolean, val partialData: Model? = null) :
        Resource<Model>()
    class Success<out Model>(val model: Model) : Resource<Model>()
    class Failure(exception: SolutionXException): Resource<Nothing>()
//    class Loading<T>(loading:Boolean) : Resource<T>()

    companion object {
        fun <Model> loading(
            loading: Boolean = true, partialData: Model? = null
        ): Resource<Model> = Progress(loading, partialData)

        fun <Model> success(model: Model): Resource<Model> = Success(model)
        fun <Model> failure(exception: SolutionXException): Resource<Model> = Failure(exception)
    }

}

