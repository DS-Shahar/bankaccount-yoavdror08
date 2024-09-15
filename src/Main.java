class Main {
    public static void main(String[] args) {
        BankAccount BOB = new BankAccount(1000, -1000);
        BankAccount LISA = new BankAccount(1000, -1000);
        System.out.println(BOB.getBalance());
        System.out.println(Lisa.getBalance());
        
        System.out.println("Bob balance: " + BobAccount.getbalance())
        System.out.println("Lisa balance: " + LisaAccount.getbalance())
        
        BobAccount.transfer(Lisa, 500);
        
        LisaAccount.transfer(Bob, 1600);
        
        System.out.println("Bob balance: " + BobAccount.getbalance())
        System.out.println("Lisa balance: " + LisaAccount.getbalance())
         
    }
}

