package com.calculadora_imc.model;

import java.text.DecimalFormat;

public class ImcBean {

	private float peso;
	private float altura;
	public ImcBean() {

	}
	public ImcBean(String peso, String altura) {
		setPeso(peso);
		setAltura(altura);
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public void setPeso(String peso) {
		this.peso = (peso.matches("[0-9.]+")==false ? 0f:Float.parseFloat(peso));
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public void setAltura(String altura) {

		this.altura = (altura.matches("[0-9.]+")==false ? 0f:Float.parseFloat(altura));

	}
		public String getResultado() {

			Float imc = peso / (altura * 2);
			
			if(imc.isNaN())
				return "coloque o valor !!!! ";
			StringBuilder result = new StringBuilder("IMC = " + new DecimalFormat("#.##").format(imc));

			if(imc < 24.9) {
				result.append(" vc é uma pessoal saudavel, apresentando menor risco para doenças ");
			}else{
				if((imc>=25 ) && (imc<=29.7)){
			result.append(" vc � uma pessoa sobrepeso, podendo levar � fadiga, varizes e m� circula��o");
				}else{
					result.append(" obesidade de grau I, podendo resultar em diabetes, infarto, angina e aterosclerose.");

				}
			}
			return result.toString();

		}



	@Override
	public String toString() {
		return " Imc \n peso = " + peso + "\r\n altura = " + altura + "\n Resultado  \n " + getResultado()  ;
	}


}
