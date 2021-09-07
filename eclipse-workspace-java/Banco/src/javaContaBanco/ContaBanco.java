package javaContaBanco;
	
	public class ContaBanco {
		//atributos
		public int NumConta;
		protected String Tipo;
		private String Dono; 
		private float Saldo;
		private boolean Status ;
		//metodos
		public void estadoAtual() {
			System.out.println("----------------------------");
			System.out.println("conta: " + this.getNunConta());
			System.out.println("tipo: " + this.getTipo());
			System.out.println("dono: " + this.getDono());
			System.out.println("saldo: " + this.getSaldo());
			System.out.println("status: " + this.getStatus());
			System.out.println("----------------------------");
		}
		
	
		public void abrirConta(String t) {
			this.setTipo(t);
			this.setStatus(true);
			if (t == "CC") {	
			this.setSaldo(50);
			} else if (t == "CP") {
				this.setSaldo(150);
			}
			System.out.println("Conta aberta com sucesso!");	
		}
		public void fecharConta() {
			if (this.getSaldo() > 0) {
				System.out.println("Conta nao pode ser fecada por que ainda tem dinheiro!!!");
			} else if (this.getSaldo() < 0) {
				System.out.println("Conta nao pode ser fechada pois tem debito!!!");
			} else {
				this.setStatus(false);
				System.out.println("Conta fechada com sucesso");
			}
			
		}
		
		public void depositar(float v) {
			if (this.getStatus()) {  
			this.setSaldo(this.getSaldo() + v);
			System.out.println("deposito realizado na conta de " + this.getDono());
			} else {
				System.out.println("impossivel depositar em uma conta fechada!!!!");
			}
		}
			
		public void sacar(float v) {
			if (this.getStatus()) {
				if (this.getSaldo() >= v) {
					this.setSaldo(this.getSaldo() - v);
					System.out.println("saque realizado na conta " + this.getDono());
				} else {
					System.out.println("saldo insuficiente para saque");
				}
			} else {
				System.out.println("impossivel sacar de uma conta fechada!!!");
			}
			
		}
		
		public void pagarMensalidade() {
			int v = 0;
			if (this.getTipo() == "CC") {
				v = 12;
			} else if (this.getTipo() == "CP") {
				v = 20;
			}
			if (this.getStatus()) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("mensalidade paga com sucesso por " + this.getDono());
			} else {
				System.out.println("impossivel pagar uma conta fechada:");
			}
		}
			
		
		
		//Metodos especiais
		
		 public ContaBanco() {
			 this.Saldo = 0;
			 this.Status = false;
		 }
		 public int getNunConta() {
			 return this.NumConta;
		 }
		 
		 public void setNumConta(int NumConta) {
			 this.NumConta = NumConta;
		 } 
		 public String getTipo() {
			 return Tipo;
		 }
		 public void setTipo(String Tipo) {
			 this.Tipo = Tipo;
		 }
		 public String getDono() {
			 return Dono;
		 }
		 public void setDono(String Dono) {
			 this.Dono = Dono;
		 }
		 public float getSaldo() {
			 return Saldo;
		 }
		 public void setSaldo(float Saldo) {
			 this.Saldo = Saldo;
		 }
		 public boolean getStatus() {
			 return Status;
		 }
		 public void setStatus(boolean Status) {
			 this.Status = Status; 
		 }
		 
	}
