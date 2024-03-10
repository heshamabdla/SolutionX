package am.leon.solutionx.android.helpers.logging.writers

import am.leon.solutionx.android.helpers.logging.LogDebug
import com.example.solutionx.logging.writers.LoggerWriter

/**
 * Do not writes anything
 */
class DummyWriter : LogDebug {
    override val isDebugEnabled: Boolean
        get() = false
}