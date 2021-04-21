package model.observer


interface Observable{

    fun subscribe(observer: Observer)

    fun unsubscribe(observer: Observer)

    fun notifyObservers()


}