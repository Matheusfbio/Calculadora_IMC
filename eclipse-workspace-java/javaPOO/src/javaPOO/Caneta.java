package javaPOO;

public class Caneta {
		private String Modelo;
		private float Ponta;
		private String Cor;
		private boolean Tampada;
		
		public Caneta(String m , String c , float p) {	//metodo construtor
			this.Modelo = m;
			this.Cor = c;
			this.setPonta(p);
			this.Tampar();
		}
		
		public String getModelo() {
			return this.Modelo;
		}
		public void setModelo(String m) {
			this.Modelo = m;
		}
		public float getPonta() {
			return this.Ponta;
		}
		public void setPonta(float p) {
			this.Ponta = p; 
		}
		public void Tampar () {
			this.Tampada = true;
		}
		
		public void Desampar() {
			this.Tampada = false;
		}
		public void status() {
			System.out.println("sobre a caneta:");
			System.out.println("Modelo: " + this.getModelo());
			System.out.println("Ponta: "+ this.getPonta());
			System.out.println("Cor: "+ this.Cor);
			System.out.println("Tampada:"+ this.Tampada);
			 
		}
}