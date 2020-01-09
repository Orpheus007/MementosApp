package com.gpg.mementos.base

/**
 *
 * From Darel Bitsy's clean-arch repo here:
 *
 * https://github.com/bitsydarel/clean-arch/blob/master/core/src/commonMain/kotlin/com/bitsydarel/cleanarch/core/usecases/UseCase.kt
 * @param <out>
 */
abstract class IzanagiPicaro<in Params, out R> {
    /**
     * Build the use case to be executed.
     *
     * @param params required to build this use case.
     *
     * @return result [R] of the use case.
     */
    protected abstract suspend fun buildUseCase(params: Params): R

    /**
     * Execute the use case.
     *
     * Called by client of the use case.
     *
     * @return [R] result of executing this use case
     */
    suspend fun execute(params: Params): R = buildUseCase(params)
}


/*
suspend fun getReminders(): ResultWrapper<Exception, List<Reminder>>

class GetReminder(
    private val repo: IReminderRepository
) : UseCaseWithParams<String, ResultWrapper<Exception, Reminder>>() {
    override suspend fun buildUseCase(params: String): ResultWrapper<Exception, Reminder> {
        return repo.getReminderById(params)
    }
}*/
