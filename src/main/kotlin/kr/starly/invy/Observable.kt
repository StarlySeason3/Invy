package kr.starly.invy

interface Observable {

    fun addObserver(who: Observer, what: Int, how: Int)

    fun removeObserver(who: Observer, what: Int, how: Int)

}