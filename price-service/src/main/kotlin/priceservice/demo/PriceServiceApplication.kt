package priceservice.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@EnableEurekaClient
class PriceServiceApplication

fun main(args: Array<String>) {
	runApplication<PriceServiceApplication>(*args)
}


@RestController
class PriceController{

	@RequestMapping("/")
	fun prices(): Map<String, Double>{
		return mapOf("iPhone" to 799.99, "macbook" to 1599.99)
	}
}
