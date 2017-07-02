package br.univel;

import javax.jws.WebService;

@WebService(endpointInterface = "br.univel.CalculadoraServer")
public class CalculadoraServerImpl implements CalculadoraServer{

	@Override
	public float soma(float num1, float num2) {
		return num1 + num2;
	}

	@Override
	public float subtracao(float num1, float num2) {
		return num1 - num2;
	}

	@Override
	public float multiplicacao(float num1, float num2) {
		return num1 * num2;
	}

	@Override
	public float divisao(float num1, float num2) {
		return num1 / num2;
	}

}
