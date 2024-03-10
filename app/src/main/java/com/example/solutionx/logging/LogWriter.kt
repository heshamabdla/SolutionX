package com.example.solutionx.logging

import am.leon.solutionx.android.helpers.logging.LogDebug

interface LogWriter:LogDebug {
    fun debug(clazz: Class<*>, message: String?)
    fun info(clazz: Class<*>, message: String?)
    fun warning(clazz: Class<*>, message: String?)
    fun error(clazz: Class<*>, message: String?, throwable: Throwable? = null)
}