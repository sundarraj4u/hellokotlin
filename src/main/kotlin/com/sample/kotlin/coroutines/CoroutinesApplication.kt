package com.sample.kotlin.coroutines

import javafx.application.Application.launch
import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.math.BigInteger
import kotlin.system.measureTimeMillis

@SpringBootApplication
class CoroutinesApplication

fun main(args: Array<String>) {
	runApplication<CoroutinesApplication>(*args){
		setBannerMode(Banner.Mode.CONSOLE)
		println("Hello world.")
	}
}


private suspend fun getFibonacci(range: Int): BigInteger {
	var first: BigInteger = BigInteger.ZERO
	var second: BigInteger = BigInteger.ONE
	for (i in 1 until range) {
		val sum = first + second
		first = second
		second = sum
		if (i == (range - 1))
			return first
	}
	return BigInteger.ZERO
}

fun runBlocking(any: Any) {
	TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}
