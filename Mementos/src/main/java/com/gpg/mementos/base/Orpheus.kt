package com.gpg.mementos.base

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job

abstract class Orpheus<in EventType>(protected val main: CoroutineDispatcher) : CoroutineScope {
    protected val jobTracker: Job = Job()

    abstract fun dispatch(eventType: EventType)

}