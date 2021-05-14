public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public void abrirConta(String tipo, String dono) {
        setTipo(tipo.toUpperCase());
        setStatus(true);

        setDono(dono);

        if (tipo.toUpperCase().strip().equals("CC")) {
            setSaldo(50);
            
        } else if (tipo.toUpperCase().strip().equals("CP")) {
            setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }

    public void fecharConta() {
        if (getSaldo() > 0) {
            System.out.println("Conta com dinheiro!");
        } else if (getSaldo() < 0) {
            System.out.println("Esta conta está com débito");
        } else {
            setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
    }

    public void depositar(Float valor) {
        if (getStatus() == true) {
            setSaldo(getSaldo() + valor);
            System.out.println("Depósito realizado");
        } else {
            System.out.println("ERRRO! Conta está fechada");
        }
    }

    public void sacar(float valor) {
        if (getStatus() == true) {
            if (getSaldo() >= valor) {
                setSaldo(getSaldo() - valor);
                System.out.println("Saque realizado");
            } else {
                System.out.println("ERRO! Saldo insuficiente");
            }
        } else {
            System.out.println("ERRO! Conta fechada");
        }
    }

    public void pagarMensal() {
        if (getStatus() == true) {
            if (getTipo().toUpperCase() == "CC") {
                if (getSaldo() >= 12) {
                    setSaldo(getSaldo() - 12); 
                    System.out.println("Pagamento mensal realizado");
                } else {
                    System.out.println("Saldo insuficiente");
                }
                
            } else if (getTipo().toUpperCase() == "CP") {
                if (getSaldo() >= 20) {
                    setSaldo(getSaldo() - 20); 
                    System.out.println("Pagamento mensal realizado");
                } else {
                    System.out.println("Saldo insuficiente");
                }
            }
        } else {
            System.out.println("ERRO! Conta fechada");
        }
    }

    //  ------------------ NumConta --------------------------
    public int getNumConta() {
        return this.numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    //  ------------------ Tipo --------------------------
    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // -------------------- Status --------------------------
    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // -------------------- Saldo ------------------------
    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    // ----------------------- Dono -----------------------
    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
    // -----------------------------------------------------
}
