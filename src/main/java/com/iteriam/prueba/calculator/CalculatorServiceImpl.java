package com.iteriam.prueba.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public Integer add(Integer num1, Integer num2) {
		return num1 + num2;
	}

	@Override
	public Integer subtract(Integer num1, Integer num2) {
		return num1 - num2;
	}

	@Override
	public Integer multiply(Integer num1, Integer num2) {
		return num1 * num2;
	}

	@Override
	public Integer divide(Integer num1, Integer num2) {
		return num1 / num2;
	}

}
