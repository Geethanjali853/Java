 class Account {
    private int acc_id;
    public void set_acc_id(int id) {
        this.acc_id = id;
    }
    public int get_acc_id() {
        return this.acc_id;
    }
    public static void main(String[] args) {
        Account a = new Account();
        a.set_acc_id(101);
        System.out.println(a.get_acc_id());
    }
}
