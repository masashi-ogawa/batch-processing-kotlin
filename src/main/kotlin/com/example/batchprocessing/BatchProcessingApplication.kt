package com.example.batchprocessing

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import kotlin.system.exitProcess

@SpringBootApplication
class BatchProcessingApplication {
	companion object {
		@JvmStatic
		fun main(args: Array<String>) {
			exitProcess(SpringApplication.exit(SpringApplication.run(BatchProcessingApplication::class.java, *args)))
		}
	}
}
