/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Alisson Kaelan
 */
public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Metodos 
    public void estadoAtual(){
        System.out.println("----------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        
    }
    public void abrirConta(String tipo){
       this.setTipo(tipo);
       this.setStatus(true);
       if("CC".equals(tipo)){//"CC" Conta Corrente
           this.setSaldo(50);    
       } else if("CP".equals(tipo)){//"CP" Conta Poupanca
          this.setSaldo(150);
       } 
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta nao pode ser fechada pois possui saldo");
        }else if(getSaldo() < 0){
             System.out.println("Conta nao pode ser fechada pois possui Debito");
        } else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    
    public void depositar(float valor){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        }else{
            System.out.println("Impossivel depositar em uma conta fechada!");
        }
    }
    
    public void sacar(float valor){
        if (this.getStatus()){
            if(this.getSaldo() >= valor){
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque realizadona conta de " + this.getDono());
            }else{
                System.out.println("Saldo insuficiente para saque");
            }
        }else{
            System.out.println("Impossivel sacar de uma conta fechada!");
        }
        
    }
    
    public void pagarMensal(){
      int valor = 0;
      if("CC".equals(this.getTipo())){
         valor = 12;
        }else if("CP".equals(this.getTipo())){
        valor = 20;  
      } 
      if(this.getStatus()){
         this.setSaldo(this.getSaldo() - valor);
          System.out.println("Mensalidade paga com sucesso por" + this.getDono());
      } else{
          System.out.println("Imposivel pagar de uma conta fechada!");
      }
    }
    
    //Metodos especiais

    public ContaBanco() {
       this.saldo = 0;
       this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

   
   
    
    
    
}
