package br.com.tiagolivrera.webnovelapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebnovelApiApplication

fun main(args: Array<String>) {
	runApplication<WebnovelApiApplication>(*args)
}
