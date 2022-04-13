package com.cs.jettriviaquestion.data

import java.lang.Exception

data class DataOrException<T, Boolea, E : Exception>(
    var data: T? = null,
    var loading: Boolean? = null,
    var e: E? = null
)