package FI1;
@FunctionalInterface
 interface DaoI {
    public abstract void login();

}
 class DaoImpl implements DaoI {
    public void login () {
        System.out.println("Login Success");
    }

    public static void main(String[] args) {
        DaoI dao = new DaoImpl();
        dao.login();
    }
}
