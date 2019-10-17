package com.iteriam.prueba.calculator;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api")
@Api(value = "Calculator microservice", description = "Operations pertaining to the calculator microservices")
public class CalculatorController {

	@ApiOperation("Add two numbers passed by parameters")
	@ApiResponses(value = {
        @ApiResponse(code = 200, message = "Addition completed successfully")
    })
	@GetMapping(value = "/add/{num1}/{num2}/")
	public String add(@PathVariable("num1") @ApiParam(value = "Summand 1", example = "5") Integer num1, 
					  @PathVariable("num2") @ApiParam(value = "Summand 2", example = "3") Integer num2) {
		return String.format("%d + %d = %d", num1, num2, (num1 + num2));
	}

	@ApiOperation("Subtract two numbers passed by parameters")
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Subtraction completed successfully")
    })
	@GetMapping(value = "/subtract/{num1}/{num2}/")
	public String subtract(@PathVariable("num1") @ApiParam(value = "Minuend", example = "10") Integer num1, 
					  @PathVariable("num2") @ApiParam(value = "Subtrahend", example = "5") Integer num2) {
		return String.format("%d - %d = %d", num1, num2, (num1 - num2));
	}

	@ApiOperation("Multiply two numbers passed by parameters")
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Multiplication completed successfully")
    })
	@GetMapping(value = "/multiply/{num1}/{num2}/")
	public String multiply(@PathVariable("num1") @ApiParam(value = "Multiplicand", example = "8") Integer num1, 
					       @PathVariable("num2") @ApiParam(value = "Multiplier", example = "6") Integer num2) {
		return String.format("%d x %d = %d", num1, num2, (num1 * num2));
	}

	@ApiOperation("Divide two numbers passed by parameters")
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Division completed successfully")
    })
	@GetMapping(value = "/divide/{num1}/{num2}/")
	public String divide(@PathVariable("num1") @ApiParam(value = "Dividend", example = "10") Integer num1, 
					     @PathVariable("num2") @ApiParam(value = "Divider", example = "2") Integer num2) {
		return String.format("%d / %d = %d", num1, num2, (num1 / num2));
	}
}
